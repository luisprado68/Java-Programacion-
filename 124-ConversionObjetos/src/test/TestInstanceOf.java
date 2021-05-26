/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
//con * llamamos a todas las clases de la carpteta
import domain.*;


public class TestInstanceOf {
    public static void main(String[] args) {
      
        Empleado empleado = new Empleado("Juan",5000);
         
        determinarTipo(empleado);
        Gerente g = new Gerente("Luis Prado",50000,"Sistemas");
        
        determinarTipo(g);
    } 
    
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo gerente");
            Gerente g = (Gerente)empleado;
            System.out.println(g.getDepartamento());
        }
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
//            Gerente g = (Gerente)empleado; no se puede convertir de padre a hijo
           System.out.println(empleado.getNombre());
        }
        else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }
}
