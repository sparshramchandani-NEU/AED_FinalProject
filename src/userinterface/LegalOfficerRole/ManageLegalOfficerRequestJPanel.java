/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LegalOfficerRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.LegalOfficerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Magic.Design.*;
import Magic.Design.MyJLabel;
import Magic.Design.MyTableFormat;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *

 * @author Payal

 */
public class ManageLegalOfficerRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageLegalOfficerRequestJPanel
     */
    private EcoSystem system;
    private UserAccount userAccount;
    private LegalOfficerOrganization legalofficerorganization;
    private Enterprise enterprise;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    
    public ManageLegalOfficerRequestJPanel(EcoSystem system, UserAccount userAccount, LegalOfficerOrganization legalofficerorganization, Enterprise enterprise) {
        initComponents();
        this.system = system;
        this.userAccount = userAccount;
        this.legalofficerorganization = legalofficerorganization;
        this.enterprise = enterprise;
        
        tblLegalOrganisation.getTableHeader().setDefaultRenderer(new MyTableFormat());
        tblLegalOfficer.getTableHeader().setDefaultRenderer(new MyTableFormat());
        populateOrganisationpatientTable();
        populateLegalPatientTable();
        
    }

    public void populateOrganisationpatientTable(){
        DefaultTableModel model = (DefaultTableModel)tblLegalOrganisation.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : legalofficerorganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getSummary();
            row[2] = request.getPatient();
            row[3] = request.getPatient().getName();
            row[4] = request.getPatient().getEmailID();
            row[5] = request.getStatus();
            
            model.addRow(row);
        }
    }
    
  
     public void populateLegalPatientTable(){
        DefaultTableModel model = (DefaultTableModel)tblLegalOfficer.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getPatient();
            row[2] = request.getPatient().getName();
            row[3] = request.getPatient().getEmailID();
            row[4] = request.getUserAccount().getUsername();
            row[5] = request.getStatus();
             
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

        btnAssign = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLegalOrganisation = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblLegalOfficer = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lblTreatmentApprovalRequest = new javax.swing.JLabel();
        lblTo = new javax.swing.JLabel();
        lblFrom = new javax.swing.JLabel();
        lblSubject = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        btnSendMail = new javax.swing.JButton();
        txtTo = new javax.swing.JTextField();
        txtFrom = new javax.swing.JTextField();
        txtSubject = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAssign.setBackground(new java.awt.Color(255, 164, 0));
        btnAssign.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 120, 30));

        tblLegalOrganisation.setBackground(new java.awt.Color(0, 0, 0));
        tblLegalOrganisation.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblLegalOrganisation.setForeground(new java.awt.Color(255, 255, 255));
        tblLegalOrganisation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Number", "Summary", "Patient UID", "Patient Name", "Email", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLegalOrganisation.setGridColor(new java.awt.Color(0, 0, 0));
        tblLegalOrganisation.setRowHeight(30);
        jScrollPane2.setViewportView(tblLegalOrganisation);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 990, 190));

        tblLegalOfficer.setBackground(new java.awt.Color(0, 0, 0));
        tblLegalOfficer.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblLegalOfficer.setForeground(new java.awt.Color(255, 255, 255));
        tblLegalOfficer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Number", "Patient UID", "Patient Name", "Email", "Assigned to", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLegalOfficer.setGridColor(new java.awt.Color(0, 0, 0));
        tblLegalOfficer.setRowHeight(30);
        jScrollPane4.setViewportView(tblLegalOfficer);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 990, 160));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        lblTreatmentApprovalRequest.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTreatmentApprovalRequest.setForeground(new java.awt.Color(255, 255, 255));
        lblTreatmentApprovalRequest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTreatmentApprovalRequest.setText("Treatment Approval Request");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblTreatmentApprovalRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 1104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 476, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTreatmentApprovalRequest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1580, -1));

        lblTo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTo.setText("To:");
        add(lblTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));

        lblFrom.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblFrom.setText("From:");
        add(lblFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, -1, -1));

        lblSubject.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblSubject.setText("Subject:");
        add(lblSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, -1, -1));

        lblMessage.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblMessage.setText("Message:");
        add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, -1, -1));

        btnSendMail.setBackground(new java.awt.Color(255, 164, 0));
        btnSendMail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSendMail.setText("Send Mail");
        btnSendMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSendMailMouseClicked(evt);
            }
        });
        btnSendMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendMailActionPerformed(evt);
            }
        });
        add(btnSendMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 660, 100, 30));

        txtTo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtTo.setText("sparshramchandani7021@gmail.com");

        txtTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToActionPerformed(evt);
            }
        });
        add(txtTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 320, -1));

        txtFrom.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtFrom.setText("sparsh95473@gmail.com");

        txtFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromActionPerformed(evt);
            }
        });
        add(txtFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 320, -1));

        txtSubject.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtSubject.setText("Approval Form for Organ Donation");
        txtSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubjectActionPerformed(evt);
            }
        });
        add(txtSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 590, 320, -1));

        txtMessage.setColumns(20);
        txtMessage.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtMessage.setRows(5);
        txtMessage.setText("Hello,\n\nIf you are still in need of Organ Transplant of Bone Marrow, please go through this mail \nand sign the required consent form. So that we can proceed forward with treatment\n\nThanks and Regards,\nLegal Operations Officer");
        jScrollPane1.setViewportView(txtMessage);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, 330, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
       int selectedRow = tblLegalOrganisation.getSelectedRow();
        
        if (selectedRow < 0){
           //JOptionPane.showMessageDialog(null, "Please select a row", "Error", JOptionPane.ERROR_MESSAGE);
           JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Please select a row from the table</b></html>"), "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        else{
            WorkRequest request = (WorkRequest)tblLegalOrganisation.getValueAt(selectedRow, 0);    
           
            if(request.getStatus().equals("Assigned to Legal Department"))
            {
            request.setStatus("Assign to LegalOfficer" + userAccount.getUsername());
            request.setUserAccount(userAccount);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            }
            else{
            //JOptionPane.showMessageDialog(null, "Work Request is already assigned!" );
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Work Request is already in progress!</b></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
             
            }
            dB4OUtil.storeSystem(system);
            populateOrganisationpatientTable();
            populateLegalPatientTable();
        }
        
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnSendMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendMailActionPerformed
        // TODO add your handling code here:

        if(txtTo.getText().equals("") || txtSubject.getText().equals("") ||  txtMessage.getText().equals("")){

            JOptionPane.showMessageDialog(null,new JLabel("<html><b>All fields are mandatory!</b></html>"), "Error", JOptionPane.ERROR_MESSAGE);
       
            //JOptionPane.showMessageDialog(null, "Please fill all the fields!" );
        }
        else{
        String toEmail = txtTo.getText();
        //       String toEmail = "aedprojspring21@gmail.com";
        //       final String fromEmail = "aedprojspring21@gmail.com";
        final String fromEmail = txtFrom.getText();
        final String fromEmailPassword = "gxhuoxgozcbihfdn"; 
        String subject = txtSubject.getText();

        Properties properties = new Properties();
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.EnableSSL.enable","true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.auth","true");
        properties.put("mail.debug", "true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.setProperty("mail.smtp.socketFactory.fallback", "false");
        properties.setProperty("mail.smtp.port", "465");
        properties.setProperty("mail.smtp.socketFactory.port", "465");

        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, fromEmailPassword);
            }
        });

        try{
            MimeMessage message = new  MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject(subject);
            message.setText(txtMessage.getText());
            Transport.send(message);
        }
        catch(MessagingException ex){
            System.out.println(""+ex);
        }

        
      //
      //
        int selectedRow = tblLegalOfficer.getSelectedRow();
       
        if(selectedRow <0){
        //JOptionPane.showMessageDialog(null,"Please select a row");
        JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Please select a row from the table</b></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            
        }
        else{
        WorkRequest request = (WorkRequest)tblLegalOfficer.getValueAt(selectedRow, 0);
       
            request.setStatus("Consent form sent");
            //request.setUserAccount(userAccount);
        //userAccount.getWorkQueue().getWorkRequestList().add(request);
        
        dB4OUtil.storeSystem(system);
        
        populateOrganisationpatientTable();
        populateLegalPatientTable();
        
        JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Consent Form sent successfully!</b></html>"),"Info", JOptionPane.INFORMATION_MESSAGE);
      
        //JOptionPane.showMessageDialog(null,"Consent Form Sent Successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
        }
    }//GEN-LAST:event_btnSendMailActionPerformed

    private void txtFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFromActionPerformed

    private void txtSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubjectActionPerformed

    private void txtToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtToActionPerformed

    private void btnSendMailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendMailMouseClicked
        // TODO add your handling code here:
        api ap = new api();
        ap.sms("sparsh1915", "Sparsh1915", txtTo.getText(), txtMessage.getText());
    }//GEN-LAST:event_btnSendMailMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnSendMail;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblFrom;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblSubject;
    private javax.swing.JLabel lblTo;
    private javax.swing.JLabel lblTreatmentApprovalRequest;
    private javax.swing.JTable tblLegalOfficer;
    private javax.swing.JTable tblLegalOrganisation;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JTextArea txtMessage;
    private javax.swing.JTextField txtSubject;
    private javax.swing.JTextField txtTo;
    // End of variables declaration//GEN-END:variables
}
