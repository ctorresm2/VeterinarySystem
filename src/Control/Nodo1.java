/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Clientes;

/**
 *
 * @author Cristian
 */
public class Nodo1 {
    private Clientes informacion; 
    private Nodo1 siguiente;
    

    public Nodo1(Clientes e) {
        this.informacion=e;
        siguiente=null;
    }

    public Clientes getInformacion() {
        return informacion;
    }

    public void setInformacion(Clientes informacion) {
        this.informacion = informacion;
    }

    public Nodo1 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo1 siguiente) {
        this.siguiente = siguiente;
    }
}
