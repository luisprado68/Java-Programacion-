
package test;

import java.util.*;


public class TestColecciones {
    public static void main(String[] args) {
        //la lista no necesita declarar el tamaño se pueden duplicar elementos
        List lista = new ArrayList();
        System.out.println("List");
        lista.add("Lunes");
        lista.add("Martes");
        lista.add("Miercoles");
        lista.add("Jueves");
        lista.add("Viernes");
        lista.add("Sabado");
        lista.add("Domingo");
        
        //funciona landa flecha
//        lista.forEach(elemento -> {
//            System.out.println("elemento = " + elemento);
//        });
        imprimir(lista);
        System.out.println("");
        
        // La clase set a medida que se agregan elementos no mantiene el orden
        //no se pueden duplicar elementos
        System.out.println("Set");
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");//no se imprimie por duplicado
        
        imprimir(miSet);
        System.out.println("");
        System.out.println("Map");
        //Diccionario llave valor Map
        Map miMapa = new HashMap();
        miMapa.put("llave1", "Luis");
        miMapa.put("llave2", "Maria");
        miMapa.put("llave3", "Amadeo");
        miMapa.put("llave4", "Karen");
        
        //get devuelve un objeto por ende se debe realizar un casteo
        String elemento = (String) miMapa.get("llave1");
        System.out.println("elemento = " + elemento);
        
        System.out.println("");
        //podemos llamar todas la llaves en un set
        imprimir(miMapa.keySet());
        
        //imprimir los valores
        imprimir(miMapa.values());
    }
    //vamos a aplicar polimorfismo haciendo un metodo mas generico ya que 
    //la clase arraylist y hashset implementan interfaces hijas de collection
    public static void imprimir(Collection lista){
        
        for(Object elemento : lista){
            System.out.println("elemento = " + elemento);
        }
    }
}
