/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.codejava.swing.Subject;

import net.codejava.swing.lecturerDetails.HomeLecturers;

/**
 *
 * @author  Jayagoda N.M.  -  IT17184304
 */
public class HomeSubjects extends javax.swing.JFrame {

    /**
     * Creates new form HomeSubjects
     */
    public HomeSubjects() {
        initComponents();
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
        btn_lecturerTab = new javax.swing.JButton();
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
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_viewSubjects = new javax.swing.JButton();
        btn_addSubject = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1600, 1000));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/codejava/images/icons8-group-of-projects-50.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 770, -1, -1));

        btn_statisticsTab.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        btn_statisticsTab.setText("Statistics");
        btn_statisticsTab.setFocusPainted(false);
        btn_statisticsTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_statisticsTabActionPerformed(evt);
            }
        });
        jPanel1.add(btn_statisticsTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 420, 90));

        jLabel4.setBackground(new java.awt.Color(153, 102, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/codejava/images/icons8-lecturer-50.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 50, 60));

        btn_lecturerTab.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        btn_lecturerTab.setText("Lectures");
        btn_lecturerTab.setFocusPainted(false);
        btn_lecturerTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lecturerTabActionPerformed(evt);
            }
        });
        jPanel1.add(btn_lecturerTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 420, 90));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/codejava/images/icons8-student-registration-50.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        btn_studentTab.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        btn_studentTab.setText("Students");
        btn_studentTab.setFocusPainted(false);
        btn_studentTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_studentTabActionPerformed(evt);
            }
        });
        jPanel1.add(btn_studentTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 420, 90));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/codejava/images/icons8-love-book-50.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        btn_subjectTab.setBackground(new java.awt.Color(255, 51, 102));
        btn_subjectTab.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        btn_subjectTab.setText("Subjects");
        btn_subjectTab.setFocusPainted(false);
        btn_subjectTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subjectTabActionPerformed(evt);
            }
        });
        jPanel1.add(btn_subjectTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 420, 90));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/codejava/images/icons8-calendar-10-50.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, -1, -1));

        btn_workingDaysTab.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        btn_workingDaysTab.setText("       Working days");
        btn_workingDaysTab.setFocusPainted(false);
        btn_workingDaysTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_workingDaysTabActionPerformed(evt);
            }
        });
        jPanel1.add(btn_workingDaysTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 420, 90));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/codejava/images/icons8-location-64.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 680, -1, 60));

        btn_locationTab.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        btn_locationTab.setText("Location");
        btn_locationTab.setFocusPainted(false);
        btn_locationTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_locationTabActionPerformed(evt);
            }
        });
        jPanel1.add(btn_locationTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 420, 90));

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

        btn_viewSubjects.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_viewSubjects.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/codejava/images/icons8-new-view-100.png"))); // NOI18N
        btn_viewSubjects.setText("View Subject Details");
        btn_viewSubjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewSubjectsActionPerformed(evt);
            }
        });
        jPanel3.add(btn_viewSubjects, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 490, 390, 240));

        btn_addSubject.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_addSubject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/codejava/images/icons8-add-book-100.png"))); // NOI18N
        btn_addSubject.setText("Add Subject Details");
        btn_addSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addSubjectActionPerformed(evt);
            }
        });
        jPanel3.add(btn_addSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 390, 240));

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

    private void btn_statisticsTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_statisticsTabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_statisticsTabActionPerformed

    private void btn_lecturerTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lecturerTabActionPerformed
        // TODO add your handling code here:
        this.dispose();
        HomeLecturers wnd_HOmeLecturer = new HomeLecturers();
        wnd_HOmeLecturer.setVisible(true);
    }//GEN-LAST:event_btn_lecturerTabActionPerformed

    private void btn_studentTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_studentTabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_studentTabActionPerformed

    private void btn_subjectTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subjectTabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_subjectTabActionPerformed

    private void btn_workingDaysTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_workingDaysTabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_workingDaysTabActionPerformed

    private void btn_locationTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_locationTabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_locationTabActionPerformed

    private void btn_viewSubjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewSubjectsActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ViewSubject wnd_viewSubjectDetails = new ViewSubject();
        wnd_viewSubjectDetails.setVisible(true);
    }//GEN-LAST:event_btn_viewSubjectsActionPerformed

    private void btn_addSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addSubjectActionPerformed
        // TODO add your handling code here:
        this.dispose();
        AddSubject wnd_addSubject = new AddSubject();
        wnd_addSubject.setVisible(true);
    }//GEN-LAST:event_btn_addSubjectActionPerformed

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
            java.util.logging.Logger.getLogger(HomeSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeSubjects().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addSubject;
    private javax.swing.JButton btn_lecturerTab;
    private javax.swing.JButton btn_locationTab;
    private javax.swing.JButton btn_statisticsTab;
    private javax.swing.JButton btn_studentTab;
    private javax.swing.JButton btn_subjectTab;
    private javax.swing.JButton btn_viewSubjects;
    private javax.swing.JButton btn_workingDaysTab;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
