
package ar.com.peliculas.datos;

import ar.com.peliculas.domain.Pelicula;
import java.util.List;

public interface IAccesoDatos {
    public boolean existe(String nombreArchivo);
    public List<Pelicula> listar(String nombreArchivo);
    public void escribir(Pelicula pelicula,String nombreArchivo,boolean anexar);
    public String buscar(String nombreArchivo,String buscar);
    public void crear(String nombreArchivo);
    public void borrar(String nombreArchivo);
    
    
    
}
