
package DAO;

import DTO.VendasProdutosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class VendasProdutosDAO {
    
     Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<VendasProdutosDTO> listavendasprodutos = new ArrayList<>();
    
    //SALVAR VENDAS PRODUTO
       public void salvarVendasProdutos(VendasProdutosDTO objvendasprodutosdto) {
        String sql = "insert into tbl_vendas_produtos(id_vendas_produtos,venda_produto_valor,"
                + "venda_produto_quantidade,produto_id,vendas_id) values(?,?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objvendasprodutosdto.getIdvendaproduto());
            pstm.setDouble(2, objvendasprodutosdto.getVendaprodutovalor());            
            pstm.setInt(3, objvendasprodutosdto.getVendaprodutoquantidade());
            pstm.setInt(4, objvendasprodutosdto.getProduto());
            pstm.setInt(5, objvendasprodutosdto.getVendas());
            
    
            
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Vendas Produtos Cadastrado");
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "vendasPrdutos cadastro DAO" + erro);
        }
    }

       
       //PESQUISAR VENDAS PRODUTO
        public ArrayList<VendasProdutosDTO> PesquisarVendasProdutos() {
        String sql = "select * from tbl_vendas_produtos";
        conn = new ConexaoDAO().conectaBD();
       
        try {

            pstm = conn.prepareStatement(sql);
           
            rs = pstm.executeQuery();

            while (rs.next()) {
                VendasProdutosDTO objvendasprodutosDTO = new VendasProdutosDTO();
                
                objvendasprodutosDTO.setIdvendaproduto(rs.getInt("id_vendas_produtos"));
                objvendasprodutosDTO.setVendaprodutovalor(rs.getDouble("venda_produto_valor"));
                objvendasprodutosDTO.setVendaprodutoquantidade(rs.getInt("venda_produto_quantidade"));
                objvendasprodutosDTO.setProduto(rs.getInt("produto_id"));
                objvendasprodutosDTO.setVendas(rs.getInt("vendas_id"));
             
                listavendasprodutos.add(objvendasprodutosDTO);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "VendasDAO" + erro);
        }
        return listavendasprodutos;
    }
    
    
        
         // METODO EXCLUIR VENDAS PRODUTO
    public void ExcluirVendasProdutos(VendasProdutosDTO objvendasprodutosdto){
        String sql = " delete from tbl_vendas_produtos where id_vendas_produtos = ?";
        
          conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objvendasprodutosdto.getIdvendaproduto());
            

            pstm.execute();
            JOptionPane.showMessageDialog(null, "Venda Excluida" );
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Venda ExcluirDAO" + erro);
        }
                
    }

    
    //ALTERAR VENDAS PRODUTO
    public void alterarProduto(VendasProdutosDTO objvendasprodutosdto){
        String sql = " update tbl_vendas_produtos set id_vendas_produtos = ?,venda_produto_valor = ?,venda_produto_quantidade = ?,produto_id = ?, vendas_id = ?,";
        
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objvendasprodutosdto.getIdvendaproduto());
            pstm.setDouble(2, objvendasprodutosdto.getVendaprodutovalor());
            pstm.setInt(3, objvendasprodutosdto.getVendaprodutoquantidade());
            pstm.setInt(4, objvendasprodutosdto.getVendas());
            pstm.setInt(5, objvendasprodutosdto.getProduto());
            
            
            

            pstm.execute();
            JOptionPane.showMessageDialog(null, " Vendas Produto Alterado Com Sucessso!");
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "VendasDAO Aterar" + erro);
        }

    }

    public boolean salvarVendasProdutoDAO(ArrayList<VendasProdutosDTO> listaVendasProdutosdto) {
        
        String sql = "insert into tbl_vendas_produtos(venda_produto_valor,"
                + "venda_produto_quantidade,produto_id,vendas_id) values(?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {
            int cont = listaVendasProdutosdto.size();
            for (int i = 0; i < cont; i++) {
                
            pstm = conn.prepareStatement(sql);
           
            pstm.setDouble(1, listaVendasProdutosdto.get(i).getVendaprodutovalor());            
            pstm.setInt(2, listaVendasProdutosdto.get(i).getVendaprodutoquantidade());
            pstm.setInt(3, listaVendasProdutosdto.get(i).getProduto());
            pstm.setInt(4, listaVendasProdutosdto.get(i).getVendas());
            
    
            
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Vendas Produtos Cadastrado");
            pstm.close();
}
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "vendasPrdutos cadastro DAO" + erro);
        }
         return true;
    }
    
    
}
