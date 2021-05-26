/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

public class Gerente extends Empleado {
    
    private String departamento;
    public Gerente(String nombre, double sueldo,String departamento ) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    //el modificador no puede ser mas restrictivo que el de la clase padre
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles()+ "Departamento = "+ this.departamento;
    }
}
