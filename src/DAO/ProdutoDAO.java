package DAO;

import DTO.FornecedorDTO;
import DTO.ProdutoDTO;
import DTO.VendasDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutoDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ProdutoDTO> lista = new ArrayList<>();
    ArrayList<FornecedorDTO> listarfornecedor = new ArrayList<>();

//cadastrar produtudo banco
    public void cadastrarProduto(ProdutoDTO objprodutodto) {
        String sql = "insert into produto(fornecedor, produto,lucro,quantidade,"
                + "valorcompra,valorvenda,fornecedor_id) values(?,?,?,?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            // pstm.setInt(1, objprodutodto.getCodigofornecedor());  
            pstm.setString(1, objprodutodto.getFornecedordto().getNome_fornecedor());
            pstm.setString(2, objprodutodto.getFornecedordto().getProduto_fornecedor());
            pstm.setString(3, objprodutodto.getLucro());
            pstm.setString(4, objprodutodto.getQuantidade());
            pstm.setString(5, objprodutodto.getValorcompra());
            pstm.setString(6, objprodutodto.getValorvenda());
            pstm.setInt(7, objprodutodto.getFornecedordto().getId_fornecedor());

            pstm.execute();
            JOptionPane.showMessageDialog(null, "Produto Cadastrado");
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO" + erro);
        }

    }

    public ArrayList<ProdutoDTO> pesquisarProduto() {
        String sql = "select * from produto order by fornecedor";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);

            rs = pstm.executeQuery();

            while (rs.next()) {
                ProdutoDTO objProdutoDTO = new ProdutoDTO();

                objProdutoDTO.setId(rs.getInt("id"));
                objProdutoDTO.setFornecedor(rs.getString("fornecedor"));
                objProdutoDTO.setProduto(rs.getString("produto"));
                objProdutoDTO.setQuantidade(rs.getString("quantidade"));
                objProdutoDTO.setValorcompra(rs.getString("valorcompra"));
                objProdutoDTO.setValorvenda(rs.getString("valorvenda"));
                objProdutoDTO.setLucro(rs.getString("lucro"));

                lista.add(objProdutoDTO);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO" + erro);
        }
        return lista;
    }
    /*
    public ArrayList<ProdutoDTO> pesquisarProdutoC() {
        String sql = "select f.id_fornecedor, f.nome_fornecedor, f.produto_fornecedor, p.lucro, p.quantidade, p.valorcompra, p.valorvenda\n"
                + "from produto as p JOIN fornecedor as f\n"
                + "on(p.fornecedor_id = f.id_fornecedor)";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);

            rs = pstm.executeQuery();

            while (rs.next()) {
                ProdutoDTO objProdutoDTO = new ProdutoDTO();
                FornecedorDTO f = new FornecedorDTO();

                f.setNome_fornecedor(rs.getString("f.nome_fornecedor"));
                f.setProduto_fornecedor(rs.getString("f.produto_fornecedor"));
                f.setId_fornecedor(rs.getInt("f.id_fornecedor"));
                //objProdutoDTO.setId(rs.getInt("p.id"));
                //objProdutoDTO.setFornecedor(rs.getString("f.nome_fornecedor"));
                //objProdutoDTO.setProduto(rs.getString("p.produto"));
                objProdutoDTO.setQuantidade(rs.getString("p.quantidade"));
                objProdutoDTO.setValorcompra(rs.getString("p.valorcompra"));
                objProdutoDTO.setValorvenda(rs.getString("p.valorvenda"));
                objProdutoDTO.setLucro(rs.getString("p.lucro"));

                objProdutoDTO.setFornecedordto(f);

                lista.add(objProdutoDTO);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO" + erro);
        }
        return lista;
    }
    */
    //pesquisar na tabela feito alteracao adiconei o combobox
    public ArrayList<ProdutoDTO> pesquisarProdutoNovo() {
        String sql = "select  * from produto ";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
             
            rs = pstm.executeQuery();

            while (rs.next()) {
                ProdutoDTO objProdutoDTO = new ProdutoDTO();
               // FornecedorDTO f = new FornecedorDTO();

               // f.setNome_fornecedor(rs.getString("f.nome_fornecedor"));
              //  f.setProduto_fornecedor(rs.getString("f.produto_fornecedor"));
               // f.setId_fornecedor(rs.getInt("f.id_fornecedor"));
                objProdutoDTO.setId(rs.getInt("id"));
                objProdutoDTO.setFornecedor(rs.getString("fornecedor"));
                objProdutoDTO.setProduto(rs.getString("produto"));
                objProdutoDTO.setQuantidade(rs.getString("quantidade"));
                objProdutoDTO.setValorcompra(rs.getString("valorcompra"));
                objProdutoDTO.setValorvenda(rs.getString("valorvenda"));
                objProdutoDTO.setLucro(rs.getString("lucro"));

           //     objProdutoDTO.setFornecedordto(f);

                lista.add(objProdutoDTO);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO" + erro);
        }
        return lista;
    }
    // METODO EXCLUIR PRODUTO

    public void ExcluirProduto(ProdutoDTO objprodutodto) {
        String sql = " delete from produto where id = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objprodutodto.getId());

            pstm.execute();
            JOptionPane.showMessageDialog(null, "Produto Excluido");
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Produto Excluir" + erro);
        }

    }

    public void alterarProduto(ProdutoDTO objprodutodto) {
        String sql = " update produto set fornecedor = ?,produto = ?,lucro = ?, quantidade = ?,"
                + "valorcompra = ?,valorvenda = ? where id = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, objprodutodto.getFornecedor());
            pstm.setString(2, objprodutodto.getProduto());
            pstm.setString(3, objprodutodto.getLucro());
            pstm.setString(4, objprodutodto.getQuantidade());
            pstm.setString(5, objprodutodto.getValorcompra());
            pstm.setString(6, objprodutodto.getValorvenda());
            pstm.setInt(7, objprodutodto.getId());

            pstm.execute();
            JOptionPane.showMessageDialog(null, " Produto Alterado Com Sucessso!");
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "ProdutoDAO Aterar" + erro);
        }

    }
