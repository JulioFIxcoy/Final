/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

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
   
  private Jugador jugador;

   
    public Casilla(boolean destruible, int intDestruible) {
        this.destruible = destruible;
        this.intDestruible = intDestruible;
       
       
        // System.out.println("hola");  
        
        
                  //
                        
                       // System.out.println("acction");
                       //  pop.add(opciones[0]);
        
                      
                   
//         addMouseListener(new MouseAdapter() {
//
//                @Override
//                public void mouseReleased(MouseEvent e){
//                    System.out.println("e.getX() = " + e.getX());
//                    System.out.println("e.getY() = " + e.getY());
//                   
////                    if (e.getButton() == MouseEvent.BUTTON3) {
////                         pop = new JPopupMenu("Opciones De Juego");
////      
////                    pop.show(e.getComponent(), e.getX(), e.getY());
////                    }
////                    
//                }
//                @Override
//                public void mouseExited(MouseEvent e){
//                //   pop.setVisible(false);
//                }
//         });
           
                  
      //   action();
    }
    

   

    
    public Jugador getJugador() {
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
    

//    MouseListener n = new MouseListener() {
//      @Override
//      public void mouseClicked(MouseEvent e) {
//          
//      }
//
//      @Override
//      public void mousePressed(MouseEvent e) {
//          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//      }
//
//      @Override
//      public void mouseReleased(MouseEvent e) {
//          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//      }
//
//      @Override
//      public void mouseEntered(MouseEvent e) {
//          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//      }
//
//      @Override
//      public void mouseExited(MouseEvent e) {
//          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//      }
//  };
    abstract void setCasillaColor();

   


private boolean destruible;
private int intDestruible;
private int posicionX,posicionY;
 
    
}
