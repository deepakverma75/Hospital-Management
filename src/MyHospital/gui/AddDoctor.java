/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyHospital.gui;

import MyHospital.Dao.DoctorDao;
import MyHospital.Dao.EmpDao;
import MyHospital.pojo.DoctorPojo;
import MyHospital.pojo.userprofile;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class AddDoctor extends javax.swing.JFrame {
 String did,userid,qualification,specialist;
    /**
     * Creates new form AddDoctor
     */
    public AddDoctor() {
        initComponents();
        this.setLocationRelativeTo(null);
        getId();
        
    }
    public void getId()
    {
        try {
        String id = DoctorDao.getNewId();
        txtDocId.setText(id);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Some Problem occur while Generating Doctor Id");
        }
    }
    public boolean validateInputs()
    {
        userid = txtUserid.getText();
        qualification = txtQualification.getText();
        specialist =txtSpecial.getText();
        if(userid.isEmpty()||qualification.isEmpty()||specialist.isEmpty())
            return true;
        return false;
    }
    public void clearText()
    {
        txtUserid.setText("");
        txtQualification.setText("");
        txtSpecial.setText("");
    }
     private  void accessDenied()
     {
         String name=userprofile.getUsername();
         if(name==null)
         {
             JOptionPane.showMessageDialog(null,"Access Denied Please Login First!","Error",JOptionPane.ERROR_MESSAGE);
             Login frame = new Login();
             frame.setVisible(true);
             this.dispose();
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

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnAdddoctor1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDocId = new javax.swing.JTextField();
        txtUserid = new javax.swing.JTextField();
        txtSpecial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtQualification = new javax.swing.JTextField();
        btnLogout1 = new javax.swing.JButton();
        btnAdddoctor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        btnAdddoctor1.setFont(new java.awt.Font("Sitka Text", 1, 30)); // NOI18N
        btnAdddoctor1.setText("Logout");
        btnAdddoctor1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 204, 204), new java.awt.Color(51, 255, 255), new java.awt.Color(0, 153, 255)));
        btnAdddoctor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdddoctor1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(426, Short.MAX_VALUE)
                .addComponent(btnAdddoctor1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdddoctor1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1.setLayer(btnAdddoctor1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel2.setText("User Id");

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel3.setText("Qualification");

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel4.setText("Specialist");

        txtDocId.setEditable(false);
        txtDocId.setFont(new java.awt.Font("Sitka Text", 1, 19)); // NOI18N

        txtUserid.setFont(new java.awt.Font("Sitka Text", 1, 19)); // NOI18N

        txtSpecial.setFont(new java.awt.Font("Sitka Text", 1, 19)); // NOI18N
        txtSpecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecialActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel5.setText("Doctor ID");

        txtQualification.setFont(new java.awt.Font("Sitka Text", 1, 19)); // NOI18N

        btnLogout1.setFont(new java.awt.Font("Sitka Text", 1, 30)); // NOI18N
        btnLogout1.setText("Back");
        btnLogout1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 204, 204), new java.awt.Color(51, 255, 255), new java.awt.Color(0, 153, 255)));
        btnLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout1ActionPerformed(evt);
            }
        });

        btnAdddoctor.setFont(new java.awt.Font("Sitka Text", 1, 30)); // NOI18N
        btnAdddoctor.setText("Add Doctor");
        btnAdddoctor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 204, 204), new java.awt.Color(51, 255, 255), new java.awt.Color(0, 153, 255)));
        btnAdddoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdddoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserid, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addComponent(txtDocId)
                            .addComponent(txtSpecial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addComponent(txtQualification, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                        .addGap(20, 20, 20)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdddoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDocId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUserid, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtQualification, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSpecial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdddoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSpecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecialActionPerformed

    private void btnLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout1ActionPerformed
        // TODO add your handling code here:
        DoctorOptions a = new DoctorOptions();
        a.setVisible(true);
        this.dispose();
        
       
    }//GEN-LAST:event_btnLogout1ActionPerformed

    private void btnAdddoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdddoctorActionPerformed
        // TODO add your handling code here:
          if(validateInputs()==true)
        {
            JOptionPane.showMessageDialog(null,"Please Fill all Fields","Error",JOptionPane.ERROR_MESSAGE);
        }
        try
        {
            did = txtDocId.getText();
            DoctorPojo p = new DoctorPojo();
            p.setUserid(userid);
            p.setDoctorid(did);
            p.setQualification(qualification);
            p.setSpecialist(specialist);
            
            boolean a = DoctorDao.addDoctorToDoctors(p);
            if(a==true)
            {
                JOptionPane.showMessageDialog(null,"Doctor Successfully Added!","Success",JOptionPane.INFORMATION_MESSAGE);
                getId();
                clearText();
            }
            else
            JOptionPane.showMessageDialog(null,"Some Error Doctor not Added!","Error",JOptionPane.ERROR_MESSAGE);

        }
        catch(NumberFormatException f)
        {
            JOptionPane.showMessageDialog(null,"Please Field Correct Value","Error",JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Please enter Valid Userid! Soory Wrong user Id","Error",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.out.println("Some Problem in DB");
        }
    }//GEN-LAST:event_btnAdddoctorActionPerformed

    private void btnAdddoctor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdddoctor1ActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAdddoctor1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new AddDoctor().setVisible(true);
                 AddDoctor frame=new AddDoctor();
                frame.setVisible(true);
                frame.accessDenied();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdddoctor;
    private javax.swing.JButton btnAdddoctor1;
    private javax.swing.JButton btnLogout1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDocId;
    private javax.swing.JTextField txtQualification;
    private javax.swing.JTextField txtSpecial;
    private javax.swing.JTextField txtUserid;
    // End of variables declaration//GEN-END:variables
}
