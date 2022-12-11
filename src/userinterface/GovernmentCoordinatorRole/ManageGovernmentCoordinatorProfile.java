/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

sparsh
 */


package userinterface.GovernmentCoordinatorRole;

import userinterface.BoneMarrowBankCoordinatorRole.*;
import userinterface.DoctorRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Bone_Marrow_Bank_Organization;
import Business.Organization.GovernmentOrganization;
import Business.UserAccount.UserAccount;
import Magic.Design.*;
import java.util.Date;
import Magic.Design.MyJLabel;

/**
 *
 * @author parth
 */

public class ManageGovernmentCoordinatorProfile extends javax.swing.JPanel {

    /**
     * Creates new form ManageDoctorProfile
     */
     
     private UserAccount userAccount;
     private Enterprise enterprise ;
private GovernmentOrganization govtOrganization;    
    public ManageGovernmentCoordinatorProfile(UserAccount userAccount, GovernmentOrganization govtOrganization, Enterprise enterprise) {
        initComponents();
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.govtOrganization = govtOrganization;
        populateFields();
    }

    private void populateFields(){
        
        cmbGender.removeAllItems();
        cmbGender.addItem("Male");
        cmbGender.addItem("Female");
        txtAddress.setText(userAccount.getEmployee().getAddress());
        txtCity.setText(userAccount.getEmployee().getCity());
        txtContact.setText(String.valueOf(userAccount.getEmployee().getContactNumber()));
        txtDOB.setDate(userAccount.getEmployee().getDateOfBirth());
        txtName.setText(userAccount.getEmployee().getName());
        txtSpecialization.setText(userAccount.getEmployee().getSpecialization());
        txtState.setText(userAccount.getEmployee().getState());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtSpecialization = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        cmbGender = new javax.swing.JComboBox();
        lblSpecialization = new javax.swing.JLabel();
        txtDOB = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 50, -1, -1));

        lblContact.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblContact.setText("Contact:");
        add(lblContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 80, -1, -1));

        lblAddress.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblAddress.setText("Address:");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 110, -1, -1));

        lblCity.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCity.setText("City:");
        add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 140, -1, -1));

        lblState.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblState.setText("State:");
        add(lblState, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 170, -1, -1));

        lblGender.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblGender.setText("Gender:");
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 200, -1, -1));

        lblDOB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDOB.setText("DOB:");
        add(lblDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 235, -1, -1));

        txtName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 44, 146, -1));

        txtContact.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 74, 146, -1));

        txtAddress.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 104, 146, -1));

        txtCity.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 134, 146, -1));

        txtState.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 164, 146, -1));

        txtSpecialization.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(txtSpecialization, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 146, -1));

        btnSave.setBackground(new java.awt.Color(255, 164, 0));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 324, -1, -1));

        cmbGender.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        add(cmbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 197, -1, -1));

        lblSpecialization.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSpecialization.setText("Specialization:");
        add(lblSpecialization, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        txtDOB.setBackground(new java.awt.Color(255, 255, 255));
        txtDOB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDOB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDOBFocusLost(evt);
            }
        });
        txtDOB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtDOBMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDOBMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtDOBagePop(evt);
            }
        });
        txtDOB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDOBuDobKeyTyped(evt);
            }
        });
        add(txtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        userAccount.getEmployee().setCity(txtCity.getText());
        userAccount.getEmployee().setContactNumber(Integer.parseInt(txtContact.getText()));
        userAccount.getEmployee().setDateOfBirth(txtDOB.getDate());
        userAccount.getEmployee().setGender((String) cmbGender.getSelectedItem());
        userAccount.getEmployee().setAddress(txtAddress.getText());
        userAccount.getEmployee().setState(txtCity.getText());
        userAccount.getEmployee().setSpecialization(txtSpecialization.getText());
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtDOBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDOBFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBFocusLost

    private void txtDOBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDOBMouseExited
        //    Date dob = dobDateField.getDate();
        //       System.out.println(dob.getYear());
        //    ageText.setText((String.valueOf(new Date().getYear()-dob.getYear())));
    }//GEN-LAST:event_txtDOBMouseExited

    private void txtDOBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDOBMousePressed

    }//GEN-LAST:event_txtDOBMousePressed

    private void txtDOBagePop(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDOBagePop
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBagePop

    private void txtDOBuDobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDOBuDobKeyTyped
        // TODO add your handling code here:
        // System.out.println("date");
        /*

        Date dob = dobDateField.getDate();

        LocalDate today = LocalDate.now();                          //Today's date
        LocalDate birthday;  //Birth date
        birthday = LocalDate.of(dob);

        Period p = Period.between(birthday, today);

        ageText.setText(String.valueOf(p.getYears()));
        String dobq=  calculateAge(dob, today);

        }

        */
        /*  public  int calculateAge(LocalDate birthDate, LocalDate currentDate) {
            if ((birthDate != null) && (currentDate != null)) {
                return Period.between(birthDate, currentDate).getYears();
            } else {
                return 0;
            }

            */
    }//GEN-LAST:event_txtDOBuDobKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbGender;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSpecialization;
    private javax.swing.JLabel lblState;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContact;
    private com.toedter.calendar.JDateChooser txtDOB;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSpecialization;
    private javax.swing.JTextField txtState;
    // End of variables declaration//GEN-END:variables
}
