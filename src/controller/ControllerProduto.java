/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ProdutoDAO;
import DTO.FornecedorDTO;
import DTO.ProdutoDTO;
import java.util.ArrayList;



public class ControllerProduto {
    
     private ProdutoDAO produtodao = new ProdutoDAO();
    
    public  ArrayList<ProdutoDTO> ListaProdutosController() {
         return produtodao.pesquisarProduto();
          
  
    }   
    public  ArrayList<ProdutoDTO> ListaProdutosControllerVenda(int id) {
         return produtodao.PesquisarProdutoparavenda(id);
    }
   
    public ProdutoDTO pesquisarPorCodigo(int id) {
        return produtodao.pesquisarPorCodigo(id);
    }
    public boolean alterarEstoqueProdutoController(ArrayList<ProdutoDTO> listadtoprodutos){
        return this.produtodao.alterarEstoqueprodutoDAO(listadtoprodutos);
    }

   public boolean podeVenderProduto(int id, int quantidade) {
       return produtodao.podeVenderProduto(id, quantidade);
   }
    
   public  ArrayList<ProdutoDTO> ControllerpesquisarNovo() {
        return produtodao.pesquisarProdutoNovo();
    }
//      public  ArrayList<ProdutoDTO> ControllerpesquisarC() {
//        return produtodao.pesquisarProdutoC();
//    }
   
    public ProdutoDTO pesquisarProdutoValorCompra(int id) {
        return produtodao.pesquisarProdutoValorCompra(id);
    
    }
    public boolean podeVenderProdutoConset(int id, int quantidade) {
      return produtodao.podeVenderProdutoConsert(id, quantidade);
    }

}
