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
public class TiendaVehiculos extends javax.swing.JPanel {

    /**
     * Creates new form TiendaVehiculos
     */
    public TiendaVehiculos() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehiculos = new javax.swing.JTable();
        lblFondo = new javax.swing.JLabel();

        setLayout(null);

        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                idioma.getProperty("vehiculo"), idioma.getProperty("costo"), idioma.getProperty("cantidad"), ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVehiculos);

        add(jScrollPane1);
        jScrollPane1.setBounds(140, 260, 660, 190);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/at.jpg"))); // NOI18N
        add(lblFondo);
        lblFondo.setBounds(0, 0, 1000, 563);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTable tblVehiculos;
    // End of variables declaration//GEN-END:variables
}