/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BloodLeukemia_Centre_Coordinator_Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Magic.Design.*;
import Business.Organization.LegalOfficerOrganization;
import Business.Organization.Organization;
import Business.People.Patient;
import Business.People.PatientRequest;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.System_Coordinator_Test_WorkRequest;
import Business.WorkQueue.WorkRequest;
import Magic.Design.MyJButton;
import Magic.Design.MyTableFormat;
import java.awt.Color;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author parth
 */
public class VolunteerReceiverRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VolunteerReceiverRequestJPanel
     */
    private  EcoSystem system;
    private PatientRequest patientRequest;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private UserAccount userAccount;
    private Network network;
    
    public VolunteerReceiverRequestJPanel(EcoSystem system, UserAccount userAccount, Network network) {
        initComponents();
        this.system = system;
        this.userAccount = userAccount;
        this.network = network;
        tblRequest.getTableHeader().setDefaultRenderer(new MyTableFormat());
        populateRequestTable();
    }
  

    private void populateRequestTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblRequest.getModel();
        
        dtm.setRowCount(0);
        
         for(PatientRequest patientRequest: system.getPatientRequestDirectory().getPatientRequestList()){            
            Object row[] = new Object[4];
            row[0]= patientRequest;
            row[1]= patientRequest.getName();
            row[2]= patientRequest.getContact();
            row[3]= patientRequest.getStatus();
              
            dtm.addRow(row);
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

        lblUID = new javax.swing.JLabel();
        txtUID = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblDOB = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblContactNumber = new javax.swing.JLabel();
        txtContactNumber = new javax.swing.JTextField();
        lblEmailID = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblHLAType = new javax.swing.JLabel();
        txtHLAType = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lblStreetAddress = new javax.swing.JLabel();
        txtStreetAddress = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        lblZipCode = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblPatientRequestHadling = new javax.swing.JLabel();
        txtLabConfirmation = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequest = new javax.swing.JTable();
        txtStatus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblProfilePicture = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        covidDiagnosedDateChooser = new com.toedter.calendar.JDateChooser();
        dobDateField = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setPreferredSize(new java.awt.Dimension(1150, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUID.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUID.setText("UID");
        add(lblUID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        txtUID.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(txtUID, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 180, -1));

        lblName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblName.setText("Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, -1, -1));

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 190, -1));

        lblDOB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDOB.setText("DOB");
        add(lblDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        lblAge.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblAge.setText("Age");
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, -1));

        txtAge.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 190, -1));

        lblContactNumber.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblContactNumber.setText("Contact Number");
        add(lblContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        txtContactNumber.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtContactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNumberActionPerformed(evt);
            }
        });
        add(txtContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 180, -1));

        lblEmailID.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblEmailID.setText("Email ID");
        add(lblEmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, -1));

        txtEmailID.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(txtEmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 190, -1));

        lblGender.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblGender.setText("Gender");
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 70, -1));

        txtGender.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 180, -1));

        lblHLAType.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblHLAType.setText("HLA Types");
        add(lblHLAType, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, -1, -1));

        txtHLAType.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(txtHLAType, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 190, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText("Cancer diagnosed date");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 720, -1, -1));

        lblStreetAddress.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblStreetAddress.setText("Street address");
        add(lblStreetAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, -1, 30));

        txtStreetAddress.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(txtStreetAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 176, -1));

        lblCity.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblCity.setText("City");
        add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 610, -1, -1));

        txtCity.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 610, 180, -1));

        lblState.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblState.setText("State");
        add(lblState, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 680, -1, -1));

        txtState.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateActionPerformed(evt);
            }
        });
        add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 670, 180, -1));

        lblZipCode.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblZipCode.setText("ZipCode");
        add(lblZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 740, -1, -1));

        txtZipCode.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(txtZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 730, 180, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel19.setText("Was your disease confirmed by Medical Practitioner?");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 610, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        lblPatientRequestHadling.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblPatientRequestHadling.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientRequestHadling.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatientRequestHadling.setText("Patient Request Handling");
        lblPatientRequestHadling.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(lblPatientRequestHadling, javax.swing.GroupLayout.PREFERRED_SIZE, 973, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(535, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPatientRequestHadling, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1580, -1));

        txtLabConfirmation.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(txtLabConfirmation, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 660, 210, -1));

        tblRequest.setBackground(new java.awt.Color(0, 0, 0));
        tblRequest.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblRequest.setForeground(new java.awt.Color(255, 255, 255));
        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UID", "Name", "Contact", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRequest.setFocusable(false);
        tblRequest.setGridColor(new java.awt.Color(0, 0, 0));
        tblRequest.setRowHeight(30);
        tblRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblRequestMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 980, 190));

        txtStatus.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });
        add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, 200, -1));

        jLabel1.setText("Status");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 11, -1, -1));

        lblProfilePicture.setBackground(new java.awt.Color(255, 164, 0));
        lblProfilePicture.setForeground(new java.awt.Color(255, 164, 0));
        lblProfilePicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 164, 0)));
        lblProfilePicture.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        add(lblProfilePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 310, 160, 140));

        lblStatus.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblStatus.setText("Status");
        add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 550, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 20, 200));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 860, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setText("Cancer History Details");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setText("Location Details");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, -1, -1));

        btnApprove.setBackground(new java.awt.Color(255, 164, 0));
        btnApprove.setText("Approve");
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 490, -1, -1));

        btnReject.setBackground(new java.awt.Color(255, 164, 0));
        btnReject.setText("Reject");
        add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 490, 80, -1));

        covidDiagnosedDateChooser.setBackground(new java.awt.Color(0, 0, 0));
        covidDiagnosedDateChooser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        covidDiagnosedDateChooser.setForeground(new java.awt.Color(255, 255, 255));
        add(covidDiagnosedDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 720, 180, -1));

        dobDateField.setBackground(new java.awt.Color(0, 0, 0));
        dobDateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dobDateField.setForeground(new java.awt.Color(255, 255, 255));
        add(dobDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtContactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNumberActionPerformed

    private void tblRequestMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRequestMousePressed
        int selectedRow = tblRequest.getSelectedRow();
        if(selectedRow < 0){
        }
        else{
       //display the details 
            patientRequest = (PatientRequest) tblRequest.getValueAt(selectedRow, 0);
            populateRequestDetails(patientRequest);
            btnApprove.setEnabled(true);
            btnApprove.setEnabled(true);
            
            if(Integer.parseInt(txtAge.getText()) < 18)
            {
            txtAge.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtAge.setForeground(Color.red);
            }
            else {
                txtAge.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                txtAge.setForeground(Color.black);
            }
            if(txtLabConfirmation.getText().equals("false"))
            {
                txtLabConfirmation.setBorder(BorderFactory.createLineBorder(Color.RED));
                txtLabConfirmation.setForeground(Color.red);
            }
            if(patientRequest.getStatus().equals("New Request")){
                btnApprove.setEnabled(true);
                btnApprove.setEnabled(true);
            }
            else {
                btnApprove.setEnabled(false);
                btnApprove.setEnabled(false);
            }
            
            
             dB4OUtil.storeSystem(system);
            
            
        }
    }//GEN-LAST:event_tblRequestMousePressed

    private void txtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStateActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnReject;
    private com.toedter.calendar.JDateChooser covidDiagnosedDateChooser;
    private com.toedter.calendar.JDateChooser dobDateField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmailID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHLAType;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPatientRequestHadling;
    private javax.swing.JLabel lblProfilePicture;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblStreetAddress;
    private javax.swing.JLabel lblUID;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTable tblRequest;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtHLAType;
    private javax.swing.JTextField txtLabConfirmation;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtStreetAddress;
    private javax.swing.JTextField txtUID;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables

    private void populateRequestDetails(PatientRequest patientRequest) {
            txtUID.setText(patientRequest.getReceiverID());
            txtName.setText(patientRequest.getName());
            covidDiagnosedDateChooser.setDate(patientRequest.getDob());
            covidDiagnosedDateChooser.setDate(patientRequest.getCancerDiagnosedDate());
            txtAge.setText(String.valueOf(patientRequest.getAge()));
            txtGender.setText(patientRequest.getGender());
            txtHLAType.setText(String.join(", ", (Iterable<String>) patientRequest.getHla().getHlaValuesList()));
            txtStreetAddress.setText(patientRequest.getStreetAddress());
            txtCity.setText(patientRequest.getCity());
            txtState.setText(patientRequest.getState());
            txtZipCode.setText(String.valueOf(patientRequest.getZipCode()));
            txtContactNumber.setText(String.valueOf(patientRequest.getContact()));
            txtEmailID.setText(patientRequest.getEmailID());
            txtStatus.setText(patientRequest.getStatus());
            
            txtLabConfirmation.setText(String.valueOf(patientRequest.isLabConfirmation()));
            
            
            
            
             if(patientRequest.getdP() !=null){
            //Working line
            byte[] JLabelpictureLabel = patientRequest.getdP();
            ImageIcon i = setPicturebyte(JLabelpictureLabel);
            lblProfilePicture.setIcon(i);
            }
            else{
            System.err.println("No Image");
            }
             
             
            txtUID.setEditable(false);
            txtName.setEditable(false);
            txtAge.setEditable(false);
            txtGender.setEditable(false);
            txtHLAType.setEditable(false);
            txtStreetAddress.setEditable(false);
            txtCity.setEditable(false);
            txtState.setEditable(false);
            txtZipCode.setEditable(false);
            txtContactNumber.setEditable(false);
            txtEmailID.setEditable(false);
            txtStatus.setEditable(false);
            txtLabConfirmation.setEditable(false);     
            dobDateField.setEnabled(false);
            covidDiagnosedDateChooser.setEnabled(false);
    }
    
    private ImageIcon setPicturebyte(byte[] byteArrayImage){

        ImageIcon imageCar;
        imageCar = new ImageIcon(byteArrayImage);
        Image picCar = imageCar.getImage();
        JLabel pictureLabel1 = new JLabel();
        pictureLabel1.setSize(107, 133);
        Image resizedImage = picCar.getScaledInstance(pictureLabel1.getWidth(), pictureLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedCarPicture = new ImageIcon(resizedImage);
        return selectedCarPicture;  

    
    }
}
