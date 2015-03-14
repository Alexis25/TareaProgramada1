/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Daviid
 */
public class clsNodoSimple {
    private clsCartas dato;
    public clsNodoSimple next;
    
    public clsNodoSimple(){
    }

    public clsNodoSimple(clsCartas dato, clsNodoSimple next) {
        this.next = next;
        this.dato = dato;
    }
    
    public clsNodoSimple(clsNodoSimple pNext){
        next =pNext;
    }

    public clsCartas getDato() {
        return dato;
    }
}
