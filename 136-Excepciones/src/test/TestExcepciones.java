package test;

import aritmetica.*;
import excepciones.OperacionExcepcion;

public class TestExcepciones {
    public static void main(String[] args) {
        
        int resultado = 0;
        
        try {
            resultado = Aritmetica.division(10, 0);
        }catch(OperacionExcepcion e){
            System.out.println("Ocurrio un error de tipo  OperacionExcepcion");
            e.printStackTrace(System.out);
        
        } catch (Exception e){
            System.out.println("Ocurrio un error de tipo Excepcion");
            e.printStackTrace(System.out);//para imprimir la lista de excepciones que viene en consola(System.out)
        }
        finally{
            System.out.println("Se reviso la division entre cero");
        }
        System.out.println("resultado = " + resultado);
        
        ///runtimeexception****************************************************
        System.out.println("");
        System.out.println("runtimeexception");
        System.out.println("");
         int result = 0;
        
        try {
            result = Aritmetica1.division1(10, 0);
        } catch (Exception e) {
            System.out.println("Ocurrio un error");
            e.printStackTrace(System.out);//para imprimir la lista de excepciones que viene en consola(System.out)
        }
        System.out.println("resultado = " + result);
        
    }
}
