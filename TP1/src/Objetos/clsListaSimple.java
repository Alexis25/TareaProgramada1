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
public class clsListaSimple {
    private clsNodoSimple primerNodo;
    private clsNodoSimple ultimoNodo;
    int size;
    
    public clsListaSimple(){
        primerNodo = ultimoNodo = new clsNodoSimple();
        size = 0;
    }
    
    public void insertarInicio(clsCartas dato){
        if(size==0){
            primerNodo = ultimoNodo = new clsNodoSimple(dato, primerNodo);
            size++;
        }
        else{
            primerNodo = new clsNodoSimple(dato,primerNodo);
            size++;
        }
    }
   
    void imprimirLista() {
        clsNodoSimple actual = primerNodo;
        System.out.print("La lista actual es la siguiente \n");
        for (int index=0; index < size; index ++) {
            System.out.print(actual.getDato().toString());
//            System.out.print(actual.getDato());  //para poder probarlo con enteros
            System.out.print( " -> ");
            actual = actual.next;
        }
    }
}
