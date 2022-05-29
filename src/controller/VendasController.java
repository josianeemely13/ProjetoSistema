/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ProdutoDAO;
import DAO.VendasDAO;
import DTO.VendasDTO;
import java.util.List;

/**
 *
 * @author josia
 */
public class VendasController {
    private VendasDAO dao = new VendasDAO();
    private ProdutoDAO produtoDao = new ProdutoDAO();
    
    public void salvar(List<VendasDTO> vendas) {
        vendas.forEach(dao::salvarVendas);
        
        produtoDao.darBaixaProduto(vendas);
    }
}
 