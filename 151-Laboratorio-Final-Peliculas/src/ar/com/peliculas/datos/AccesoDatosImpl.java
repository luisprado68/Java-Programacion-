
package ar.com.peliculas.datos;

import ar.com.peliculas.domain.Pelicula;
import ar.com.peliculas.excepciones.EscrituraDatosException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class AccesoDatosImpl implements IAccesoDatos{
    public AccesoDatosImpl(){
        
    }

    @Override
    public boolean existe(String nombreArchivo) {
        File archivo = new File(nombreArchivo+ ".txt");
        
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) {
        
        List<Pelicula> peliculas = new ArrayList<>();
        var archivo = new File(nombreArchivo + ".txt");
        
        try {
            
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();
            
            while(lectura != null){
                peliculas.add(new Pelicula(lectura));
                lectura = entrada.readLine();
            }
            entrada.close();
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        
        
        return  peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {
        
        File archivo = new File(nombreArchivo + ".txt");
        try {
            //con fileWrite le indicamos true para anexar la informacion
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula);
            salida.close();
            System.out.println("Se ha anexado la pelicula  al archivo");
       
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) {
        
        if(this.existe(nombreArchivo)){
            List<Pelicula> lista = this.listar(nombreArchivo);
            for(Pelicula pelicula : lista){
                if(pelicula.toString().equals(buscar)){
                    return buscar;
                }
            }
                    
        }
        else{
            return "No existe el archivo";
        }
        return "No se encuentra la pelicula indicada";
    }

    @Override
    public void crear(String nombreArchivo) {
        File archivo = new File(nombreArchivo + ".txt");
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void borrar(String nombreArchivo) {
        if(this.existe(nombreArchivo)){
        
        File archivo = new File(nombreArchivo + ".txt");
        if (archivo.delete()){
            System.out.println("El fichero ha sido borrado satisfactoriamente");
        }
        else{
            System.out.println("El fichero no puede ser borrado");
        }
        }
        else{
            System.out.println("No existe el archivo");
        }
       
}
}
