
package test;

import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionMysql;
import accesodatos.ImplementacionOracle;


public class TestInterfaces {
    public static void main(String[] args) {
        //no se púede crear onbjetos de una interface por que son abstractas
        IAccesoDatos datos = new ImplementacionMysql();
        datos.listar();
        
        datos = new ImplementacionOracle();
        datos.listar();
        
        imprimir(datos);
    
    }
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
