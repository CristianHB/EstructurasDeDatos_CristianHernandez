/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos.estructuravector;

public class Vector {
    
   private int tamaño;
    
   private String[] vector ;
   
    public boolean crearVector(int t) {
        
         boolean salida;
         
         if(this.vector==null)
         { 
             this.setTamaño(t);
             this.vector=new String[this.tamaño];
             salida=true;
             System.out.println("se ha creado el vector");
         }else
         {
             System.out.println("este vector ya esta crado");
             salida=false;
         }
       
       return salida;
    }

    
    public int buscarDato(String dato){
        int i;
        int salida=0;
        
        for (i=0; i<vector.length;i++) {
            if (dato.equals(vector[i])) {
                System.out.println("el dato esta en ");
                salida=i;
                break;
            }else{
                System.out.println("no existe");
                salida=-9999;
            }                
                }   
    return salida;
    }
    
    public void listarVector(){
    int i;
        for(i=0; i<vector.length;i++)
        {
        System.out.println(vector[i]);
        }
    
    }
    
    public boolean insertarDato(String tipoDato,int pos){
        
        vector[pos]=tipoDato;
    return true;
        }
    
    
    public boolean eliminarVector(){
        this.vector=null;
        return false;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    }
    
    
    
    
    
    
    

