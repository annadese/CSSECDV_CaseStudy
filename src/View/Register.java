
package View;

import Model.User;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Register extends javax.swing.JPanel {

    public Frame frame;
    private Boolean isUsernameLenValid = false;
    private Boolean  isUsernameCharValid = false;
    private Boolean isUsernameValid = false;
    private Boolean isPassValValid = false;
    private Boolean isPassLenValid = false;
    private Boolean isConfPassValid = false;
    
    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerBtn = new javax.swing.JButton();
        passwordFld = new javax.swing.JPasswordField();
        usernameFld = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        confpassFld = new javax.swing.JPasswordField();
        backBtn = new javax.swing.JButton();
        errorConfPassword = new javax.swing.JTextField();
        errorUsername = new javax.swing.JTextField();
        errorPassword = new javax.swing.JTextField();

        registerBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        registerBtn.setText("REGISTER");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        passwordFld.setBackground(new java.awt.Color(240, 240, 240));
        passwordFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        usernameFld.setBackground(new java.awt.Color(240, 240, 240));
        usernameFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        confpassFld.setBackground(new java.awt.Color(240, 240, 240));
        confpassFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confpassFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        confpassFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "CONFIRM PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
				
				usernameFld.setText("");
				passwordFld.setText("");
				confpassFld.setText("");
            }
        });

        errorConfPassword.setEditable(false);
        errorConfPassword.setForeground(new java.awt.Color(204, 0, 51));
        errorConfPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        errorConfPassword.setText("Passwords do not match.");
        errorConfPassword.setToolTipText("");
        errorConfPassword.setAlignmentX(0.0F);
        errorConfPassword.setAlignmentY(0.0F);
        errorConfPassword.setBorder(null);
        errorConfPassword.setDisabledTextColor(new java.awt.Color(242, 242, 242));
        errorConfPassword.setEnabled(false);

        errorUsername.setEditable(false);
        errorUsername.setForeground(new java.awt.Color(204, 0, 51));
        errorUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        errorUsername.setText("Username must have at least 6 characters.");
        errorUsername.setAlignmentX(0.0F);
        errorUsername.setAlignmentY(0.0F);
        errorUsername.setBorder(null);
        errorUsername.setDisabledTextColor(new java.awt.Color(242, 242, 242));
        errorUsername.setEnabled(false);

        errorPassword.setEditable(false);
        errorPassword.setForeground(new java.awt.Color(204, 0, 51));
        errorPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        errorPassword.setText("Password must have at least 8 characters and must be a combination of letters, numbers, and special characters.");
        errorPassword.setToolTipText("");
        errorPassword.setAlignmentX(0.0F);
        errorPassword.setAlignmentY(0.0F);
        errorPassword.setBorder(null);
        errorPassword.setDisabledTextColor(new java.awt.Color(242, 242, 242));
        errorPassword.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usernameFld)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordFld, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confpassFld, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(errorConfPassword, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(errorUsername)
            .addComponent(errorPassword)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(usernameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confpassFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorConfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        checkUsername();
        checkPassword();
        checkConfirmPassword();
        
        if (isUsernameLenValid && isUsernameCharValid && isUsernameValid && isPassValValid && isPassLenValid && isConfPassValid){
            frame.registerAction(usernameFld.getText().toLowerCase(), passwordFld.getText(), confpassFld.getText());
            frame.loginNav();
            resetRegPage();
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        frame.loginNav();
        resetRegPage();
    }//GEN-LAST:event_backBtnActionPerformed

    // Clears all input fields and resets all error messages
    private void resetRegPage(){
        usernameFld.setText("");
        passwordFld.setText("");
        confpassFld.setText("");
        
        errorUsername.setEnabled(false);
        errorPassword.setEnabled(false);
        errorConfPassword.setEnabled(false);
    }
    // Checks if username has at least 6 characters, contains white spaces, and already exists in the database.
    private void checkUsername(){
        
        // Checks if username has at least 6 characters
        if (usernameFld.getText().length() >= 6){
            isUsernameLenValid = true;
        } else{
            isUsernameLenValid = false;
        }
        
        // Checks if username contains a white space
        if(usernameFld.getText().contains(" ")){
            isUsernameCharValid = false;
        } else{
            isUsernameCharValid = true;
        }
        
        // Checks if username already exists in the database
        ArrayList<User> userList = frame.getUserList();
        isUsernameValid = true;
        for(int i = 0; i < userList.size(); i++){
            if(userList.get(i).getUsername().equals(usernameFld.getText().toLowerCase())){
                isUsernameValid = false;
            }
        }
        
        // Sets the text for the error message
        if(isUsernameLenValid == false && isUsernameCharValid == false && isUsernameValid == false){
            errorUsername.setEnabled(true);
            errorUsername.setText("Username must have at least 6 characters, cannot contain white spaces, and already exists.");
        } else if (isUsernameLenValid == false && isUsernameCharValid == false &&isUsernameValid == true){
            errorUsername.setEnabled(true);
            errorUsername.setText("Username must have at least 6 characters, and cannot contain white spaces.");
        } else if(isUsernameLenValid == true && isUsernameCharValid == false && isUsernameValid == false){
            errorUsername.setEnabled(true);
            errorUsername.setText("Username cannot contain white spaces, and already exists.");
        } else if(isUsernameLenValid == false && isUsernameCharValid == true && isUsernameValid == false){
            errorUsername.setEnabled(true);
            errorUsername.setText("Username must have at least 6 characters, and already exists.");
        } else if(isUsernameLenValid == false && isUsernameCharValid == true && isUsernameValid == true){
            errorUsername.setEnabled(true);
            errorUsername.setText("Username must have at least 6 characters.");
        } else if(isUsernameLenValid == true && isUsernameCharValid == false && isUsernameValid == true){
            errorUsername.setEnabled(true);
            errorUsername.setText("Username cannot contain white spaces.");
        } else if(isUsernameLenValid == true && isUsernameCharValid == true && isUsernameValid == false){
            errorUsername.setEnabled(true);
            errorUsername.setText("Username already exists.");
        } else{
            errorUsername.setEnabled(false);
        }
            
    }
    
    // Checks if the password contains at least 8 characters and is a combination of letters, numbers, and special characters.
    private void checkPassword(){

        // Checks if the password has at least 8 characters
        if (passwordFld.getText().length() >= 8){
            isPassLenValid = true;
        } else{
            isPassLenValid = false;
        }

        // Checks if the password contains at least 1 special character
        Pattern patternSpecialChar = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcherSpecialChar = patternSpecialChar.matcher(passwordFld.getText());
        boolean containsSpecialChar = matcherSpecialChar.find();
        
        // Checks if the password contains at least 1 letter
        Pattern patternLetter = Pattern.compile("[a-zA-Z]");
        Matcher matcherLetter = patternLetter.matcher(passwordFld.getText());
        boolean containsLetter = matcherLetter.find();
        
        // Checks if the password contains at least 1 number
        Pattern patternNum = Pattern.compile("[0-9]");
        Matcher matcherNum = patternNum.matcher(passwordFld.getText());
        boolean containsNum = matcherNum.find();
        
        if(containsSpecialChar && containsLetter && containsNum){
            isPassValValid = true;
        } else{
            isPassValValid = false;
        }
        
        // Sets the text for the error message
        if(isPassLenValid == false && isPassValValid == false){
            errorPassword.setText("Password must have at least 8 characters and must be a combination of letters, numbers, and special characters.");
            errorPassword.setEnabled(true);
        } else if(isPassLenValid == false && isPassValValid == true){
            errorPassword.setText("Password must have at least 8 characters.");
            errorPassword.setEnabled(true);
        } else if(isPassLenValid == true && isPassValValid == false){
            errorPassword.setText("Password must be a combination of letters, numbers, and special characters.");
            errorPassword.setEnabled(true);
        } else{
            errorPassword.setEnabled(false);
        }
    }
    
    // Checks if the values of password and confirm password fields are similar
    private void checkConfirmPassword(){
        if (passwordFld.getText().equals(confpassFld.getText())){
            isConfPassValid = true;
            errorConfPassword.setEnabled(false);
        } else{
            isConfPassValid = false;
            errorConfPassword.setEnabled(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField confpassFld;
    private javax.swing.JTextField errorConfPassword;
    private javax.swing.JTextField errorPassword;
    private javax.swing.JTextField errorUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField passwordFld;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField usernameFld;
    // End of variables declaration//GEN-END:variables
}
