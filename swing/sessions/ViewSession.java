/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.codejava.swing.sessions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.codejava.swing.Subject.HomeSubjects;
import net.codejava.swing.lecturerDetails.AddLecturer;
import net.codejava.swing.lecturerDetails.HomeLecturers;
import net.codejava.swing.lecturerDetails.ViewLecturer;

/**
 *
 * @author  Jayagoda N.M.  -  IT17184304
 */
public class ViewSession extends javax.swing.JFrame {

    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private String lectures, subject_code, subject_name, tag, student_group_id;
    private int duration, student_count;
    private DefaultTableModel defTableModel;
    /**
     * Creates new form ViewSession
     */
    public ViewSession() {
        initComponents();
        dbconnect();
        showSessionList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btn_statisticsTab = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_studentTab = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btn_subjectTab = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btn_workingDaysTab = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btn_locationTab = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_lecturerTab = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_sessionTab = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_displaySessionDetails = new javax.swing.JTable();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        filter_textField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1600, 1000));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/codejava/images/icons8-group-of-projects-50.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 860, -1, -1));

        btn_statisticsTab.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        btn_statisticsTab.setText("Statistics");
        btn_statisticsTab.setFocusPainted(false);
        btn_statisticsTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_statisticsTabActionPerformed(evt);
            }
        });
        jPanel1.add(btn_statisticsTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 840, 420, 90));

        jLabel4.setBackground(new java.awt.Color(153, 102, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/codejava/images/icons8-lecturer-50.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 50, 60));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/codejava/images/icons8-student-registration-50.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, -1, -1));

        btn_studentTab.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        btn_studentTab.setText("Students");
        btn_studentTab.setFocusPainted(false);
        btn_studentTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_studentTabActionPerformed(evt);
            }
        });
        jPanel1.add(btn_studentTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 420, 90));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/codejava/images/icons8-love-book-50.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        btn_subjectTab.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        btn_subjectTab.setText("Subjects");
        btn_subjectTab.setFocusPainted(false);
        btn_subjectTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subjectTabActionPerformed(evt);
            }
        });
        jPanel1.add(btn_subjectTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 420, 90));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/codejava/images/icons8-calendar-10-50.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 680, -1, -1));

        btn_workingDaysTab.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        btn_workingDaysTab.setText("       Working days");
        btn_workingDaysTab.setFocusPainted(false);
        btn_workingDaysTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_workingDaysTabActionPerformed(evt);
            }
        });
        jPanel1.add(btn_workingDaysTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 420, 90));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/codejava/images/icons8-location-64.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 770, -1, 60));

        btn_locationTab.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        btn_locationTab.setText("Location");
        btn_locationTab.setFocusPainted(false);
        btn_locationTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_locationTabActionPerformed(evt);
            }
        });
        jPanel1.add(btn_locationTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 420, 90));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(177, 122, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DASHBOARD");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 200, 130));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/codejava/images/icons8-home-50.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 70, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 420, 130));

        btn_lecturerTab.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        btn_lecturerTab.setText("Lectures");
        btn_lecturerTab.setFocusPainted(false);
        btn_lecturerTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lecturerTabActionPerformed(evt);
            }
        });
        jPanel1.add(btn_lecturerTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 420, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/codejava/images/icons8-stopwatch-64.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 60, 60));

        btn_sessionTab.setBackground(new java.awt.Color(255, 51, 102));
        btn_sessionTab.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        btn_sessionTab.setText("Sessions");
        btn_sessionTab.setFocusPainted(false);
        btn_sessionTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sessionTabActionPerformed(evt);
            }
        });
        jPanel1.add(btn_sessionTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 420, 90));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 1000));

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 32)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SLIIT - Timetable Management System ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 1230, -1));

        table_displaySessionDetails.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table_displaySessionDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lecturer(s)", "Subject Code", "Subject Name", "Tag", "Student Group ID", "Duration", "Student Count"
            }
        ));
        table_displaySessionDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_displaySessionDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_displaySessionDetails);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 870, 610));

        btn_delete.setBackground(new java.awt.Color(204, 51, 0));
        btn_delete.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel3.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 580, 190, 60));

        btn_update.setBackground(new java.awt.Color(255, 204, 0));
        btn_update.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel3.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 190, 60));

        btn_back.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/codejava/images/icons8-back-40.png"))); // NOI18N
        btn_back.setText(" Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel3.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 160, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/codejava/images/icons8-search-24.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 250, 40, 40));

        filter_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filter_textFieldActionPerformed(evt);
            }
        });
        filter_textField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filter_textFieldKeyReleased(evt);
            }
        });
        jPanel3.add(filter_textField, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 250, 510, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dbconnect(){
        final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
        final String JDBC_URL = "jdbc:derby:unidb;create=true";
        
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(JDBC_URL);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddLecturer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddLecturer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }  
        
    }
    
    public ArrayList<Session> sessionList(){
        ArrayList<Session> sessionList = new ArrayList<>();
        try{
            String query = "SELECT * FROM sessions";
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            
            Session session;
            
            while (rs.next()) {                
                session = new Session( rs.getString("lecturers"), rs.getString("tag"), 
                        rs.getString("subject_name"), rs.getString("subject_code"), 
                        rs.getString("student_group_id"), rs.getInt("duration") , rs.getInt("number_of_students"));
                
                sessionList.add(session);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex + "Exception occured in sessionList method");
            Logger.getLogger(ViewSession.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return sessionList;
    }
    
    public void showSessionList(){
        ArrayList<Session> sessionList = sessionList();
        DefaultTableModel tableModel = (DefaultTableModel) table_displaySessionDetails.getModel();
        Object[] row = new Object[7];
        for (int i = 0; i < sessionList.size(); i++) {
            row[0] = sessionList.get(i).getLecturers();
            row[1] = sessionList.get(i).getSubject_code();
            row[2] = sessionList.get(i).getSubject_name();
            row[3] = sessionList.get(i).getTag();
            row[4] = sessionList.get(i).getStudent_group_id();
            row[5] = sessionList.get(i).getDuration();
            row[6] = sessionList.get(i).getNumber_of_students();
            
            tableModel.addRow(row);
        }
    }
    
    private void table_displaySessionDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_displaySessionDetailsMouseClicked
        // TODO add your handling code here:
        int i = table_displaySessionDetails.getSelectedRow();
        TableModel tableModel = table_displaySessionDetails.getModel();

        lectures = tableModel.getValueAt(i, 0).toString();
        subject_code = tableModel.getValueAt(i, 1).toString();
        subject_name = tableModel.getValueAt(i, 2).toString();
        tag = tableModel.getValueAt(i, 3).toString();
        student_group_id = tableModel.getValueAt(i, 4).toString();
        duration = Integer.parseInt(tableModel.getValueAt(i, 5).toString());
        student_count = Integer.parseInt(tableModel.getValueAt(i, 6).toString());

//        System.out.println(lectures);
//        System.out.println(subject_code);
//        System.out.println(subject_name);
//        System.out.println(tag);
//        System.out.println(student_group_id);
//        System.out.println(duration);
//        System.out.println(student_count);
//        System.out.println("");
    }//GEN-LAST:event_table_displaySessionDetailsMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        int opt = JOptionPane.showConfirmDialog(null, "Are you sure you want to Delete " + tag + " session of "
                + subject_name + " ?", "Delete", JOptionPane.YES_NO_OPTION);

        if (opt == 0) {
            try {
                String query = "DELETE FROM sessions WHERE subject_code = ? and tag = ?";

                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, subject_code);
                preparedStatement.setString(2, tag);

                // execute the preparedstatement
                preparedStatement.execute();

                DefaultTableModel model = (DefaultTableModel) table_displaySessionDetails.getModel();
                model.setRowCount(0);
                this.showSessionList();

                JOptionPane.showMessageDialog(null, "Record deleted successfully from the Database");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong! Please try again.");
                System.err.println("Exception in delete operation : " + ex);
                System.err.println(ex.getMessage());
                Logger.getLogger(ViewLecturer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void filter(String searchKey){
        defTableModel = (DefaultTableModel) table_displaySessionDetails.getModel();
        TableRowSorter<DefaultTableModel> tableSorter = new TableRowSorter<DefaultTableModel>(defTableModel);
        table_displaySessionDetails.setRowSorter(tableSorter);
       
        tableSorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchKey));
    }
    
    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        HomeSessions wnd_homeSession = new HomeSessions();
        wnd_homeSession.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_statisticsTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_statisticsTabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_statisticsTabActionPerformed

    private void btn_studentTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_studentTabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_studentTabActionPerformed

    private void btn_subjectTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subjectTabActionPerformed
        // TODO add your handling code here:
        this.dispose();
        HomeSubjects wnd_homeSubjects = new HomeSubjects();
        wnd_homeSubjects.setVisible(true);
    }//GEN-LAST:event_btn_subjectTabActionPerformed

    private void btn_workingDaysTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_workingDaysTabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_workingDaysTabActionPerformed

    private void btn_locationTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_locationTabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_locationTabActionPerformed

    private void btn_lecturerTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lecturerTabActionPerformed
        // TODO add your handling code here:
        this.dispose();
        HomeLecturers wnd_homeLecturer = new HomeLecturers();
        wnd_homeLecturer.setVisible(true);
    }//GEN-LAST:event_btn_lecturerTabActionPerformed

    private void btn_sessionTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sessionTabActionPerformed
        // TODO add your handling code here:
        this.dispose();
        HomeSessions wnd_homeSessions = new HomeSessions();
        wnd_homeSessions.setVisible(true);
    }//GEN-LAST:event_btn_sessionTabActionPerformed

    private void filter_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filter_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filter_textFieldActionPerformed

    private void filter_textFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filter_textFieldKeyReleased
        // TODO add your handling code here:
        String searchKey = filter_textField.getText().toString();
        filter(searchKey);
    }//GEN-LAST:event_filter_textFieldKeyReleased

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
            java.util.logging.Logger.getLogger(ViewSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSession().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_lecturerTab;
    private javax.swing.JButton btn_locationTab;
    private javax.swing.JButton btn_sessionTab;
    private javax.swing.JButton btn_statisticsTab;
    private javax.swing.JButton btn_studentTab;
    private javax.swing.JButton btn_subjectTab;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_workingDaysTab;
    private javax.swing.JTextField filter_textField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_displaySessionDetails;
    // End of variables declaration//GEN-END:variables
}
