
package domain;


public class Escritor extends Empleado{
    
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles()+"Tipo Escritura = "+ tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        return super.toString() + "Escritor{" + "tipoEscritura=" + tipoEscritura + '}';
    }
    
}
