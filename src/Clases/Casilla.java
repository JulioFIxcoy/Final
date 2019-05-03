/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static Vistas.Principal.idioma;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.AncestorListener;

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
         pop = new JPopupMenu(idioma.getProperty("opcionesJuego"));
        opciones = new JMenuItem[5];
        opciones[0] = new JMenuItem(idioma.getProperty("atacar"));
        opciones[1] = new JMenuItem(idioma.getProperty("colocarBot"));
        opciones[2] = new JMenuItem(idioma.getProperty("moverVehiculo"));
        opciones[3] = new JMenuItem(idioma.getProperty("cambiarVehiculo"));
        opciones[4] = new JMenuItem(idioma.getProperty("usarArticulo"));
        
        for (JMenuItem opcione : opciones) {
            opcione.setVisible(true);
            pop.add(opcione);
        }
                  //
                        pop.setSize(150, 250);
                        System.out.println("acction");
                       //  pop.add(opciones[0]);
        
        add(pop);              
                   
         addMouseListener(new MouseAdapter() {

                @Override
                public void mouseReleased(MouseEvent e){
                    System.out.println("e.getX() = " + e.getX());
                    System.out.println("e.getY() = " + e.getY());
                    pop.setLocation(e.getLocationOnScreen());
                    pop.setVisible(true);
//                    if (e.getButton() == MouseEvent.BUTTON3) {
//                         pop = new JPopupMenu("Opciones De Juego");
//      
//                    pop.show(e.getComponent(), e.getX(), e.getY());
//                    }
//                    
                }
                @Override
                public void mouseExited(MouseEvent e){
                //   pop.setVisible(false);
                }
         });
         r(opciones);  
                  
         action();
    }
    public void action(){
//         opciones[0].addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                System.out.println("click menu");
//            }
//        });
//         opciones[1].addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                System.out.println("click menu");
//            }
//        });
         
         for (JMenuItem opcione : opciones) {
            
            opcione.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    
                    System.out.println(opcione.getText());
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
private void r(JMenuItem[] item){
       Border line = new LineBorder(Color.DARK_GRAY);
        Border margin = new EmptyBorder(5, 10, 5, 10);
        Border compound = new CompoundBorder(line, margin);
       // item.setBorder(compound);
       for (JMenuItem each : item) {
        each.setBorder(compound);
        }
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
    

    MouseListener n = new MouseListener() {
      @Override
      public void mouseClicked(MouseEvent e) {
          
      }

      @Override
      public void mousePressed(MouseEvent e) {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }

      @Override
      public void mouseReleased(MouseEvent e) {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }

      @Override
      public void mouseEntered(MouseEvent e) {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }

      @Override
      public void mouseExited(MouseEvent e) {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }
  };
    abstract void setCasillaColor();

   

 private JPopupMenu pop;
    private JMenuItem[] opciones;
private boolean destruible;
private int intDestruible;
private int posicionX,posicionY;
    
    
}
