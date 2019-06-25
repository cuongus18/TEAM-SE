/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2.bai182;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Minh
 */
public class HuongDanLapTrinhSwing extends javax.swing.JFrame {

    List<Student> studentList = new ArrayList<>();

    DefaultTableModel tableModel;

    int currentIndex = -1;

    public HuongDanLapTrinhSwing() {
        initComponents();
        tableModel = (DefaultTableModel) tblStudentList.getModel();

        loadStudentFromData();
        displayAllStudentTable();
    }

    private void loadStudentFromData() {
        try {
            studentList.clear();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bt182", "root", "");

            String sql = "select * from student";

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                int no = result.getInt("stdNo");
                String fName = result.getString("fullname");
                String sex = result.getString("gender");
                int age = result.getInt("age");
                String email = result.getString("email");
                String phonenumber = result.get String("phonenumber");

                Student std = new Student(no, fName, sex, age, email, phonenumber);
                studentList.add(std);
            }

            statement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(HuongDanLapTrinhSwing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void displayAllStudentTable() {
        tableModel.setRowCount(0);

        for (Student student : studentList) {
            tableModel.addRow(new Object[]{tableModel.getRowCount() + 1, student.getFullName(), student.getGender(), student.getAge(), student.getEmail(), student.getPhoneNumber()});
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_fullname = new javax.swing.JTextField();
        txt_age = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_phonenumber = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_find = new javax.swing.JButton();
        cb_gender = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Nhap Thong Tin Sinh Vien", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(0, 204, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Full Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Gender");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Age:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Phone Number:");

        txt_fullname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_age.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        txt_phonenumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btn_save.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_reset.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_delete.setText("Delete");

        btn_find.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_find.setText("Find");

        cb_gender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cb_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Male", "Female", "Other" }));
        cb_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_genderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_save)
                                .addGap(18, 18, 18)
                                .addComponent(btn_reset)
                                .addGap(18, 18, 18)
                                .addComponent(btn_delete)
                                .addGap(18, 18, 18)
                                .addComponent(btn_find))
                            .addComponent(txt_phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save)
                    .addComponent(btn_reset)
                    .addComponent(btn_delete)
                    .addComponent(btn_find))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        tblStudentList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Full Name", "Gender", "Age", "Email", "Phone Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblStudentList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        txt_fullname.setText("");
        txt_age.setText("");
        txt_email.setText("");
        txt_phonenumber.setText("");
        cb_gender.setSelectedIndex(0);
    }//GEN-LAST:event_btn_resetActionPerformed

    private void cb_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_genderActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

        String fullname = txt_fullname.getText().toString();
        String gender = cb_gender.getSelectedItem().toString();
        int age = Integer.parseInt(txt_age.getText().toString());
        String email = txt_email.getText().toString();
        String phonenumber = txt_phonenumber.getText().toString();

        if (fullname.isEmpty() || email.isEmpty() || phonenumber.isEmpty() || gender.isEmpty() || age < 0) {
            JOptionPane.showMessageDialog(rootPane, "Nhap sai hoac thieu, vui long nhap lai!!!");
            return;
        }

        Student std = null;
        if (currentIndex == -1) {
            std = new Student(0, fullname, gender, age, email, phonenumber);
        } else {
            std = studentList.get(currentIndex);
            std.setFullName(fullname);
            std.setGender(gender);
            std.setAge(age);
            std.setEmail(email);
            std.setPhoneNumber(phonenumber);
        }
        currentIndex = -1;

        insert(std);
    }//GEN-LAST:event_btn_saveActionPerformed

    private void insert(Student std) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bt182", "root", "");

            String sql = "";
            if (std.getNo() > 0) {
                sql = "update student set fullname = ?, gender = ?, age = ?, email = ?, phonenumber = ? where stdNo =" + std.getNo();
            } else {
                sql = "insert into student(fullname, gender, age, email, phonenumber) values (?, ?, ?, ?, ?)";
            }

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, std.getFullName());
            statement.setString(2, std.getGender());
            statement.setInt(3, std.getAge());
            statement.setString(4, std.getEmail());
            statement.setString(5, std.getPhoneNumber());

            statement.execute();

            statement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(HuongDanLapTrinhSwing.class.getName()).log(Level.SEVERE, null, ex);
        }

        loadStudentFromData();
        displayAllStudentTable();
    }

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
            java.util.logging.Logger.getLogger(HuongDanLapTrinhSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HuongDanLapTrinhSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HuongDanLapTrinhSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HuongDanLapTrinhSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HuongDanLapTrinhSwing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_find;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox<String> cb_gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStudentList;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fullname;
    private javax.swing.JTextField txt_phonenumber;
    // End of variables declaration//GEN-END:variables
}
