package Controlador;
import java.sql.*;
import Modelo.Usuario;

public class AccionesUsuario {
    //primero vamos a registrar un usuario
    public static int registrarUsuario(Usuario usuario){
        int estatus = 0;
        
        try{
            //establezco la conexion
            Connection con = Conexion.getConection();
            String q = "insert into usuario(nom_usuario, correo_usuario, contra_usuario)"
                    + "values (?,?,?)";
                    
            //el cual es preparar la sentencia
            PreparedStatement ps = con.prepareStatement(q);
            
            //obtener cada uno de los elementos del objeto
            ps.setString(1, usuario.getNom_usuario());
            ps.setString(2, usuario.getCorreo_usuario());
            ps.setString(3, usuario.getContra_usuario());
            
            //ejecuto la sentencia
            estatus = ps.executeUpdate();
            System.out.println("Usuario registrado con exito");
            con.close();
        }catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("No se pudo registrar el usuario");
        }
        return estatus;
    }
    
    public static Usuario buscarCorreo(String correo){
        //necesito crear una instancia del alumno
        Usuario user = new Usuario();
        try{
            Connection con = Conexion.getConection();
            String q = "select * from usuario where correo_usuario = ?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1, correo);
            ResultSet rs = ps.executeQuery();
            //tengo que buscar dentro de la tabla
            if(rs.next()){
                //get y set
                user.setIdUsuario(rs.getInt(1));
                user.setNom_usuario(rs.getString(2));
                user.setCorreo_usuario(rs.getString(3));
                user.setContra_usuario(rs.getString(4));
            }
            System.out.println("Se encontro al usuario");
            con.close();
        }catch(SQLException e){
            System.out.println("Error " + e.getMessage());
            System.out.println("No se encontro el usuario");
        }
        return user;
    }
}