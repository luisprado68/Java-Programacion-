
package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {
    
    //agregamos throws al metodo que posible lance la expecion
    public static int division(int numerador,int denominador) throws OperacionExcepcion {
        
        if(denominador == 0){
            throw new OperacionExcepcion("No puede dividir por cero");
        }
        return numerador / denominador;
    }
}
