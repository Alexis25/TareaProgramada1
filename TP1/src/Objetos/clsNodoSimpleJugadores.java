/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author User
 */
public class clsNodoSimpleJugadores {
    private clsJugador dato;
    public clsNodoSimpleJugadores next;
    
    public clsNodoSimpleJugadores(){
    }

    public clsNodoSimpleJugadores(clsJugador dato, clsNodoSimpleJugadores next) {
        this.next = next;
        this.dato = dato;
    }
    
    public clsNodoSimpleJugadores(clsNodoSimpleJugadores pNext){
        next =pNext;
    }

    public clsJugador getDato() {
        return dato;
    }
    
}
