/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.vendasClienteDAO;
import DTO.VendasClienteDTO;
import java.util.ArrayList;

/**
 *
 * @author josia
 */
public class ControllerVendasCliente {
    
    private vendasClienteDAO  vendasclientedao = new vendasClienteDAO();

    public ArrayList<VendasClienteDTO> getListaCliente() {
       return this.vendasclientedao.getVendasClinteDAO();
    }
    
}
