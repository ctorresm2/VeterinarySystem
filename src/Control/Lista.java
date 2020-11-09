package Control;

import Modelo.Usuario;
import java.util.ArrayList;

public class Lista {

    Nodo inicio, fin;

    public Lista() {
        inicio = fin = null;
    }

    public boolean vacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertarInicio(Usuario emp) {
        Nodo nuevo = new Nodo(emp);
        nuevo.setSiguiente(inicio);
        inicio = nuevo;
    }

    public void insertarFinal(Usuario emp) {
        Nodo nuevo = new Nodo(emp);
        if (vacia()) {
            inicio = nuevo;
        } else {
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
        fin.setSiguiente(null);

    }

    public ArrayList<Usuario> listar() {
        Nodo aux = inicio;
        ArrayList<Usuario> array = new ArrayList();
        while (aux != null) {
            array.add(new Usuario(aux.getInformacion().getNombre(),
                    aux.getInformacion().getUsuario(),
                    aux.getInformacion().getContraseña(),
                    aux.getInformacion().getPermisos()));
            aux = aux.getSiguiente();
        }
        return array;
    }

   
    
    public boolean verificar(String objBuscar) { 
       
                Nodo aux = inicio;
                while (aux != null && !objBuscar.equalsIgnoreCase(aux.getInformacion().getUsuario())) {
                    aux = aux.getSiguiente();
                }
                if (aux != null) {
                    return true;
                } else {
                    return false;
                }
    }
    
    public boolean verificarid(String objBuscar) { 
       
                Nodo aux = inicio;
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
       
                Nodo aux = inicio;
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
       
                Nodo aux = inicio;
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
       
                Nodo aux = inicio;
                while (aux != null && !objBuscar.equalsIgnoreCase(aux.getInformacion().getPermisos())) {
                    aux = aux.getSiguiente();
                }
                if (aux != null) {
                    return true;
                } else {
                    return false;
                }
    }
       
    
}
