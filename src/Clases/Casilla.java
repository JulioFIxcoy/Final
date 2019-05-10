/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static Vistas.Principal.uno;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.JButton;

/**
 *
 * @author julio
 */
public abstract class Casilla extends JButton implements ActionListener,Serializable{
/**
 * casilla se inicializa la casilla
 */
   
  

   
    public Casilla(boolean destruible, int intDestruible) {
        this.destruible = destruible;
        this.intDestruible = intDestruible;
       
       
    //  setCasillaColor();
    }
    

   

    
    public Jugador getPlayer() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public boolean isDestruible() {
        return destruible;
    }

    public void setDestruible(boolean destruible) {
        this.destruible = destruible;
    }

    public int getIntDestruible() {
        return intDestruible;
    }

    public void setIntDestruible(int intDestruible) {
        this.intDestruible = intDestruible;
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
    public void imgBot(){
        setIcon(new javax.swing.ImageIcon(getClass().getResource(jugador.getBot().getImgPath())));
    }
   public void iconDefault(){
       setIcon(null);
   }
    public void imgJugador(Jugador player){
        setIcon(player.getCurrentVehicle().getIcon());
        setText(player.getCurrentVehicle().getNombre());
      repaint();
    }

    public Bots getBot() {
        return bot;
    }

    public void setBot(Bots bot) {
        this.bot = bot;
    }
    
    abstract void setCasillaColor();
    
   

private Bots bot;
private boolean destruible;
private int intDestruible;
private int posicionX,posicionY;
private Jugador jugador;
    
}
