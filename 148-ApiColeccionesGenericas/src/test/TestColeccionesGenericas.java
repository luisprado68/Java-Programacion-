
package test;

import java.util.*;


public class TestColeccionesGenericas {
    public static void main(String[] args) {
        //se puede omitir el tipo en el generico y dejar como notacion diamante
        //con esto indicamos el tipo de elementos que va almacenar la lista
        //en esta caso de tipo string
        List<String> lista = new ArrayList<>();
        System.out.println("List");
        lista.add("Lunes");
        lista.add("Martes");
        lista.add("Miercoles");
        lista.add("Jueves");
        lista.add("Viernes");
        lista.add("Sabado");
        lista.add("Domingo");
        
        //no hace falta realizar el casteo debido a que ya definimos el tipo en el generico
        String palabra = lista.get(0);
        System.out.println("elemento = " + palabra);
        
        //funciona landa flecha
//        lista.forEach(elemento -> {
//            System.out.println("elemento = " + elemento);
//        });
        imprimir(lista);
        System.out.println("");
        
        // La clase set a medida que se agregan elementos no mantiene el orden
        //no se pueden duplicar elementos
        System.out.println("Set");
        Set<String> miSet = new HashSet<>();
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
        Map<String,String> miMapa = new HashMap<>();
        miMapa.put("llave1", "Luis");
        miMapa.put("llave2", "Maria");
        miMapa.put("llave3", "Amadeo");
        miMapa.put("llave4", "Karen");
        miMapa.put("llave4", "Camila");//en este caso el valor de llave cuatro sera reemplazado por camila
        
        //get devuelve un objeto por ende se debe realizar un casteo
        String elementoMap =  miMapa.get("llave1");
        System.out.println("elemento = " + elementoMap);
        
        System.out.println("");
        //podemos llamar todas la llaves en un set
        imprimir(miMapa.keySet());
        
        //imprimir los valores
        imprimir(miMapa.values());
    }
    //podemos especificar el tipo de string 
    public static void imprimir(Collection<String> lista){
        //ahora sabemos que imprimos un string por lo tanto espesificamos el tipo
        for(String elemento : lista){
            System.out.println("elemento = " + elemento);
        }
    }
}
