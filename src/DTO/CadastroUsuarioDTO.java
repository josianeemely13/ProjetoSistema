
package DTO;


public class CadastroUsuarioDTO {
    
    private int idcadastro;
    private String cadastrousuario;
    private String cadastrosenha;
    private String nome;
    private String pesquisar;
    //private String cadastroconfirmasenha;
   
//
//    public String getCadastroconfirmasenha() {
//        return cadastroconfirmasenha;
//    }
//
//    public void setCadastroconfirmasenha(String cadastroconfirmasenha) {
//        this.cadastroconfirmasenha = cadastroconfirmasenha;
//    }

    public String getPesquisar() {
        return pesquisar;
    }

    public void setPesquisar(String pesquisar) {
        this.pesquisar = pesquisar;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
    public int getIdcadastro() {
        return idcadastro;
    }

    public void setIdcadastro(int idcadastro) {
        this.idcadastro = idcadastro;
    }

    public String getCadastrousuario() {
        return cadastrousuario;
    }

    public void setCadastrousuario(String cadastrousuario) {
        this.cadastrousuario = cadastrousuario;
    }

    public String getCadastrosenha() {
        return cadastrosenha;
    }

    public void setCadastrosenha(String cadastrosenha) {
        this.cadastrosenha = cadastrosenha;
    }

    public void setIdcadastro(String id_cadastro_usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
}
