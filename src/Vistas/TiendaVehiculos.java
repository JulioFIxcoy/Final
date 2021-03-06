/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Archivos.RecuperarPlantilla;
import Clases.Vehiculo;
import static Vistas.Principal.idioma;
import java.io.File;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

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
        addElement();
        eventTable();
    }
    public void eventTable(){
        tblVehiculos.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                   
                    int index=tblVehiculos.getSelectedRow();
                     subTotal =(double)(tblVehiculos.getValueAt(index, 1))*(int)(tblVehiculos.getValueAt(index, 2));
                    System.out.println("subtotal"+subTotal);
                     nombre =(String)tblVehiculos.getValueAt(index, 0);
                     costo =(double)tblVehiculos.getValueAt(index, 1);
                    cantidad =(int)(tblVehiculos.getValueAt(index, 2));
                   // tblVehiculos.getModel().setValueAt(subTotal, index, 3);
                    addElementT();
                    
              //  tblVehiculos.setValueAt(25, index, 3);
            }
        });
    }
    
    public void addElementT(){
        tblVehiculos.getModel().setValueAt(subTotal, index, 3);
    }
            
    public void tableChanged(TableModelEvent e){
        System.out.println("model used"+e.getClass());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
//    @SuppressWarnings("unchecked");
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehiculos = new javax.swing.JTable();
        btnPurchase = new javax.swing.JButton();
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
        jScrollPane1.setBounds(120, 220, 660, 190);

        btnPurchase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito - Copy.jpg"))); // NOI18N
        btnPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseActionPerformed(evt);
            }
        });
        add(btnPurchase);
        btnPurchase.setBounds(760, 460, 77, 32);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/at.jpg"))); // NOI18N
        add(lblFondo);
        lblFondo.setBounds(0, 0, 1000, 563);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseActionPerformed
       DefaultTableModel model = (DefaultTableModel) tblVehiculos.getModel();
       int row = model.getRowCount();
        for (int i = 0; i < model.getDataVector().size(); i++) {
            
            
        }
    }//GEN-LAST:event_btnPurchaseActionPerformed

public void addElement(){
    RecuperarPlantilla<Vehiculo> recuperar = new RecuperarPlantilla<>();
    File fileStore = new File("Tienda");
    DefaultTableModel model = (DefaultTableModel) tblVehiculos.getModel();
    model.setRowCount(0);
   
    for (String string : fileStore.list()) {
        Vehiculo recuperado=recuperar.recuperar(Principal.mkdirTienda, string, "");
       model.addRow(new Object[]{
           recuperado.getNombre(),recuperado.getPrecio(),0,0
       });
        
    }
   
    
}
private String nombre;
private    int index;
 private   double subTotal;
   private double costo;
    private int cantidad;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPurchase;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTable tblVehiculos;
    // End of variables declaration//GEN-END:variables
}
