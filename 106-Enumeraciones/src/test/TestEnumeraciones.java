
package test;

import enumercion.Continentes;
import enumercion.Dias;


public class TestEnumeraciones {
    public static void main(String[] args) {
        
        System.out.println("Dia 1: "+ Dias.LUNES);
        indicarDiaSemana(Dias.SABADO);
        
        System.out.println("Continente 4: " + Continentes.AMERICA);
         System.out.println("Continente 4 paises: " + Continentes.AMERICA.getPaises());
    }
    private static void indicarDiaSemana(Dias dia){
        switch(dia){
            case LUNES:
                System.out.println("1 dia de la semana");
                break;
            case MARTES:
                System.out.println("2 dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("3 dia de la semana");
                break;
            case JUEVES:
                System.out.println("4 dia de la semana");
                break;
            case VIERNES:
                System.out.println("5 dia de la semana");
                break;
            case SABADO:
                System.out.println("6 dia de la semana");
                break;
            case DOMINGO:
                System.out.println("7 dia de la semana");
                break;
        }
    }
}
