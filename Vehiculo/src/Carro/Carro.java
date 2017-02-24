/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//se crea el paquete carro donde va la clase igual llamada carro
package Carro;

/**
 *
 * @author Cristian David Hernandez Barrero
 */
// firma de la clase
public class Carro {
    
    //se crean los atributos
    
    private String modelo="aveo Family";
    private String numeroSoat;
    private String color;
    private String placa="IBX064";

    //se genera el encapsulamiento, como la placa y el modelo del carro 
    //nunca cambian, entonces no le genero el set.
    
    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @return the numeroSoat
     */
    public String getNumeroSoat() {
        return numeroSoat;
    }

    /**
     * @param numeroSoat the numeroSoat to set
     */
    public void setNumeroSoat(String numeroSoat) {
        this.numeroSoat = numeroSoat;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    
}
