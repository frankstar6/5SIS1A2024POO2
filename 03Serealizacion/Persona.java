import java.io.*;
/* la serealizacion es el proceso mediante el cual el programa puede traducir a un archivo los objetos que se le marquen para su almacenamiento
 * o por tipos de dato la diferencia radica principalmente en el buffer madiante el cual se envia o se extrae la informacion
 * el buffer es el media mediante el cual vamos a transmitir los datos
  * un objeto se transforma en lenguaje de java
  * .io es entrada y salida de datos (leer o escribir)
  * abstracto: algo que puedes imaginar
  """"investigar funciones""""
  siguiente semana parte web

 */ 

 public abstract class Persona implements Serializable {

  private String nombre;
  private int edad;

public Persona(){
}

public Persona (String nombre, int edad){
this.nombre = nombre;
this.edad = edad;

}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public int getEdad() {
    return edad;
}

public void setEdad(int edad) {
    this.edad = edad;
}

abstract String tipoPersona();

 }

