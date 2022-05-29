package DAO;


public class UsuarioDAO {

    /* 
    public boolean autenticarLogin(String cadastro_usuario, String cadastro_senha){
    
    PreparedStatement pstm = null;
    ResultSet rs ;
    Connection conn;
    boolean autenticar = false;
    
        try {
            String  sql = (" select * from cadastrousuario where cadastrousuario = ?, and senha = ?");
            pstm.setString(1,cadastro_usuario );
            pstm.setString(2, cadastro_senha);
            rs = pstm.executeQuery();
            
            if (rs.next()){
                 autenticar = true;
                
            }
            
        } catch (SQLException erro) {
            Logger.getLogger(CadastroUsuarioDAO.class.getName()).log(Level.SEVERE, null ,erro);
        }finally{
            
        }
        
        return autenticar;
    }

     */
/*
    public ResultSet autenticacaoUsuario(CadastroUsuarioDTO objusuario) {

        Connection conn;

        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select * from usuario where nome_usuario = ? and senha_usuario = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuario.getCadastrousuario());
            pstm.setString(2, objusuario.getCadastrosenha());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
            return null;
        }
    }
*/
    
}
