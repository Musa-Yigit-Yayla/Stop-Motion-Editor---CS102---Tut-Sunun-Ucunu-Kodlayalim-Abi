/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.guideneme;

/**
 *
 * @author Burak Oruk
 */
public class LoginScreenFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public LoginScreenFrame() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        logıinBasePanel = new javax.swing.JPanel();
        loginUsernameLabel = new javax.swing.JLabel();
        loginUsernameScrollpane = new javax.swing.JScrollPane();
        loginUsernameTextArea = new javax.swing.JTextArea();
        loginPasswordLabel = new javax.swing.JLabel();
        loginPasswordScrollpane = new javax.swing.JScrollPane();
        loginPasswordTextArea = new javax.swing.JTextArea();
        loginDoneButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        logıinBasePanel.setBackground(new java.awt.Color(102, 236, 133));

        loginUsernameLabel.setFont(new java.awt.Font("Ink Free", 3, 36)); // NOI18N
        loginUsernameLabel.setForeground(new java.awt.Color(51, 0, 51));
        loginUsernameLabel.setText("ENTER USERNAME");

        loginUsernameScrollpane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        loginUsernameScrollpane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        loginUsernameTextArea.setBackground(new java.awt.Color(0, 255, 153));
        loginUsernameTextArea.setColumns(20);
        loginUsernameTextArea.setFont(new java.awt.Font("Constantia", 0, 36)); // NOI18N
        loginUsernameTextArea.setForeground(new java.awt.Color(0, 102, 102));
        loginUsernameTextArea.setRows(5);
        loginUsernameTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usernameHandler(evt);
            }
        });
        loginUsernameScrollpane.setViewportView(loginUsernameTextArea);

        loginPasswordLabel.setFont(new java.awt.Font("Ink Free", 3, 36)); // NOI18N
        loginPasswordLabel.setForeground(new java.awt.Color(51, 0, 51));
        loginPasswordLabel.setText("ENTER PASSWORD");

        loginPasswordScrollpane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        loginPasswordScrollpane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        loginPasswordTextArea.setBackground(new java.awt.Color(0, 255, 153));
        loginPasswordTextArea.setColumns(20);
        loginPasswordTextArea.setFont(new java.awt.Font("Constantia", 0, 36)); // NOI18N
        loginPasswordTextArea.setForeground(new java.awt.Color(0, 102, 102));
        loginPasswordTextArea.setRows(5);
        loginPasswordTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                loginPasswordTextAreausernameHandler(evt);
            }
        });
        loginPasswordScrollpane.setViewportView(loginPasswordTextArea);

        loginDoneButton.setBackground(new java.awt.Color(51, 204, 0));
        loginDoneButton.setFont(new java.awt.Font("Ink Free", 3, 36)); // NOI18N
        loginDoneButton.setForeground(new java.awt.Color(153, 255, 102));
        loginDoneButton.setText("DONE!");
        loginDoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginDoneButtonActionPerformed(evt);
            }
        });

        registerButton.setBackground(new java.awt.Color(0, 153, 51));
        registerButton.setFont(new java.awt.Font("Yu Gothic Medium", 2, 20)); // NOI18N
        registerButton.setForeground(new java.awt.Color(0, 51, 51));
        registerButton.setText("Don't have an account? Click HERE to register!");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout logıinBasePanelLayout = new javax.swing.GroupLayout(logıinBasePanel);
        logıinBasePanel.setLayout(logıinBasePanelLayout);
        logıinBasePanelLayout.setHorizontalGroup(
            logıinBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logıinBasePanelLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(logıinBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logıinBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(logıinBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logıinBasePanelLayout.createSequentialGroup()
                                .addComponent(loginUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(145, 145, 145))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logıinBasePanelLayout.createSequentialGroup()
                                .addComponent(loginUsernameScrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126)))
                        .addGroup(logıinBasePanelLayout.createSequentialGroup()
                            .addGroup(logıinBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(loginPasswordScrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(logıinBasePanelLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(loginPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(16, 16, 16)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logıinBasePanelLayout.createSequentialGroup()
                        .addComponent(loginDoneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(230, 230, 230))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logıinBasePanelLayout.createSequentialGroup()
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        logıinBasePanelLayout.setVerticalGroup(
            logıinBasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logıinBasePanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(loginUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginUsernameScrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(loginPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginPasswordScrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginDoneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logıinBasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logıinBasePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameHandler(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameHandler

    private void loginPasswordTextAreausernameHandler(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginPasswordTextAreausernameHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_loginPasswordTextAreausernameHandler

    private void loginDoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginDoneButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginDoneButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreenFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton loginDoneButton;
    private javax.swing.JLabel loginPasswordLabel;
    private javax.swing.JScrollPane loginPasswordScrollpane;
    private javax.swing.JTextArea loginPasswordTextArea;
    private javax.swing.JLabel loginUsernameLabel;
    private javax.swing.JScrollPane loginUsernameScrollpane;
    private javax.swing.JTextArea loginUsernameTextArea;
    private javax.swing.JPanel logıinBasePanel;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables

}

