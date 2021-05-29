
package aritmetica;

import excepciones.OperacionExcepcion1;

public class Aritmetica1 {
    
    //agregamos throws al metodo que posible lance la expecion
    public static int division1(int numerador,int denominador) {
        
        if(denominador == 0){
            throw new OperacionExcepcion1("No puede dividir por cero");
        }
        return numerador / denominador;
    }
}
