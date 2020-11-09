
package Control;

import Modelo.Usuario;


public class Nodo {
    private Usuario informacion; 
    private Nodo siguiente;
    

    public Nodo(Usuario e) {
        this.informacion=e;
        siguiente=null;
    }

    public Usuario getInformacion() {
        return informacion;
    }

    public void setInformacion(Usuario informacion) {
        this.informacion = informacion;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
    
}
