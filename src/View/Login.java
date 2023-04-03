
package View;

import Model.User;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login extends javax.swing.JPanel {

    public Frame frame;
    
    private boolean isUsernameValid = false;
    private boolean isPassValid = false;
    private boolean isRoleValid = false;
    private boolean isLocked = false;
    
    private int userAttempts = 0;
    private int userIndex = 0;
    private ArrayList<User> userList;
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        usernameFld = new javax.swing.JTextField();
        passwordFld = new javax.swing.JPasswordField();
        registerBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        errorMessage = new javax.swing.JTextField();
        errorMaxAttempt = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        usernameFld.setBackground(new java.awt.Color(240, 240, 240));
        usernameFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        passwordFld.setBackground(new java.awt.Color(240, 240, 240));
        passwordFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        registerBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        registerBtn.setText("REGISTER");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        loginBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        loginBtn.setText("LOGIN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        errorMessage.setEditable(false);
        errorMessage.setForeground(new java.awt.Color(204, 0, 51));
        errorMessage.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        errorMessage.setText("Username or password is invalid.");
        errorMessage.setAlignmentX(0.0F);
        errorMessage.setAlignmentY(0.0F);
        errorMessage.setBorder(null);
        errorMessage.setDisabledTextColor(new java.awt.Color(242, 242, 242));
        errorMessage.setEnabled(false);

        errorMaxAttempt.setEditable(false);
        errorMaxAttempt.setForeground(new java.awt.Color(204, 0, 51));
        errorMaxAttempt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        errorMaxAttempt.setText("User has been locked. Please contact admin to re-activate account.");
        errorMaxAttempt.setAlignmentX(0.0F);
        errorMaxAttempt.setAlignmentY(0.0F);
        errorMaxAttempt.setBorder(null);
        errorMaxAttempt.setDisabledTextColor(new java.awt.Color(242, 242, 242));
        errorMaxAttempt.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(usernameFld)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordFld, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(200, Short.MAX_VALUE))
            .addComponent(errorMessage, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errorMaxAttempt)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(usernameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorMaxAttempt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        if(checkInput()){
            checkUsername();
            // If username is valid, then it will check if the password is correct
            if(isUsernameValid){
                try {
                    checkPassword();
                } catch (Exception ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else{
                isPassValid = false;
            }

            checkLock();

            if(!isLocked){
                // Checks for the validity of both username and password for the user to proceed to the main page
                if(isUsernameValid && isPassValid){
                    checkRole();
                    if(isRoleValid){
                        frame.mainNav(usernameFld.getText().toLowerCase());
                        frame.createLog(usernameFld.getText(), " User login successful");
                        frame.setUser(usernameFld.getText());
                        frame.setRole(frame.getUser(usernameFld.getText()).getRole());
                        frame.initFrame();

                        errorMaxAttempt.setEnabled(false);
                        frame.resetLock(userList.get(userIndex).getUsername()); // resets the lock of the user since he successfully logged in
                        resetLogInPage();
                    } else{
                        errorMessage.setText("User is disabled. Please contact admin to re-activate account.");
                        errorMessage.setEnabled(true);
                        errorMaxAttempt.setEnabled(false);
                    }
                } else{
                    errorMessage.setText("Username or password is invalid.");
                    errorMessage.setEnabled(true);
                    errorMaxAttempt.setEnabled(false);
                }
            } else{
                errorMaxAttempt.setEnabled(true);
                errorMessage.setEnabled(false);
                isLocked = false;
            }
        } else{
            errorMessage.setEnabled(true);
            errorMaxAttempt.setEnabled(false);
        }

    }//GEN-LAST:event_loginBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        frame.registerNav();
        resetLogInPage();
    }//GEN-LAST:event_registerBtnActionPerformed

    // Clears all input fields and resets the error message
    private void resetLogInPage(){
        usernameFld.setText("");
        passwordFld.setText("");
        errorMessage.setEnabled(false);
        errorMaxAttempt.setEnabled(false);
    }
    
    private boolean checkInput(){
        boolean isInputValid = false;
        
    // Checks if the username input does not contain <, >, ', or "
        Pattern patternUsernameSymbol = Pattern.compile("^[^<>'\"]+$");
        Matcher matcherUsernameSymbol = patternUsernameSymbol.matcher(usernameFld.getText());
        boolean containsUsernameSymbol = matcherUsernameSymbol.find();
        
        // Checks if the password input does not contain <, >, ', or "
        Pattern patternPassSymbol = Pattern.compile("^[^<>'\"]+$");
        Matcher matcherPassSymbol = patternPassSymbol.matcher(passwordFld.getText());
        boolean containsPassSymbol = matcherPassSymbol.find();
        
        if(containsUsernameSymbol && containsPassSymbol){
            isInputValid = true;
        } else{
            isInputValid = false;
        }
        
        return isInputValid;
    }

    // Checks if username exists in the database
    private void checkUsername(){
        userList = frame.getUserList();
        isUsernameValid = false;
        for(int i = 0; i < userList.size(); i++){
            if(userList.get(i).getUsername().equals(usernameFld.getText().toLowerCase())){
                isUsernameValid = true;
                userIndex = i;
            }
        }
    }

    // Checks if the password is correct and matches a user's credentials in the database
    private void checkPassword() throws Exception{
        String hashPass = frame.getHashPass(passwordFld.getText());
        if(userList.get(userIndex).getPassword().equals(hashPass)){
            isPassValid = true;
        } else{
            isPassValid = false;
            
            // Increases the number of lock a user has
            frame.increaseLock(userList.get(userIndex).getUsername());
        }
    }

    // Checks if the user has maxed the number of login attempts
    private void checkLock(){
        if(userList.get(userIndex).getLocked() >= 3){
            isLocked = true;
        }
    }
    
    // Checks if the user is not disabled
    private void checkRole(){
        if(userList.get(userIndex).getRole() == 1){
            isRoleValid = false;
        } else{
            isRoleValid = true;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField errorMaxAttempt;
    private javax.swing.JTextField errorMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField passwordFld;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField usernameFld;
    // End of variables declaration//GEN-END:variables
}
