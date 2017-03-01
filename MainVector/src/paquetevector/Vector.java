/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetevector;

public class Vector {
    
   public int tamaño;
    
   public String[] vector = {null};
   
    public boolean crearVector(String tipoDato,int tamaño) {
            
        if (tipoDato=="String"){
            
               vector = new String[tamaño];  
               return true;       
        /*}else if (tipoDato=="int"){
            
               vector = new int[tamaño];  
               return true;*/  
        }else{
            
            return false;
        }   
    }
    
    public int buscarDato(String dato){
        int i;
        
        for (i=0; i<vector.length;i++) {
            if (dato == vector[i]) {
                System.out.println("el dato esta en " + i);
                return i;
            }else{
                System.out.println("");
                return 0;
            }                
                }   
    return 1;
    }
    
    public void listarVector(){
    int i;
        for(i=0; i<vector.length;i++){
        System.out.println(vector[i]+"/n");
        }
    
    }
    
    
    
    
    
    
    
}
