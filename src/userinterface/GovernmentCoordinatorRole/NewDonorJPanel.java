/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GovernmentCoordinatorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.People.DonorRequest;
import Magic.Design.*;
import Business.People.DonorRequestDirectory;
import Magic.Design.MyJButton;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.SwingUtilities.getWindowAncestor;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author parth
 */
public class NewDonorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewDonorJPanel
     */
    
    private boolean emailValid;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private byte[] tempdP;
    private ButtonGroup radioGroup1;
    private ButtonGroup radioGroup2;
    private ButtonGroup radioGroup3;
    private ButtonGroup radioGroup4;
            
    public NewDonorJPanel(EcoSystem system)
    {
        initComponents();
        this.system = system;
        this.radioGroup1 = new ButtonGroup();
        this.radioGroup2 = new ButtonGroup();
        this.radioGroup3 = new ButtonGroup();
        this.radioGroup4 = new ButtonGroup();
        
       // ButtonGroup radioGroup1 = new ButtonGroup();
        radioGroup1.add(btnYesQ1);
        radioGroup1.add(btnNoQ1);
  
      //  ButtonGroup radioGroup2 = new ButtonGroup();
        radioGroup2.add(btnYesQ2);
        radioGroup2.add(btnNoQ2);
        
      //  ButtonGroup radioGroup3 = new ButtonGroup();
        radioGroup3.add(btnYesQ3);
        radioGroup3.add(btnNoQ3);
        
       // ButtonGroup radioGroup4 = new ButtonGroup();
        radioGroup4.add(btnYesQ4);
        radioGroup4.add(btnNoQ4);
        
        populateGenderComboBox();
        populateStateComboBox();
    
    
    }
  
  private void populateGenderComboBox(){
           cmbGender.addItem("Male");
           cmbGender.addItem("Female");
           cmbGender.addItem("Other");
        }
  
  private void populateStateComboBox(){
           cmbState.addItem("California");
           cmbState.addItem("Massachusetts");
           cmbState.addItem("Georgia");
           cmbState.addItem("Arizona");
           cmbState.addItem("Texas");
           cmbState.addItem("Florida");
           cmbState.addItem("Illinois");
      }
    public static boolean phoneNumberValidator(String contact) {
        Pattern pattern;
        Matcher matcher;
        String PHONE_PATTERN = "^[0-9]{10}$";
        pattern = Pattern.compile(PHONE_PATTERN);
        matcher = pattern.matcher(contact);
        return matcher.matches();
        }
    public static boolean zipCodeValidator(String zip) {
        Pattern pattern;
        Matcher matcher;
        String zip_pattern = "^[0-9]{5}$";
        pattern = Pattern.compile(zip_pattern);
        matcher = pattern.matcher(zip);
        return matcher.matches();
        } 
    public static boolean emailValidator(String email) {
        Pattern pattern;
        Matcher matcher;
        String EMAIL_PATTERN = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
        }
    public boolean isAlpha(String name) {
        return name.matches("[a-zA-Z]+");
        }

    private void disableAllButton(){
    
        txtUID.setEnabled(false);
        txtName.setEnabled(false);
        dobDateField.setEnabled(false);
        txtAge.setEnabled(false);
        txtEmailID.setEnabled(false);
        txtContactNumber.setEnabled(false);
        cmbGender.setEnabled(false);
        txtHLAType.setEnabled(false);
        txtStreetAddress.setEnabled(false);
        txtCity.setEnabled(false);
        cmbState.setEnabled(false);
        txtZipCode.setEnabled(false);
        btnYesQ1.setEnabled(false);
        btnNoQ1.setEnabled(false);
        btnYesQ2.setEnabled(false);
        btnNoQ2.setEnabled(false);
        btnYesQ3.setEnabled(false);
        btnNoQ3.setEnabled(false);
        btnYesQ4.setEnabled(false);
        btnNoQ4.setEnabled(false);
        btnAddPhoto.setEnabled(false);
    
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblRegNum = new javax.swing.JLabel();
        txtUID = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblHLAType = new javax.swing.JLabel();
        txtStreetAddress = new javax.swing.JTextField();
        lblStreetAddress = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        lblContactNumber = new javax.swing.JLabel();
        txtContactNumber = new javax.swing.JTextField();
        lblEmailID = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        lblBrainInjuryConfirmation = new javax.swing.JLabel();
        lblBreathingProblemConfirmation = new javax.swing.JLabel();
        lblDiabetesAndBloodPressureConfirmation = new javax.swing.JLabel();
        lblChronicPainConfirmation = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnAddPhoto = new javax.swing.JButton();
        btnYesQ2 = new javax.swing.JRadioButton();
        btnNoQ2 = new javax.swing.JRadioButton();
        btnNoQ1 = new javax.swing.JRadioButton();
        btnYesQ1 = new javax.swing.JRadioButton();
        btnNoQ3 = new javax.swing.JRadioButton();
        btnYesQ3 = new javax.swing.JRadioButton();
        btnNoQ4 = new javax.swing.JRadioButton();
        btnYesQ4 = new javax.swing.JRadioButton();
        lblProfilePicture = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        cmbState = new javax.swing.JComboBox();
        cmbGender = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblInjuryConfirmation = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        dobDateField = new com.toedter.calendar.JDateChooser();
        txtHLAType = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblName.setText("Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        txtName.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 170, -1));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 218, -1, -1));

        lblRegNum.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblRegNum.setText("Reg Num");
        add(lblRegNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, -1, -1));

        txtUID.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtUID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUIDActionPerformed(evt);
            }
        });
        add(txtUID, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, 180, -1));

        lblDate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDate.setText("DOB");
        add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        lblAge.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblAge.setText("Age");
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));

        txtAge.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtAge.setEnabled(false);
        txtAge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAgeMouseClicked(evt);
            }
        });
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeKeyPressed(evt);
            }
        });
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 180, -1));

        lblGender.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblGender.setText("Gender");
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        lblHLAType.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblHLAType.setText("HLA Types");
        add(lblHLAType, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, -1, 20));

        txtStreetAddress.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(txtStreetAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 180, -1));

        lblStreetAddress.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblStreetAddress.setText("Street address");
        add(lblStreetAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, -1, -1));

        lblCity.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblCity.setText("City");
        add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, -1, -1));

        txtCity.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 180, -1));

        lblState.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblState.setText("State");
        add(lblState, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, -1, -1));

        lblZipCode.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblZipCode.setText("ZipCode");
        add(lblZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, -1, -1));

        txtZipCode.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(txtZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, 180, -1));

        lblContactNumber.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblContactNumber.setText("Contact Number");
        add(lblContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, -1, -1));

        txtContactNumber.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(txtContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 280, 180, -1));

        lblEmailID.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblEmailID.setText("Email ID");
        add(lblEmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        txtEmailID.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtEmailID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmailIDMouseClicked(evt);
            }
        });
        txtEmailID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uEmailKeyTyped(evt);
            }
        });
        add(txtEmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 170, -1));

        lblBrainInjuryConfirmation.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lblBrainInjuryConfirmation.setText(" Do you have any history with severe brain injuries? ");
        add(lblBrainInjuryConfirmation, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 450, -1, -1));

        lblBreathingProblemConfirmation.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lblBreathingProblemConfirmation.setText("Do you have any history with breathing problem?");
        add(lblBreathingProblemConfirmation, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, -1, -1));

        lblDiabetesAndBloodPressureConfirmation.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lblDiabetesAndBloodPressureConfirmation.setText("Do you have any history with Diabities and Blood Pressure?");
        add(lblDiabetesAndBloodPressureConfirmation, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 570, 490, -1));

        lblChronicPainConfirmation.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lblChronicPainConfirmation.setText("Are you suffering with any Chronic pain in the ares of neck, back, or spine?");
        add(lblChronicPainConfirmation, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 630, 630, 20));

        btnSubmit.setBackground(new java.awt.Color(255, 164, 0));
        btnSubmit.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 700, 80, 30));

        btnAddPhoto.setBackground(new java.awt.Color(255, 164, 0));
        btnAddPhoto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAddPhoto.setText("Add photo");
        btnAddPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPhotoActionPerformed(evt);
            }
        });
        add(btnAddPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 320, 110, 30));

        btnYesQ2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnYesQ2.setText("No");
        add(btnYesQ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 540, -1, -1));

        btnNoQ2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNoQ2.setText("Yes");
        add(btnNoQ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 540, -1, -1));

        btnNoQ1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNoQ1.setText("Yes");
        add(btnNoQ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 480, -1, -1));

        btnYesQ1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnYesQ1.setText("No");
        btnYesQ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesQ1ActionPerformed(evt);
            }
        });
        add(btnYesQ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 480, -1, -1));

        btnNoQ3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNoQ3.setText("Yes");
        add(btnNoQ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 600, -1, -1));

        btnYesQ3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnYesQ3.setText("No");
        add(btnYesQ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 600, -1, -1));

        btnNoQ4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNoQ4.setText("Yes");
        add(btnNoQ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 660, -1, -1));

        btnYesQ4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnYesQ4.setText("No");
        btnYesQ4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesQ4ActionPerformed(evt);
            }
        });
        add(btnYesQ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 660, -1, -1));

        lblProfilePicture.setBackground(new java.awt.Color(255, 164, 0));
        lblProfilePicture.setForeground(new java.awt.Color(255, 164, 0));
        lblProfilePicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 164, 0)));
        add(lblProfilePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 170, 130, 130));

        jButton2.setBackground(new java.awt.Color(255, 164, 0));
        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setText("New Form");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 700, 100, 30));

        cmbState.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        cmbState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStateActionPerformed(evt);
            }
        });
        add(cmbState, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 180, -1));

        cmbGender.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        cmbGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGenderActionPerformed(evt);
            }
        });
        add(cmbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 170, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Donor Registration Form ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 1365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 325, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1690, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 1140, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel2.setText("Donor Details");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel23.setText("Address Details");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, 20, 360));

        lblInjuryConfirmation.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lblInjuryConfirmation.setText("By Registering to join this cause, you are confirming that");
        add(lblInjuryConfirmation, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, -1, -1));

        btnBack.setBackground(new java.awt.Color(255, 164, 0));
        btnBack.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 700, 80, 30));

        dobDateField.setBackground(new java.awt.Color(255, 255, 255));
        dobDateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dobDateFieldagePop(evt);
            }
        });
        dobDateField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dobDateFielduDobKeyTyped(evt);
            }
        });
        add(dobDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 170, -1));

        txtHLAType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "HLA_A", "HLA_B", "HLA_C", "HLA_DR", "HLA_DBQ1" }));
        txtHLAType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHLATypeActionPerformed(evt);
            }
        });
        add(txtHLAType, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 330, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        DonorRequest donorRequest = new DonorRequest();
        Date currentDate = new Date(); 
         if ( lblProfilePicture == null ){
            lblProfilePicture.setBorder(BorderFactory.createLineBorder(Color.RED));
            lblProfilePicture.setForeground(Color.red);
            btnAddPhoto.setBorder(BorderFactory.createLineBorder(Color.RED));
            btnAddPhoto.setForeground(Color.red);       
        }
        if ( cmbState.getSelectedItem().equals("") ){
            cmbState.setBorder(BorderFactory.createLineBorder(Color.RED));
            cmbState.setForeground(Color.red);
        }
        if ( cmbGender.getSelectedItem().equals("") ){
            cmbGender.setBorder(BorderFactory.createLineBorder(Color.RED));
            cmbGender.setForeground(Color.red);
        }
        if ( txtHLAType.getSelectedItem().equals("Select") ){
            txtHLAType.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtHLAType.setForeground(Color.red);
        }
        if (txtName.getText().isEmpty()) {
            txtName.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtName.setForeground(Color.red);
        }
        if (txtUID.getText().isEmpty()) {
            txtUID.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtUID.setForeground(Color.red);
        } 
        if (txtEmailID.getText().isEmpty()) {
            txtEmailID.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtEmailID.setForeground(Color.red);
        }
        if (txtContactNumber.getText().isEmpty()) {
            txtContactNumber.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtContactNumber.setForeground(Color.red);
        }
        if (txtZipCode.getText().isEmpty()) {
            txtZipCode.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtZipCode.setForeground(Color.red);
        }
        if (txtCity.getText().isEmpty()) {
            txtCity.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtCity.setForeground(Color.red);
        }
        if (txtStreetAddress.getText().isEmpty()) {
            txtStreetAddress.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtStreetAddress.setForeground(Color.red);
        }      
        if (dobDateField.getDate() == null ) {
            dobDateField.setBorder(BorderFactory.createLineBorder(Color.RED));
            dobDateField.setForeground(Color.red);
        }
         if (txtAge.getText().isEmpty()) {
            txtAge.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtAge.setForeground(Color.red);
        }
         if(btnNoQ1.isSelected() || 
                 btnNoQ2.isSelected() ||
                 btnNoQ3.isSelected() ||
                 btnNoQ4.isSelected()) {
             JOptionPane.showMessageDialog(null,new JLabel(  "<html>Based on the inputs, we could not accept your marrow!<br> Thanks for your interest to save the Humanity!</html>") , "Error", JOptionPane.ERROR_MESSAGE);
             return ;
         }
       //
       //
       //
       //
       
        if (    txtName.getText().isEmpty()        || txtEmailID.getText().isEmpty()        || txtCity.getText().isEmpty() ||
                txtContactNumber.getText().isEmpty()     || txtZipCode.getText().isEmpty()          || txtStreetAddress.getText().isEmpty() || 
                txtUID.getText().isEmpty()         || 
                dobDateField.getDate() == null      || 
                txtAge.getText().isEmpty()         ||
                String.valueOf(cmbGender.getSelectedItem()).equals("") || 
                String.valueOf(txtHLAType.getSelectedItem()).equals("") || 
                String.valueOf(cmbState.getSelectedItem()).equals(""))
            { 
            JOptionPane.showMessageDialog(null,new JLabel(  "<html><b>All fields are mandatory!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);
             return ;
            }
   
        
        else if(  !btnNoQ1.isSelected()  &&  !btnYesQ1.isSelected()   ||
                  !btnNoQ2.isSelected()  &&  !btnYesQ2.isSelected()   ||
                  !btnNoQ3.isSelected()  &&  !btnYesQ3.isSelected()   ||
                  !btnNoQ4.isSelected()  &&  !btnYesQ4.isSelected()   )
        {
        JOptionPane.showMessageDialog(null,new JLabel("<html><b>All fields are mandatory!</b></html>"), "Error", JOptionPane.ERROR_MESSAGE);
        return;
        }
        
    
        else if (!isAlpha(txtName.getText()))
        {
         txtName.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtName.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, new JLabel("<html><b>Name must contain only alphabets</b>!</html>") , "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if (!isAlpha(txtCity.getText()))
        {
         txtCity.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtCity.setForeground(Color.red);
         JOptionPane.showMessageDialog(null, new JLabel("<html><b>Name of the City must contain only alphabets!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);
            return;
            //JOptionPane.showMessageDialog(null, "City name must contain only alphabets." , "Error", JOptionPane.ERROR_MESSAGE);
            //return;
        }
        
        else   if ( !phoneNumberValidator(txtContactNumber.getText())   ){
           //JOptionPane.showMessageDialog(null, "Contact number should be 10 digit and Zip should be 5 digit" , "Error", JOptionPane.ERROR_MESSAGE);
           JOptionPane.showMessageDialog(null, new JLabel("<html><b>Contact Number should be 10 digit!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);
           // return;
           return;
        }
        else   if ( !zipCodeValidator(txtZipCode.getText()) ){
           //JOptionPane.showMessageDialog(null, "Contact number should be 10 digit and Zip should be 5 digit" , "Error", JOptionPane.ERROR_MESSAGE);
           JOptionPane.showMessageDialog(null, new JLabel("<html><b>Zip should be 5 digit!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);
           return;
        }
        else   if ( !emailValidator(txtEmailID.getText()) ){
           //JOptionPane.showMessageDialog(null, "Email ID must be in correct format!" , "Error", JOptionPane.ERROR_MESSAGE);
JOptionPane.showMessageDialog(null, new JLabel("<html><b>Email ID must be in correct format!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);

           return;
        } 
        
        else if (dobDateField.getDate().after(currentDate)) {
             //JOptionPane.showMessageDialog(null, "Date should be past date", "Error", JOptionPane.ERROR_MESSAGE);
             JOptionPane.showMessageDialog(null, new JLabel("<html><b>Are you booking for your children? Sorry, we don't accept it as of today!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);

             return;}          
          
          else{
            try {
                donorRequest.getHLA().updateHLAlist(String.valueOf(txtHLAType.getSelectedItem()));
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Patient's HLA Type can only be one of these HLA_A,HLA_B,HLA_C,HLA_DR,HLA_DBQ1</b></html>"));
                return;
            }

            int n = JOptionPane.showConfirmDialog(null,new JLabel("<html><b>Would you like to submit the form?</b></html>"),
                    "CONFIRMATION REQUIRED",JOptionPane.YES_NO_OPTION);

            if(n == 0)
            {
                
        donorRequest.setDonorID(txtUID.getText()); // UID
        donorRequest.setName(txtName.getText()); // Name
        donorRequest.setDob(dobDateField.getDate()); // DOB 
        donorRequest.setAge(Integer.parseInt(txtAge.getText())); // Age
        donorRequest.setGender((String) cmbGender.getSelectedItem()); // gender
        donorRequest.setStreetAddress(txtStreetAddress.getText()); // streetAddress
        donorRequest.setCity(txtCity.getText()); // city
        donorRequest.setState((String) cmbState.getSelectedItem()); // state
        donorRequest.setZipCode(Integer.parseInt(txtZipCode.getText())); // zipCode
        donorRequest.setContact(Long.parseLong(txtContactNumber.getText())); // contact
        donorRequest.setEmailID(txtEmailID.getText()); // emailID
        donorRequest.setStatus("New Request"); // status
        //donorRequest.setImagePath(photoTextField.getText()); 
        donorRequest.setdP(tempdP);
        
        for(DonorRequest dnr : system.getDonorRequestDirectory().getDonorRequestList()){
            //System.out.println("PRINITNG IT HERE!!");
           // System.out.println(dnr.getName());
        }
        
        if(btnYesQ1.isSelected())
        {donorRequest.setBrainInjury(true); //  labConfirmation
        }
        else if(btnNoQ1.isSelected())
        {donorRequest.setBrainInjury(false); //  labConfirmation
        }
        
        if(btnYesQ2.isSelected())
        {donorRequest.setBreathingProb(true); //  symptoms
        }
        else if(btnNoQ2.isSelected())
        {donorRequest.setBreathingProb(false); //  symptoms
        }
        
        if(btnYesQ3.isSelected())
        {donorRequest.setDiabitiesBP(true); //  symptoms
        }
        else if(btnNoQ3.isSelected())
        {donorRequest.setDiabitiesBP(false); //  symptoms
        }
        
        if(btnYesQ4.isSelected())
        {donorRequest.setChronicPains(true); //  followUpTest
        }
        else if(btnNoQ4.isSelected())
        {donorRequest.setChronicPains(false); //  followUpTest
        }
        system.getDonorRequestDirectory().addDonorRequest(donorRequest); 
        JOptionPane.showMessageDialog(null, new JLabel("<html><b>Thank you for volunteering to save a life!</b></html>"));
        
        dB4OUtil.storeSystem(system);
        disableAllButton();
        }}
        btnSubmit.setEnabled(false);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnAddPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPhotoActionPerformed
        // TODO add your handling code here:
       /* JFileChooser chooser1 = new JFileChooser();
        chooser1.showOpenDialog(null);
        File f = chooser1.getSelectedFile();
        String filename = f.getAbsolutePath();
        photoTextField.setText(filename);
        Image getAbsolutePath = null;
        ImageIcon icon = new ImageIcon(filename);
        Image image = icon.getImage().getScaledInstance(jLabel23.getWidth(), jLabel23.getHeight(), Image.SCALE_SMOOTH);
        jLabel23.setIcon(icon);*/
       
       
       JFileChooser file = new JFileChooser();
          file.setCurrentDirectory(new File(System.getProperty("user.dir")));
          //filter the files
          FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
          file.addChoosableFileFilter(filter);
          int result = file.showSaveDialog(null);
           //if the user click on save in Jfilechooser
          if(result == JFileChooser.APPROVE_OPTION){
              File selectedFile = file.getSelectedFile();
              tempdP = new byte[(int) selectedFile.length()]; 
                FileInputStream fis;
             try {
                 fis = new FileInputStream(selectedFile);
                 fis.read(tempdP);
                 fis.close();
             } catch (IOException ex) {
                 Logger.getLogger(NewDonorJPanel.class.getName()).log(Level.SEVERE, null, ex);
             }             
              lblProfilePicture.setIcon(ResizeImage(selectedFile.getAbsolutePath()));
              lblProfilePicture.setIcon(setPicture(selectedFile.getAbsolutePath(),lblProfilePicture));
          }

          else if(result == JFileChooser.CANCEL_OPTION){
             // System.out.println("No File Select");
          }
       
          
       
    }//GEN-LAST:event_btnAddPhotoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        lblProfilePicture.setIcon(null);
        radioGroup1.clearSelection();
        radioGroup2.clearSelection();
        radioGroup3.clearSelection();
        radioGroup4.clearSelection();
        txtUID.setEnabled(true);
        txtName.setEnabled(true);
        dobDateField.setEnabled(true);
        txtAge.setEnabled(false);
        txtEmailID.setEnabled(true);
        txtContactNumber.setEnabled(true);
        cmbGender.setEnabled(true);
        txtHLAType.setEnabled(true);
        txtStreetAddress.setEnabled(true);
        txtCity.setEnabled(true);
        cmbState.setEnabled(true);
        txtZipCode.setEnabled(true);
        btnYesQ1.setEnabled(true);
        btnNoQ1.setEnabled(true);
        btnYesQ2.setEnabled(true);
        btnNoQ2.setEnabled(true);
        btnYesQ3.setEnabled(true);
        btnNoQ3.setEnabled(true);
        btnYesQ4.setEnabled(true);
        btnNoQ4.setEnabled(true);
        btnAddPhoto.setEnabled(true);
        
        txtUID.setText("");
        txtName.setText("");
        txtAge.setText("");
        txtEmailID.setText("");
        txtContactNumber.setText("");
        txtStreetAddress.setText("");
        txtCity.setText("");
        txtZipCode.setText("");
        txtHLAType.setSelectedItem("Select");
        
        cmbGender.setSelectedItem("");
        cmbState.setSelectedItem("");
        
        dobDateField.setCalendar(null);
        
        btnYesQ1.setSelected(false);
        btnNoQ1.setSelected(false);
        btnYesQ2.setSelected(false);
        btnNoQ2.setSelected(false);
        btnYesQ3.setSelected(false);
        btnNoQ3.setSelected(false);
        btnYesQ4.setSelected(false);
        btnNoQ4.setSelected(false);
        
        lblProfilePicture.removeAll();
        
        btnSubmit.setEnabled(true);
            
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStateActionPerformed
       
        
    }//GEN-LAST:event_cmbStateActionPerformed

    private void cmbGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGenderActionPerformed

    private void uEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uEmailKeyTyped
        // TODO add your handling code here:
        if (!emailValidator(txtEmailID.getText())) {
            emailValid = false;
        } else {
//            emailText.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txtEmailID.setForeground(Color.BLACK);
            emailValid = true;
        }
        
        
        
    }//GEN-LAST:event_uEmailKeyTyped

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void uDobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uDobKeyTyped
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
    }//GEN-LAST:event_uDobKeyTyped

    private void txtAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeKeyPressed

    private void txtAgeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgeMouseClicked
        // TODO add your handling code here:
        Date dob = dobDateField.getDate();
        //System.out.println(dob.getYear());
        txtAge.setText((String.valueOf(new Date().getYear()-dob.getYear())));
    
      /*  LocalDate today = LocalDate.now();                          //Today's date
        LocalDate birthday;  //Birth date
        birthday = LocalDate.of(dob);
 
        Period p = Period.between(birthday, today);
        
        ageText.setText(String.valueOf(p.getYears()));
        String dobq=  calculateAge(dob, today);  
        */
        
    }//GEN-LAST:event_txtAgeMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        Date dob = dobDateField.getDate();
       // System.out.println(dob.getYear());
        txtAge.setText((String.valueOf(new Date().getYear()-dob.getYear())));
    }//GEN-LAST:event_formMouseClicked

    private void dobDateFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dobDateFieldMouseExited
        //    Date dob = dobDateField.getDate();
        //       System.out.println(dob.getYear());
        //    ageText.setText((String.valueOf(new Date().getYear()-dob.getYear())));
    }//GEN-LAST:event_dobDateFieldMouseExited

    public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lblProfilePicture.getWidth(), lblProfilePicture.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
     private ImageIcon setPicture(String carImageLocation, JLabel carImage){

        ImageIcon imageCar;
        imageCar = new ImageIcon(carImageLocation);
        Image picCar = imageCar.getImage();
        Image resizedImage = picCar.getScaledInstance(carImage.getWidth(), carImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedCarPicture = new ImageIcon(resizedImage);
        
        return selectedCarPicture;  
}    
    
    private void dobDateFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dobDateFieldMousePressed

    }//GEN-LAST:event_dobDateFieldMousePressed

    
    private void dobDateFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobDateFieldFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_dobDateFieldFocusLost

    private void agePop(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agePop
        // TODO add your handling code here:
        Date dob = dobDateField.getDate();
        System.out.println(dob.getYear());
        txtAge.setText((String.valueOf(new Date().getYear()-dob.getYear())));
        
    }//GEN-LAST:event_agePop

    private void txtEmailIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailIDMouseClicked
        // TODO add your handling code here:
        
        Date dob = dobDateField.getDate();
      //  System.out.println(dob.getYear());
        txtAge.setText((String.valueOf(new Date().getYear()-dob.getYear())));
    }//GEN-LAST:event_txtEmailIDMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        JFrame frame = (JFrame) getWindowAncestor(this);
        frame.dispose();
        NewDonorJPanel.super.setVisible(false);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtUIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUIDActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void dobDateFieldagePop(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dobDateFieldagePop
        // TODO add your handling code here:
        Date dob = dobDateField.getDate();
        System.out.println(dob.getYear());
        txtAge.setText((String.valueOf(new Date().getYear()-dob.getYear())));

    }//GEN-LAST:event_dobDateFieldagePop

    private void dobDateFielduDobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dobDateFielduDobKeyTyped
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
    }//GEN-LAST:event_dobDateFielduDobKeyTyped

    private void btnYesQ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesQ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnYesQ1ActionPerformed

    private void btnYesQ4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesQ4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnYesQ4ActionPerformed

    private void txtHLATypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHLATypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHLATypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPhoto;
    private javax.swing.JButton btnBack;
    private javax.swing.JRadioButton btnNoQ1;
    private javax.swing.JRadioButton btnNoQ2;
    private javax.swing.JRadioButton btnNoQ3;
    private javax.swing.JRadioButton btnNoQ4;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JRadioButton btnYesQ1;
    private javax.swing.JRadioButton btnYesQ2;
    private javax.swing.JRadioButton btnYesQ3;
    private javax.swing.JRadioButton btnYesQ4;
    private javax.swing.JComboBox cmbGender;
    private javax.swing.JComboBox cmbState;
    private com.toedter.calendar.JDateChooser dobDateField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBrainInjuryConfirmation;
    private javax.swing.JLabel lblBreathingProblemConfirmation;
    private javax.swing.JLabel lblChronicPainConfirmation;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDiabetesAndBloodPressureConfirmation;
    private javax.swing.JLabel lblEmailID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHLAType;
    private javax.swing.JLabel lblInjuryConfirmation;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProfilePicture;
    private javax.swing.JLabel lblRegNum;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreetAddress;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JComboBox<String> txtHLAType;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtStreetAddress;
    private javax.swing.JTextField txtUID;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}
