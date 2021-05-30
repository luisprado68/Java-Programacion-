
package ar.com.peliculas.datos;

import ar.com.peliculas.domain.Pelicula;
import ar.com.peliculas.excepciones.*;

import java.util.List;

public interface IAccesoDatos {
    public boolean existe(String nombreArchivo) throws AccesoDatosException;
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosException;
    public void escribir(Pelicula pelicula,String nombreArchivo,boolean anexar) throws EscrituraDatosException;
    public String buscar(String nombreArchivo,String buscar) throws LecturaDatosException;
    public void crear(String nombreArchivo) throws AccesoDatosException;
    public void borrar(String nombreArchivo) throws AccesoDatosException;
    
    
    
}
