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
public class clsFicha {
        private ImageIcon tipoFicha;
    private String duenioFicha;

    public clsFicha(ImageIcon imagen,String nombre) {
        this.tipoFicha=imagen;
        this.duenioFicha=nombre;
    }

    public void setTipoFicha(ImageIcon tipoFicha) {
        this.tipoFicha = tipoFicha;
    }

    public void setNombreFicha(String nombreFicha) {
        this.duenioFicha = nombreFicha;
    }

    public ImageIcon getTipoFicha() {
        return tipoFicha;
    }

    public String getNombreFicha() {
        return duenioFicha;
    }
    
    
}
