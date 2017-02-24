/*
 
 */

//se define el paquete donde esta la clase
package estructurasdedatos.estructuraobjeto;

/**
 *
 * @author Cristian David Hernandez
 */

//la firma de la clase
public class Persona {
    
    private String nombre;
    private int cedula= 1088031031;
    private String direccion;
    private String telefono;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        //aqui se codifica las reglas a cumplir para poder cambiar atributo
        this.nombre = nombre;
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
