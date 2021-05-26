
package test;


public class TestArgumentosVariables {
    public static void main(String[] args) {
        
        imprimirNumeros(1,50,20,35,45);
        imprimirNumeros(250,214,5,20);
        
        variosPrametros("Luis",4,7,5);
    }
    //argumentos variables no neceistamos indicar el n de parametros
    //se los maneja como un array
    public static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento: = " + numeros[i]);
        }
    }
    
    //podemos hacer un metodo con otro parametro siempre y cuando el argumento
    //variable quede como ultimo parametro 
    public static void variosPrametros(String nombre,int... numeros){
        System.out.println("nombre: "+nombre);
        imprimirNumeros(numeros);
    }
}
