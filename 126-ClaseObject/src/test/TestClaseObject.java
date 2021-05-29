
package test;

import domain.Empleado;


public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleadoUno = new Empleado("Luis Prado",50000);
        
        Empleado empleadoDos = new Empleado("Luis Prado",50000);
        //validamos si son iguales
        if(empleadoUno == empleadoDos){
            System.out.println("Tiene la misma referencia en memoria");
        }
        else{
            System.out.println("Tienen distinta referencia en memoria");
        }
        
        var respuesta =empleadoUno.equals(empleadoDos);
        if(respuesta){
            System.out.println("Los objetos son iguales en contenido");
        }
        else{
            System.out.println("Los objetos son distintos en contenido");
        }
         // sede comparar con hascode
         if(empleadoUno.hashCode() == empleadoDos.hashCode()){
             System.out.println("Los objetos son iguales en contenido");
         }
         else{
            System.out.println("Los objetos son distintos en contenido");
        }
    }
}
