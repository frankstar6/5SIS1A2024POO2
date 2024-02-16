
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Funciones {

    ArrayList<Persona> listapersonas = 
    new ArrayList<>();
    String rep = "si";
    String nombre = "";
    int edad, num_empleado, bol;

    //ahora aplicamos polimorfismo
    Persona alumno = new Alumno();
    //trabajador Persona trabajador = new Trabajador();

    //menu

    void menu(){
// si no esta declarado es publico 

while(true){

while(rep.equalsIgnoreCase(anotherString: "si")){
try{
String var = JOptionPane.showInputDialog("Ingresa la opcion deseada: \n" +"1. Registrar Alumno\n" +"2.Consultar Alumno\n" +"3. salir\n");
if(var == null){
System.exit(status:0);
}
int opcion =
Integer.parseInt(var);
switch (opcion){
case 1:
//metodo para pedir datos
// registro prueba textil: guardar,ingresas,editar,buscar,imprimir,firmar. Dos roles probador y supervisor (textil,composicion)
// constructores como es la estructura de los datos
pedirDatosAlumno();
alumno = new Alumno (bol, nombre, edad);
guardarAlumno();

break;

default:
System.out.println("Opcion no valida");
rep =JOptionPane.showInputDialog("Desea repetir?");

}


}catch(Exception e){
    System.out.println("Error: "  + e.getMessage());
}
}
}
    }
    private void pedirDatosAlumno(){
        bol = Integer.parseInt(JOptionPane.showInputDialog)
    }
    private void guardarAlumno(){
        listapersonas.add(alumno);
    }
    //metodo para leer un archivo 
    private void leerAlumnos(){
// definir donde esta el archivo que esta guardando la informacion
FileInputStream archivo = new FileInoutStream("archivo.dat");
// generar la lectura de los objetos
ObjectInputStream entrada = new ObjectInputStream(archivo);
// tenemos que transformar los objetos porque por defecto su lectura en bytes por lo tanto debe castear a un objeto
listapersonas = (ArrayList)entrada.readObject();

for(int i = 0; i < listapersonas.size(); i++){
// size para obtener el tamano
//recorro lo que necesito del objeto
Alumno obj = (Alumno)listapersonas.get(i);
//get (i); para contar la lista
JOptionPane.showMessageDialog(null, "\n" + "Numero de Alumno: " + (i+1) + "\n" + "NUmero de Alumno: " + obj.getBoleta() + "\n" + "Edad del Amuno: " + obj.getEdad()
+ "\n" + "Tipo de persona: " + obj.tipoPersona() + "\n"); 

}

private void guardar() throw Exception{ 
    //debo de generar el archivo de salida
    FileOutputStream archivo = new 
    FileOutputStream("archivo.dat ");
    //definimos que es un buffer de objetos
    ObjectOutputStream salida = new
    ObjectOutputStream(archivo);
    //empiezo a escribir
    salida.writeObject(listapersonas);
    salida.close();
    
}
    }



}
// examen: 