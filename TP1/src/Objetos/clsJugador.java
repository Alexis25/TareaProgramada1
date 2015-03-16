/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.Scanner;

/**
 *
 * @author Alexis Cardenas
 */
public class clsJugador {
    private final String nombre;
    private final clsFicha ficha;
    private double dinero=3000;
    private int size=0;

    public clsJugador(String nombre, clsFicha ficha){
        this.nombre = nombre;
        this.ficha = ficha;
        size++;
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
    public void moverse(clsJugador jugador,int pasos,clsListaCircular lista,clsListaSimpleJugadores listJugadores){
        clsNodo temporal= lista.getPrimerNodo();
        System.out.print("inicio a moverse \n");
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        for (int index=0; index < pasos-1; index ++) {
                temporal= temporal.next;
            }
        if (temporal.getData().getDueño()==null){
            System.out.print(jugador.nombre+" Deseas comprar esta propiedad 1. si   2.no: ");
            int opcion = entradaEscaner.nextInt();
            if (opcion==1){
                temporal.getData().setDueño(nombre); 
                jugador.setDinero(jugador.dinero-temporal.getData().getValorCompra());
            }else{
              System.out.print(" no has querido comprar esta propiedad");
            }
        }else if(temporal.getData().getDueño()==jugador.getNombre()){
            System.out.print(jugador.nombre+" Deseas agrandar tu propiedad 1. si   2.no: ");
            int opcion = entradaEscaner.nextInt();
            if (opcion==1){
                
                
                
                
                
                if(temporal.getData().isAlquilerCasa()==false){
                    temporal.getData().setAlquilerCasa(true);
                    double restar=temporal.getData().getValorCompra()/0.25;
                    jugador.setDinero(dinero-restar);
                    System.out.print(jugador.nombre+"Has agrandado tu propiedad, ahora cuentas con un alquiler de casa");
                }else if (temporal.getData().isAlquilerHacienda()==false){
                    temporal.getData().setAlquilerHacienda(true);
                    double restar=temporal.getData().getValorCompra()/0.25+temporal.getData().getValorCompra()/0.25;
                    jugador.setDinero(dinero-restar);                    
                    System.out.print(jugador.nombre+"Has agrandado tu propiedad, ahora cuentas con un alquiler de Hacienda");
                }else{
                    temporal.getData().setAlquilerHotel(true);
                    double restar=temporal.getData().getValorCompra()/0.25+temporal.getData().getValorCompra()/0.25+temporal.getData().getValorCompra()/0.25;
                    jugador.setDinero(dinero-restar);                    
                    System.out.print(jugador.nombre+"Has agrandado tu propiedad, ahora cuentas con un alquiler de Hotel Deluxe");
                }
                
                
                
                
                
                
                

            }else{
              System.out.print(" no has querido agrandar esta propiedad");
            }   
        }else{
            pagarPeaje(jugador,temporal.getData().getDueño(),listJugadores,temporal);
        }
    }
    
    
    
    public void pagarPeaje(clsJugador deudor,String jugador,clsListaSimpleJugadores lista,clsNodo propiedad){ 
        clsNodoSimpleJugadores temporal= lista.getPrimerNodo();
        for (int i=0; i<lista.getSize();i++){
            if (temporal.getDato().getNombre()==jugador){
                System.out.print("debes pagar peaje");
                temporal.getDato().setDinero(temporal.getDato().getDinero()+propiedad.getData().getPeage());//le suma al dinero del dueño de la propiedad el valor del peqaje de su propiedad
                deudor.setDinero(getDinero()-propiedad.getData().getPeage());// resta al dinero del jugador el peaje que ha pagado
                break;
            }else{
                temporal=temporal.next;
            }
        }
    }
        
    }