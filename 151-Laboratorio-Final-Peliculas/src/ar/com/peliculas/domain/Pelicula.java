
package ar.com.peliculas.domain;


public class Pelicula {
    private String nombre;
    
    public Pelicula(){
        this.nombre = "";
    }
    public Pelicula(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
}
