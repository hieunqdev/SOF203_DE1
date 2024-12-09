package View;

import Model.KhachHang;
import DAO.KhachHangDAO;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class MainForm extends javax.swing.JFrame {
    String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=SOF203_DE1;"
                + "user=sa;password=1234;instanceName=Admin\\SQLEXPRESS;encrypt=true;"
                + "trustServerCertificate=true";

    public MainForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDiaChi = new javax.swing.JTextArea();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableKhachHang = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnHienThi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã KH");

        jLabel2.setText("Tên KH");

        jLabel3.setText("Email");

        jLabel4.setText("Địa chỉ");

        txtAreaDiaChi.setColumns(20);
        txtAreaDiaChi.setRows(5);
        jScrollPane1.setViewportView(txtAreaDiaChi);

        jLabel5.setText("Giới tính");

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        tableKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã KH", "Tên KH", "Địa chỉ", "Email", "Giới tính"
            }
        ));
        jScrollPane2.setViewportView(tableKhachHang);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("QUẢN LÝ KHÁCH HÀNG");

        btnHienThi.setText("Hiển thị");
        btnHienThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienThiActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(35, 35, 35)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnHienThi)
                                .addGap(62, 62, 62)
                                .addComponent(btnThem)))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSua)
                                .addGap(52, 52, 52)
                                .addComponent(btnXoa))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdoNam)
                                            .addComponent(rdoNu)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rdoNam))
                        .addGap(18, 18, 18)
                        .addComponent(rdoNu)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHienThi)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHienThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienThiActionPerformed
        // TODO add your handling code here:
        try (Connection con = DriverManager.getConnection(connectionUrl)) {
            KhachHangDAO khachHangDAO = new KhachHangDAO(con);
            List<KhachHang> khachHangLst = khachHangDAO.readKhachHang();
            
            DefaultTableModel tableStudent = (DefaultTableModel) this.tableKhachHang.getModel();
            tableStudent.setRowCount(0);
            
            for (KhachHang khachHang : khachHangLst) {
                tableStudent.addRow(new Object[] {
                    khachHang.getMaKH(),
                    khachHang.getTenKH(),
                    khachHang.getDiaChi(),
                    khachHang.getEmail(),
                    khachHang.isGioiTinh()? "Nam" : "Nữ",
                });
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHienThiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        try (Connection con = DriverManager.getConnection(connectionUrl)) {
            String MaKH = txtMaKH.getText();
            String TenKH = txtTenKH.getText();
            String DiaChi = txtAreaDiaChi.getText();
            String Email = txtEmail.getText();
            boolean GioiTinh = rdoNam.isSelected();
            
            if (MaKH.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ma khach hang khong duoc de trong");
                return;
            } 
            if (TenKH.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ten khach hang khong duoc de trong");
                return;
            }
            if (DiaChi.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Dia chi khong duoc de trong");
                return;
            } 
            if (Email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Email khong duoc de trong");
                return;
            }
            if (!rdoNam.isSelected() && !rdoNu.isSelected()) {
                JOptionPane.showMessageDialog(this, "Gioi tinh chua duoc chon");
                return;
            }
            
            KhachHangDAO khachHangDAO = new KhachHangDAO(con);
            KhachHang khachHang = new KhachHang(MaKH, TenKH, DiaChi, Email, GioiTinh);
            int ketQua = khachHangDAO.createKhachHang(khachHang);
            
            if (ketQua == 1) {
                JOptionPane.showMessageDialog(this, "Tao thanh cong");
            } else {
                JOptionPane.showMessageDialog(this, "That bai");
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        try (Connection con = DriverManager.getConnection(connectionUrl)) {
            String MaKH = txtMaKH.getText();
            String TenKH = txtTenKH.getText();
            String DiaChi = txtAreaDiaChi.getText();
            String Email = txtEmail.getText();
            boolean GioiTinh = rdoNam.isSelected();
            
            if (MaKH.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ma khach hang khong duoc de trong");
                return;
            } 
            if (TenKH.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ten khach hang khong duoc de trong");
                return;
            }
            if (DiaChi.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Dia chi khong duoc de trong");
                return;
            } 
            if (Email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Email khong duoc de trong");
                return;
            }
            if (!rdoNam.isSelected() && !rdoNu.isSelected()) {
                JOptionPane.showMessageDialog(this, "Gioi tinh chua duoc chon");
                return;
            }
            
            KhachHangDAO khachHangDAO = new KhachHangDAO(con);
            KhachHang khachHang = new KhachHang(MaKH, TenKH, DiaChi, Email, GioiTinh);
            
            int ketQua = khachHangDAO.updateKhachHang(khachHang);
            if (ketQua == 1) {
                JOptionPane.showMessageDialog(this, "Sua thanh cong");
            } else {
                JOptionPane.showMessageDialog(this, "That bai");
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        try (Connection con = DriverManager.getConnection(connectionUrl)) {
            String MaKH = txtMaKH.getText();
            
            if (MaKH.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ma khach hang khong duoc de trong");
                return;
            } 
            
            KhachHangDAO khachHangDAO = new KhachHangDAO(con);
            
            int ketQua = khachHangDAO.deleteKhachHang(MaKH);
            if (ketQua == 1) {
                JOptionPane.showMessageDialog(this, "Xoa thanh cong");
            } else {
                JOptionPane.showMessageDialog(this, "That bai");
            }
            
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHienThi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tableKhachHang;
    private javax.swing.JTextArea txtAreaDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables
}
