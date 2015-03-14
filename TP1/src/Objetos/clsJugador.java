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
public class clsJugador {
    private final String nombre;
    private final clsFicha ficha;
    private double dinero=3000;

    public clsJugador(String nombre, clsFicha ficha){
        this.nombre = nombre;
        this.ficha = ficha;
    }

    public String getNombre() {
        return nombre;
    }

    public clsFicha getFicha() {
        return ficha;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    

    public void moverse(int pasos,clsListaCircular lista){
        clsNodo temporal= lista.getPrimerNodo();
        System.out.print("inicio a moverse \n");
        for (int index=0; index < pasos-1; index ++) {
            temporal= temporal.next;
        }
        temporal.getData().setDueño(nombre);
        }
    
    
    
    
}