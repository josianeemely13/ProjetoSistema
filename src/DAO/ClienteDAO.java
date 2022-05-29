package DAO;

import DTO.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ClienteDTO> listacliente = new ArrayList<>();
    ArrayList<ClienteDTO> listacampocliente = new ArrayList<>();

    public void CadastrarCliente(ClienteDTO objclientedto) {

        String sql = "insert into cadastro_cliente(cliente_nome,cliente_contato1,"
                + " cliente_contato2, cliente_cpf, cliente_endereco, cliente_email)"
                + " values(?,?,?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            //pstm.setInt(1, objclientedto.getIdcliente());
            pstm.setString(1, objclientedto.getNome());
            pstm.setString(2, objclientedto.getContato1());
            pstm.setString(3, objclientedto.getContato2());
            pstm.setString(4, objclientedto.getCpf());
            pstm.setString(5, objclientedto.getEndereco());
            pstm.setString(6, objclientedto.getEmail());

            pstm.execute();
            JOptionPane.showMessageDialog(null, "Cliete cadastrado com sucesso!");
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO" + erro);
        }

    }

    public ArrayList<ClienteDTO> PesquisarCliente() {
        String sql = "select * from cadastro_cliente";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            rs = pstm.executeQuery();

            while (rs.next()) {
                ClienteDTO objclientedto = new ClienteDTO();

                objclientedto.setIdcliente(rs.getInt("id_cadastro_cliente"));
                objclientedto.setNome(rs.getString("cliente_nome"));
                objclientedto.setContato1(rs.getString("cliente_contato1"));
                objclientedto.setContato2(rs.getString("cliente_contato2"));
                objclientedto.setCpf(rs.getString("cliente_cpf"));
                objclientedto.setEndereco(rs.getString("cliente_endereco"));
                objclientedto.setEmail(rs.getString("cliente_email"));

                listacliente.add(objclientedto);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "pesquisar ClienteDAO" + erro);
        }
        return listacliente;
    }

    //PESQUISAR CLIENTE
    public void alterarCliente(ClienteDTO objclientedto) {
        String sql = " update cadastro_cliente set cliente_nome = ?, cliente_contato1 = ?, cliente_contato2 = ?, cliente_cpf = ?, cliente_endereco = ?, cliente_email = ? where id_cadastro_cliente = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objclientedto.getNome());
            pstm.setString(2, objclientedto.getContato1());
            pstm.setString(3, objclientedto.getContato2());
            pstm.setString(4, objclientedto.getCpf());
            pstm.setString(5, objclientedto.getEndereco());
            pstm.setString(6, objclientedto.getEmail());
            pstm.setInt(7, objclientedto.getIdcliente());

            pstm.execute();
            JOptionPane.showMessageDialog(null, " Cliente Alterado Com Sucessso!");
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Cliente DAO Aterar" + erro);
        }

    }

    //METODO EXCLUIR CLIENTE
    public void ExcluirCliente(ClienteDTO objclientedto) {
        String sql = " delete from cadastro_cliente where id_cadastro_cliente = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objclientedto.getIdcliente());

            pstm.execute();
            JOptionPane.showMessageDialog(null, "Cliente Excluido");
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "ClienteDAO Excluir" + erro);
        }

    }

    // para aparecer no camo de pesquisa de vendas (cliente)
    public ClienteDTO PesquisarcampoCliente(int idcliente) {
        String sql = "select id_cadastro_cliente ,cliente_nome from cadastro_cliente"
                + "      WHERE  id_cadastro_cliente = ?;";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);                  
            pstm.setString(1, String.valueOf(idcliente));
            rs = pstm.executeQuery();

            while (rs.next()) {
                ClienteDTO objclientedto = new ClienteDTO();
                objclientedto.setIdcliente(rs.getInt("id_cadastro_cliente"));
                objclientedto.setNome(rs.getString("cliente_nome"));
                return objclientedto;
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "pesquisar ClienteDAO" + erro);
        }
        return null;
    }
    
    //PESQUISAR CLIENTE POR DESCRIÇAO
     public ArrayList<ClienteDTO> PesquisarClienteDesc(String desc) {
        String sql = "select * from cadastro_cliente where cliente_nome like ?";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "%"+desc+"%");
            rs = pstm.executeQuery();

            while (rs.next()) {
                ClienteDTO objclientedto = new ClienteDTO();

                objclientedto.setIdcliente(rs.getInt("id_cadastro_cliente"));
                objclientedto.setNome(rs.getString("cliente_nome"));
                objclientedto.setContato1(rs.getString("cliente_contato1"));
                objclientedto.setContato2(rs.getString("cliente_contato2"));
                objclientedto.setCpf(rs.getString("cliente_cpf"));
                objclientedto.setEndereco(rs.getString("cliente_endereco"));
                objclientedto.setEmail(rs.getString("cliente_email"));

                listacliente.add(objclientedto);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "pesquisar ClienteDAO" + erro);
        }
        return listacliente;
    }
}