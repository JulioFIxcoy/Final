/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import static Vistas.Principal.idioma;

/**
 *
 * @author Julio
 */
public class Player extends javax.swing.JPanel {

    /**
     * Creates new form Player
     */
    public Player() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCantidadGrande = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setText(idioma.getProperty("tienda"));
        add(jLabel1);
        jLabel1.setBounds(100, 30, 340, 90);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setText(idioma.getProperty("kRep"));
        add(jLabel2);
        jLabel2.setBounds(160, 136, 190, 50);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(idioma.getProperty("peque"));
        add(jLabel3);
        jLabel3.setBounds(200, 190, 80, 40);

        jLabel4.setText(idioma.getProperty("tam"));
        add(jLabel4);
        jLabel4.setBounds(200, 166, 60, 30);

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText(idioma.getProperty("costo"));
        add(jLabel5);
        jLabel5.setBounds(340, 170, 70, 30);

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText(idioma.getProperty("ptsVida"));
        add(jLabel6);
        jLabel6.setBounds(440, 166, 110, 30);

        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText(idioma.getProperty("cantidad"));
        add(jLabel7);
        jLabel7.setBounds(580, 170, 80, 16);

        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("Total");
        add(jLabel8);
        jLabel8.setBounds(700, 170, 28, 16);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("30");
        add(jLabel9);
        jLabel9.setBounds(350, 200, 14, 16);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("25");
        add(jLabel10);
        jLabel10.setBounds(460, 200, 14, 16);
        add(txtCantidad);
        txtCantidad.setBounds(580, 200, 60, 24);

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        add(jLabel11);
        jLabel11.setBounds(680, 210, 70, 0);

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(idioma.getProperty("grande"));
        add(jLabel12);
        jLabel12.setBounds(200, 230, 80, 40);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("50");
        add(jLabel13);
        jLabel13.setBounds(350, 240, 14, 16);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("50");
        add(jLabel14);
        jLabel14.setBounds(460, 240, 14, 16);
        add(txtCantidadGrande);
        txtCantidadGrande.setBounds(580, 240, 60, 24);

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        add(jLabel15);
        jLabel15.setBounds(680, 250, 70, 0);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito - Copy.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(720, 410, 77, 32);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tiendaUb.png"))); // NOI18N
        add(jLabel16);
        jLabel16.setBounds(20, 50, 70, 80);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAvi.jpg"))); // NOI18N
        add(jButton2);
        jButton2.setBounds(617, 412, 80, 30);

        lblFondo.setForeground(new java.awt.Color(255, 255, 255));
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tienda.jpg"))); // NOI18N
        add(lblFondo);
        lblFondo.setBounds(60, 30, 900, 506);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println("Realizar Compra");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCantidadGrande;
    // End of variables declaration//GEN-END:variables
}
