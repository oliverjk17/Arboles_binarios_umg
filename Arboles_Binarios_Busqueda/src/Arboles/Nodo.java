/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;

/**
 *
 * @author OLIVER
 */
public class Nodo {
    public Nodo izquierdo, derecho;
    public int llave;
    
    public Nodo(int llave)
    {
        this.llave=llave;
        this.izquierdo=null;
        this.derecho=null;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }

    public int getLlave() {
        return llave;
    }

    public void setLlave(int llave) {
        this.llave = llave;
    }
    
    public void insertar(int numero)
    {
        if(numero<this.llave)
        {
            if(this.izquierdo == null)
            {
                this.izquierdo = new Nodo(numero);
            } else
            {
                this.izquierdo.insertar(numero);
            }
        }else
        {
            if(this.derecho == null )
            {
                this.derecho = new Nodo (numero);
            }else
            {
                this.derecho.insertar(numero);
            }
        }
    }
}

