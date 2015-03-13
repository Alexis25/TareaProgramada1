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
public class clsBilletes {
    private int kkk;
    private int monto;
    private final ImageIcon imagen;

    public clsBilletes(int monto, ImageIcon imagen) {
        this.monto = monto;
        this.imagen = imagen;
    }

    
    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    
    
}
