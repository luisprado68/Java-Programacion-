/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Persona;

public class TestFoEach {
    public static void main(String[] args) {
        int edades[] = {5,6,8,51};
        
        for(int edad : edades){
            System.out.println("edad = " + edad);
        }
        
        Persona personas[] = {new Persona("Juan"),
                              new Persona("Maria"),
                               new Persona("Celeste")};
        
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }
}
