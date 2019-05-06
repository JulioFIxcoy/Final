/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Archivos.BinariosPlantilla;
import Clases.Jugador;
import static Vistas.Principal.idioma;

/**
 *
 * @author Julio
 */
public class Tienda extends javax.swing.JPanel {

    /**
     * Creates new form Tienda
     */
    public Tienda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setText(idioma.getProperty("nombre"));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 130, 40));
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 220, 40));

        jButton1.setText(idioma.getProperty("jugar"));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/soldadoDuty.jpg"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Jugador nuevo = new Jugador(txtNombre.getText());
        BinariosPlantilla<Jugador> escribir = new BinariosPlantilla<>();
        escribir.writeObjectBin(nuevo, Principal.mkdirPlayer, String.valueOf(nuevo.getId()), ".player");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}