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
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author TOSHIBA
 */
public class vendors extends javax.swing.JFrame {


 
    public vendors() {
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

public void load(){

int a;
try
{
pst = con.prepareStatement("select * from vendor");
ResultSet rs = pst.executeQuery();

ResultSetMetaData rd = rs.getMetaData();
a = rd.getColumnCount();
df = (DefaultTableModel)jtableVENDOR.getModel();
df.setRowCount(0);

while(rs.next())
{
Vector v2 = new Vector();
for(int i=1; i<=a; i++){

v2.add(rs.getString("id"));
v2.add(rs.getString("name"));
v2.add(rs.getString("phone"));
v2.add(rs.getString("email"));
v2.add(rs.getString("address"));
}
df.addRow(v2);
}
}  catch (SQLException ex) {
            Logger.getLogger(vendors.class.getName()).log(Level.SEVERE, null, ex);
           }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtableVENDOR = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        ADD = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextVENDOR = new javax.swing.JTextField();
        jTextVENDOREMAIL = new javax.swing.JTextField();
        jTextPHONENUM = new javax.swing.JTextField();
        jTextADD = new javax.swing.JTextField();
        EDIT = new javax.swing.JButton();
        CANCEL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtableVENDOR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VendorID", "Vendor Name", "Email", "PhoneNumber", "Address"
            }
        ));
        jtableVENDOR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableVENDORMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableVENDOR);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel5.setText("Vendor");

        ADD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        DELETE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DELETE.setText("DELETE");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Vendor Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("PhoneNumber");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Address");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextVENDOR, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel2)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jTextADD))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jTextVENDOREMAIL)))))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextPHONENUM)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextVENDOR, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPHONENUM, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTextVENDOREMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextADD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        EDIT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EDIT.setText("EDIT");
        EDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITActionPerformed(evt);
            }
        });

        CANCEL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CANCEL.setText("CANCEL");
        CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(ADD)
                                .addGap(56, 56, 56)
                                .addComponent(EDIT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DELETE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(CANCEL))))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ADD)
                            .addComponent(EDIT)
                            .addComponent(DELETE)
                            .addComponent(CANCEL)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     
    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
 
        try {
String vname = jTextVENDOR.getText();
String phone = jTextPHONENUM.getText();
String email = jTextVENDOREMAIL.getText();
String address = jTextADD.getText();


pst = con.prepareStatement("insert into vendor(name, phone, email, address)values(?,?,?,?)");
            
pst.setString(1, vname);
pst.setString(2, phone);
pst.setString(3, email);
pst.setString(4, address);
pst.executeUpdate();
JOptionPane.showMessageDialog(this, "Vendor Added");

            
jTextVENDOR.setText("");
jTextPHONENUM.setText("");
jTextVENDOREMAIL.setText("");
jTextADD.setText("");
jTextVENDOR.requestFocus();
load();

            
            
        } catch (SQLException ex) {
            Logger.getLogger(vendors.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_ADDActionPerformed

    private void jtableVENDORMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableVENDORMouseClicked
   df = (DefaultTableModel)jtableVENDOR.getModel();
int selected = jtableVENDOR.getSelectedRow();

int id = Integer.parseInt(df.getValueAt(selected, 0).toString());
jTextVENDOR.setText(df.getValueAt(selected, 1).toString());
jTextPHONENUM.setText(df.getValueAt(selected, 2).toString());
jTextVENDOREMAIL.setText(df.getValueAt(selected, 3).toString());
jTextADD.setText(df.getValueAt(selected, 4).toString());

ADD.setEnabled(false);
    }//GEN-LAST:event_jtableVENDORMouseClicked

    private void EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITActionPerformed
    df = (DefaultTableModel)jtableVENDOR.getModel();
int selected = jtableVENDOR.getSelectedRow();

int id = Integer.parseInt(df.getValueAt(selected, 0).toString());

String vname = jTextVENDOR.getText();
String phone = jTextPHONENUM.getText();
String email = jTextVENDOREMAIL.getText();
String address = jTextADD.getText();


try
{
pst = con.prepareStatement("update vendor set name=?, phone=?, email=?, address=? where id=?");

pst.setString(1, vname);
pst.setString(2, phone);
pst.setString(3, email);
pst.setString(4, address);
pst.setInt(5, id);
pst.executeUpdate();
JOptionPane.showMessageDialog(this, "Vendor Added");
load();
ADD.setEnabled(true);


jTextVENDOR.setText("");
jTextPHONENUM.setText("");
jTextVENDOREMAIL.setText("");
jTextADD.setText("");
jTextVENDOR.requestFocus();
} catch (SQLException ex) {
            Logger.getLogger(vendors.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_EDITActionPerformed

    private void CANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELActionPerformed
        // TODO add your handling code here:
        
        
        
        this.setVisible(false);
    }//GEN-LAST:event_CANCELActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        // TODO add your handling code here:
         try{
          df = (DefaultTableModel)jtableVENDOR.getModel();
   int selectIndex = jtableVENDOR.getSelectedRow();
      String id = df.getValueAt(selectIndex, 0).toString();
pst = con.prepareStatement("delete from vendor where id = ?");
pst.setString(1, id);

pst.executeUpdate();
JOptionPane.showMessageDialog(this, "Vendor deleted");
 
  
  
jTextVENDOR.setText("");
jTextPHONENUM.setText("");
jTextVENDOREMAIL.setText("");
jTextADD.setText("");
jTextVENDOR.requestFocus();
load();

      } catch (SQLException ex) {
            Logger.getLogger(vendors.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_DELETEActionPerformed

    /**
     * @param args the command line arguments
     */
 
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
            java.util.logging.Logger.getLogger(vendors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vendors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vendors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vendors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vendors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton CANCEL;
    private javax.swing.JButton DELETE;
    private javax.swing.JButton EDIT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextADD;
    private javax.swing.JTextField jTextPHONENUM;
    private javax.swing.JTextField jTextVENDOR;
    private javax.swing.JTextField jTextVENDOREMAIL;
    private javax.swing.JTable jtableVENDOR;
    // End of variables declaration//GEN-END:variables
}
