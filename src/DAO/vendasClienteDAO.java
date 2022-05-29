/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ClienteDTO;
import DTO.VendasClienteDTO;
import DTO.VendasDTO;
import DTO.VendasProdutosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author josia
 */
public class vendasClienteDAO extends ConexaoDAO{
    
    
     Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    public ArrayList<VendasClienteDTO> getVendasClinteDAO() {
           ArrayList<VendasClienteDTO> listadtovendasclinte = new ArrayList();
           VendasDTO vendasdto = new VendasDTO();
           ClienteDTO clientedto = new ClienteDTO();
           VendasClienteDTO vendasclientedto = new VendasClienteDTO();
           
        String sql = " select  * from tbl_vendas INNER JOIN cadastro_cliente ON cadastro_cliente.id_cadastro_cliente = tbl_vendas.cliente_id";
        conn = new ConexaoDAO().conectaBD();
       
        try {

            pstm = conn.prepareStatement(sql);
           
            rs = pstm.executeQuery();

            while (rs.next()) {
                
                VendasDTO objvendasDTO = new VendasDTO();
                ClienteDTO objclientedto = new ClienteDTO();
                VendasClienteDTO objvendasclientedto = new VendasClienteDTO();
                                             
                objvendasDTO.setIdvendas(rs.getInt("id_vendas"));
                objvendasDTO.setDatavenda(rs.getDate("venda_data_venda"));
                objvendasDTO.setValorLiquido(rs.getDouble("venda_valor_liquido"));
                objvendasDTO.setValorBruto(rs.getDouble("venda_valor_bruto"));
                objvendasDTO.setVendasDesconto(rs.getDouble("venda_desconto"));
                objvendasDTO.setCodigocliente(rs.getInt("cliente_id"));
                objvendasDTO.setValortotalapagar(rs.getDouble("valor_total_apagar"));
                //vendas cliente
                objclientedto.setIdcliente(rs.getInt("id_cadastro_cliente"));
                objclientedto.setNome(rs.getString("cliente_nome"));
                objclientedto.setContato1(rs.getString("cliente_contato1"));
                objclientedto.setContato2(rs.getString("cliente_contato2"));
                objclientedto.setCpf(rs.getString("cliente_cpf"));
                objclientedto.setEndereco(rs.getString("cliente_endereco"));
                objclientedto.setEmail(rs.getString("cliente_email"));
             
                vendasclientedto.setVendasdto(vendasdto);
                vendasclientedto.setClientedto(clientedto);
                
                listadtovendasclinte.add(vendasclientedto);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "VendasDAO" + erro);
        }
        return listadtovendasclinte;
    }
    
}
