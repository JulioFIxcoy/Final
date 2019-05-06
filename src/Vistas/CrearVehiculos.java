/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Archivos.BinariosPlantilla;
import Clases.Avion;
import Clases.Tanque;
import static Vistas.Principal.idioma;
import static Vistas.Principal.mkdirAir;
import static Vistas.Principal.mkdirTank;

/**
 *
 * @author Julio
 */
public class CrearVehiculos extends javax.swing.JPanel {

    /**
     * Creates new form CrearVehiculos
     */
    public CrearVehiculos() {
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
        tanque = new javax.swing.JButton();
        avion = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel2.setText("Nombre");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 130, 60));

        tanque.setText(idioma.getProperty("Tanque"));
        tanque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanqueActionPerformed(evt);
            }
        });
        add(tanque, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 170, 40));

        avion.setText(idioma.getProperty("avion"));
        avion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avionActionPerformed(evt);
            }
        });
        add(avion, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 170, 40));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 54, 220, 50));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/at.jpg"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 570));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void tanqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanqueActionPerformed
        // TODO add your handling code here:
        Tanque nuevo = new Tanque(txtNombre.getText());
        BinariosPlantilla<Tanque> write = new BinariosPlantilla<>();
        write.writeObjectBin(nuevo, mkdirTank, String.valueOf(nuevo.getId()), ".tank");
    }//GEN-LAST:event_tanqueActionPerformed

    private void avionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avionActionPerformed
        // TODO add your handling code here:
        Avion nuevo = new Avion(txtNombre.getText());
        BinariosPlantilla<Avion> write = new BinariosPlantilla<>();
        write.writeObjectBin(nuevo, mkdirAir, String.valueOf(nuevo.getId()), ".air");
        
    }//GEN-LAST:event_avionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JButton tanque;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
