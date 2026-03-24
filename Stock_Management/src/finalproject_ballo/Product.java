/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject_ballo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TOSHIBA
 */
public class Product extends javax.swing.JFrame {

    /**
     * Creates new form Product
     */
    public Product() {
        initComponents();
         Connect();
         load();
    }
  Connection con;
PreparedStatement pst;
DefaultTableModel df;

public void Connect()
{
try{
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stockmanagement","root","root");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(vendors.class.getName()).log(Level.SEVERE, null, ex);
        }
}

private void clearFields() {
    jTextPNAME.setText("");
    jTextDESCRIP.setText("");
    jTextBAR.setText("");
    jTextCPRICE.setText("");
    jTextRPRICE.setText("");
    jTextQTY.setText("");
    jTextRLEVEL.setText("");
    
    jTextPNAME.requestFocus(); // Optional: set focus back to first field
}


public void load() {
    try {
        pst = con.prepareStatement("SELECT * FROM product");
        ResultSet rs = pst.executeQuery();

        df = (DefaultTableModel) jTablePRODUCT.getModel();
        df.setRowCount(0);  // clear existing rows

        while (rs.next()) {
            Vector<String> v2 = new Vector<>();

            v2.add(rs.getString("id"));
            v2.add(rs.getString("pname"));
            v2.add(rs.getString("description"));
            v2.add(rs.getString("barcode"));
            v2.add(rs.getString("cprice"));
            v2.add(rs.getString("rprice"));
            v2.add(rs.getString("qty"));
            v2.add(rs.getString("rlevel"));

            df.addRow(v2);
        }

    } catch (SQLException ex) {
        Logger.getLogger(vendors.class.getName()).log(Level.SEVERE, null, ex);
    }
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextPNAME = new javax.swing.JTextField();
        jTextDESCRIP = new javax.swing.JTextField();
        jTextBAR = new javax.swing.JTextField();
        jTextCPRICE = new javax.swing.JTextField();
        jTextRPRICE = new javax.swing.JTextField();
        jTextQTY = new javax.swing.JTextField();
        jTextRLEVEL = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePRODUCT = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Product");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Product Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Description");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Cost Price");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Barcode");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Rental Price");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Quantity");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("ReOrderLevel");

        jTextDESCRIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDESCRIPActionPerformed(evt);
            }
        });

        jTablePRODUCT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductID", "ProductName", "Description", "Barcode", "CostPrice", "Rental", "Quantity", "ReOrder"
            }
        ));
        jTablePRODUCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePRODUCTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePRODUCT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextRLEVEL, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextPNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextDESCRIP, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextBAR, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCPRICE, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextRPRICE, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextPNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jTextDESCRIP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextBAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextCPRICE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextRPRICE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(37, 37, 37))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextQTY, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jTextRLEVEL, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("EDIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("CANCEL");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton1)
                        .addGap(71, 71, 71)
                        .addComponent(jButton2)
                        .addGap(62, 62, 62)
                        .addComponent(jButton3)
                        .addGap(77, 77, 77)
                        .addComponent(jButton4)
                        .addGap(93, 93, 93)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(jButton4)
                        .addComponent(jButton5)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
        // Assuming your 'con' and 'pst' are declared as class members and 'Connect()' is called before this.
        String pname = jTextPNAME.getText();
        String description = jTextDESCRIP.getText();
        String barcode = jTextBAR.getText();
        double cprice = Double.parseDouble(jTextCPRICE.getText());
        double rprice = Double.parseDouble(jTextRPRICE.getText());
        int qty = Integer.parseInt(jTextQTY.getText());
        int rlevel = Integer.parseInt(jTextRLEVEL.getText());

        String sql = "INSERT INTO product (pname, description, barcode, cprice, rprice, qty, rlevel) VALUES (?, ?, ?, ?, ?, ?, ?)";
        pst = con.prepareStatement(sql);
        pst.setString(1, pname);
        pst.setString(2, description);
        pst.setString(3, barcode);
        pst.setDouble(4, cprice);
        pst.setDouble(5, rprice);
        pst.setInt(6, qty);
        pst.setInt(7, rlevel);

        pst.executeUpdate();

        JOptionPane.showMessageDialog(null, "Product Added Successfully");

        // Optionally clear text fields after successful insert
        jTextPNAME.setText("");
        jTextDESCRIP.setText("");
        jTextBAR.setText("");
        jTextCPRICE.setText("");
        jTextRPRICE.setText("");
        jTextQTY.setText("");
        jTextRLEVEL.setText("");
        
        // Optionally reset focus to first input
        jTextPNAME.requestFocus();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Please enter valid numbers for price, quantity, and reorder level.");
    }
         load();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        
        
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try {
        String barcode = jTextBAR.getText();

        if (barcode.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the barcode of the product to delete.");
            return;
        }

        String sql = "DELETE FROM product WHERE barcode = ?";
        pst = con.prepareStatement(sql);
        pst.setString(1, barcode);

        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this product?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Product deleted successfully.");
                // Optionally clear the form fields
                jTextPNAME.setText("");
                jTextDESCRIP.setText("");
                jTextBAR.setText("");
                jTextCPRICE.setText("");
                jTextRPRICE.setText("");
                jTextQTY.setText("");
                jTextRLEVEL.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "No product found with the given barcode.");
            }
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
    }
         load();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTablePRODUCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePRODUCTMouseClicked
        // TODO add your handling code here:
        df = (DefaultTableModel)jTablePRODUCT.getModel();
        int selectIndex = jTablePRODUCT.getSelectedRow();
        
        String id = df.getValueAt(selectIndex, 0).toString();
        jTextPNAME.setText(df.getValueAt(selectIndex, 1).toString());
        jTextDESCRIP.setText(df.getValueAt(selectIndex, 2).toString());
        jTextBAR.setText(df.getValueAt(selectIndex, 3).toString());
        jTextCPRICE.setText(df.getValueAt(selectIndex, 4).toString());
        jTextRPRICE.setText(df.getValueAt(selectIndex, 5).toString());
        jTextQTY.setText(df.getValueAt(selectIndex, 6).toString());
        jTextRLEVEL.setText(df.getValueAt(selectIndex,7).toString());
        load();
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jTablePRODUCTMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTablePRODUCT.getModel();
    int selectedIndex = jTablePRODUCT.getSelectedRow();

    if (selectedIndex == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row to update.");
        return;
    }

    try {
        String id = model.getValueAt(selectedIndex, 0).toString();

        String pname = jTextPNAME.getText();
        String description = jTextDESCRIP.getText();
        String barcode = jTextBAR.getText();
        String cprice = jTextCPRICE.getText();
        String rprice = jTextRPRICE.getText();
        String qty = jTextQTY.getText();
        String rlevel = jTextRLEVEL.getText();

        pst = con.prepareStatement("UPDATE product SET pname=?, description=?, barcode=?, cprice=?, rprice=?, qty=?, rlevel=? WHERE id=?");

        pst.setString(1, pname);
        pst.setString(2, description);
        pst.setString(3, barcode);
        pst.setString(4, cprice);
        pst.setString(5, rprice);
        pst.setString(6, qty);
        pst.setString(7, rlevel);
        pst.setString(8, id);

        int k = pst.executeUpdate();

        if (k == 1) {
            JOptionPane.showMessageDialog(this, "Product Updated Successfully.");
            clearFields();
            load(); // Refresh the table after update
        } else {
            JOptionPane.showMessageDialog(this, "Update Failed.");
        }

    } catch (SQLException ex) {
        Logger.getLogger(vendors.class.getName()).log(Level.SEVERE, null, ex);
    }
    load();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clearFields();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextDESCRIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDESCRIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDESCRIPActionPerformed

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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePRODUCT;
    private javax.swing.JTextField jTextBAR;
    private javax.swing.JTextField jTextCPRICE;
    private javax.swing.JTextField jTextDESCRIP;
    private javax.swing.JTextField jTextPNAME;
    private javax.swing.JTextField jTextQTY;
    private javax.swing.JTextField jTextRLEVEL;
    private javax.swing.JTextField jTextRPRICE;
    // End of variables declaration//GEN-END:variables
}
