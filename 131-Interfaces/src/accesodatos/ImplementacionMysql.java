/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;

//la clase que implementa la interfaz esta obligada a implementar los metodps
//o marcar la clase como abstracta pero no se podria instanciar 
public class ImplementacionMysql implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar desde mysql");
    }

    @Override
    public void listar() {
        System.out.println("listar desde mysql");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizar desde mysql");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminar desde mysql");
    }
    
}
