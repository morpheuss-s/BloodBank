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
        menuBar = new javax.swing.JMenuBar();
        adminPanelMenu = new javax.swing.JMenu();
        addNewUserMenuItem = new javax.swing.JMenuItem();
        deleteUserMenuItem = new javax.swing.JMenuItem();
        updateUserProfileMenuItem = new javax.swing.JMenuItem();
        myAccountMenu = new javax.swing.JMenu();
        profileMenuItem = new javax.swing.JMenuItem();
        logoutMenuItem = new javax.swing.JMenuItem();
        bloodDonorsMenu = new javax.swing.JMenu();
        addDonorMenuItem = new javax.swing.JMenuItem();
        updateDonorProfileMenuItem = new javax.swing.JMenuItem();
        deleteDonorMenuItem = new javax.swing.JMenuItem();
        bloodInventoryMenu = new javax.swing.JMenu();
        currentStockStatusMenuItem = new javax.swing.JMenuItem();
        addNewStockMenuItem = new javax.swing.JMenuItem();
        updateStockMenuItem = new javax.swing.JMenuItem();
        getStockReportMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1533, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 943, Short.MAX_VALUE)
        );

        menuBar.setBackground(new java.awt.Color(204, 0, 0));
        menuBar.setPreferredSize(new java.awt.Dimension(472, 40));

        adminPanelMenu.setText("Admin Panel");
        adminPanelMenu.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N

        addNewUserMenuItem.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        addNewUserMenuItem.setText("Add New User");
        addNewUserMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewUserMenuItemActionPerformed(evt);
            }
        });
        adminPanelMenu.add(addNewUserMenuItem);

        deleteUserMenuItem.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        deleteUserMenuItem.setText("Delete User");
        adminPanelMenu.add(deleteUserMenuItem);

        updateUserProfileMenuItem.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        updateUserProfileMenuItem.setText("Update user Profile");
        adminPanelMenu.add(updateUserProfileMenuItem);

        menuBar.add(adminPanelMenu);

        myAccountMenu.setText("     My Account");
        myAccountMenu.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N

        profileMenuItem.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        profileMenuItem.setText("Profile");
        myAccountMenu.add(profileMenuItem);

        logoutMenuItem.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        logoutMenuItem.setText("Logout");
        myAccountMenu.add(logoutMenuItem);

        menuBar.add(myAccountMenu);

        bloodDonorsMenu.setText("     Blood Donors");
        bloodDonorsMenu.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        bloodDonorsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodDonorsMenuActionPerformed(evt);
            }
        });

        addDonorMenuItem.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        addDonorMenuItem.setText("Add New Donor");
        addDonorMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDonorMenuItemActionPerformed(evt);
            }
        });
        bloodDonorsMenu.add(addDonorMenuItem);

        updateDonorProfileMenuItem.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        updateDonorProfileMenuItem.setText("Update Donor Profile");
        bloodDonorsMenu.add(updateDonorProfileMenuItem);

        deleteDonorMenuItem.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        deleteDonorMenuItem.setText("Delete Donor");
        bloodDonorsMenu.add(deleteDonorMenuItem);

        menuBar.add(bloodDonorsMenu);

        bloodInventoryMenu.setText("      Blood Inventory");
        bloodInventoryMenu.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N

        currentStockStatusMenuItem.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        currentStockStatusMenuItem.setText("Current Stock Status");
        currentStockStatusMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentStockStatusMenuItemActionPerformed(evt);
            }
        });
        bloodInventoryMenu.add(currentStockStatusMenuItem);

        addNewStockMenuItem.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        addNewStockMenuItem.setText("Add New Stock");
        bloodInventoryMenu.add(addNewStockMenuItem);

        updateStockMenuItem.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        updateStockMenuItem.setText("Update Stock");
        bloodInventoryMenu.add(updateStockMenuItem);

        getStockReportMenuItem.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        getStockReportMenuItem.setText("Get Stock Report");
        bloodInventoryMenu.add(getStockReportMenuItem);

        menuBar.add(bloodInventoryMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bloodDonorsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodDonorsMenuActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bloodDonorsMenuActionPerformed

    private void addDonorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDonorMenuItemActionPerformed
        // TODO add your handling code here:
        DonorMenu dmenu = new DonorMenu();
        Desktop.add(dmenu).setVisible(true);
    }//GEN-LAST:event_addDonorMenuItemActionPerformed

    private void addNewUserMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewUserMenuItemActionPerformed
        // TODO add your handling code here:
        NewUserForm nuf = new NewUserForm();
        Desktop.add(nuf).setVisible(true);
    }//GEN-LAST:event_addNewUserMenuItemActionPerformed

    private void currentStockStatusMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentStockStatusMenuItemActionPerformed
        // TODO add your handling code here:
        Inventory intv = new Inventory();
        Desktop.add(intv).setVisible(true);
    }//GEN-LAST:event_currentStockStatusMenuItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem addDonorMenuItem;
    private javax.swing.JMenuItem addNewStockMenuItem;
    private javax.swing.JMenuItem addNewUserMenuItem;
    private javax.swing.JMenu adminPanelMenu;
    private javax.swing.JMenu bloodDonorsMenu;
    private javax.swing.JMenu bloodInventoryMenu;
    private javax.swing.JMenuItem currentStockStatusMenuItem;
    private javax.swing.JMenuItem deleteDonorMenuItem;
    private javax.swing.JMenuItem deleteUserMenuItem;
    private javax.swing.JMenuItem getStockReportMenuItem;
    private javax.swing.JMenuItem logoutMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu myAccountMenu;
    private javax.swing.JMenuItem profileMenuItem;
    private javax.swing.JMenuItem updateDonorProfileMenuItem;
    private javax.swing.JMenuItem updateStockMenuItem;
    private javax.swing.JMenuItem updateUserProfileMenuItem;
    // End of variables declaration//GEN-END:variables
}
