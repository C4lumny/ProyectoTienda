/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Datos.Gestion;
import Logica.Entrada;
import Logica.Inventario;
import java.awt.Color;
import javax.swing.JOptionPane;
import Modelo.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CARLOS
 */
public class RegistroProducto extends javax.swing.JFrame{
    Inventario tienda = new Inventario();
    private Entrada sc = new Entrada();
    private Gestion archivo = new Gestion();
    private String Nom, Tipo, Cod;
    private Double Precio, Cant;

    /**
     * Creates new form RegistroProducto
     */
    public RegistroProducto() {
        initComponents();
    }

    public void limpiar() {
        txtproductCode.setText("");
        txtproductName.setText("");
        txtproductValor.setText("");
        txtproductCant.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbProductTipe = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtproductCode = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtproductName = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtproductValor = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtproductCant = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Tipo de producto: ");

        cmbProductTipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Producto por unidad", "Producto por peso [Lb]" }));
        cmbProductTipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductTipeActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Codigo del producto: ");

        jLabel4.setText("Precio de compra: ");

        jLabel5.setText("Cantidad");

        txtproductCode.setForeground(new java.awt.Color(204, 204, 204));
        txtproductCode.setText("Ingrese el codigo");
        txtproductCode.setToolTipText("");
        txtproductCode.setBorder(null);
        txtproductCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtproductCodeMousePressed(evt);
            }
        });
        txtproductCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductCodeActionPerformed(evt);
            }
        });

        txtproductName.setForeground(new java.awt.Color(204, 204, 204));
        txtproductName.setText("Ingrese el nombre");
        txtproductName.setToolTipText("");
        txtproductName.setBorder(null);
        txtproductName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtproductNameMousePressed(evt);
            }
        });
        txtproductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductNameActionPerformed(evt);
            }
        });

        txtproductValor.setForeground(new java.awt.Color(204, 204, 204));
        txtproductValor.setText("Ingrese el precio");
        txtproductValor.setToolTipText("");
        txtproductValor.setBorder(null);
        txtproductValor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtproductValorMousePressed(evt);
            }
        });
        txtproductValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductValorActionPerformed(evt);
            }
        });

        txtproductCant.setForeground(new java.awt.Color(204, 204, 204));
        txtproductCant.setText("Ingrese la cantidad");
        txtproductCant.setToolTipText("");
        txtproductCant.setBorder(null);
        txtproductCant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtproductCantMousePressed(evt);
            }
        });
        txtproductCant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductCantActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cmbProductTipe, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtproductCode)
                            .addComponent(jSeparator1)
                            .addComponent(txtproductName)
                            .addComponent(jSeparator2)
                            .addComponent(txtproductValor)
                            .addComponent(jSeparator3)
                            .addComponent(txtproductCant)
                            .addComponent(jSeparator4))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbProductTipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtproductCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtproductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtproductValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtproductCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(btnGuardar)
                .addContainerGap(177, Short.MAX_VALUE))
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
                .addGap(193, 193, 193)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(55, 55, 55))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegresar)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtproductCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproductCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproductCodeActionPerformed

    private void txtproductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproductNameActionPerformed

    private void txtproductValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproductValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproductValorActionPerformed

    private void txtproductCantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproductCantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproductCantActionPerformed

    private void txtproductCodeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtproductCodeMousePressed
        txtproductCode.setText("");
        txtproductCode.setForeground(Color.black);
    }//GEN-LAST:event_txtproductCodeMousePressed

    private void txtproductNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtproductNameMousePressed
        txtproductName.setText("");
        txtproductName.setForeground(Color.black);

    }//GEN-LAST:event_txtproductNameMousePressed

    private void txtproductValorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtproductValorMousePressed
        txtproductValor.setText("");
        txtproductValor.setForeground(Color.black);
    }//GEN-LAST:event_txtproductValorMousePressed

    private void txtproductCantMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtproductCantMousePressed
        txtproductCant.setText("");
        txtproductCant.setForeground(Color.black);
    }//GEN-LAST:event_txtproductCantMousePressed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        boolean a;
        Cod = txtproductCode.getText();
        Nom = txtproductName.getText();
        Precio = sc.verificarDouble(txtproductValor.getText());
        if (Precio == null) {
            a = false;
        } else {
            a = true;
        }
        Cant = sc.verificarDouble(txtproductCant.getText());
        if (Cant == null) {
            a = false;
        } else {
            a = true;
        }
        Tipo = (String) cmbProductTipe.getSelectedItem();
        if ("Producto por peso [Lb]".equals(Tipo)) {
            try {
                tienda.RegistrarArticulo(Cod, Nom, Precio, Cant, 1);
                
            } catch (IOException ex) {
                Logger.getLogger(RegistroProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                tienda.RegistrarArticulo(Cod, Nom, Precio, Cant, 2);
            } catch (IOException ex) {
                Logger.getLogger(RegistroProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        txtproductCant.setText("");
        txtproductCode.setText("");
        txtproductName.setText("");
        txtproductValor.setText("");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
          this.setVisible(false);
          GUImenu g = new GUImenu();
          //g.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cmbProductTipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductTipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProductTipeActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(RegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RegistroProducto().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbProductTipe;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtproductCant;
    private javax.swing.JTextField txtproductCode;
    private javax.swing.JTextField txtproductName;
    private javax.swing.JTextField txtproductValor;
    // End of variables declaration//GEN-END:variables
}
