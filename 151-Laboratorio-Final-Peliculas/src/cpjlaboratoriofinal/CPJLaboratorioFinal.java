
package cpjlaboratoriofinal;

import ar.com.peliculas.negocio.CatalogoPeliculasImpl;
import java.util.Scanner;

public class CPJLaboratorioFinal {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int opcion;
        String nombreArchivo = "Terror";
        CatalogoPeliculasImpl catalago = new CatalogoPeliculasImpl();
        
        System.out.println("\n1.- Iniciar catalogos de peliculas"
         + "\n2.- Agregar película"
        +"\n3.- Listar Películas"
         + "\n4.- Buscar Película"
        +"\n0- Salir\nEliga una opcion:");
        opcion = Integer.parseInt(consola.nextLine());
        switch(opcion){
            case 0:
                System.exit(0);
                break;
            case 1:
               catalago.inciarArchivo(nombreArchivo );
                break;
            case 2:
                System.out.println("Ingresa un nombre de la pelicula a agregar:");
                var pelicula = consola.nextLine();
                catalago.agregarPelicula(pelicula, nombreArchivo);
                break;
            case 3:
                catalago.listarPeliculas(nombreArchivo);
                break;
            case 4:
                System.out.println("Ingresa un nombre de la pelicula a buscar:");
                var peliculaDos = consola.nextLine();
                catalago.buscarPelicula(nombreArchivo, peliculaDos);
                break;
            default:
                    break;
                
        }
    }
}
