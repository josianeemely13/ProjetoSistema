package DAO;

import DTO.FornecedorDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FornecedorDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FornecedorDTO> listafornecedor = new ArrayList<>();

    public void CadastrarFornecedor(FornecedorDTO objfornecedordto) {

        String sql = "insert into fornecedor( nome_fornecedor, cpf_fornecedor, endereco_fornecedor,"
                + "produto_fornecedor, email_fornecedor, contato_fornecedor1, contato_fornecedor2)"
                + " values(?,?,?,?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
           // pstm.setInt(1, objfornecedordto.getId_fornecedor());
            pstm.setString(1, objfornecedordto.getNome_fornecedor());
            pstm.setString(2, objfornecedordto.getCpf_fornecedor());
            pstm.setString(3, objfornecedordto.getEndereco_fornecedor());
            pstm.setString(4, objfornecedordto.getProduto_fornecedor());
            pstm.setString(5, objfornecedordto.getEmail_fornecedor());
            pstm.setString(6, objfornecedordto.getContato_fornecedor1());
            pstm.setString(7, objfornecedordto.getContato_fornecedor2());
            

            pstm.execute();
            JOptionPane.showMessageDialog(null, "Fornecedor Cadastrado!" );
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Fornecedor DAO" + erro);
        }

    }
    //CADASTRAR FORNECEDOR      

    public ArrayList<FornecedorDTO> PesquisarFornecedor() {
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

                listafornecedor.add(objfornecedordao);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FornecedorDAO" + erro);
        }
        return listafornecedor;
    }

    public void ExcluirFornecedor(FornecedorDTO objfornecedordto) {
        String sql = " delete from fornecedor where id_fornecedor = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objfornecedordto.getId_fornecedor());

            pstm.execute();
            JOptionPane.showMessageDialog(null, "Fornecedor Excluído!");
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Fornecedor Excluir" + erro);
        }

    }

    public void alterarFornecedor(FornecedorDTO objfornecedordto) {
        String sql = "update fornecedor set  nome_fornecedor = ?, cpf_fornecedor = ?, endereco_fornecedor = ?,"
                + "produto_fornecedor = ?, email_fornecedor = ?, contato_fornecedor1 = ?, contato_fornecedor2 = ?"
                + "where id_fornecedor = ?";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
           
            pstm.setString(1, objfornecedordto.getNome_fornecedor());
            pstm.setString(2, objfornecedordto.getCpf_fornecedor());
            pstm.setString(3, objfornecedordto.getEndereco_fornecedor());
            pstm.setString(4, objfornecedordto.getProduto_fornecedor());
            pstm.setString(5, objfornecedordto.getEmail_fornecedor());
            pstm.setString(6, objfornecedordto.getContato_fornecedor1());
            pstm.setString(7, objfornecedordto.getContato_fornecedor2());
            pstm.setInt(8, objfornecedordto.getId_fornecedor());
            
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Fornecedor Alterado!" );
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "FornecedorDAO Aterar" + erro);
        }

    }
    ///
    
    public FornecedorDTO pesquisarPorCodigoF(int id) {
        String sql = "select id_fornecedor, produto_fornecedor from fornecedor WHERE id_fornecedor = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, String.valueOf(id));
            rs = pstm.executeQuery();

            while (rs.next()) {
               // ProdutoDTO objclientedto = new ProdutoDTO();
                FornecedorDTO f = new FornecedorDTO();
                f.setId_fornecedor(rs.getInt("id_fornecedor"));
                f.setProduto_fornecedor(rs.getString("produto_fornecedor"));
//                objclientedto.setId(rs.getInt("id_fornecedor"));
//                objclientedto.setProduto(rs.getString("produto_fornecedor"));
                return f;
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "pesquisar ProdutoDAO" + erro);
        }
        return null;
    }
    
    //PESQUISAR FORNECEDOR POR DESCRIÇÃO
       public ArrayList<FornecedorDTO> PesquisarFornecedorDesc(String desc) {
        String sql = "select * from fornecedor where nome_fornecedor like ?";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "%"+desc+"%");
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

                listafornecedor.add(objfornecedordao);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FornecedorDAO" + erro);
        }
        return listafornecedor;
       }
}
