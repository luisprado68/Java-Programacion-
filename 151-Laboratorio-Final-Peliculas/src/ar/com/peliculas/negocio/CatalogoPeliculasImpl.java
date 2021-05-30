
package ar.com.peliculas.negocio;

import ar.com.peliculas.datos.AccesoDatosImpl;
import ar.com.peliculas.domain.Pelicula;
import ar.com.peliculas.excepciones.AccesoDatosException;
import ar.com.peliculas.excepciones.EscrituraDatosException;
import ar.com.peliculas.excepciones.LecturaDatosException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class CatalogoPeliculasImpl implements ICatalogoPeliculas{
    
    public AccesoDatosImpl datos;
    public CatalogoPeliculasImpl(){
        this.datos = new AccesoDatosImpl();
    }
    @Override
    public void agregarPelicula(String nombrePelicula,String nombreArchivo){
     
        Pelicula nuevaPelicula = new Pelicula(nombrePelicula);
        try {
            this.datos.escribir(nuevaPelicula, nombreArchivo, true);
        } catch (EscrituraDatosException ex) {
            System.out.println("Error de acceso a datos");
        }
    }
    @Override
     public void listarPeliculas(String nombreArchivo){
         
          List<Pelicula> peliculas;
        try {
            peliculas = this.datos.listar(nombreArchivo);
            for(Pelicula pelicula : peliculas){
              System.out.println("pelicula = " + pelicula);
            }
        } catch (LecturaDatosException ex) {
            System.out.println("Error de lectura de datos");
        }
          
     }
     @Override
     public void buscarPelicula(String nombreArchivo,String buscar){
         
        try {
            var pelicula = this.datos.buscar(nombreArchivo, buscar);
            System.out.println("pelicula = " + pelicula);
        } catch (LecturaDatosException ex) {
           System.out.println("Error de lectura de datos");
        }
         
     }
     @Override
     public void inciarArchivo(String nombreArchivo){
        try {
            this.datos.crear(nombreArchivo);
        } catch (AccesoDatosException ex) {
            System.out.println("Error de acceso a datos");
        }
     }

    
}
