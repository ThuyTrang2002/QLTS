/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;
/**
 *
 * @author Viet
 */
public class AdminUI extends javax.swing.JFrame {

    /**
     * Creates new form AdminUI
     */
    
    private ManagementStudentPanel mmStudent = null; // Khai báo panel quản lý sinh viên
    private HomePanel homePanel = null; // Khai báo panel trang chủ
    public static boolean changePassed = false; // Khai báo biến kiểm tra đã nhấn đổi mật khẩu chưa
    
    public AdminUI() {
        initComponents();
        setExtendedState(AdminUI.MAXIMIZED_BOTH); // Thiết lập độ dài tối đa cho màn hình
        if(homePanel == null) { // Kiểm tra nếu chưa có tab Home panel thì khởi tạo
            homePanel = new HomePanel();
            tbpAdmin.addTab("Trang chủ", homePanel); // Thêm Home panel vào tab
        }
        
        tbpAdmin.setSelectedComponent(homePanel); // Thiết lập tab đang chọn là home panel
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnLogout = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnHome = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnManagementStudent = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnExit = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        tbpAdmin = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuChangePassword = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuLogout = new javax.swing.JMenuItem();
        jMenu_1 = new javax.swing.JMenu();
        mnuManagementStudent = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuManagementTargets = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMIN");

        jToolBar1.setRollover(true);

        btnLogout.setBackground(new java.awt.Color(242, 242, 242));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/Log Out_32x32.png"))); // NOI18N
        btnLogout.setText("Đăng xuất");
        btnLogout.setFocusable(false);
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.setMargin(new java.awt.Insets(5, 15, 5, 15));
        btnLogout.setMaximumSize(new java.awt.Dimension(125, 70));
        btnLogout.setMinimumSize(new java.awt.Dimension(125, 70));
        btnLogout.setPreferredSize(new java.awt.Dimension(125, 70));
        btnLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLogout);
        jToolBar1.add(jSeparator3);

