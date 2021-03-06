/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interf;

import Codes.DBconnect;
import Codes.grades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Dinuksha
 */
public class AssignStudentGrades extends javax.swing.JInternalFrame {
    Connection con = null;
    PreparedStatement pst = null;
    grades g4;
    String id,course;
    int exam_id;
    /**
     * Creates new form AssignStudentGrades
     */
    public AssignStudentGrades() {
        initComponents();
        con = DBconnect.connect();
        g4 =  new grades(con,pst);
        g4.getCourses(jComboBox1);
        g4.getExamCode(jComboBox2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1600, 605));
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ok.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/okPressed.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(960, 40, 70, 45);

        jComboBox1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Course" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(169, 45, 410, 30);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Select Course");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(56, 48, 110, 23);

        jTable1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                ""
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 130, 350, 253);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Student ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(462, 147, 80, 20);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Grade");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(462, 190, 70, 23);

        jTextField2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(601, 187, 40, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/assign.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(601, 262, 100, 40);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(601, 147, 171, 22);

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setText("Exam Code");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(640, 50, 90, 23);

        jComboBox2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(770, 50, 130, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/assignGradesIcon2.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(760, 170, 580, 370);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Light-Blue-blur-background1.jpg"))); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(1600, 1200));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-11, -4, 1330, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jComboBox1.getSelectedItem().toString().equals("Select Course") && jComboBox2.getSelectedItem().toString().equals("Select")){
            JOptionPane.showMessageDialog(null, "Please Select a Course and Exam Code");
        }
        else if(!jComboBox1.getSelectedItem().toString().equals("Select Course") && jComboBox2.getSelectedItem().toString().equals("Select")){
                JOptionPane.showMessageDialog(null, "Please Select an Exam");
            }
            else if(jComboBox1.getSelectedItem().toString().equals("Select Course") && !jComboBox2.getSelectedItem().toString().equals("Select")){
                    JOptionPane.showMessageDialog(null, "Please Select a Course");
                }
                else{
                    course = jComboBox1.getSelectedItem().toString();
                    exam_id = Integer.parseInt(jComboBox2.getSelectedItem().toString());
                    jTable1.removeAll();
                    g4.getEnrolledStudents(jTable1,exam_id, course);
                }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int r = jTable1.getSelectedRow();
        
        id = jTable1.getValueAt(r, 0).toString();
        //JOptionPane.showMessageDialog(null, id);
        jLabel4.setText(id);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jLabel4.getText()!=""||jTextField2.getText()!=""){
            String grade = jTextField2.getText();

            int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to assign?");

            if(x==0){
                g4.assignGrades(id, grade, course, exam_id);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Please Select a Student and Enter the Grade");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
