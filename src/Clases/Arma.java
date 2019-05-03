/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author Julio
 */
public class Arma implements Serializable{
    
private int danger;
private String nombre;

    public Arma(int danger, String nombre) {
        this.danger = danger;
        this.nombre = nombre;
    }

  

    public int getDanger() {
        return danger;
    }

    public void setDanger(int danger) {
        this.danger = danger;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
 
}