/*
 
    public ProdutoDTO pesquisarPorCodigo(int id) {
        String sql = "select id_fornecedor, produto_fornecedor from fornecedor WHERE id_fornecedor = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, String.valueOf(id));
            rs = pstm.executeQuery();

            while (rs.next()) {
                ProdutoDTO objclientedto = new ProdutoDTO();
                FornecedorDTO f = new FornecedorDTO();
                f.setId_fornecedor(rs.getInt("id_fornecedor"));
                f.setProduto_fornecedor(rs.getString("produto_fornecedor"));
//                objclientedto.setId(rs.getInt("id_fornecedor"));
//                objclientedto.setProduto(rs.getString("produto_fornecedor"));
                return objclientedto;
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "pesquisar ProdutoDAO" + erro);
        }
        return null;
    }
*/
    
    public ProdutoDTO pesquisarPorCodigo(int id) {
        String sql = "select id, produto from produto WHERE id = ?;";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);                  
            pstm.setString(1, String.valueOf(id));
            rs = pstm.executeQuery();

            while (rs.next()) {
                ProdutoDTO objclientedto = new ProdutoDTO();
                objclientedto.setId(rs.getInt("id"));
                objclientedto.setProduto(rs.getString("produto"));
                return objclientedto;
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "pesquisar ProdutoDAO" + erro);
        }
        return null;
    }
    
  
     
    public ArrayList<ProdutoDTO> PesquisarProdutoparavenda(int id) {
        String sql = "select * from produto";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                ProdutoDTO objProdutoDTO = new ProdutoDTO();

                objProdutoDTO.setId(rs.getInt("id"));

                objProdutoDTO.setFornecedor(rs.getString("fornecedor"));
                objProdutoDTO.setProduto(rs.getString("produto"));
                objProdutoDTO.setQuantidade(rs.getString("lucro"));
                objProdutoDTO.setValorcompra(rs.getString("quantidade"));
                objProdutoDTO.setValorvenda(rs.getString("valorcompra"));
                objProdutoDTO.setLucro(rs.getString("valorvenda"));

                lista.add(objProdutoDTO);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO" + erro);
        }
        return lista;
    }

    // Alterar Quantidade de produtos no banco
    public boolean alterarEstoqueprodutoDAO(ArrayList<ProdutoDTO> listadtoprodutos) {
        String sql = " update produto set  quantidade = ? where id = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            for (int i = 0; i < listadtoprodutos.size(); i++) {

                pstm.setString(1, listadtoprodutos.get(i).getQuantidade());
                pstm.setInt(2, listadtoprodutos.get(i).getId());

                pstm.execute();
                JOptionPane.showMessageDialog(null, " Produto Alterado Com Sucessso!");
                pstm.close();
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO Aterar" + erro);
        }
        return true;
    }
    
    public boolean podeVenderProduto(int id, int quantidade) {
        String sql = "select p.quantidade from produto p where id = ?;";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, String.valueOf(id));
            rs = pstm.executeQuery();

            while (rs.next()) {
                if (quantidade <= rs.getInt("quantidade")) {
                    return true;
                }
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "pesquisar ProdutoDAO" + erro);
        }
        return false;
    }
   

    public boolean podeVenderProdutoConsert(int id, int quantidade) {
        String sql = "select  p.quantidade, p.valorvenda\n" +
"from produto as p JOIN fornecedor as f\n" +
"on(p.fornecedor_id = f.id_fornecedor)  where id_fornecedor = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, String.valueOf(id));
            rs = pstm.executeQuery();

            while (rs.next()) {
                if (quantidade <= rs.getInt("quantidade")) {
                    return true;
                }
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "pesquisar ProdutoDAO" + erro);
        }
        return false;
    }

    
    public void darBaixaProduto(List<VendasDTO> vendas) {
        String sql = "update produto set quantidade = quantidade - ? where id = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            for (VendasDTO venda : vendas) {
                pstm = conn.prepareStatement(sql);
                pstm.setInt(1, venda.getQuantidade());
                pstm.setInt(2, venda.getCodigoProduto());
                pstm.execute();
                pstm.close();
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO Aterar" + erro);
        }
    }

    //PESQUISAR PRODUTO DESCRIÇÃO
    public ArrayList<ProdutoDTO> pesquisarProdutoDesc(String desc) {
        String sql = "select * from produto where produto like ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "%" + desc + "%");
            rs = pstm.executeQuery();

            while (rs.next()) {
                ProdutoDTO objProdutoDTO = new ProdutoDTO();
               // FornecedorDTO f = new FornecedorDTO();
               // f.setNome_fornecedor(rs.getString("f.nome_fornecedor"));
               // f.setProduto_fornecedor(rs.getString("f.produto_fornecedor"));
                objProdutoDTO.setId(rs.getInt("id"));
                objProdutoDTO.setFornecedor(rs.getString("fornecedor"));
                objProdutoDTO.setProduto(rs.getString("produto"));
                objProdutoDTO.setQuantidade(rs.getString("quantidade"));
                objProdutoDTO.setValorcompra(rs.getString("valorcompra"));
                objProdutoDTO.setValorvenda(rs.getString("valorvenda"));
                objProdutoDTO.setLucro(rs.getString("lucro"));

              //  objProdutoDTO.setFornecedordto(f);

                lista.add(objProdutoDTO);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO" + erro);
        }
        return lista;
    }

    /*
     public ArrayList<FornecedorDTO> carregarFornecedor() {
        String sql = "select * from fornecedor";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            rs = pstm.executeQuery();

            while (rs.next()) {
                FornecedorDTO objfornecedordao = new FornecedorDTO();

               objfornecedordao.setId_fornecedor(rs.getInt("id_fornecedor"));
                objfornecedordao.setNome_fornecedor(rs.getString("nome_fornecedor"));
                objfornecedordao.setEndereco_fornecedor(rs.getString("endereco_fornecedor"));
                objfornecedordao.setEmail_fornecedor(rs.getString("email_fornecedor"));
                objfornecedordao.setCpf_fornecedor(rs.getString("cpf_fornecedor"));
                objfornecedordao.setProduto_fornecedor(rs.getString("produto_fornecedor"));
                objfornecedordao.setContato_fornecedor1(rs.getString("contato_fornecedor1"));
                objfornecedordao.setContato_fornecedor2(rs.getString("contato_fornecedor2"));

                listarfornecedor.add(objfornecedordao);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FornecedorDAO" + erro);
        }
        return listarfornecedor;
    }
     */
    //LISTAR NO COMBOX O NOME DO FORNECEDOR NA TABELA PRODUTO
    public ResultSet listarFornecedor() {
        conn = new ConexaoDAO().conectaBD();
        String sql = "select * from fornecedor ORDER BY nome_fornecedor";

        try {
            pstm = conn.prepareStatement(sql);

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Listar Fornecedor" + erro);
        }
        return null;

    }
 
        public ProdutoDTO pesquisarProdutoValorCompra(int id) {
        String sql = "select f.id_fornecedor, f.nome_fornecedor, f.produto_fornecedor, p.lucro, p.quantidade, p.valorcompra, p.valorvenda\n" +
"from produto as p JOIN fornecedor as f\n" +
"on(p.fornecedor_id = f.id_fornecedor) where id_fornecedor = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, String.valueOf(id));
            rs = pstm.executeQuery();

            while (rs.next()) {
                ProdutoDTO objProdutoDTO = new ProdutoDTO();
                FornecedorDTO f = new FornecedorDTO();

                f.setNome_fornecedor(rs.getString("f.nome_fornecedor"));
                f.setProduto_fornecedor(rs.getString("f.produto_fornecedor"));
                f.setId_fornecedor(rs.getInt("f.id_fornecedor"));
                //objProdutoDTO.setId(rs.getInt("p.id"));
                //objProdutoDTO.setFornecedor(rs.getString("f.nome_fornecedor"));
                //objProdutoDTO.setProduto(rs.getString("p.produto"));
                objProdutoDTO.setQuantidade(rs.getString("p.quantidade"));
                objProdutoDTO.setValorcompra(rs.getString("p.valorcompra"));
                objProdutoDTO.setValorvenda(rs.getString("p.valorvenda"));
                objProdutoDTO.setLucro(rs.getString("p.lucro"));

                objProdutoDTO.setFornecedordto(f);

           

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO" + erro);
        }
        return null;
        
        
   }
}
