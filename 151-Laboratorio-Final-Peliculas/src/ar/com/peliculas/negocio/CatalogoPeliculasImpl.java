
package ar.com.peliculas.negocio;

import ar.com.peliculas.datos.AccesoDatosImpl;
import ar.com.peliculas.domain.Pelicula;
import java.util.List;



public class CatalogoPeliculasImpl implements ICatalogoPeliculas{
    
    public AccesoDatosImpl datos;
   
    @Override
    public void agregarPelicula(String nombrePelicula,String nombreArchivo){
        this.datos = new AccesoDatosImpl();
        Pelicula nuevaPelicula = new Pelicula(nombrePelicula);
        this.datos.escribir(nuevaPelicula, nombreArchivo, true);
    }
    @Override
     public void listarPeliculas(String nombreArchivo){
         AccesoDatosImpl acceso = new AccesoDatosImpl();
          List<Pelicula> peliculas = acceso.listar(nombreArchivo);
          for(Pelicula pelicula : peliculas){
              System.out.println("pelicula = " + pelicula);
            }
     }
     @Override
     public void buscarPelicula(String nombreArchivo,String buscar){
         AccesoDatosImpl acceso = new AccesoDatosImpl();
         var pelicula = acceso.buscar(nombreArchivo, buscar);
         System.out.println("pelicula = " + pelicula);
     }
     @Override
     public void inciarArchivo(String nombreArchivo){
         AccesoDatosImpl acceso = new AccesoDatosImpl();
         acceso.crear(nombreArchivo);
     }

    
}
