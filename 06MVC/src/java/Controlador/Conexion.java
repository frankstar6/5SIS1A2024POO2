package Controlador;

import java.sql.*;

public class Conexion {
    
    public static Connection getConection(){
        String url, user, pass;
        
        url = "jdbc:mysql://localhost/registroalumnos";
        user = "root";
        pass = "frncisco631";
      
        
        //establezco el objeto de conexion
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Si conecto con la BD");
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("No conecto con la BD");
        }
        return con;
    }
    
}