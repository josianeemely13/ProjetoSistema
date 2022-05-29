/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.ArrayList;

/**
 *
 * @author josia
 */
public class VendasClienteDTO {
    
    private VendasDTO vendasdto;
    private ClienteDTO clientedto;
    private ArrayList<VendasClienteDTO> listadtovendascliente;

    public VendasDTO getVendasdto() {
        return vendasdto;
    }

    public void setVendasdto(VendasDTO vendasdto) {
        this.vendasdto = vendasdto;
    }

    public ClienteDTO getClientedto() {
        return clientedto;
    }

    public void setClientedto(ClienteDTO clientedto) {
        this.clientedto = clientedto;
    }

    public ArrayList<VendasClienteDTO> getListadtovendascliente() {
        return listadtovendascliente;
    }

    public void setListadtovendascliente(ArrayList<VendasClienteDTO> listadtovendascliente) {
        this.listadtovendascliente = listadtovendascliente;
    }
    
    
    
}
