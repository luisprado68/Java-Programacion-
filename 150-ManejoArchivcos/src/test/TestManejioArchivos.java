
package test;

import static manejoarchivos.ManejoArchivos.*;


public class TestManejioArchivos {
    public static void main(String[] args) {
        var nombre = "test.txt";
       
        //crearArchivo(nombre);
        
        //escribirArchivo(nombre, "Hola desde JAVA");
        //anexarArchivo(nombre, "nos vemos!");
        
        leerArchivo(nombre);
    }
}
