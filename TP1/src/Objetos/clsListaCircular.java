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
public class clsListaCircular {
        private clsNodo primerNodo;
        private clsNodo ultimoNodo;
        int size;
        
        public clsListaCircular(){
                primerNodo = ultimoNodo = new clsNodo();
                size = 0;
            } 

        void insertarInicio(clsPropiedad dato){
        if (size ==0){
            primerNodo = ultimoNodo= new clsNodo(dato,primerNodo,null);
            size++;
        } else {
            clsNodo nuevo= new clsNodo(dato,primerNodo,null);         
            primerNodo.back=nuevo;
            primerNodo= nuevo;
            size++;
        }
    }
        
    void imprimirLista() {
        clsNodo actual = primerNodo;
        System.out.print("La lista actual es la siguiente \n");
        for (int index=0; index < size; index ++) {
             System.out.print(actual.getData().toString());
//            cout<< actual->back;
            System.out.print( " <-> ");
            actual = actual.next;
        }
        
    }
}
