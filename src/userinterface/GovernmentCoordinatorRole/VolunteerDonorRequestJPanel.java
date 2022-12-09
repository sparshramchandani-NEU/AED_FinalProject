/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GovernmentCoordinatorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.HLA.PersonHLA;
import Business.People.Donor;
import Business.People.DonorRequest;
import Magic.Design.*;
import Magic.Design.MyTableFormat;
import Magic.Design.MyJLabel;
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
 * @author nitin
 */
public class VolunteerDonorRequestJPanel extends javax.swing.JPanel {

  private  EcoSystem system;
  private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
  //private DonorRequest donorRequest;
  
    VolunteerDonorRequestJPanel(EcoSystem system) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.system = system;
        
        tblRequest.getTableHeader().setDefaultRenderer(new MyTableFormat());
        populateRequestTable();
     }
   
     
        private void populateRequestTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblRequest.getModel();
        
        dtm.setRowCount(0);
          
        for(DonorRequest dnr : system.getDonorRequestDirectory().getDonorRequestList()){
        }
        
         for(DonorRequest donorRequest: system.getDonorRequestDirectory().getDonorRequestList()){            
            Object row[] = new Object[4];
            row[0]= donorRequest;
            row[1]= donorRequest.getName();
            row[2]= donorRequest.getContact();
            row[3]= donorRequest.getStatus();
              
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequest = new javax.swing.JTable();
        lblUID = new javax.swing.JLabel();
        txtUID = new javax.swing.JTextField();
        lblDOB = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        txtStreetAddress = new javax.swing.JTextField();
        txtHLAType = new javax.swing.JTextField();
        lblStreetAddress = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        lblZipCode = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        lblContactNumber = new javax.swing.JLabel();
        txtContactNumber = new javax.swing.JTextField();
        lblEmailID = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        txtSufferingChronicPains = new javax.swing.JTextField();
        lblBrainInjury = new javax.swing.JLabel();
        lblDiabetesAndBloodPressure = new javax.swing.JLabel();
        lblSufferingChronicPain = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblBreathingProblem = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblDonorRequestHandling = new javax.swing.JLabel();
        txtBrainInjury = new javax.swing.JTextField();
        txtBreathingProblem = new javax.swing.JTextField();
        txtDiabetesAndBloodPressure = new javax.swing.JTextField();
        lblProfilePicture = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        lblHLAType = new javax.swing.JLabel();
        lblRequestDetails = new javax.swing.JLabel();
        lblPatientDetails = new javax.swing.JLabel();
        lblAddressDetails = new javax.swing.JLabel();
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        dobDateField = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1450, 830));
        setPreferredSize(new java.awt.Dimension(1150, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 780, 170));

        lblUID.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUID.setText("UID");
        add(lblUID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 30));

        txtUID.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(txtUID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 170, -1));

        lblDOB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDOB.setText("DOB");
        add(lblDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, 30));

        lblAge.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblAge.setText("Age");
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, -1));

        txtAge.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 180, -1));

        lblGender.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblGender.setText("Gender");
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        txtGender.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 170, -1));

        lblStatus.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblStatus.setText("Status");
        add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, -1, 30));

        txtStreetAddress.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(txtStreetAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 320, 176, -1));

        txtHLAType.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtHLAType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHLATypeActionPerformed(evt);
            }
        });
        add(txtHLAType, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 180, -1));

        lblStreetAddress.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblStreetAddress.setText("Street address");
        add(lblStreetAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, -1, -1));

        lblCity.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblCity.setText("City");
        add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, -1, 30));

        txtCity.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 360, 180, -1));

        lblState.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblState.setText("State");
        add(lblState, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, -1, -1));

        txtState.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 400, 180, -1));

        lblZipCode.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblZipCode.setText("ZipCode");
        add(lblZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, -1, -1));

        txtZipCode.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipCodeActionPerformed(evt);
            }
        });
        add(txtZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 440, 180, -1));

        lblContactNumber.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblContactNumber.setText("Contact Number");
        add(lblContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        txtContactNumber.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(txtContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 170, -1));

        lblEmailID.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblEmailID.setText("Email ID");
        add(lblEmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, -1, -1));

        txtStatus.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 180, -1));

        txtSufferingChronicPains.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtSufferingChronicPains.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSufferingChronicPainsActionPerformed(evt);
            }
        });
        add(txtSufferingChronicPains, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 680, 90, 30));

        lblBrainInjury.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblBrainInjury.setText("History with severe brain injuries ");
        add(lblBrainInjury, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, -1));

        lblDiabetesAndBloodPressure.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDiabetesAndBloodPressure.setText("History with Diabetes and Blood Pressure");
        add(lblDiabetesAndBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 640, -1, -1));

        lblSufferingChronicPain.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblSufferingChronicPain.setText("Suffering with any Chronic pains");
        add(lblSufferingChronicPain, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 690, -1, -1));

        lblName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblName.setText("Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        lblBreathingProblem.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblBreathingProblem.setText("History with breathing problem");
        add(lblBreathingProblem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 690, -1, -1));

        txtName.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 180, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        lblDonorRequestHandling.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblDonorRequestHandling.setForeground(new java.awt.Color(255, 255, 255));
        lblDonorRequestHandling.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDonorRequestHandling.setText("Donor Request Handling");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblDonorRequestHandling, javax.swing.GroupLayout.PREFERRED_SIZE, 1109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 621, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDonorRequestHandling, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1730, -1));

        txtBrainInjury.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(txtBrainInjury, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 630, 100, 30));

        txtBreathingProblem.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtBreathingProblem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBreathingProblemActionPerformed(evt);
            }
        });
        add(txtBreathingProblem, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 680, 100, 30));

        txtDiabetesAndBloodPressure.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtDiabetesAndBloodPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiabetesAndBloodPressureActionPerformed(evt);
            }
        });
        add(txtDiabetesAndBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 630, 90, 30));

        lblProfilePicture.setBackground(new java.awt.Color(0, 0, 0));
        lblProfilePicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 164, 0)));
        add(lblProfilePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 80, 130, 130));

        txtEmailID.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(txtEmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 180, -1));

        lblHLAType.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblHLAType.setText("HLA Types");
        add(lblHLAType, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, -1, 20));

        lblRequestDetails.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lblRequestDetails.setText("Request Details");
        add(lblRequestDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, -1, -1));

        lblPatientDetails.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lblPatientDetails.setText("Patient Details");
        add(lblPatientDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        lblAddressDetails.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lblAddressDetails.setText("Address Details");
        add(lblAddressDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 270, -1, -1));

        btnApprove.setBackground(new java.awt.Color(255, 164, 0));
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, -1, -1));

        btnReject.setBackground(new java.awt.Color(255, 164, 0));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 230, 80, -1));

        dobDateField.setBackground(new java.awt.Color(0, 0, 0));
        dobDateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dobDateField.setForeground(new java.awt.Color(255, 255, 255));
        dobDateField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dobDateFieldFocusLost(evt);
            }
        });
        dobDateField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dobDateFieldMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dobDateFieldMousePressed(evt);
            }
        });
        dobDateField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dobDateFielduDobKeyTyped(evt);
            }
        });
        add(dobDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

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
    
    
    
    private void txtSufferingChronicPainsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSufferingChronicPainsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSufferingChronicPainsActionPerformed

    private void txtBreathingProblemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBreathingProblemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBreathingProblemActionPerformed

    private void txtDiabetesAndBloodPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiabetesAndBloodPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiabetesAndBloodPressureActionPerformed

    private void dobDateFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobDateFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_dobDateFieldFocusLost

    private void dobDateFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dobDateFieldMouseExited
        //Date dob = dobDateField.getDate();
        //System.out.println(dob.getYear());
        //ageText.setText((String.valueOf(new Date().getYear()-dob.getYear())));
    }//GEN-LAST:event_dobDateFieldMouseExited

    private void dobDateFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dobDateFieldMousePressed

    }//GEN-LAST:event_dobDateFieldMousePressed

    private void dobDateFielduDobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dobDateFielduDobKeyTyped
        // TODO add your handling code here:
        System.out.println("date");
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
    }//GEN-LAST:event_dobDateFielduDobKeyTyped

    private void populateRequestDetails(DonorRequest donorRequest){
            txtUID.setText(donorRequest.getDonorID());
            txtName.setText(donorRequest.getName());
            dobDateField.setDate(donorRequest.getDob());
            txtAge.setText(String.valueOf(donorRequest.getAge()));
            txtGender.setText(donorRequest.getGender());
            txtHLAType.setText(String.join(", ",donorRequest.getHLA().getHlaValuesList()));
            txtStreetAddress.setText(donorRequest.getStreetAddress());
            txtCity.setText(donorRequest.getCity());
            txtState.setText(donorRequest.getState());
            txtZipCode.setText(String.valueOf(donorRequest.getZipCode()));
            txtContactNumber.setText(String.valueOf(donorRequest.getContact()));
            txtEmailID.setText(donorRequest.getEmailID());
            txtStatus.setText(donorRequest.getStatus());

            txtBrainInjury.setText(String.valueOf(donorRequest.isBrainInjury()));
            txtBreathingProblem.setText(String.valueOf(donorRequest.isBreathingProb()));
            txtDiabetesAndBloodPressure.setText(String.valueOf(donorRequest.isDiabitiesBP()));
            txtSufferingChronicPains.setText(String.valueOf(donorRequest.isChronicPains()));

            if(donorRequest.getdP() !=null){
                //Working line
                byte[] JLabelpictureLabel = donorRequest.getdP();
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
            txtStatus.setEditable(false);
            txtStatus.setEditable(false);
            txtBrainInjury.setEditable(false);
            txtBreathingProblem.setEditable(false);
            txtDiabetesAndBloodPressure.setEditable(false);
            txtSufferingChronicPains.setEditable(false);
            dobDateField.setEnabled(false);

    } 
    
    private void tblRequestMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRequestMousePressed
        int selectedRow = tblRequest.getSelectedRow();
        if(selectedRow < 0){
        }
        else{
       //display the details 
            populateRequestDetails((DonorRequest) tblRequest.getValueAt(selectedRow, 0));
            btnApprove.setEnabled(true);
            btnReject.setEnabled(true);
            
            if(Integer.parseInt(txtAge.getText()) < 18) // AGE IS LESS THAN 18 YEARS
            {
            txtAge.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtAge.setForeground(Color.red);
            }
            if(txtBrainInjury.getText().equals("false")) // Was your disease confirmed by Medical Practitioner?
            {
            txtBrainInjury.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtBrainInjury.setForeground(Color.red);
            }
            if(txtBreathingProblem.getText().equals("false")) 
            {
            txtBreathingProblem.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtBreathingProblem.setForeground(Color.red);
            }
            if(txtDiabetesAndBloodPressure.getText().equals("false")) // Currently you do NOT have any symptoms? 
            {
            txtDiabetesAndBloodPressure.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtDiabetesAndBloodPressure.setForeground(Color.red);
            }
            if(txtSufferingChronicPains.getText().equals("false")) // Has it been at least 14 days since the last day of your symptoms?
            {
            txtSufferingChronicPains.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtSufferingChronicPains.setForeground(Color.red);
            }

            
           dB4OUtil.storeSystem(system);
            
        }
    }//GEN-LAST:event_tblRequestMousePressed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
               // TODO add your handling code here:
        if( !txtStatus.getText().equals("New Request"))
        {
            //JOptionPane.showMessageDialog(null,"Can Not Approve the Request!");
         JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Request can not be approved!</b></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
        
        }
        
        else
        {
        Donor donor = new Donor();
        donor.setDonorID(txtUID.getText()); // UID
        donor.setName(txtName.getText()); // Name
        donor.setDob(dobDateField.getDate()); // DOB 
        //donor.setCancerDiagnosedDate(diagnosedDateField.getDate());
        //donor.setLastDonationDate(lastDonationDateField.getDate()); // LastDonationDate
               
        donor.setAge(Integer.parseInt(txtAge.getText())); // Age
        donor.setGender(txtGender.getText()); // gender
        try {
            donor.getHla().updateHLAlist(txtHLAType.getText());
        }
        catch (NullPointerException e) {
            if(donor.getHla() == null)
                donor.setHla(new PersonHLA());
            donor.getHla().updateHLAlist(txtHLAType.getText());
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Patient's HLA Type can only be one of these HLA_A,HLA_B,HLA_C,HLA_DR,HLA_DBQ1</b></html>"));
            return;
        }
        donor.setStreetAddress(txtStreetAddress.getText()); // streetAddress
        donor.setCity(txtCity.getText()); // city
        donor.setState(txtState.getText()); // state
        donor.setZipCode(Integer.parseInt(txtZipCode.getText())); // zipCode
        donor.setContact(Long.parseLong(txtContactNumber.getText())); // contact
        donor.setEmailID(txtStatus.getText()); // emailID
        donor.setStatus("Government Approved"); // status
    
        donor.setBrainInjury(true); //  labConfirmation
        donor.setDiabitiesBP(true); //  symptoms
        donor.setBreathingProb(true); //  followUpTest 
        system.getDonorDirectory().addDonor(donor);
             
        for(DonorRequest donorRequest: system.getDonorRequestDirectory().getDonorRequestList()){            
        
            if(donorRequest.getDonorID().equals(txtUID.getText())){
            donorRequest.setStatus("Government Approved");
            dB4OUtil.storeSystem(system);
            }
        }
        txtStatus.setText("Government Approved");
        
        dB4OUtil.storeSystem(system);
        populateRequestTable();
         JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Request approved successfully!</b></html>"));
           
        //JOptionPane.showMessageDialog(null,"Request Approved. New Donor added!");
        
        
        
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
                // TODO add your handling code here:
       if(!txtStatus.getText().equals("New Request"))
                  {
                      
       JOptionPane.showMessageDialog(null, new JLabel("<html><b>Request can not be rejected!</b></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
          
                      
                      //JOptionPane.showMessageDialog(null,"Can Not Reject the Request!");
        }
       else{
        for(DonorRequest donorRequest: system.getDonorRequestDirectory().getDonorRequestList()){            
        
            if(donorRequest.getName().equals(txtName.getText())){
            txtStatus.setText("Rejected");
            donorRequest.setStatus("Rejected");
            }}
        dB4OUtil.storeSystem(system);
        populateRequestTable();
        
        JOptionPane.showMessageDialog(null, new JLabel("<html><b>Request has been rejected!</b></html>"));
        
        //JOptionPane.showMessageDialog(null,"Rejected the Request!");
        }
       dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnRejectActionPerformed

    private void txtHLATypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHLATypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHLATypeActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipCodeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnReject;
    private com.toedter.calendar.JDateChooser dobDateField;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddressDetails;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBrainInjury;
    private javax.swing.JLabel lblBreathingProblem;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDiabetesAndBloodPressure;
    private javax.swing.JLabel lblDonorRequestHandling;
    private javax.swing.JLabel lblEmailID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHLAType;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPatientDetails;
    private javax.swing.JLabel lblProfilePicture;
    private javax.swing.JLabel lblRequestDetails;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblStreetAddress;
    private javax.swing.JLabel lblSufferingChronicPain;
    private javax.swing.JLabel lblUID;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTable tblRequest;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBrainInjury;
    private javax.swing.JTextField txtBreathingProblem;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtDiabetesAndBloodPressure;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtHLAType;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtStreetAddress;
    private javax.swing.JTextField txtSufferingChronicPains;
    private javax.swing.JTextField txtUID;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}
