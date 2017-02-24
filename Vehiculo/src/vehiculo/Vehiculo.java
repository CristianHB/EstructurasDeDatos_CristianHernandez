/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

import Carro.Carro;

/**
 *
 * @author Cristian David Hernandez Barrero
 */
//firma de la clase
public class Vehiculo {

    /**
     * @param args the command line arguments
     */
    
    // clase principal
    public static void main(String[] args) {
        // TODO code application logic here
        
        // se crea el objeto de la clase carro
        Carro mazda=new Carro();
        
        // se le meten los atributos modificables
        mazda.setColor("grisplata");
        mazda.setNumeroSoat("135b78c");
        
        System.out.println("modelo: " + mazda.getModelo() + 
                           "\ncolor: " + mazda.getColor() + 
                           "\nnumero de soat: " + mazda.getNumeroSoat() + 
                           "\nplaca: " + mazda.getPlaca());
        
        
    }
    
}
