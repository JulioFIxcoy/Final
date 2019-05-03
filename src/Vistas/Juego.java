/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.Escenario;
import static Vistas.Principal.idioma;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import javax.swing.JLabel;
import javax.swing.event.MouseInputAdapter;
import javax.swing.event.MouseInputListener;

/**
 *
 * @author Julio
 */
public class Juego extends javax.swing.JPanel implements Serializable {

    /**
     * Creates new form Juego
     */
    public Juego() {
        initComponents();
        
        opcionTablero.setLocationRelativeTo(null);
        opcionTablero.setVisible(true);
        lbl64.addMouseListener(click);
        lblCuatro.addMouseListener(click);
        lbl89.addMouseListener(click);
        
        
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionTablero = new javax.swing.JDialog();
        mensaje = new javax.swing.JLabel();
        lbl89 = new javax.swing.JLabel();
        lbl64 = new javax.swing.JLabel();
        lblCuatro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        opcionTablero.setSize(350, 345);
        opcionTablero.setTitle(idioma.getProperty("dialogo"));
        opcionTablero.setAlwaysOnTop(true);
        opcionTablero.setLocation(new java.awt.Point(0, 0));
        opcionTablero.setType(java.awt.Window.Type.POPUP);
        opcionTablero.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mensaje.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        mensaje.setForeground(new java.awt.Color(51, 51, 51));
        mensaje.setText(idioma.getProperty("jugarEnEscenarioDe"));
        opcionTablero.getContentPane().add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 320, -1));

        lbl89.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbl89.setForeground(new java.awt.Color(0, 0, 0));
        lbl89.setText("8*9");
        opcionTablero.getContentPane().add(lbl89, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 40, -1));

        lbl64.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbl64.setForeground(new java.awt.Color(0, 0, 0));
        lbl64.setText("6*4");
        opcionTablero.getContentPane().add(lbl64, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 40, -1));

        lblCuatro.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblCuatro.setForeground(new java.awt.Color(0, 0, 0));
        lblCuatro.setText("4*4");
        opcionTablero.getContentPane().add(lblCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 40, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dialogo.jpg"))); // NOI18N
        opcionTablero.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 335, 300));

        setLayout(new java.awt.GridLayout(1, 0));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/posibleFondo.jpg"))); // NOI18N
        add(lblFondo);
    }// </editor-fold>//GEN-END:initComponents

    MouseListener click = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent e) {
            //System.out.println(""+e.getSource());
            
            JLabel lbl= (JLabel) e.getSource();
           
            char sixee[]=lbl.getText().toCharArray();
            nuevo = new Escenario(Integer.parseInt(Character.toString(sixee[0])), Integer.parseInt(Character.toString(sixee[2])));
            
            nuevo.initMatrizEscenario(Juego.this);
            repaint();
            Principal.setVisibleSave(true);
            lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/posibleFondo.jpg"))); // NOI18N
            add(lblFondo);
            opcionTablero.dispose();
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

    public JLabel getLblFondo() {
        return lblFondo;
    }
    
    public static String actionPlayer1;
    public static String actionPlayer2;
    
    private Escenario nuevo ;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl64;
    private javax.swing.JLabel lbl89;
    private javax.swing.JLabel lblCuatro;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel mensaje;
    private javax.swing.JDialog opcionTablero;
    // End of variables declaration//GEN-END:variables
}
