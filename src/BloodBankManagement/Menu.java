/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BloodBankManagement;

/**
 *
 * @author Souleymane.Sono
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        Desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        AddDonor = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2357, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1354, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 0, 0));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(472, 40));

        jMenu1.setText("Admin Panel");
        jMenu1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jMenuItem1.setText("Add New User");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jMenuItem2.setText("Delete User");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jMenuItem3.setText("Update user Profile");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("     My Account");
        jMenu4.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N

        jMenuItem11.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jMenuItem11.setText("Profile");
        jMenu4.add(jMenuItem11);

        jMenuItem12.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jMenuItem12.setText("Logout");
        jMenu4.add(jMenuItem12);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("     Blood Donors");
        jMenu2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        AddDonor.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        AddDonor.setText("Add New Donor");
        AddDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDonorActionPerformed(evt);
            }
        });
        jMenu2.add(AddDonor);

        jMenuItem5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jMenuItem5.setText("Update Donor Profile");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jMenuItem6.setText("Delete Donor");
        jMenu2.add(jMenuItem6);

        jMenuItem4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jMenuItem4.setText("Add Blood");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("      Blood Inventory");
        jMenu3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jMenuItem7.setText("Stock Current Status");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jMenuItem8.setText("Add New Stock");
        jMenu3.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jMenuItem9.setText("Update Stock");
        jMenu3.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jMenuItem10.setText("Get Stock Report");
        jMenu3.add(jMenuItem10);

        jMenuItem13.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jMenuItem13.setText("Add Blood");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void AddDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDonorActionPerformed
        // TODO add your handling code here:
        DonorMenu dmenu = new DonorMenu();
        Desktop.add(dmenu).setVisible(true);
    }//GEN-LAST:event_AddDonorActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        NewUserForm nuf = new NewUserForm();
        Desktop.add(nuf).setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        Inventory intv = new Inventory();
        Desktop.add(intv).setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        AddBlood ab = new AddBlood();
        Desktop.add(ab).setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddDonor;
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
