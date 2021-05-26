/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //clases envolvente de tipos primitivos
        /*int - Integer
        long - Long
        float - Float
        double - Double
        boolen - Boolean
        byte - Byte
        char Character
        short - Short
        */
        //Se utilizan para obtener metodos de clase eje convertir a double
        Integer entero = 10;
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.doubleValue());
        //unboxing de object a tipo primitivo
        int entero2 = entero;
        System.out.println("entero2 = " + entero2);
    }
}
