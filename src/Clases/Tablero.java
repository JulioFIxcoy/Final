/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author julio
 */
public class Tablero  implements Serializable{
    private Casilla[][] tablero;
    private int fila, columna;
    private int posX, posY;
    private int tipo;
   
    /**
     * constructor de la clase tablero
     * tablero es donde se construye la matriz de un tablero de ajedrez
     * @param fila
     * @param columna 
     */
    public Tablero( int fila, int columna) {
   
    tipo=-1;
        this.fila = fila;
        this.columna = columna;
        tablero = new Casilla[this.fila][this.columna];
        
        iniciarTablero(false);
    }
    /**
     * se inicializan las casillas 
     */
    public void iniciarTablero(boolean cuadradaPar){
       
        
        boolean blanco = true;

        for (int i = 0; i<fila; i++){
            
            for (int j = 0; j<columna; j++){
              
                blanco = !blanco;
               
                if (blanco){
                    tablero[i][j] = new TipoTerreno(false,0) ;
                }
                tablero[i][j].setText(i+","+j);
            }
            
            if (cuadradaPar ) 
                blanco =! blanco;
             
        }
    }
    /**
     * se agrega el tablero a un panel para que el usuario pueda visualizarlo
     * @param contenedor 
     */
    public void colocarTablero(JPanel contenedor){
        int xButton = (contenedor.getWidth()/columna);
        int yButton = (contenedor.getHeight()/fila);
        
        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                //tablero[i][j].setBounds(49+j, j, 50, 50);
                System.out.println("x"+xButton+"Y"+yButton);
                tablero[i][j].setBounds(xButton*j,yButton*i,xButton, yButton);
                tablero[i][j].setVisible(true);
               tablero[i][j].addMouseListener(click);
               
            tablero[i][j].addActionListener(new java.awt.event.ActionListener() {
            
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    tablero[posX][posY].setIcon(new ImageIcon(getClass().getResource("/img/alfilb.png")));
//                 jugador.setPuntos(jugador.getPuntos()+5);
//                    BtnRunnable hilo = new BtnRunnable(new Alfil(tablero[posX][posY], 0, tablero, posX, posY,jugador), 0);
//                   new Thread(hilo).start();
//                   tablero[posX][posY].setEnabled(false);
//                    
                    
                }
            });
                contenedor.add(tablero[i][j]);
                
                contenedor.setVisible(true);
            }
            
        }
    }
/**
 * MouseListener creo una variable de la interfaz, para obtner la posicion y colocar la torre
 */
   
    MouseListener click = new MouseListener() {
        /**
         * click derecho coloca la torre
         * @param e 
         */
   @Override
        public void mouseClicked(MouseEvent e) {
           // System.out.println(e.getButton());
            //MouseEvent.BUTTON3 es el boton derecho
            if (e.getButton()==MouseEvent.BUTTON3) {
                tipo=1;
                tablero[posX][posY].setIcon(new ImageIcon(getClass().getResource("/img/torreb.png")));
                
//                jugador.setPuntos(jugador.getPuntos()+8);
//                 // tablero[posX][posY].setBackground(Color.red);
//                    BtnRunnable hilo = new BtnRunnable(new Torre(tablero[posX][posY], 1, tablero, posX, posY,jugador), 1);
//                   new Thread(hilo).start();
                tablero[posX][posY].setEnabled(false);
            } 
        }

       

        @Override
        public void mousePressed(MouseEvent e) {
          
        }

        @Override
        public void mouseReleased(MouseEvent e) {
           
        }
/**
 * verifica en que posicion esta el puntero del mouse 
 * y asi obtener las coordenadas
 * @param e 
 */
        @Override
        public void mouseEntered(MouseEvent e) {
          //  e.
            System.out.println(e.getSource());
            JButton btn = (JButton) e.getComponent();
            
            System.out.println("cambiar btn"+btn.getText());
            String[] posiscion = btn.getText().split(",");
            posX= Integer.parseInt(posiscion[0]);
            posY= Integer.parseInt(posiscion[1]);
        }

        @Override
        public void mouseExited(MouseEvent e) {
           
        }
            };

   
            
            
    
}
