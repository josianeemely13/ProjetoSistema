
package controller;

import DAO.FornecedorDAO;
import DTO.FornecedorDTO;
import java.util.ArrayList;
import static org.hibernate.criterion.Order.desc;


public class ControllerFornecedor {
    
    private FornecedorDAO fornecedordao = new FornecedorDAO();
    
    public ArrayList<FornecedorDTO>ListaFornecedorController(){
        return fornecedordao.PesquisarFornecedor();
    }
    
    public ArrayList<FornecedorDTO>ListaFornecedorControllerDesc(String desc){
        return fornecedordao.PesquisarFornecedorDesc(desc);
}
     public FornecedorDTO pesquisarPorCodigoF(int id) {
        return fornecedordao.pesquisarPorCodigoF(id);
}
}