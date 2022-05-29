
package DTO;


public class ProdutoDTO {
    
    private String codigo;
    private String fornecedor;
    private String produto; 
    private String lucro;
    private String quantidade;
    private String valorcompra;
    private String valorvenda;
    private int id;
    private FornecedorDTO fornecedordto;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getLucro() {
        return lucro;
    }

    public void setLucro(String lucro) {
        this.lucro = lucro;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getValorcompra() {
        return valorcompra;
    }

    public void setValorcompra(String valorcompra) {
        this.valorcompra = valorcompra;
    }

    public String getValorvenda() {
        return valorvenda;
    }

    public void setValorvenda(String valorvenda) {
        this.valorvenda = valorvenda;
    }

    public FornecedorDTO getFornecedordto() {
        return fornecedordto;
    }

    public void setFornecedordto(FornecedorDTO fornecedordto) {
        this.fornecedordto = fornecedordto;
    }

 
    public void setId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
