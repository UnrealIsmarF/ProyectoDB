
package Modelos;

import java.sql.*;
import javax.swing.JOptionPane;

public class Coneccion {
    Connection conexion;
    
    
    public Connection Conectar(String user, String pass){
        
        try{
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        String nombre_servidor = "168.234.74.80";
        String numero_puerto = "1521";
        String sid = "umg";
        String url = "jdbc:oracle:thin:@"+ nombre_servidor +":"+numero_puerto+":"+sid;
        
        conexion = DriverManager.getConnection(url,user,pass);
        JOptionPane.showMessageDialog(null, "Coneccion exitosa");
        return conexion;
        
        
        }
        catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Fallo la conexion..."+ e.getMessage());   
      
        }
        return conexion;
    }
}
