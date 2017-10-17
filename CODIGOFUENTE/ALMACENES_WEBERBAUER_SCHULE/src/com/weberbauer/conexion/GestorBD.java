
package com.weberbauer.conexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;

public class GestorBD {

    public Connection con=null;

    public GestorBD(){
        con = null;
    }

    public Connection conectar()
    {
        try{
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //con = DriverManager.getConnection("jdbc:odbc:oscar_almacenes","sa","system");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"+"databaseName=oscar_almacenes;user=sa;password=system;");
            System.out.println("conexion establecida ... ");
        }catch (ClassNotFoundException e){
            System.out.println("NO SE CONECTO, porque no encontro driver...");
        }
        catch (SQLException e){
            System.out.println("Error en la coneccion...");
        }
        return con;
    }

    public void borrarTabla(String cadenaSQL)
    {
         try
         {
         Statement stmt = con.createStatement();
         stmt.executeUpdate(cadenaSQL);
         }
         catch (SQLException e)
         {
         System.out.println("Error en la eliminacion de tabla...");
         }
    }

    public boolean crearTabla(String cadenaSQL){
        boolean ct = false;
        try
        {
            Statement stmt = con.createStatement();
            stmt.execute(cadenaSQL);
            ct = true;
            System.out.println("Creacion de tabla : OK ... " );
        }catch(SQLException e){
            System.out.println("Error en la creacion de la tabla... " );
        }
        return ct;
    }

    public boolean insertar(String cadenaSQL){
        boolean in = false;
        try{
            Statement stmt = con.createStatement();
            stmt.execute(cadenaSQL);
            in = true;
        }catch(SQLException e){
            System.out.println(cadenaSQL+"\n" );
            System.out.println("Error en la inserci�n de datos... " );
        }
        return in;
    }

    public ResultSet consultar(String cadenaSQL){
        ResultSet rs = null;
         try{
             Statement stmt = con.createStatement();
             rs = stmt.executeQuery(cadenaSQL);
            
         }catch(SQLException e){
            System.out.println(cadenaSQL+"\n" );
            System.out.println("Error en la consulta a la tabla... " );
         }
         return rs;
    }

    public void cerrarConexion(){
        try {
            con.close();
            System.out.println("Conexion cerrada...");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    /**************************************************************************/
    /*********** Devuelve un Arrglo con el contenido de una tabla *************/
    public ArrayList listaTabla(String nt){
        String sentenciaSQL="SELECT * FROM " + nt;

        ArrayList lt = new ArrayList();
        ArrayList ct = null;

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sentenciaSQL);
            ResultSetMetaData rsmd = rs.getMetaData();
            int nColumnas = rsmd.getColumnCount();
        
            while(rs.next()){
                ct = new ArrayList();
                for(int i=0;i<nColumnas;i++)
                    ct.add(rs.getObject(i+1));

                lt.add(ct);
            }
        } catch (Exception ex) { ex.printStackTrace(); }
        return lt;
    }

    public Vector vectorTabla(String nt){
        String sentenciaSQL="SELECT * FROM " + nt;

        Vector lt = new Vector();
        Vector ct = null;

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sentenciaSQL);
            ResultSetMetaData rsmd = rs.getMetaData();
            int nColumnas = rsmd.getColumnCount();

            while(rs.next()){
                ct = new Vector();
                for(int i=0;i<nColumnas;i++)
                    ct.add(rs.getObject(i+1));
                lt.add(ct);
            }
        } catch (Exception ex) { ex.printStackTrace(); }
        return lt;
    }

    public Vector vectorConsulta(String sql){
        Vector lt = new Vector();
        Vector ct = null;
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int nColumnas = rsmd.getColumnCount();

            while(rs.next()){
                ct = new Vector();
                for(int i=0;i<nColumnas;i++)
                    ct.add(rs.getObject(i+1));
                lt.add(ct);
            }
        } catch (Exception ex) { ex.printStackTrace(); }
        return lt;
    }
}
