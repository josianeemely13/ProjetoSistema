package DTO;

public class FornecedorDTO {
    
    private int id_fornecedor;
    private String nome_fornecedor;
    private String cpf_fornecedor;
    private String endereco_fornecedor;
    private String produto_fornecedor;
    private String email_fornecedor;
    private String contato_fornecedor1;
    private String contato_fornecedor2; 
    
    private ProdutoDTO Produtodto;

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public String getNome_fornecedor() {
        return nome_fornecedor;
    }

    public void setNome_fornecedor(String nome_fornecedor) {
        this.nome_fornecedor = nome_fornecedor;
    }

    public String getCpf_fornecedor() {
        return cpf_fornecedor;
    }

    public void setCpf_fornecedor(String cpf_fornecedor) {
        this.cpf_fornecedor = cpf_fornecedor;
    }

    public String getEndereco_fornecedor() {
        return endereco_fornecedor;
    }

    public void setEndereco_fornecedor(String endereco_fornecedor) {
        this.endereco_fornecedor = endereco_fornecedor;
    }

    public String getProduto_fornecedor() {
        return produto_fornecedor;
    }

    public void setProduto_fornecedor(String produto_fornecedor) {
        this.produto_fornecedor = produto_fornecedor;
    }

    public String getEmail_fornecedor() {
        return email_fornecedor;
    }

    public void setEmail_fornecedor(String email_fornecedor) {
        this.email_fornecedor = email_fornecedor;
    }

    public String getContato_fornecedor1() {
        return contato_fornecedor1;
    }

    public void setContato_fornecedor1(String contato_fornecedor1) {
        this.contato_fornecedor1 = contato_fornecedor1;
    }

    public String getContato_fornecedor2() {
        return contato_fornecedor2;
    }

    public void setContato_fornecedor2(String contato_fornecedor2) {
        this.contato_fornecedor2 = contato_fornecedor2;
    }

    public ProdutoDTO getProdutodto() {
        return Produtodto;
    }

    public void setProdutodto(ProdutoDTO Produtodto) {
        this.Produtodto = Produtodto;
    }

 //PARA APARECER O NOME DO FORNECEDOR DENTRO DA COMBOBOX NA TELA CADASTRAR-PRODUTO   
   @Override
   public String toString(){
       return this.getNome_fornecedor();
       
   }

 
  
}
