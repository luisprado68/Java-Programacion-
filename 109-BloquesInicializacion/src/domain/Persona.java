/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author CE39207770
 */
public class Persona {
    private int idPersona;
    private static int contaadorPersona;
    //bloque de codigo de inicializacion estatico
    //se ejecuta antes del contructor y del bci no estatico
    //se ejecuta una vez
    static{
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contaadorPersona;
    }
    //bloque de incicializacion no estatico se ejecuta cada vez que se crea un objeto 
    {
        System.out.println("Ejecucion de bloque no estatico");
        this.idPersona =Persona.contaadorPersona++;
    }
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
    
}