        btnHome.setBackground(new java.awt.Color(242, 242, 242));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/home2.png"))); // NOI18N
        btnHome.setText("Trang chủ");
        btnHome.setFocusable(false);
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome.setMargin(new java.awt.Insets(5, 15, 5, 15));
        btnHome.setMaximumSize(new java.awt.Dimension(125, 70));
        btnHome.setMinimumSize(new java.awt.Dimension(125, 70));
        btnHome.setPreferredSize(new java.awt.Dimension(125, 70));
        btnHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHome);
        jToolBar1.add(jSeparator4);

        btnManagementStudent.setBackground(new java.awt.Color(242, 242, 242));
        btnManagementStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/10207-man-student-light-skin-tone-icon-32.png"))); // NOI18N
        btnManagementStudent.setText("Quản lý thí sinh");
        btnManagementStudent.setFocusable(false);
        btnManagementStudent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnManagementStudent.setMargin(new java.awt.Insets(5, 15, 5, 15));
        btnManagementStudent.setMaximumSize(new java.awt.Dimension(125, 70));
        btnManagementStudent.setMinimumSize(new java.awt.Dimension(125, 70));
        btnManagementStudent.setPreferredSize(new java.awt.Dimension(125, 70));
        btnManagementStudent.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnManagementStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagementStudentActionPerformed(evt);
            }
        });
        jToolBar1.add(btnManagementStudent);
        jToolBar1.add(jSeparator5);

        btnExit.setBackground(new java.awt.Color(242, 242, 242));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/Delete_32x32.png"))); // NOI18N
        btnExit.setText("Thoát");
        btnExit.setFocusable(false);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setMargin(new java.awt.Insets(5, 15, 5, 15));
        btnExit.setMaximumSize(new java.awt.Dimension(125, 70));
        btnExit.setMinimumSize(new java.awt.Dimension(125, 70));
        btnExit.setPreferredSize(new java.awt.Dimension(125, 70));
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExit);

        tbpAdmin.setBackground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator6)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
            .addComponent(tbpAdmin)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbpAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/Settings_16x16.png"))); // NOI18N
        jMenu1.setText("Cài đặt");

        mnuChangePassword.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuChangePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/gpa-icon-24.png"))); // NOI18N
        mnuChangePassword.setText("Đổi mật khẩu");
        mnuChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuChangePasswordActionPerformed(evt);
            }
        });
        jMenu1.add(mnuChangePassword);
        jMenu1.add(jSeparator1);

        mnuLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/logout-icon-16.png"))); // NOI18N
        mnuLogout.setText("Đăng xuất");
        mnuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLogoutActionPerformed(evt);
            }
        });
        jMenu1.add(mnuLogout);

        jMenuBar1.add(jMenu1);

        jMenu_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/Folder_16x16.png"))); // NOI18N
        jMenu_1.setText("Quản lý");

        mnuManagementStudent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnuManagementStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/10207-man-student-light-skin-tone-icon-16.png"))); // NOI18N
        mnuManagementStudent.setText("Quản lý thí sinh");
        mnuManagementStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManagementStudentActionPerformed(evt);
            }
        });
        jMenu_1.add(mnuManagementStudent);
        jMenu_1.add(jSeparator2);

        mnuManagementTargets.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuManagementTargets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/icontexto-webdev-site-map-016x016.png"))); // NOI18N
        mnuManagementTargets.setText("Quản lý chỉ tiêu");
        mnuManagementTargets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManagementTargetsActionPerformed(evt);
            }
        });
        jMenu_1.add(mnuManagementTargets);

        jMenuBar1.add(jMenu_1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // ====================================================================== //
    // ================== Sự kiện nút thay đổi mật khẩu ===================== //
    // ====================================================================== //
    private void mnuChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuChangePasswordActionPerformed
        // TODO add your handling code here:
        changePassed = true; // Thiết lập trạng thái là đã nhấn nút thay đổi mật khẩu
        ChangePasswordDialog changePass = new ChangePasswordDialog(this, true); // Tạo và gọi đến dialog thay đổi pass
        changePass.setVisible(true); // Thiết lập hiển thị hộp dialog
    }//GEN-LAST:event_mnuChangePasswordActionPerformed

    // ====================================================================== //
    // ==================== Sự kiện nút đăng xuất =========================== //
    // ====================================================================== //
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        LoginDialog loginDialog = new LoginDialog(this, true); // Tạo ra giao diện đăng nhập
        this.setVisible(false); // Đóng giao diện hiện tại
        loginDialog.setVisible(true); // Thiết lập hiển thị giao diện đăng nhập
    }//GEN-LAST:event_btnLogoutActionPerformed

    // ====================================================================== //
    // ===================== Tool bar thoát ================================= //
    // ====================================================================== //
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    // ====================================================================== //
    // =================== Menu quản lý thí sinh ============================ //
    // ====================================================================== //
    private void mnuManagementStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManagementStudentActionPerformed
        // TODO add your handling code here:
        // Tương tự line 20
        if(mmStudent == null){
            mmStudent = new ManagementStudentPanel();
            tbpAdmin.addTab("Quản lý thí sinh", mmStudent);
        }
        mmStudent.loadTable();
        tbpAdmin.setSelectedComponent(mmStudent);
    }//GEN-LAST:event_mnuManagementStudentActionPerformed

    // ====================================================================== //
    // ==================== Tool bar quản lý thí sinh ======================= //
    // ====================================================================== //
    private void btnManagementStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagementStudentActionPerformed
        // TODO add your handling code here:
        // Tương tự line 20
        if(mmStudent == null){
            mmStudent = new ManagementStudentPanel();
            tbpAdmin.addTab("Quản lý thí sinh", mmStudent);
        }
        mmStudent.loadTable();
        tbpAdmin.setSelectedComponent(mmStudent);
    }//GEN-LAST:event_btnManagementStudentActionPerformed

    // ====================================================================== //
    // ================== Sự kiện quản lý chỉ tiêu ========================== //
    private void mnuManagementTargetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManagementTargetsActionPerformed
        // TODO add your handling code here:
        // Tương tự line 226
        ManagementTargetDialog mmTarget = new ManagementTargetDialog(this, true);
        mmTarget.setVisible(true);
    }//GEN-LAST:event_mnuManagementTargetsActionPerformed

    // ====================================================================== //
    // ====================== Sự kiện menu đăng xuất ======================== //
    // ====================================================================== //
    private void mnuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLogoutActionPerformed
        // TODO add your handling code here:
        // Same nút đăng xuất
        LoginDialog loginDialog = new LoginDialog(this, true);
        this.setVisible(false);
        loginDialog.setVisible(true);
    }//GEN-LAST:event_mnuLogoutActionPerformed

    // ====================================================================== //
    // ======================= Sự kiện nút home ============================= //
    // ====================================================================== //
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        // Same line 20
        if(homePanel == null) {
            homePanel = new HomePanel();
            tbpAdmin.addTab("Trang chủ", homePanel);
        } else {
            homePanel.load();
        }
        tbpAdmin.setSelectedComponent(homePanel);
    }//GEN-LAST:event_btnHomeActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AdminUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManagementStudent;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenu_1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuItem mnuChangePassword;
    private javax.swing.JMenuItem mnuLogout;
    private javax.swing.JMenuItem mnuManagementStudent;
    private javax.swing.JMenuItem mnuManagementTargets;
    private javax.swing.JTabbedPane tbpAdmin;
    // End of variables declaration//GEN-END:variables
}
