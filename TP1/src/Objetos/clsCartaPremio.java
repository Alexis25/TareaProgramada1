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
public class clsCartaPremio {
    private final int pasos;
    private final double dinero;
    private final boolean turno;

    public clsCartaPremio(int pasos, double dinero, boolean turno) {
        this.pasos = pasos;
        this.dinero = dinero;
        this.turno = turno;
    }
    
    public int getPasos() {
        return pasos;
    }

    public double getDinero() {
        return dinero;
    }

    public boolean getTurno() {
        return turno;
    }
        
}