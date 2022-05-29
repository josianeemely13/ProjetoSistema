
package DTO;

import java.sql.Date;


public class VendasDTO {
    
   private int idvendas;
   private int codigocliente;
   private Date datavenda;
   private double valorLiquido;
   private double valorBruto;
   private double vendasDesconto;
   private int codigoProduto;
   private int quantidade;
   double valortotalapagar;
   private String formapagamento;
   
   private int codigofornecedor;
   
    public int getIdvendas() {
        return idvendas;
    }

    public void setIdvendas(int idvendas) {
        this.idvendas = idvendas;
    }

    public int getCodigocliente() {
        return codigocliente;
    }

    public void setCodigocliente(int codigocliente) {
        this.codigocliente = codigocliente;
    }

    public Date getDatavenda() {
        return datavenda;
    }

    public void setDatavenda(Date datavenda) {
        this.datavenda = datavenda;
    }

    public double getValorLiquido() {
        return valorLiquido;
    }

    public void setValorLiquido(double valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public double getVendasDesconto() {
        return vendasDesconto;
    }

    public void setVendasDesconto(double vendasDesconto) {
        this.vendasDesconto = vendasDesconto;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getValortotalapagar() {
        return valortotalapagar;
    }

    public void setValortotalapagar(double valortotalapagar) {
        this.valortotalapagar = valortotalapagar;
    }

    public String getFormapagamento() {
        return formapagamento;
    }

    public void setFormapagamento(String formapagamento) {
        this.formapagamento = formapagamento;
    }

    public int getCodigofornecedor() {
        return codigofornecedor;
    }

    public void setCodigofornecedor(int codigofornecedor) {
        this.codigofornecedor = codigofornecedor;
    }

    
}

