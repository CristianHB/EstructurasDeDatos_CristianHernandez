/*
fecha: 22/02/2017 primer clase, donde creamos objeto

 */
package estructurasdedatos;

//importamos el paquete para poder acceder a el
import estructurasdedatos.estructuraobjeto.Persona;

/**
 *
 * @author Usuario Cristian David Hernandez Barrero
 */
public class EstructurasDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Persona juan=new Persona();
        juan.setNombre("juan hernandez");
        juan.setDireccion("villa del campo");
        juan.setTelefono("3128032834");
        
        System.out.println("nombre: " + juan.getNombre() +
                           "\ncedula: " + juan.getCedula() +
                           "\ndirección: " + juan.getDireccion()+
                           "\ntelefono: " + juan.getTelefono());
    }
    
}
