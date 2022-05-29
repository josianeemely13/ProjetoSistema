/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.VendasProdutosDAO;
import DTO.VendasProdutosDTO;
import java.util.ArrayList;

/**
 *
 * @author josia
 */
public class ControllerVendasProdutos {
    VendasProdutosDTO vendasprodutosdto = new  VendasProdutosDTO();
    VendasProdutosDAO vendasProdutosdao = new VendasProdutosDAO();
   
    
// salva uma lista de produtos
    public boolean salvarVendasProdutosController(ArrayList<VendasProdutosDTO>listaVendasProdutosdto){
        return this.vendasProdutosdao.salvarVendasProdutoDAO(listaVendasProdutosdto);
    }

    
}
