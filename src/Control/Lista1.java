
package Control;

import Modelo.Clientes;
import java.util.ArrayList;


public class Lista1 {
    Nodo1 inicio, fin;

    public Lista1(){
        inicio = fin = null;
    }

    public boolean vacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertarInicio(Clientes emp) {
        Nodo1 nuevo = new Nodo1(emp);
        nuevo.setSiguiente(inicio);
        inicio = nuevo;
    }

    public void insertarFinal(Clientes emp) {
        Nodo1 nuevo = new Nodo1(emp);
        if (vacia()) {
            inicio = nuevo;
        } else {
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
        fin.setSiguiente(null);

    }

    public ArrayList<Clientes> listar() {
        Nodo1 aux = inicio;
        ArrayList<Clientes> array = new ArrayList();
        while (aux != null) {
            array.add(new Clientes(aux.getInformacion().getCliente(),
                    aux.getInformacion().getMascota(),
                    aux.getInformacion().getEdad(),
                    aux.getInformacion().getTipo()));
            aux = aux.getSiguiente();
        }
        return array;
    }

   
    
    public boolean verificar(String objBuscar) { 
       
                Nodo1 aux = inicio;
                while (aux != null && !objBuscar.equalsIgnoreCase(aux.getInformacion().getMascota())) {
                    aux = aux.getSiguiente();
                }
                if (aux != null) {
                    return true;
                } else {
                    return false;
                }
    }
    /**
    public boolean verificarid(String objBuscar) { 
       
                Nodo1 aux = inicio;
                while (aux != null && !objBuscar.equalsIgnoreCase(aux.getInformacion().getUsuario())) {
                    aux = aux.getSiguiente();
                }
                if (aux != null) {
                    return true;
                } else {
                    return false;
                }
    }
    
    public boolean verificarpw(String objBuscar) { 
       
                Nodo1 aux = inicio;
                while (aux != null && !objBuscar.equalsIgnoreCase(aux.getInformacion().getContraseña())) {
                    aux = aux.getSiguiente();
                }
                if (aux != null) {
                    return true;
                } else {
                    return false;
                }
    }
    
    public boolean verificarlogin(String objBuscar) { 
       
                Nodo1 aux = inicio;
                while (aux != null && !objBuscar.equalsIgnoreCase(aux.getInformacion().getUsuario())
                        && !objBuscar.equalsIgnoreCase(aux.getInformacion().getContraseña())
                        && !objBuscar.equalsIgnoreCase(aux.getInformacion().getPermisos())) {
                    aux = aux.getSiguiente();
                }
                if (aux != null) {
                    return true;
                } else {
                    return false;
                }
    }
    
    public boolean verificarpermiso(String objBuscar) { 
       
                Nodo1 aux = inicio;
                while (aux != null && !objBuscar.equalsIgnoreCase(aux.getInformacion().getPermisos())) {
                    aux = aux.getSiguiente();
                }
                if (aux != null) {
                    return true;
                } else {
                    return false;
                }
    }**/
}
