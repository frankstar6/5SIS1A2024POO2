package Modelo;

public class Usuario {
    private int idUsuario;
    private String nom_usuario, correo_usuario, contra_usuario;
    
    public Usuario() {   
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public String getNom_usuario() {
        return nom_usuario;
    }
    
    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }
    
    public String getCorreo_usuario() {
        return correo_usuario;
    }
    
    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }
    
    public String getContra_usuario() {
        return contra_usuario;
    }
    
    public void setContra_usuario(String contra_usuario) {
        this.contra_usuario = contra_usuario;
    }    
}