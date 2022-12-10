/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;


/**
 *
 * @author Payal
 */


import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Magic.Design.MyJLabel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.getWindowAncestor;

public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    boolean a = true;
    Enterprise enterprise;
    EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public AdminWorkAreaJPanel(Enterprise enterprise, EcoSystem system, Network network) {
        initComponents();
        System.out.println("I'm here where u thought!!");
        this.enterprise = enterprise;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);    
    }
    
    public void clickmenu(JPanel h1, JPanel h2, int numberbool){
        
        if(numberbool == 1){
            
            h1.setBackground(new Color(70,55,37));
            h2.setBackground(new Color(216,99,1));        
        }
        else{
            h1.setBackground(new Color(216,99,1));
            h2.setBackground(new Color(70,55,37));   
        }  
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        lblManageOrganization = new javax.swing.JLabel();
        lblManageEmployees = new javax.swing.JLabel();
        lblManageUsers = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1250, 720));
        setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(0, 0, 0));
        Header.setPreferredSize(new java.awt.Dimension(800, 50));
        Header.setLayout(new java.awt.GridLayout(1, 0));

        lblManageOrganization.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblManageOrganization.setForeground(new java.awt.Color(255, 255, 255));
        lblManageOrganization.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageOrganization.setText("Manage Oranganization");
        lblManageOrganization.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblManageOrganization.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManageOrganizationMouseClicked(evt);
            }
        });
        Header.add(lblManageOrganization);

        lblManageEmployees.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblManageEmployees.setForeground(new java.awt.Color(255, 255, 255));
        lblManageEmployees.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageEmployees.setText("Manage Employees");
        lblManageEmployees.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblManageEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManageEmployeesMouseClicked(evt);
            }
        });
        Header.add(lblManageEmployees);

        lblManageUsers.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblManageUsers.setForeground(new java.awt.Color(255, 255, 255));
        lblManageUsers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageUsers.setText("Manage Users");
        lblManageUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblManageUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManageUsersMouseClicked(evt);
            }
        });
        Header.add(lblManageUsers);

        add(Header, java.awt.BorderLayout.PAGE_START);

        userProcessContainer.setBackground(new java.awt.Color(255, 255, 255));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        add(userProcessContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void lblManageOrganizationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageOrganizationMouseClicked
        // TODO add your handling code here:
        
        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory(), enterprise, system);
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_lblManageOrganizationMouseClicked

    private void lblManageEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageEmployeesMouseClicked
        // TODO add your handling code here:
        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory(), enterprise, system);
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_lblManageEmployeesMouseClicked

    private void lblManageUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageUsersMouseClicked
        // TODO add your handling code here:

        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise, system);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_lblManageUsersMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JLabel lblManageEmployees;
    private javax.swing.JLabel lblManageOrganization;
    private javax.swing.JLabel lblManageUsers;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
