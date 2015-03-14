/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class clsPropiedad {
    private final double valorCompra;
    private int peage;
    private final double alquiler1Casa;
    private final double alquilerHacienda;
    private final double alquilerHotel;
    private final ImageIcon imagenclsPropiedad;
    private String Dueño;
    private final String descripcion;
    
    public clsPropiedad(double valorCompra,int peage,double alquiler1Casa,double alquilerHacienda,double alquilerHotel,String Dueño, String descripcion,ImageIcon imagen){  
        this.valorCompra=valorCompra;
        this.peage=peage;
        this.alquiler1Casa=alquiler1Casa;
        this.alquilerHacienda=alquiler1Casa;
        this.alquilerHotel=alquilerHotel;
        this.Dueño=Dueño;
        this.descripcion=descripcion;
        this.imagenclsPropiedad=imagen;
    }
    public void setPeage(int peage) {
        this.peage = peage;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public int getPeage() {
        return peage;
    }

    public double getAlquiler1Casa() {
        return alquiler1Casa;
    }

    public double getAlquilerHacienda() {
        return alquilerHacienda;
    }

    public double getAlquilerHotel() {
        return alquilerHotel;
    }

    public void setDueño(String Dueño) {
        this.Dueño = Dueño;
    }

    public String getDueño() {
        return Dueño;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Casilla{" + "valorCompra=" + valorCompra + ", peage=" + peage + ", alquiler1Casa=" + alquiler1Casa + ", alquilerHacienda=" + alquilerHacienda + ", alquilerHotel=" + alquilerHotel + ", imagenCasilla=" + imagenclsPropiedad + ", Due\u00f1o=" + Dueño + ", descripcion=" + descripcion + '}';
    }
}