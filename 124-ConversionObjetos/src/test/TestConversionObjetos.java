
package test;

import domain.*;


public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado = new Escritor("Luis Prado",50000,TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);
        System.out.println("empleado = " + empleado.obtenerDetalles());
        
        //realizamos la conversion de objetos downcastring
        Escritor escritor = ((Escritor)empleado);
        System.out.println(" conversion de objetos empleado  a escritor= " + escritor.obtenerDetalles());
        //upcasting
        Empleado empleadoDos = escritor;
        System.out.println("empleadoDos = " + empleadoDos.obtenerDetalles());
        
    }
}
