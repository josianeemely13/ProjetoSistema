
package DAO;


import DTO.RelatorioVendaDTO;
import DTO.VendasDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class VendasDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<VendasDTO> listavendas = new ArrayList<>();
    
       public void salvarVendas(VendasDTO objvendasdto) {
        String sql = "insert into tbl_vendas(venda_data_venda,"
                + "venda_valor_liquido, cliente_id, produto_id, quantidade, forma_pagamento)"
                + " values(now(),?,?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);         
            pstm.setDouble(1, objvendasdto.getValorLiquido());
            pstm.setInt(2, objvendasdto.getCodigocliente());
            pstm.setInt(3, objvendasdto.getCodigoProduto());
            pstm.setInt(4, objvendasdto.getQuantidade());
            pstm.setString(5, objvendasdto.getFormapagamento());
            
            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Salvar vendas DAO" + erro);
        }
    }

       //PESQUISAR VENDAS
    public List<RelatorioVendaDTO> pesquisarVendas() {
        String sql = "select "
                + "date_format(v.venda_data_venda, '%d/%m/%Y %H:%i') as data_venda, "
                + "p.produto, v.quantidade, v.venda_valor_liquido, v.forma_pagamento "
                + "from tbl_vendas v join produto p on p.id = v.produto_id";
        conn = new ConexaoDAO().conectaBD();
        List<RelatorioVendaDTO> listaVendas = new ArrayList<>();
        try {
            pstm = conn.prepareStatement(sql);     
            rs = pstm.executeQuery();
            while (rs.next()) {
                RelatorioVendaDTO relatorio = new RelatorioVendaDTO();     
                relatorio.setData(rs.getString("data_venda"));
                relatorio.setNomeProduto(rs.getString("produto"));
                relatorio.setQuantidade(rs.getInt("quantidade"));
                relatorio.setValorTotal(rs.getDouble("venda_valor_liquido"));
                relatorio.setFormaPagamento(rs.getString("forma_pagamento"));
               
                listaVendas.add(relatorio);
            }
            return listaVendas;
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        } 
    }
    
    //somar total de vendas
    public double totalVendas(LocalDate data){
        try {
            double totais = 0;
            String sql = "select sum(venda_valor_liquido)as total  from tbl_vendas where date_format(venda_data_venda,'%d/%m/%Y') = ?";
            pstm = conn.prepareStatement(sql);     
            pstm.setString(1, data.toString());
            rs = pstm.executeQuery();
            
            if(rs.next()){
                totais = rs.getDouble("total");
            }
           return totais; 
        } catch (SQLException e) {
             throw  new RuntimeException(e);
        }
    }
        //EXCLUIR VENDAS
         // METODO EXCLUIR PRODUTO
    public void ExcluirVendas(VendasDTO objprodutodto){
        String sql = " delete from produto where id_vendas = ?";
        
          conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objprodutodto.getIdvendas());
            

            pstm.execute();
            JOptionPane.showMessageDialog(null, "Venda Excluida" );
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Venda Excluir" + erro);
        }
                
    }

    
    //ALTERAR VENDA
    
    public void alterarVenda(VendasDTO objvendasdto){
        String sql = " update tbl_vendas set id_vendas = ?,venda_data_venda = ?,venda_valor_liquido = ?,venda_valor_bruto = ?, venda_desconto = ?,"
                + "cliente_id = ?";
        
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objvendasdto.getIdvendas());
            pstm.setDate(2, objvendasdto.getDatavenda());
            pstm.setDouble(3, objvendasdto.getValorLiquido());
            pstm.setDouble(4, objvendasdto.getValorBruto());
            pstm.setDouble(5, objvendasdto.getVendasDesconto());
            pstm.setInt(6, objvendasdto.getCodigocliente());
            
            

            pstm.execute();
            JOptionPane.showMessageDialog(null, " Venda Alterado Com Sucessso!");
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "VendasDAO Aterar" + erro);
        }

    }
    //Retornar total venda
     public double retornaTotalVendaPorData(LocalDate datavenda){
         try {
             double valorliquido = 0;
         String sql = " select sum(venda_valor_liquido)as total from tbl_vendas where venda_data_venda= ?";
        
          //conn = new ConexaoDAO().conectaBD();

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, datavenda.toString());
            
            pstm.execute();
            if(rs.next()){
                 valorliquido = rs.getDouble("total");
               //  System.out.println("venda_data_venda");
            }
           
      
        return valorliquido ;
         } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Venda Excluir" + erro);
        }
        return 0;
       
    }

   //PESQUISAR VENDA POR DESCRIÇÃO
      public List<RelatorioVendaDTO> pesquisarVendasDesc(LocalDate dataInicio, LocalDate dataFim) {
        String sql = "select  date_format(v.venda_data_venda, '%d/%m/%Y %H:%i') as data_venda, " +
"                p.produto, v.quantidade,v.forma_pagamento, v.venda_valor_liquido " +
"                from tbl_vendas  v join produto  p on p.id = v.produto_id where date(v.venda_data_venda) between ? and ? ";
                
        conn = new ConexaoDAO().conectaBD();
        List<RelatorioVendaDTO> listaVendas = new ArrayList<>();
        try {
            pstm = conn.prepareStatement(sql); 
            pstm.setString(1, dataInicio.toString());
            pstm.setString(2, dataFim.toString());
   
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                RelatorioVendaDTO relatorio = new RelatorioVendaDTO();     
                relatorio.setData(rs.getString("data_venda"));
                relatorio.setNomeProduto(rs.getString("produto"));
                relatorio.setQuantidade(rs.getInt("quantidade"));
                relatorio.setFormaPagamento(rs.getString("forma_pagamento"));
                relatorio.setValorTotal(rs.getDouble("venda_valor_liquido"));     
                listaVendas.add(relatorio);
            }
        return listaVendas;
        
        } catch (SQLException erro) {
           // JOptionPane.showMessageDialog(null, "relatorio venda" + erro);
              throw new RuntimeException(erro);
        }
        
      
        
      
   }
}
