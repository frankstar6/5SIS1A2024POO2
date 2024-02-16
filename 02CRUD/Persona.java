// vamos a crear una 



public class Persona {
     
    private int id;
    private String nombre;
    private int edad;

     // constructor define la instancia del objeto
     //tipos de constructor "n", sobrecarga nombrar a un mismoobjeto pero con diferentes parametros, getter y setter
     // funcion otorga un resultado, hay una salida y el metodo solo  recibe datos 

     public Persona (){
        
     }

public Persona(int id, String nombre, int edad){
    this.id = id; 
    this.nombre = nombre;
    this.edad = edad;

}

public int getId(){
    return id; 
}

public void setId(int id){
    this.id = id;

}
public int getEdad(){
    return edad; 
}

public void setEdad(int edad){
    this.edad = edad;

}
public int getNombre(){
    return nombre; 
}

public void setNombre(int nombre){
    this.nombre = nombre;
}
}