/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Datos.*;
import Modelo.Articulo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CARLOS
 */
public class Informe extends javax.swing.JFrame {

    DefaultTableModel JtableVentas = new DefaultTableModel();

    Gestion modelo = new Gestion();

    public Informe() {
        initComponents();
        tablita.setModel(JtableVentas);
        JtableVentas.addColumn("Codigo");
        JtableVentas.addColumn("Nombre");
        JtableVentas.addColumn("Precio de compra");
        JtableVentas.addColumn("Cantidad existente");
        JtableVentas.addColumn("Ganancia ($)");

    }

    private void limpiar() {
        int i;
        int fila = tablita.getRowCount();
        for (i = fila - 1; i >= 0; i--) {
            JtableVentas.removeRow(i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablita = new javax.swing.JTable();
        cmbTipo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Ventas");

        tablita = new javax.swing.JTable(){
            public boolean editCellAt(int row, int column, java.util.EventObject e) {
                return false;
            }
        };
        tablita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablita);

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todo", "Producto por peso [Lb]", "Producto por Unidad" }));
        cmbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoItemStateChanged(evt);
            }
        });
        cmbTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbTipoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbTipoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmbTipoMouseReleased(evt);
            }
        });
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton1)
                        .addGap(81, 81, 81))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnRegresar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(18, 18, 18))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegresar)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
        if ("Producto por peso [Lb]".equals(cmbTipo)) {
            limpiar();
            try {
                ArrayList<Articulo> lista = modelo.Informar();
                String a[] = new String[10];
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).getID() == 1) {
                        a[0] = lista.get(i).getCod();
                        a[1] = lista.get(i).getNomP();
                        a[2] = String.valueOf(lista.get(i).getPrecioC());
                        a[3] = String.valueOf(lista.get(i).getCant());
                        a[4] = String.valueOf(lista.get(i).getGanancia());

                        JtableVentas.addRow(a);
                    }
                }

            } catch (IOException ex) {
                Logger.getLogger(Informe.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("Producto por Unidad".equals(cmbTipo)) {
            limpiar();
            try {
                ArrayList<Articulo> lista = modelo.Informar();
                String a[] = new String[10];
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).getID() != 1) {
                        a[0] = lista.get(i).getCod();
                        a[1] = lista.get(i).getNomP();
                        a[2] = String.valueOf(lista.get(i).getPrecioC());
                        a[3] = String.valueOf(lista.get(i).getCant());
                        a[4] = String.valueOf(lista.get(i).getGanancia());

                        JtableVentas.addRow(a);
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(Informe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cmbTipoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbTipoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbTipoMousePressed

    }//GEN-LAST:event_cmbTipoMousePressed

    private void cmbTipoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbTipoMouseReleased

    }//GEN-LAST:event_cmbTipoMouseReleased

    private void cmbTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbTipoMouseClicked

    }//GEN-LAST:event_cmbTipoMouseClicked

    private void cmbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoItemStateChanged
        limpiar();
        if ("Producto por peso [Lb]".equals(cmbTipo.getSelectedItem().toString())) {
            try {
                ArrayList<Articulo> lista = modelo.Informar();
                String a[] = new String[10];
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).getID() == 1) {
                        a[0] = lista.get(i).getCod();
                        a[1] = lista.get(i).getNomP();
                        a[2] = String.valueOf(lista.get(i).getPrecioC());
                        a[3] = String.valueOf(lista.get(i).getCant());
                        a[4] = String.valueOf(lista.get(i).getGanancia());

                        JtableVentas.addRow(a);
                    }
                }

            } catch (IOException ex) {
                Logger.getLogger(Informe.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ("Producto por Unidad".equals(cmbTipo.getSelectedItem().toString())) {
            try {
                ArrayList<Articulo> lista = modelo.Informar();
                String a[] = new String[10];
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).getID() == 2) {
                        a[0] = lista.get(i).getCod();
                        a[1] = lista.get(i).getNomP();
                        a[2] = String.valueOf(lista.get(i).getPrecioC());
                        a[3] = String.valueOf(lista.get(i).getCant());
                        a[4] = String.valueOf(lista.get(i).getGanancia());

                        JtableVentas.addRow(a);
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(Informe.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                ArrayList<Articulo> lista = modelo.Informar();
                String a[] = new String[10];
                for (int i = 0; i < lista.size(); i++) {
                    a[0] = lista.get(i).getCod();
                    a[1] = lista.get(i).getNomP();
                    a[2] = String.valueOf(lista.get(i).getPrecioC());
                    a[3] = String.valueOf(lista.get(i).getCant());
                    a[4] = String.valueOf(lista.get(i).getGanancia());

                    JtableVentas.addRow(a);

                }
            } catch (IOException ex) {
                Logger.getLogger(Informe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cmbTipoItemStateChanged

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
         this.setVisible(false);
          GUImenu g = new GUImenu();
          g.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Informe.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informe.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informe.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informe.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablita;
    // End of variables declaration//GEN-END:variables
}
