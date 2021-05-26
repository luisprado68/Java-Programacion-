/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

 class Clase1 {
     private String atributoPrivate = "atributo Private";
    
     private Clase1(){
        System.out.println("Constructor Private");
    }
     public Clase1(String arg){
         this();
         System.out.println("Constructor publico");
     }
    
     private void metodoPrivate(){
        System.out.println("Metodo Private");
    }

    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
    
}
