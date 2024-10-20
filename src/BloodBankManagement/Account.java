/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package BloodBankManagement;

/**
 *
 * @author souleymane.sono
 */
public class Account extends javax.swing.JInternalFrame {

    /**
     * Creates new form Account
     */
    public Account() {
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

        accountPanel = new javax.swing.JPanel();
        sideBarPanel = new javax.swing.JPanel();
        myAccountLabel = new javax.swing.JLabel();
        eventsLabel = new javax.swing.JLabel();
        documentUploadsLabel = new javax.swing.JLabel();
        complaintsLabel = new javax.swing.JLabel();
        activityFeedButton = new javax.swing.JButton();
        mailboxButton = new javax.swing.JButton();
        newsButton = new javax.swing.JButton();
        eventsListButton = new javax.swing.JButton();
        calendarButton = new javax.swing.JButton();
        eventTypesButton = new javax.swing.JButton();
        uploadButton = new javax.swing.JButton();
        categoryButton = new javax.swing.JButton();
        complaintListButton = new javax.swing.JButton();
        complaintListLabel = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        fileChooser = new javax.swing.JFileChooser();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setAutoscrolls(true);

        accountPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 0, 18))); // NOI18N

        sideBarPanel.setBackground(new java.awt.Color(204, 204, 204));

        myAccountLabel.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        myAccountLabel.setText("MY ACCOUNT");

        eventsLabel.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        eventsLabel.setText("EVENTS");

        documentUploadsLabel.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        documentUploadsLabel.setText("DOCUMENT UPLOADS");

        complaintsLabel.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        complaintsLabel.setText("COMPLAINTS");

        activityFeedButton.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        activityFeedButton.setText("Activity Feed");
        activityFeedButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        mailboxButton.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        mailboxButton.setText("Mailbox");
        mailboxButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        newsButton.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        newsButton.setText("News");
        newsButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        eventsListButton.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        eventsListButton.setText("Events List");
        eventsListButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        calendarButton.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        calendarButton.setText("Calendar");
        calendarButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        eventTypesButton.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        eventTypesButton.setText("Event Types");
        eventTypesButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        uploadButton.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        uploadButton.setText("Upload");
        uploadButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        categoryButton.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        categoryButton.setText("Category");
        categoryButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        categoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryButtonActionPerformed(evt);
            }
        });

        complaintListButton.setFont(new java.awt.Font("Bahnschrift", 0, 13)); // NOI18N
        complaintListButton.setText("Complaint List");
        complaintListButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        complaintListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complaintListButtonActionPerformed(evt);
            }
        });

        complaintListLabel.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        complaintListLabel.setText("0");

        javax.swing.GroupLayout sideBarPanelLayout = new javax.swing.GroupLayout(sideBarPanel);
        sideBarPanel.setLayout(sideBarPanelLayout);
        sideBarPanelLayout.setHorizontalGroup(
            sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarPanelLayout.createSequentialGroup()
                .addGroup(sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eventsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eventsListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calendarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eventTypesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(sideBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(complaintsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(documentUploadsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(activityFeedButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                        .addComponent(myAccountLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mailboxButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(categoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sideBarPanelLayout.createSequentialGroup()
                        .addComponent(complaintListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(complaintListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        sideBarPanelLayout.setVerticalGroup(
            sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarPanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(myAccountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(activityFeedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mailboxButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(eventsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(eventsListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(calendarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(eventTypesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(documentUploadsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(uploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(complaintsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(sideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(complaintListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(complaintListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(fileChooser, javax.swing.JLayeredPane.POPUP_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout accountPanelLayout = new javax.swing.GroupLayout(accountPanel);
        accountPanel.setLayout(accountPanelLayout);
        accountPanelLayout.setHorizontalGroup(
            accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sideBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        accountPanelLayout.setVerticalGroup(
            accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountPanelLayout.createSequentialGroup()
                .addGroup(accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accountPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sideBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jDesktopPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(accountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(accountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void categoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryButtonActionPerformed

    private void complaintListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complaintListButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_complaintListButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accountPanel;
    private javax.swing.JButton activityFeedButton;
    private javax.swing.JButton calendarButton;
    private javax.swing.JButton categoryButton;
    private javax.swing.JButton complaintListButton;
    private javax.swing.JLabel complaintListLabel;
    private javax.swing.JLabel complaintsLabel;
    private javax.swing.JLabel documentUploadsLabel;
    private javax.swing.JButton eventTypesButton;
    private javax.swing.JLabel eventsLabel;
    private javax.swing.JButton eventsListButton;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JButton mailboxButton;
    private javax.swing.JLabel myAccountLabel;
    private javax.swing.JButton newsButton;
    private javax.swing.JPanel sideBarPanel;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
}
