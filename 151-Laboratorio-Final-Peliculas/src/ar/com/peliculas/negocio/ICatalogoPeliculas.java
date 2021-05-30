
package ar.com.peliculas.negocio;


public interface ICatalogoPeliculas {
     void agregarPelicula(String nombrePelicula,String nombreArchivo);
     void listarPeliculas(String nombrePeliculas);
     void buscarPelicula(String nombreArchivo,String buscar);
     void inciarArchivo(String nombreArchivo);
     
}
