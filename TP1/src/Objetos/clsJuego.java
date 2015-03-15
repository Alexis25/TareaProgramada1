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
    private clsListaSimpleJugadores jugadores;

    public clsJuego(int cantidadJugadores, clsListaCircular camino,clsListaSimpleJugadores jugadores) {
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
//        Random inicia=new Random();   
//        System.out.print("inicia el jugador: " +(int)(Math.random()*cantidadJugadores+0)+"\n");
        Random random=new Random();
        int inicia= (int)(random.nextInt(cantidadJugadores));
        if (inicia!=0){
            clsJugador temp=jugadores.eliminarPosicion(inicia);
            jugadores.insertarInicio(temp);
        }
        
                
                
                
        System.out.print("El resultado del dado es: " +inicia+"\n");
        
                
    }
    
}
