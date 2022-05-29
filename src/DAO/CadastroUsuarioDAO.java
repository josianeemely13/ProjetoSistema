package DAO;

import DTO.CadastroUsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroUsuarioDAO {

    PreparedStatement pstm;
    ResultSet rs;
    Connection conn;
    ArrayList<CadastroUsuarioDTO> listacadastrousuario = new ArrayList<>();

    //AUTENTICAÇAO DE USUARIO
    public ResultSet autenticarcadastroUsuario(CadastroUsuarioDTO objcadastrousuariodto) {

        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select * from cadastro_usuario where cadastro_usuario = ? and cadastro_senha = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);

            pstm.setString(1, objcadastrousuariodto.getCadastrousuario());
            pstm.setString(2, objcadastrousuariodto.getCadastrosenha());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
            return null;
        }
    }

    //CADASTRAR USUARIO
    public void CadastroUsuario(CadastroUsuarioDTO objcadastrousuariodto) {

        try {
            String sql = "insert into cadastro_usuario( id_cadastro_usuario, cadastro_usuario, cadastro_senha, nome) values (?,?,?,?)";
            conn = new ConexaoDAO().conectaBD();

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objcadastrousuariodto.getIdcadastro());
            pstm.setString(2, objcadastrousuariodto.getCadastrousuario());
            pstm.setString(3, objcadastrousuariodto.getCadastrosenha());
            pstm.setString(4, objcadastrousuariodto.getNome());

            pstm.execute();
            JOptionPane.showMessageDialog(null, "Usuário Inserido Com Sucessso!");
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Cadastro UsuarioDAO" + erro);

        }

    }
    //FIM DO  CADASTRO DE USUARIOS

//PARA APARECER NA TABELA DA TELA CADASTRO USUARIO 
    public ArrayList<CadastroUsuarioDTO> PesquisarCadastroUsuario() {
        String sql = "select * from cadastro_usuario ";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            rs = pstm.executeQuery();

            while (rs.next()) {
                CadastroUsuarioDTO objcadastrousuariodto = new CadastroUsuarioDTO();

                objcadastrousuariodto.setIdcadastro(rs.getInt("id_cadastro_usuario"));
                objcadastrousuariodto.setCadastrousuario(rs.getString("cadastro_usuario"));
                objcadastrousuariodto.setCadastrosenha(rs.getString("cadastro_senha"));
                objcadastrousuariodto.setNome(rs.getString("nome"));

                listacadastrousuario.add(objcadastrousuariodto);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "pesquisar cadastroDAO" + erro);
        }
        return listacadastrousuario;
    }
    //FIM DO METODO PARA APARECER NA TABELA DA TELA CADASTRO USUARIO 

    //ALTERAR CADASTRO DE USUARIOS
    public void alterarcadastroUsuario(CadastroUsuarioDTO objcadastrousuariodto) {
        String sql = "update cadastro_usuario set   cadastro_usuario = ?, cadastro_senha = ?, nome = ? where id_cadastro_usuario = ?";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcadastrousuariodto.getCadastrousuario());
            pstm.setString(2, objcadastrousuariodto.getCadastrosenha());
            pstm.setString(3, objcadastrousuariodto.getNome());
            pstm.setInt(4, objcadastrousuariodto.getIdcadastro());

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Usuário Alterado Com Sucessso!");
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Cadastro UsuarioDAO Aterar" + erro);
        }

    }
    //FIM DO METODO ALTERAR CADASTRO DE USUARIOS

    //METODO PARA EXCLUIR
    public void ExcluirUsuario(CadastroUsuarioDTO objusuariodto) {

        String sql = " delete  from cadastro_usuario where id_cadastro_usuario = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objusuariodto.getIdcadastro());

            pstm.execute();
            JOptionPane.showMessageDialog(null, "Usuario Excluido");
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Produto Excluir" + erro);
        }
    }         

      public ArrayList<CadastroUsuarioDTO> PesquisarCadastroUsuarioDesc(String desc) {
        String sql = "select * from cadastro_usuario where nome like ?";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "%"+desc+"%");
            rs = pstm.executeQuery();

            while (rs.next()) {
                CadastroUsuarioDTO objcadastrousuariodto = new CadastroUsuarioDTO();

                objcadastrousuariodto.setIdcadastro(rs.getInt("id_cadastro_usuario"));
                objcadastrousuariodto.setCadastrousuario(rs.getString("cadastro_usuario"));
                objcadastrousuariodto.setCadastrosenha(rs.getString("cadastro_senha"));
                objcadastrousuariodto.setNome(rs.getString("nome"));

                listacadastrousuario.add(objcadastrousuariodto);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "pesquisar cadastroDAO" + erro);
        }
        return listacadastrousuario;
    }
}
