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
public class clsNodo {
    private clsPropiedad data;
    public clsNodo next;
    public clsNodo back;

//    public Nodo() {
//    }

    public clsNodo( clsPropiedad data, clsNodo next, clsNodo back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }
    
    public clsNodo (clsNodo pNext ,clsNodo pBack) {
        next = pNext;
        back=pBack;
    }

    
    clsPropiedad getData() {
        return data;
    }
    
}
