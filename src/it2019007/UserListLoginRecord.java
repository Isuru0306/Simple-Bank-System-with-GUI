/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it2019007;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author isuru
 */
public final class UserListLoginRecord extends javax.swing.JFrame {

    /**
     * Creates new form UserListLoginRecord
     */
    public UserListLoginRecord() {
        initComponents();
        this.setLocationRelativeTo(null);
        showUserTable("SELECT * FROM `users`;");
       showUserRecordsTable("SELECT * FROM `userlogin`;");
    }

    
        public void showUserTable(String mysql){
        
                ArrayList<TraData> list;
                DatabaseConnection con = new DatabaseConnection();

                list = con.getUserList(mysql);


               JTableHeader header= userListTable.getTableHeader();
               header.setForeground(Color.DARK_GRAY);
               header.setFont(new Font(null,Font.BOLD,24));

                DefaultTableModel model = (DefaultTableModel) userListTable.getModel();
                model.setRowCount(0);
                Object[] row = new Object[4];
                for(int i = 0;i<list.size();i++){
                       row[0] = list.get(i).getString0();
                       row[1] = list.get(i).getString1();
                       row[2] = list.get(i).getString2();
                       row[3] = list.get(i).getString3();
                       
                       model.addRow(row);        
                   }
        
    }
    
        
        
    public void showUserRecordsTable(String mysql){
        
                ArrayList<TraData> list;
                DatabaseConnection con = new DatabaseConnection();

                list = con.getUserRecorsList(mysql);

               JTableHeader header= userRecordsTable.getTableHeader();
               header.setForeground(Color.DARK_GRAY);
               header.setFont(new Font(null,Font.BOLD,24));

                DefaultTableModel model = (DefaultTableModel) userRecordsTable.getModel();
                model.setRowCount(0);
                Object[] row = new Object[4];
                for(int i = 0;i<list.size();i++){
                       row[0] = list.get(i).getString0();
                       row[1] = list.get(i).getString1();
                       row[2] = list.get(i).getString2();
                       row[3] = list.get(i).getString3();
                       model.addRow(row);        
                   }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        userListTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userRecordsTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        telField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        cPasswordField = new javax.swing.JPasswordField();
        createUserAccount = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userListTable.setBackground(new java.awt.Color(0, 153, 153));
        userListTable.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        userListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "E-mail", "Telephone", "User Name"
            }
        ));
        userListTable.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(userListTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 820, 158));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel1.setText("User List");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 210, 64));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel2.setText("Login records");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 292, 65));

        userRecordsTable.setBackground(new java.awt.Color(0, 153, 153));
        userRecordsTable.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        userRecordsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Date", "Login Time", "Logout Time"
            }
        ));
        userRecordsTable.setGridColor(new java.awt.Color(0, 0, 0));
        userRecordsTable.setRowHeight(21);
        jScrollPane2.setViewportView(userRecordsTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 830, 170));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameField.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        nameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        jPanel2.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 220, 30));

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel5.setText("Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 48, -1, -1));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel6.setText("E-mail");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 110, -1, -1));

        emailField.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        emailField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 220, 30));

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel7.setText("Telephone");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 176, -1, -1));

        telField.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        telField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        telField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(telField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 220, 30));

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel8.setText("User name");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 243, -1, -1));

        userNameField.setFont(new java.awt.Font("Consolas", 3, 14)); // NOI18N
        userNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userNameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(userNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 220, 30));

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel9.setText("Password");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 305, -1, -1));

        passwordField.setFont(new java.awt.Font("Consolas", 2, 24)); // NOI18N
        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 220, 29));

        jLabel10.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel10.setText("Confirm");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 366, -1, -1));

        cPasswordField.setFont(new java.awt.Font("Consolas", 2, 24)); // NOI18N
        cPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cPasswordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(cPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 220, 29));

        createUserAccount.setFont(new java.awt.Font("Consolas", 3, 24)); // NOI18N
        createUserAccount.setText("Create");
        createUserAccount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        createUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserAccountActionPerformed(evt);
            }
        });
        jPanel2.add(createUserAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 421, 130, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 80, 490, 490));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Enter User Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, -1, -1));

        userName.setFont(new java.awt.Font("Consolas", 3, 24)); // NOI18N
        userName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 180, 40));

        searchButton.setFont(new java.awt.Font("Consolas", 3, 24)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 570, 130, -1));

        exitbutton.setFont(new java.awt.Font("Consolas", 3, 24)); // NOI18N
        exitbutton.setText("Exit");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(exitbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 710));

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        // TODO add your handling code here:
//        new ControlPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitbuttonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        if(!userName.getText().isEmpty()){
            showUserTable("SELECT * FROM `users` WHERE `userName` = '"+userName.getText()+"';");
            showUserRecordsTable("SELECT * FROM `userlogin` WHERE `userName` ='"+userName.getText()+"';");
        }
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void createUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserAccountActionPerformed
        // TODO add your handling code here:
        String name = nameField.getText();
        String email = emailField.getText();
        String telPhone = telField.getText();
        String userNames = userNameField.getText();
        String password = passwordField.getText();
        String cPassword = cPasswordField.getText();

        if(name.isEmpty()){
            JOptionPane.showMessageDialog(null, "Name is required");
        }else{
            if(email.isEmpty()){
                JOptionPane.showMessageDialog(null, "email is required");
            }else{
                if(telPhone.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Telephone No is required");
                }else{
                    if(userNames.isEmpty()){
                        JOptionPane.showMessageDialog(null, "User-Name is required");
                    }else{
                        if(password.isEmpty()){
                            JOptionPane.showMessageDialog(null, "Password is required");
                        }else{
                            if(password.equals(cPassword)){

                                DatabaseConnection con = new DatabaseConnection();
                                con.insertDataForUserTable(name, email, telPhone, userNames, password);
                                JOptionPane.showMessageDialog(null, "Insert succesfully");
                                showUserTable("SELECT * FROM `users`;");

                            }else{
                                JOptionPane.showMessageDialog(null, "The confirm password doesn't match");
                            }
                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_createUserAccountActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(UserListLoginRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserListLoginRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserListLoginRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserListLoginRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UserListLoginRecord().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField cPasswordField;
    private javax.swing.JButton createUserAccount;
    private javax.swing.JTextField emailField;
    private javax.swing.JButton exitbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField telField;
    private javax.swing.JTable userListTable;
    private javax.swing.JTextField userName;
    private javax.swing.JTextField userNameField;
    private javax.swing.JTable userRecordsTable;
    // End of variables declaration//GEN-END:variables

    private void exit(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}