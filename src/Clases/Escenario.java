/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Vistas.Juego;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.Random;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;


/**
 *
 * @author julio
 */
public class Escenario implements Serializable {
    private int filas;
    private int columnas;
    private Casilla[][] escenario;
    
    private Jugador[] enemigos;
    //private Jugador jugador;
  
    private int cantidadDeMontanas;
    private int cantidadDeAgua;
    private int posX;
    private int posY;

    /**
     * 
     * @param filas filas que tendra la matriz escenario
     * @param columnas columnas que tendra la matriz escenario 
     */
    public Escenario(int filas, int columnas) {
        
        this.filas = filas;
        this.columnas = columnas;
       
    }
    
    
   

    public Escenario() {
    }
    /**
     * 
     * @param fila
     * @param columna
     * @return  una seccion especifica
     */
    public Casilla getCasilla(int fila , int columna){
        return  escenario[fila][columna];
    }
    /**
     * 
     * @param fila
     * @param columna
     * @param seccion modifica una seccion especifica
     */
    public void setSeccion(int fila, int columna, TipoTerreno seccion){
        this.escenario[fila][columna]=seccion;
    }
    /**
     * 
     * @return cantidad de filas de la matriz escenario que es del tipo seccion
     */

    public int getFilas() {
        return filas;
    }
    /**
     * 
     * @param filas modifica la cantidad de filas que tiene la matriz
     */
    public void setFilas(int filas) {
        this.filas = filas;
    }
    /**
     * 
     * @return la cantidad de columnas que tiene la matriz del tipo seccion
     */
    public int getColumnas() {
        return columnas;
    }
    /**
     * 
     * @param columnas modifica la cantidad de columnas que tiene la matriz del tipo seccion
     */
    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
    /**
     * 
     * @return devuelve la matriz de tipo seccion
     */
    public Casilla[][] getEscenario() {
        return escenario;
    }
    /**
     * modifica el esceneario completo pasandole un escenario 
     * @param escenario matriz del tipo seccion
     */
    public void setEscenario(TipoTerreno[][] escenario) {
        this.escenario = escenario;
    }

    public int getCantidadDeMontanas() {
        return cantidadDeMontanas;
    }

    public void setCantidadDeMontanas(int cantidadDeMontanas) {
        this.cantidadDeMontanas = cantidadDeMontanas;
    }

    public int getCantidadDeAgua() {
        return cantidadDeAgua;
    }

    public void setCantidadDeAgua(int cantidadDeAgua) {
        this.cantidadDeAgua = cantidadDeAgua;
    }

    public Jugador[] getEnemigos() {
        return enemigos;
    }

    public void setEnemigos(Jugador[] enemigos) {
        this.enemigos = enemigos;
    }
    public Jugador getEnemigoIndice(int indice){
         return  this.enemigos[indice];
    }
    public void setEnemigoIndice(int indice, Jugador j){
        this.enemigos[indice] =  j;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    
//
//    public Jugador getJugador() {
//        return jugador;
//    }
//
//    public void setJugador(Jugador jugador) {
//        this.jugador = jugador;
//    }
    
    public Jugador getIndiceEnemigo(int fila , int columna){
        
//        if (escenario[fila][columna].getObject() instanceof Jugador) {
//            return (Jugador) escenario[fila][columna].getObject();
//        }
        return null;
    }
    /**
     * modifica el tipo de terreno
     * @param fila 
     * @param columna
     * @param tipoDeTerreno 1 tierra, 2 montaña ,3  agua 
     */
    public void setIndiceMatriz(int fila, int columna, int tipoDeTerreno){
        
        
    }
   
   
  
     /**
      * ubica a un enemigo en la posicion indicada
      * @param fila
      * @param columna
      * @param jugador 
      */
    public void ubicarEnemigos(int fila, int columna, int jugador,boolean isEnemigo){
        Random r = new Random();
                
    }
  
  
    
    

   /**
     * inicializa la matriz que es del tipo seccion
     * inicializa las instancias secciones que se encuentran en la matriz
     * @param contenedor
     */
    public void initMatrizEscenario(Juego contenedor){
        pop = new JPopupMenu("Opciones De Juego");
        opciones = new JMenuItem[2];
        opciones[0] = new JMenuItem("Atacar");
        opciones[1] = new JMenuItem("colocar Bots");
        opciones[0].setVisible(true);
        opciones[1].setVisible(true);
                 
        pop.add(opciones[0]);
        pop.add(opciones[1]);
         int xButton = (contenedor.getWidth()/columnas);
        int yButton = (contenedor.getHeight()/filas);
        this.escenario = new Casilla[this.filas][this.columnas];
        
        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
                this.escenario[i][j] = new Normal(false, 0);//(false,0);
                this.escenario[i][j].setPosicionX(i);
                this.escenario[i][j].setPosicionY(j);
                escenario[i][j].setBounds(xButton*j,yButton*i,xButton, yButton);
                
                escenario[i][j].setVisible(true);
                x=i; 
                y = j;
                 
                 contenedor.add(escenario[i][j]);
                
                contenedor.setVisible(true);
            }
        }
            
    }
  //agregar metodo que ubique a los vehiculoss del jugador y enemigo 
    private int x,y;
    private JPopupMenu pop;
    private JMenuItem[] opciones;
}
