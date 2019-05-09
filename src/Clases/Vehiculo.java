/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Julio
 */
public abstract class Vehiculo implements Serializable{
    private int nivel;
    private String imgPath;
    private int vida;
    private boolean estado;
    private int cantEnemys;
    private int meDerrota;
    private Arma arma;
    private String nombre;
    private int defensa,ataque,punteria,experiencia;
    private boolean enBatalla;
    private int posicionX;
    private int posicionY;
    private double precio;
    public Vehiculo(String nombre) {
        
       this.nombre = nombre;
      enBatalla = false; 
       this.nivel = 1;
        this.imgPath = "";
        this.vida = 100;
        this.estado = true;
        this.cantEnemys = 0;
        this.meDerrota = 0;
        Random r = new Random();
      int rand = r.nextInt(100);
      precio = 25;
      this.experiencia=1;
     arma = new Arma(r.nextInt(100), "Basica");
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public boolean isEnBatalla() {
        return enBatalla;
    }

    public void setEnBatalla(boolean enBatalla) {
        this.enBatalla = enBatalla;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getPunteria() {
        return punteria;
    }

    public void setPunteria(int punteria) {
        this.punteria = punteria;
    }
    

    
    
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCantEnemys() {
        return cantEnemys;
    }

    public void setCantEnemys(int cantEnemys) {
        this.cantEnemys = cantEnemys;
    }

    public int getMeDerrota() {
        return meDerrota;
    }

    public void setMeDerrota(int meDerrota) {
        this.meDerrota = meDerrota;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }
    
    public abstract int getId();
    
}
