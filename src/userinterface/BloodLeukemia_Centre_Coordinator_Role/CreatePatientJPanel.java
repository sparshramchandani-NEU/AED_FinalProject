/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BloodLeukemia_Centre_Coordinator_Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Magic.Design.*;
import Magic.Design.MyJLabel;
import Magic.Design.MyJButton;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LegalOfficerOrganization;
import Business.Organization.Organization;
import Business.People.Patient;
import Business.People.PatientDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.System_Coordinator_Test_WorkRequest;
import Business.WorkQueue.WorkRequest;
import Magic.Design.MyTableFormat;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nitin
 */
public class CreatePatientJPanel extends javax.swing.JPanel {
    private  EcoSystem system;
     private UserAccount userAccount;
     private Network network;
     private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    CreatePatientJPanel(EcoSystem system, UserAccount userAccount, Network network) {
        initComponents();
       
        this.system = system;
        this.userAccount = userAccount;
        this.network = network;
        populateTable();
        populatePatientTable();
        
        tblPatientDetails.getTableHeader().setDefaultRenderer(new MyTableFormat());
        tblRequestDetails.getTableHeader().setDefaultRenderer(new MyTableFormat());
        
    }
    
    private void populatePatientTable(){
    DefaultTableModel dtmA = (DefaultTableModel)tblPatientDetails.getModel();
      dtmA.setRowCount(0);
      Object row[] = new Object[5];
       String line = "";  
       String splitBy = ",";  
        try   
        {  
            //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader("PatientsRecord.csv"));  
            while ((line = br.readLine()) != null)   //returns a Boolean value  
            {
            String[] csv = line.split(splitBy);    // use comma as separator 
            row[0]= csv[0];
            row[1]= csv[1];
            row[2]= csv[2];
            row[3]= csv[3];
            row[4]= csv[4];
            
            dtmA.addRow(row);
        }   }
            catch (IOException e)   
            {  e.printStackTrace(); }   
    
    
    }
    
     private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblRequestDetails.getModel();
        
        dtm.setRowCount(0);
        

        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[6];
            row[0] = request;
            
            row[1] = request.getSummary();
            row[2] = request.getPatient();
            row[3] = request.getPatient().getEmailID();
            row[4] = request.getStatus();
            row[5] = request.getActionDate();
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
        lblEmail = new javax.swing.JLabel();
        txtUID = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatientDetails = new javax.swing.JTable();
        lblListOfPatients = new javax.swing.JLabel();
        lblPatientDetails = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRequestDetails = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lblCreatePatientProfile = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblHLAList = new javax.swing.JLabel();
        txtHLAList = new javax.swing.JTextField();
        btnCreateProfile = new javax.swing.JButton();
        chkEmergency = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1150, 720));
        setPreferredSize(new java.awt.Dimension(1150, 820));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUID.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUID.setText("UID:");
        add(lblUID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));

        lblEmail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblEmail.setText("Email:");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, -1));

        txtUID.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtUID.setForeground(new java.awt.Color(255, 255, 255));
        txtUID.setEnabled(false);
        add(txtUID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 212, -1));

        txtEmail.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setEnabled(false);
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 212, -1));

        tblPatientDetails.setBackground(new java.awt.Color(0, 0, 0));
        tblPatientDetails.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblPatientDetails.setForeground(new java.awt.Color(255, 255, 255));
        tblPatientDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UID", "Name", "Email", "Cancer Diagnosed Date", "HLA Types"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPatientDetails.setFocusable(false);
        tblPatientDetails.setGridColor(new java.awt.Color(0, 0, 0));
        tblPatientDetails.setRowHeight(30);
        tblPatientDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPatientDetailsMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblPatientDetails);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 890, 210));

        lblListOfPatients.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblListOfPatients.setText("List Of Cancer Patients In The Network Area Of The Coordinator");
        add(lblListOfPatients, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        lblPatientDetails.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblPatientDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatientDetails.setText("List Of Patients");
        add(lblPatientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, -1, -1));

        tblRequestDetails.setBackground(new java.awt.Color(0, 0, 0));
        tblRequestDetails.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblRequestDetails.setForeground(new java.awt.Color(255, 255, 255));
        tblRequestDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Number", "Summary", "Patient Name", "Email ID", "Status", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRequestDetails.setFocusable(false);
        tblRequestDetails.setGridColor(new java.awt.Color(0, 0, 0));
        tblRequestDetails.setRowHeight(30);
        jScrollPane2.setViewportView(tblRequestDetails);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, 900, 220));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCreatePatientProfile.setBackground(new java.awt.Color(255, 153, 153));
        lblCreatePatientProfile.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCreatePatientProfile.setForeground(new java.awt.Color(255, 255, 255));
        lblCreatePatientProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreatePatientProfile.setText("Create Patient Profile");
        jPanel3.add(lblCreatePatientProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 11, 890, 48));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, -1));

        lblName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, -1, -1));

        txtName.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setEnabled(false);
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 380, 212, -1));

        lblHLAList.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblHLAList.setText("HLA List:");
        add(lblHLAList, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, -1, -1));

        txtHLAList.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtHLAList.setForeground(new java.awt.Color(255, 255, 255));
        txtHLAList.setEnabled(false);
        add(txtHLAList, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 420, 210, -1));

        btnCreateProfile.setBackground(new java.awt.Color(255, 164, 0));
        btnCreateProfile.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCreateProfile.setText("Create Profile");
        btnCreateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateProfileActionPerformed(evt);
            }
        });
        add(btnCreateProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, -1, -1));

        chkEmergency.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        chkEmergency.setText("Emergency");
        add(chkEmergency, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tblPatientDetailsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientDetailsMousePressed
        // TODO add your handling code here:
        int selectedRow = tblPatientDetails.getSelectedRow();
        
        if(selectedRow < 0){
            
            //JOptionPane.showMessageDialog(null,"Please select a row from the table first to View Details!","Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else{

            //String.valueOf(tblGoogleSheet.getValueAt(selectedRow, 0));

            txtUID.setText( String.valueOf(tblPatientDetails.getValueAt(selectedRow, 0)));
             txtName.setText( String.valueOf(tblPatientDetails.getValueAt(selectedRow, 1)));
            txtEmail.setText( String.valueOf(tblPatientDetails.getValueAt(selectedRow, 2)));
            
            txtHLAList.setText( String.valueOf(tblPatientDetails.getValueAt(selectedRow, 4)));
            
            
            btnCreateProfile.setEnabled(true);
            chkEmergency.setEnabled(true);
            

        }
    }//GEN-LAST:event_tblPatientDetailsMousePressed

    private void btnCreateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateProfileActionPerformed
        // TODO add your handling code here:
        
         Patient patient = new Patient();
