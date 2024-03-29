
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mubsi
 */
public class LoginPagem extends javax.swing.JFrame {

    /**
     * Creates new form LoginPagem
     */
    public LoginPagem() {
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel_LOGIN = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        lblAskAccount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login Page");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanel_LOGIN.setBackground(new java.awt.Color(0, 0, 0,80));

        lblTitle.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("LOGIN");

        lblUserName.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password:");

        txtUserName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        passwordField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordField.setText("*****");
        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordFieldMouseClicked(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(102, 255, 102));
        btnLogin.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(102, 255, 102));
        btnRegister.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        lblAskAccount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAskAccount.setForeground(new java.awt.Color(255, 255, 255));
        lblAskAccount.setText("Don't you have an account?");

        javax.swing.GroupLayout jpanel_LOGINLayout = new javax.swing.GroupLayout(jpanel_LOGIN);
        jpanel_LOGIN.setLayout(jpanel_LOGINLayout);
        jpanel_LOGINLayout.setHorizontalGroup(
            jpanel_LOGINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_LOGINLayout.createSequentialGroup()
                .addGroup(jpanel_LOGINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel_LOGINLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanel_LOGINLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegister))
                    .addGroup(jpanel_LOGINLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAskAccount)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_LOGINLayout.createSequentialGroup()
                .addGroup(jpanel_LOGINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpanel_LOGINLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanel_LOGINLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jpanel_LOGINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpanel_LOGINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(passwordField))))
                .addGap(195, 195, 195))
        );
        jpanel_LOGINLayout.setVerticalGroup(
            jpanel_LOGINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_LOGINLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jpanel_LOGINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanel_LOGINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(lblAskAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jpanel_LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 330, 320));

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
    //Login Button
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
        String connectionUrl = "jdbc:sqlserver://MBS;databaseName=searchapplication;integratedSecurity=true;trustServerCertificate=true;"; 
        Connection connection = DriverManager.getConnection(connectionUrl);
        String query = "Select * FROM dbo.LoginList where username =? and password=?";
        var pst = connection.prepareStatement(query);
        pst.setString(1,txtUserName.getText());
        pst.setString(2,passwordField.getText());
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()){
            JOptionPane.showMessageDialog(null,"Login Succesful!!");
            SearchApplication myApplication = new SearchApplication();
            myApplication.setVisible(true);
            closeFirstScreen();
        }else{
            JOptionPane.showMessageDialog(null,"Username or Password NOT CORRECT !!");
            txtUserName.setText("");
            passwordField.setText("");
        
        }
        
        
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
       
        if(evt.getSource() == btnRegister){
        closeFirstScreen();    
        RegisterPagem register = new RegisterPagem();
        register.setVisible(true);       
        } 
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void passwordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMouseClicked
        passwordField.setText("");
    }//GEN-LAST:event_passwordFieldMouseClicked

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyPressed
//       if (evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER){
//           JOptionPane.showMessageDialog(null,"Denemedir");
//       }
    }//GEN-LAST:event_btnLoginKeyPressed
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        MyScreen myScreen = new MyScreen(); 
           myScreen.setVisible(true);
        
         try { 
            for(int i =0 ; i<= 100 ; i++){
                Thread.sleep(40);
                myScreen.lblLoadingValue.setText(i +"%");
                
                if(i== 10){
                    myScreen.lblInformation.setText("Turning Modules...");                   
                }
                if(i== 30){
                    myScreen.lblInformation.setText("Loading Modules...");                   
                }
                if(i== 50){
                    myScreen.lblInformation.setText("Connection to Database...");                   
                }
                if(i== 70){
                    myScreen.lblInformation.setText("Connection Successful...");                   
                }
                if(i== 90){
                    myScreen.lblInformation.setText("Launching...");                   
                }
                myScreen.LoadingBar.setValue(i);
            } 
            myScreen.setVisible(false);
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
        
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
                new LoginPagem().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpanel_LOGIN;
    private javax.swing.JLabel lblAskAccount;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
