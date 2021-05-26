
package paquete1;

import paquete1.Clase1;


public class TestModificadoresAcceso {
    public static void main(String[] args) {
        
//        Clase1 clase = new Clase1("Publico");
//        System.out.println("clase = " + clase.atributoPublico);
//        clase.metodoPublico();
//        System.out.println("");
//        ClaseHija  claseHija = new ClaseHija();
//        System.out.println("claseHija = " + claseHija);
        Clase1 clase1 = new Clase1("Publico");
        clase1.setAtributoPrivate("Cambio desde la prueba"); 
        System.out.println("clase1atributoDefault = " + clase1.getAtributoPrivate());
        
 
}
}