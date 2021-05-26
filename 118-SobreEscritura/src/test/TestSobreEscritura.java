/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
//con * llamamos a todas las clases de la carpteta
import domain.*;


public class TestSobreEscritura {
    public static void main(String[] args) {
//        Gerente g = new Gerente("Luis Prado",50000,"Sistemas");
//        System.out.println(g.obtenerDetalles()); 
        
        //polimorfismo
        Empleado empleado = new Empleado("Juan",5000);
        //System.out.println(empleado.obtenerDetalles()); 
        imprimir(empleado);
        Gerente g = new Gerente("Luis Prado",50000,"Sistemas");
        //System.out.println(g.obtenerDetalles()); 
        imprimir(g);
    } 
    //polimorfismo depende de la referencia del objeto donde evalua el meotod a utilizar
    public static void imprimir(Empleado empleado){
        System.out.println(empleado.obtenerDetalles());
    }
}
