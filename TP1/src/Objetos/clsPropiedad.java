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
    private final double valorAlquiler1Casa;// valor a pagar por poner una casa de alquiler en una propiedad
    private final double valorAlquilerHacienda;// valor a pagar por poner una Haacienda de alquiler en una propiedad
    private final double valorAlquilerHotel;// valor a pagar por poner un hotel de alquiler en una propiedad
    private final ImageIcon imagenclsPropiedad;
    private boolean AlquilerCasa=false; // inica si hay una casa de alquiler en la propiedad
    private boolean AlquilerHacienda=false;// indica si hay una hacienda de alquiler en la propiedad
    private boolean AlquilerHotel=false;// indica si hay un hotel de alquiler en la propiedad
    private String Dueño;
    private final String descripcion;
    
    public clsPropiedad(double valorCompra,int peage,double alquiler1Casa,double alquilerHacienda,double alquilerHotel,String Dueño, String descripcion,ImageIcon imagen){  
        this.valorCompra=valorCompra;
        this.peage=peage;
        this.valorAlquiler1Casa=alquiler1Casa;
        this.valorAlquilerHacienda=alquilerHacienda;
        this.valorAlquilerHotel=alquilerHotel;
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

    public double getValorAlquiler1Casa() {
        return valorAlquiler1Casa;
    }

    public double getValorAlquilerHacienda() {
        return valorAlquilerHacienda;
    }

    public double getValorAlquilerHotel() {
        return valorAlquilerHotel;
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

    public void setAlquilerCasa(boolean AlquilerCasa) {
        this.AlquilerCasa = AlquilerCasa;
    }

    public void setAlquilerHacienda(boolean AlquilerHacienda) {
        this.AlquilerHacienda = AlquilerHacienda;
    }

    public void setAlquilerHotel(boolean AlquilerHotel) {
        this.AlquilerHotel = AlquilerHotel;
    }

    public boolean isAlquilerCasa() {
        return AlquilerCasa;
    }

    public boolean isAlquilerHacienda() {
        return AlquilerHacienda;
    }

    public boolean isAlquilerHotel() {
        return AlquilerHotel;
    }

    @Override
    public String toString() {
        return "Casilla{" + "valorCompra=" + valorCompra + ", peage=" + peage + ", alquiler1Casa=" +valorAlquiler1Casa + ", alquilerHacienda=" + valorAlquilerHacienda + ", alquilerHotel=" + valorAlquilerHotel + ", imagenCasilla=" + imagenclsPropiedad + ", Due\u00f1o=" + Dueño + ", descripcion=" + descripcion + '}';
    }
}