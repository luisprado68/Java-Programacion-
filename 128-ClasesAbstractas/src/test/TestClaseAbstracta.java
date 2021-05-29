
package test;

import domain.*;

public class TestClaseAbstracta {
    public static void main(String[] args) {
        //no se puede trabajar objetos de la clase abstracta
        //FiguraGeometrica figura = new FiguraGeometrica();
        
        //aplicamos polimorfismo y upcasting
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
        System.out.println("figura = " + figura);
        
    }
}
