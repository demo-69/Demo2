/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.ui;

import com.edusys.DomainModels.ChuyenDe;
import com.edusys.dao.ChuyenDeDAO;
import com.edusys.utils.MsgBox;
import com.edusys.utils.XImage;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author huyki
 */
public class QLChuyenDeJFrame extends javax.swing.JFrame {

    /**
     * Creates new form QLChuyenDeJFrame
     */
    DefaultTableModel model;
    public QLChuyenDeJFrame() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblAnh = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaCD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTenCD = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtThoiLuong = new javax.swing.JTextField();
        txtHocPhi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnmoi = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblChuyenDe = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("QUẢN LÝ CHUYÊN ĐỀ");

        jLabel2.setText("Hình logo");

        lblAnh.setText("jLabel3");
        lblAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnhMouseClicked(evt);
            }
        });

        jLabel4.setText("Mã chuyên đề");

        jLabel5.setText("Tên chuyên đề");

        jLabel6.setText("Học phí");

        jLabel7.setText("Mô tả chuyên đề");

        jLabel8.setText("Thời lượng ( giờ )");

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane1.setViewportView(txtMoTa);

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

        btnmoi.setText("Mới");
        btnmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoiActionPerformed(evt);
            }
        });

        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(lblAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaCD)
                                    .addComponent(txtTenCD)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel8))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtThoiLuong)
                                    .addComponent(txtHocPhi)))
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(btnThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnmoi)
                .addGap(66, 66, 66)
                .addComponent(btnFirst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLast)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMaCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTenCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAnh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnmoi)
                    .addComponent(btnFirst)
                    .addComponent(btnPrev)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("CẬP NHẬP", jPanel1);

        tblChuyenDe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã CD", "Tên CD", "Học Phí", "Thời Lượng", "Hình"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChuyenDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChuyenDeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblChuyenDe);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("DANH SÁCH", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnhMouseClicked
        // TODO add your handling code here:
        this.chonAnh();
    }//GEN-LAST:event_lblAnhMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoiActionPerformed
        // TODO add your handling code here:
        clearFrom();
    }//GEN-LAST:event_btnmoiActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void tblChuyenDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChuyenDeMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2){
            row = tblChuyenDe.getSelectedRow();
            edit();
        }
    }//GEN-LAST:event_tblChuyenDeMouseClicked

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
            java.util.logging.Logger.getLogger(QLChuyenDeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLChuyenDeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLChuyenDeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLChuyenDeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLChuyenDeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnmoi;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblChuyenDe;
    private javax.swing.JTextField txtHocPhi;
    private javax.swing.JTextField txtMaCD;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtTenCD;
    private javax.swing.JTextField txtThoiLuong;
    // End of variables declaration//GEN-END:variables
    void chonAnh(){
        if(fileChooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            XImage.save(file);//lưu hình vào thư mục logos
            ImageIcon icon = XImage.read(file.getName());//đọc hình từ logos
            lblAnh.setIcon(icon);
            lblAnh.setToolTipText(file.getName());
        }
    }
    ChuyenDeDAO dao = new ChuyenDeDAO();
    int row =-1;
    void init(){
        setLocationRelativeTo(null);
        row = -1;
        fillTable();
        updateStatus();
    }
    void fillTable(){
        model = (DefaultTableModel) tblChuyenDe.getModel();
        model.setRowCount(0);//xóa tất cả các hàng trên table
        try {
            List<ChuyenDe> list = dao.selectAll();//đọc dữ liệu từ data
            for(ChuyenDe x : list){
                model.addRow(new Object[]{x.getMaCD(),x.getTenCD(),x.getHocPhi(),x.getThoiLuong(),x.getHinh()});
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }
    ChuyenDe getForm(){
        ChuyenDe nv = new ChuyenDe();
        nv.setMaCD(txtMaCD.getText());
        nv.setTenCD(txtTenCD.getText());
        nv.setHocPhi( Float.valueOf(txtHocPhi.getText()));
        nv.setThoiLuong( Integer.valueOf(txtThoiLuong.getText()));
        nv.setHinh(lblAnh.getToolTipText());
        nv.setMoTa(txtMoTa.getText());
        
        return nv;
    }
    void setFrom(ChuyenDe nv){
        txtMaCD.setText(nv.getMaCD());
        txtHocPhi.setText(String.valueOf(nv.getHocPhi()));
        txtMoTa.setText(nv.getMoTa());
        txtTenCD.setText(nv.getTenCD());
        txtThoiLuong.setText(String.valueOf(nv.getThoiLuong()));
        if(nv.getHinh()!=null){
            lblAnh.setToolTipText(nv.getHinh());
            lblAnh.setIcon(XImage.read(nv.getHinh()));
        }
    }
    void clearFrom(){
        ChuyenDe nv = new ChuyenDe();
        setFrom(nv);
        row =-1;
        updateStatus();
    }
    void edit(){
        String manv = (String) tblChuyenDe.getValueAt(row, 0);
        ChuyenDe nv = dao.selectById(manv);
        setFrom(nv);
        tabs.setSelectedIndex(0);//khi click ở table thì hiện sang tap con index 0 sang from
        updateStatus();
    }
    void insert(){
        ChuyenDe nv = getForm();
        if(nv!=null){
            dao.ensert(nv);
                fillTable();
                clearFrom();
                MsgBox.alert(this, "Thêm thành công");
        }else{
             MsgBox.alert(this, "Thêm thất bại");
        }
        
           
    }
    void update(){
        ChuyenDe nv = getForm();
        
            try {
                dao.update(nv);
                fillTable();
                clearFrom();
                MsgBox.alert(this, "Cập nhập thành công");
            } catch (Exception e) {
                MsgBox.alert(this, "Cập nhập thất bại");
            }
        
    }
    void delete(){
        String macd = txtMaCD.getText();
            if(MsgBox.confirm(this, "Bạn có chắc muốn xóa nhân viên này?")){
                try {
                    dao.delete(macd);
                    fillTable();
                    clearFrom();
                    MsgBox.alert(this, "Xóa thành công!");
                } catch (Exception e) {
                    MsgBox.alert(this, "Xóa thất bại!");
                }
 
            }
        
    }
    
    //Các nút điều hướng
    void first(){
        row =0;
        edit();
    }
    void next(){
        if(row < tblChuyenDe.getRowCount()-1){
            row++;
            edit();
        }
    }
    void prev(){
        if(row>0){
            row--;
            edit();
        }
    }
    void last(){
        row = tblChuyenDe.getRowCount()-1;
        edit();
    }
    //Cập nhập trạng thái from
    void updateStatus(){
        boolean edit = (row>=0);
        boolean first = (row==0);
        boolean last = (row==tblChuyenDe.getRowCount()-1);
        //trạng thái from
        txtMaCD.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
        //trạng thái điều hướng
        btnFirst.setEnabled(edit&&!first);
        btnPrev.setEnabled(edit&&!first);
        btnNext.setEnabled(edit&&!last);
        btnLast.setEnabled(edit&&!last);
    }
}
