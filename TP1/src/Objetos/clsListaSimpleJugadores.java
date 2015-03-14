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
public class clsListaSimpleJugadores {
    private clsNodoSimpleJugadores primerNodo;
    private clsNodoSimpleJugadores ultimoNodo;
    int size;
    
    public clsListaSimpleJugadores(){
        primerNodo = ultimoNodo = new clsNodoSimpleJugadores();
        size = 0;
    }
    
    public void insertarInicio(clsJugador dato){
        if(size==0){
            primerNodo = ultimoNodo = new clsNodoSimpleJugadores(dato, primerNodo);
            size++;
        }
        else{
            primerNodo = new clsNodoSimpleJugadores(dato,primerNodo);
            size++;
        }
    }
   
    void imprimirLista() {
        clsNodoSimpleJugadores actual = primerNodo;
        System.out.print("La lista actual es la siguiente \n");
        for (int index=0; index < size; index ++) {
            System.out.print(actual.getDato().toString());
//            System.out.print(actual.getDato());  //para poder probarlo con enteros
            System.out.print( " -> ");
            actual = actual.next;
        }
    }
    
}
