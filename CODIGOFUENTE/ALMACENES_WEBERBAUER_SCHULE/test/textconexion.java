
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENIN
 */
public class textconexion {
    
    public static void main(String[] args) {
        Connection con=null;        
        try{
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //con = DriverManager.getConnection("jdbc:sqlserver:odbc:oscar_almacenes","sa","system");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=oscar_almacenes;user=sa;password=system;");
            System.out.println("conexion establecida ... ");
        }catch (ClassNotFoundException e){
            System.out.println("NO SE CONECTO, porque no encontro driver...");
            System.out.println("eRROR="+e.getMessage());
        }
        catch (SQLException e){
            System.out.println("Error en la coneccion...");
            System.out.println("eRROR="+e.getMessage());
             System.out.println("eRROR="+e);
        }
    }
    
}
