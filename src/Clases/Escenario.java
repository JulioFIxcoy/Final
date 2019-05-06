/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Vistas.Juego;
import static Vistas.Principal.idioma;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


/**
 *
 * @author julio
 */
public class Escenario 
     //   extends Thread
        implements Serializable {
    
 

    /**
     * 
     * @param filas filas que tendra la matriz escenario
     * @param columnas columnas que tendra la matriz escenario 
     */
    public Escenario(int filas, int columnas) {
        
        this.filas = filas;
        this.columnas = columnas;
        
         playerDos = new StringBuffer();
        playerUno = new StringBuffer();
        
         pop = new JPopupMenu(idioma.getProperty("opcionesJuego"));
        opciones = new JMenuItem[5];
        opciones[0] = new JMenuItem(idioma.getProperty("atacar"));
        opciones[1] = new JMenuItem(idioma.getProperty("colocarBot"));
        opciones[2] = new JMenuItem(idioma.getProperty("moverVehiculo"));
        opciones[3] = new JMenuItem(idioma.getProperty("cambiarVehiculo"));
        opciones[4] = new JMenuItem(idioma.getProperty("usarArticulo"));
//        acciones();
        action();
        for (JMenuItem opcione : opciones) {
            opcione.setVisible(true);
            pop.add(opcione);
        }
       
        r(opciones);
        pop.setSize(150, 250);
        
        
       
    }
    
    
    private void r(JMenuItem[] item){
            Border line = new LineBorder(Color.DARK_GRAY);
            Border margin = new EmptyBorder(5, 10, 5, 10);
            Border compound = new CompoundBorder(line, margin);
            // item.setBorder(compound);
            for (JMenuItem each : item) {
                 each.setBorder(compound);
            }
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
  
  
    
    

  //agregar metodo que ubique a los vehiculoss del jugador y enemigo 
    
     public StringBuffer getPlayerUno() {
        return playerUno;
    }

    public void setPlayerUno(String playerUno) {
        if (this.playerUno.length()>0) {
            this.playerUno.setLength(0);
            this.playerUno.append(playerUno);
        }else
            this.playerUno.append(playerUno);

            if (playerUno.equalsIgnoreCase(idioma.getProperty("moverVehiculo"))) {
                

            }
            
            
    }
    

    public StringBuffer getPlayerDos() {
        return playerDos;
    }

    public void setPlayerDos(String playerDos) {
        if (this.playerDos.length()>0) {
            this.playerDos.setLength(0);
            this.playerDos.append(playerUno);
        }else
        this.playerDos.append(playerDos);
       
    }
    
     public void forf(){
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("text "+playerUno);
                Thread.sleep(250);
            } catch (InterruptedException ex) {
                Logger.getLogger(Escenario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
   
//     public void acciones(){
//       if (playerUno.toString().equalsIgnoreCase(idioma.getProperty("usarVehiculo"))) {
//                        forf();
//                        start();
//        }else if (playerUno.toString().equalsIgnoreCase(idioma.getProperty("cambiarVehiculo"))) {
//                forf();
//                start();
//        }else if (playerUno.toString().equalsIgnoreCase(idioma.getProperty("colocarBot"))) {
//                forf();
//                start();
//        }else if (playerUno.toString().equalsIgnoreCase(idioma.getProperty("atacar"))) {
//            forf();
//            start();
//        }else if (playerUno.toString().equalsIgnoreCase(idioma.getProperty("moverVehiculo"))) {
//                forf();
//                start();
//        }
//    }
//    @Override
//    public void run(){
//       forf();
//    }
   /*
     
    */
    
   /**
     * inicializa la matriz que es del tipo seccion
     * inicializa las instancias secciones que se encuentran en la matriz
     * @param contenedor
     */
    public void initMatrizEscenario(Juego contenedor){
       
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
                escenario[i][j].addMouseListener(click);
                escenario[i][j].add(pop);
                 
                contenedor.add(escenario[i][j]);
                
                contenedor.setVisible(true);
            }
        }
            
    }
    MouseListener click = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
           
                pop.setLocation(e.getLocationOnScreen());
                pop.setVisible(true);
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
          
        }

        @Override
        public void mouseReleased(MouseEvent e) {
         
        }

        @Override
        public void mouseEntered(MouseEvent e) {
          
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }
    };
    
    public void action(){
       ;
         
         for (JMenuItem opcione : opciones) {
            
            opcione.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    
                    System.out.println("click  "+opcione.getText());
                   
                   
                 // start();
                    if (juego.getTurno()==0) {
                            setPlayerUno(opcione.getText());
                    }else{
                            setPlayerDos(opcione.getText());
                    }
                }
            });
             
             
            opcione.addMouseListener(new MouseAdapter() {

             @Override
             public void mouseEntered(MouseEvent e){
                 opcione.setBackground(Color.BLUE);
             }
             @Override
             public void mouseExited(MouseEvent e){
                 opcione.setBackground(Color.WHITE);
             }
         });
         
        }
         
    }
    
    private ParametrosJuego juego;
    private int filas;
    private int columnas;
    private Casilla[][] escenario;
    
    private Jugador[] enemigos;
    private int cantidadDeMontanas;
    private int cantidadDeAgua;
    private int posX;
    private int posY;
    private StringBuffer playerUno;
    private StringBuffer playerDos;
    private JPopupMenu pop;
    private JMenuItem[] opciones;
    private int x,y;

}
