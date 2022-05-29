
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexaoDAO {
    
    public Connection conectaBD(){
        Connection conn = null;
        
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/projeto_sistema?characterEncoding=utf-8";
            String user ="dba";
            String password = "Josiane123*";
            conn = DriverManager.getConnection(url,user,password);
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"ConexaoDAO" + erro.getMessage());
        }
        return conn;
    
    }

}