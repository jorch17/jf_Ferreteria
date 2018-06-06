
package Proveedor;
    
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conection {
    Connection cn;
    Statement st;

    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/Ferre","root","SOCIALempireS20");
            System.out.println("Conexion Exitosa!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, ex);
        }return cn;
    }   
   Statement createStatement(){
       throw new UnsupportedOperationException("No soportado");
   }
}