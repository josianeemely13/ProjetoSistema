/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import DAO.ClienteDAO;
import DTO.ClienteDTO;
import java.util.ArrayList;

/**
 *
 * @author josia
 * 
 */

public class ControllerCliente {

   
    
    private ClienteDAO clientedao = new ClienteDAO();
   
    
    public void SalvarClienteController(ClienteDTO objclientedto){
             clientedao.CadastrarCliente(objclientedto);
       
        
    }
    
//    public void excluirclientecontroller(int idcliente){
//        return this.clientedao.ExcluirCliente(idcliente);
//       
//       
//    }
//    
    public  ClienteDTO Pesquisarcampo(int idcliente) {
          return this.clientedao.PesquisarcampoCliente(idcliente);
   
    }
//          
//    public  ArrayList<ClienteDTO> Pesquisarcampo(String Nome) {
//          return this.clientedao.PesquisarcampoCliente(Nome);
//        
//    }
    public  ArrayList<ClienteDTO> ControllerPesquisarCliente() {
          return this.clientedao.PesquisarCliente();
     
    }
     
    public void alterarClienteController(ClienteDTO objclientedto){
        clientedao.alterarCliente(objclientedto);
    }

    
    
    

   

    

   
    
}
