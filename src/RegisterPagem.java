

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mubsi
 */
public class RegisterPagem extends javax.swing.JFrame {

    /**
     * Creates new form LoginPagem
     */
    public RegisterPagem() {
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

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        btnGoingBack = new javax.swing.JButton();
        lblAskAccount = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register Page");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));

        lblTitle.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("REGISTER");

        lblUserName.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password:");

        txtUserName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordFieldMouseClicked(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(102, 255, 102));
        btnRegister.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnGoingBack.setBackground(new java.awt.Color(102, 255, 102));
        btnGoingBack.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        btnGoingBack.setText("Go back to login page");
        btnGoingBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoingBackActionPerformed(evt);
            }
        });

        lblAskAccount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAskAccount.setForeground(new java.awt.Color(255, 255, 255));
        lblAskAccount.setText("You already have an account?");

        lblEmail.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");

        txtEmail.setPreferredSize(new java.awt.Dimension(64, 25));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegister))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(txtUserName)
                            .addComponent(passwordField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(50, Short.MAX_VALUE)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGap(181, 181, 181))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAskAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGoingBack))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblUserName))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPassword)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(passwordField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegister)
                        .addGap(28, 28, 28)))
                .addComponent(lblAskAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGoingBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 330, 380));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/splashScreen/Assets/lockImagem.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1920, 900));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(814, 457));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void closeFirstScreen(){
        WindowEvent windowsClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowsClosingEvent);
    
    }
        
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        try {
            String userName , password, email;
            userName = txtUserName.getText();
            password = passwordField.getText();
            email = txtEmail.getText();
            
            if(txtUserName.getText().isEmpty() || passwordField.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"User WILL NOT BE CREATED !!");
                
            }
            else{
                
                var query = "EXEC [dbo].[sp_InsertUser] '"+userName+"','"+password+"','"+email+"'";
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
                String connectionUrl = "jdbc:sqlserver://MBS;databaseName=searchapplication;integratedSecurity=true;trustServerCertificate=true;"; 
                Connection connection = DriverManager.getConnection(connectionUrl);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
            
                if(resultSet.next()){
                    JOptionPane.showMessageDialog(null,"Register Succesful!!");
                }
                else {
                    JOptionPane.showMessageDialog(null,"User can not created !!");
                }
            
            }  
            
            
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnGoingBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoingBackActionPerformed
        if(evt.getSource()== btnGoingBack){
        closeFirstScreen();    
        LoginPagem goingBack = new LoginPagem();
        goingBack.setVisible(true);       
        }
    }//GEN-LAST:event_btnGoingBackActionPerformed

    private void passwordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMouseClicked
        passwordField.setText("");
    }//GEN-LAST:event_passwordFieldMouseClicked

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
            java.util.logging.Logger.getLogger(LoginPagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPagem().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoingBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAskAccount;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
