
package test;

import genericos.ClaseGenerica;


public class TestGenerics {
    public static void main(String[] args) {
        //el constructor espera el tipo indicado al creaar la clase <string>
        ClaseGenerica<String> clase = new ClaseGenerica<String>("Hola");
        clase.obtenerTipo();
        
        System.out.println("");
        ClaseGenerica<Integer> claseDos = new ClaseGenerica<Integer>(150);
        claseDos.obtenerTipo();
    }
}
