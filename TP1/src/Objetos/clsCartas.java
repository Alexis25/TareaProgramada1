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
public class clsCartas {
    private final String descripcion;
    private final ImageIcon imagen;
    
    public clsCartas(String descripcion, ImageIcon imagen) {
        this.descripcion = descripcion;
        this.imagen = imagen;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public ImageIcon getImagen() {
        return imagen;
    }
    
}
