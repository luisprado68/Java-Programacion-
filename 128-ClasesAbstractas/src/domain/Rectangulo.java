/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Luis
 */
public class   Rectangulo extends FiguraGeometrica {

    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }
    //aqui lo estamos implementando el metodo
    @Override
    public void dibujar() {
        System.out.println("Se imprime un : "+ this.getClass().getSimpleName());
    }
    
}