//        Patient patient = system.getPatientDirectory().addPatient();
        
        patient.setReceiverID(txtUID.getText());
        patient.setName(txtName.getText());
        patient.setEmailID((txtEmail.getText()));
        try {
            patient.getHLA().updateHLAlist(txtHLAList.getText());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Patient's HLA Type can only be one of these HLA_A,HLA_B,HLA_C,HLA_DR,HLA_DBQ1</b></html>"));
            return;
        }
        patient.setEmergencyStatus(chkEmergency.isSelected());
        patient.setStatus("Centre Approved");
        
        system.getPatientDirectory().addPatient(patient);
        
        populateTable();
         JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>A new Patinet has been added</b></html>"));
           
        //JOptionPane.showMessageDialog(null,"New patient has been added!");
        
        WorkRequest request = new System_Coordinator_Test_WorkRequest();
        
        request.setPatient(patient);
        request.setActionDate(new Date());
        request.setAssigned("Legal Department");
        request.setSummary("Requested for BoneMarrow Reception");
        request.setStatus("Assigned to Legal Department");
        
        request.setUserAccount(userAccount);
       
        Enterprise ent = null;
        Organization org = null;
        
        for (Enterprise enterprise : network.getEnterprise_Directory().getEnterpriseList()) {
            if (enterprise.getEnterpriseType().toString().equals("Legal")) {
            
                ent = enterprise;
                System.out.println(enterprise);
                break;
            }
        }
        
        if(ent == null) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><b>There is no Legal Enterprize!!<br>Request cannot be sent for Legal Approval!"
                    + "<br>Patient cannot be created</b></html>"),
            "Error",
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        
       
        for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
            if(organization instanceof LegalOfficerOrganization) {
                org = organization;
                break;
            }
        }
        
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            System.out.println(org.getName());
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            
            dB4OUtil.storeSystem(system);
            populateTable();
             JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Request has been sent for Legal Approval!</b></html>"));         
            
        } else {
        
         JOptionPane.showMessageDialog(null, "No organization present", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        chkEmergency.setEnabled(false);
        btnCreateProfile.setEnabled(false);
        
        txtUID.setText("");
        txtName.setText("");
        txtEmail.setText("");
        txtHLAList.setText("");
                                                    

    }//GEN-LAST:event_btnCreateProfileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateProfile;
    private javax.swing.JCheckBox chkEmergency;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCreatePatientProfile;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHLAList;
    private javax.swing.JLabel lblListOfPatients;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPatientDetails;
    private javax.swing.JLabel lblUID;
    private javax.swing.JTable tblPatientDetails;
    private javax.swing.JTable tblRequestDetails;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHLAList;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUID;
    // End of variables declaration//GEN-END:variables
}
