/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.Random;

/**
 *
 * @author User
 */
public class clsJuego {
    private final int cantidadJugadores;
    private  clsListaCircular camino;
    private clsListaCircular jugadores[];

    public clsJuego(int cantidadJugadores, clsListaCircular camino,clsListaCircular jugadores[]) {
        this.cantidadJugadores = cantidadJugadores;
        this.camino = camino;
        this.jugadores = jugadores;
    }



    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    public clsListaCircular getCamino() {
        return camino;
    }


    public void setCamino(clsListaCircular camino) {
        this.camino = camino;
    }

    
    public void jugadorInicial(){
        Random inicia=new Random();   
        System.out.print("inicia el jugador: " +(int)(Math.random()*jugadores.length)+"\n");
                
    }
    
}
