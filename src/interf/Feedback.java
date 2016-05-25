/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interf;

import Codes.DBconnect;
import Codes.feedback;
import Codes.validateUser;
import interf.ViewFeedback;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author Joel
 */
public class Feedback extends javax.swing.JFrame {
    Connection con=null; 
    PreparedStatement pst=null;
    ResultSet rs=null;
    String user = null;
    
    int type = 0;
   
    public Feedback() {
        initComponents();
        con=DBconnect.connect();
        
        feedback f = new feedback();
        f.cb1items(pst, con, rs,jComboBox1);
        f.cb2items(pst, con, rs,jComboBox2);
    }
    
    public Feedback(String un) {
        initComponents();
        con=DBconnect.connect();
        user = un;
        
        feedback f = new feedback();
        f.cb1items(pst, con, rs,jComboBox1);
        f.cb2items(pst, con, rs,jComboBox2);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Feedback");
        setLocation(new java.awt.Point(200, 10));
        setPreferredSize(new java.awt.Dimension(890, 680));
        setSize(new java.awt.Dimension(890, 680));
        getContentPane().setLayout(null);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button(18).png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pressedvfeed.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 30, 180, 60);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_arrow-back-icon.png"))); // NOI18N
        jButton4.setText("Back");
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(730, 30, 130, 49);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Lecturer Name:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 150, 101, 42);

        jComboBox1.setToolTipText("");
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(390, 160, 360, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Course:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 240, 196, 17);

        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(390, 240, 360, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Feedback: \n(500 characters max) ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 310, 204, 50);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setMaximumSize(null);
        jTextArea1.setPreferredSize(new java.awt.Dimension(250, 250));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(390, 310, 359, 169);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button(16).png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/submitpressed.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(370, 550, 135, 45);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Light-Blue-blur-background1.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-10, -320, 900, 1010);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String lname=String.valueOf(jComboBox1.getSelectedItem());
        String course=String.valueOf(jComboBox2.getSelectedItem());
        String feedback=jTextArea1.getText();

        if(!lname.equals("") & !course.isEmpty() & !feedback.isEmpty())
        {
            feedback f = new feedback();

            if(f.feedback(pst, con, lname, course, feedback))
            {
                jTextArea1.setText(null);//resets text areas after feedback is submitted
            }

        }
        else
        {
             JOptionPane.showMessageDialog(null,"Please fill in all required information!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(user==null){
            ViewFeedback viewfeed=new ViewFeedback();
            viewfeed.setVisible(true);
            this.dispose();
        }
        else{
            if(validateUser.checkLecturer(user, pst, con)){
                ViewFeedback viewfeed=new ViewFeedback(user);
                viewfeed.setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null,"Access Denied!");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
