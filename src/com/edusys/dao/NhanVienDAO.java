/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.DomainModels.NhanVien;
import com.edusys.utility.DBConnext;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class NhanVienDAO extends EduSysDAOO<NhanVien, String>{
    String insert = "INSERT INTO NHANVIEN\n" +
"                         (MANV, MATKHAU, HOTEN, VAITRO)\n" +
"VALUES        (?, ?, ?, ?)";
    String update = "UPDATE       NHANVIEN\n" +
"SET                MATKHAU =?, HOTEN =?, VAITRO =?\n" +
"WHERE        (MANV =?)";
    String delete ="DELETE FROM NHANVIEN\n" +
"WHERE        (MANV = ?)";
    String all = "SELECT        MANV, MATKHAU, HOTEN, VAITRO\n" +
"FROM            NHANVIEN";
    String selectById = "SELECT        MANV, MATKHAU, HOTEN, VAITRO\n" +
"FROM            NHANVIEN\n" +
"WHERE        (MANV = ?)";
    
    @Override
    public void ensert(NhanVien entity) {
        DBConnext.update(insert, entity.getMaNV(),entity.getMatKhau(),entity.getHoTen(),entity.getVaiTro());
    }

    @Override
    public void update(NhanVien entity) {
        DBConnext.update(update, entity.getMatKhau(),entity.getHoTen(),entity.getVaiTro(),entity.getMaNV());
    }

    @Override
    public void delete(String key) {
        DBConnext.update(delete, key);
    }

    @Override
    public List<NhanVien> selectAll() {
        return selectBySql(all);
    }

    @Override
    public NhanVien selectById(String key) {
        List<NhanVien> lisst = selectBySql(selectById, key);
        //isEmpty()  khi chuỗi trống trả về true, ngược lại trả về false
        if(lisst.isEmpty()){
            return null;
        }
        return lisst.get(0);
    }

    @Override
    public List<NhanVien> selectBySql(String sql, Object... args) {
       List<NhanVien> list = new ArrayList<NhanVien>();
        try {
            ResultSet rs = DBConnext.query(sql,args);
            while (rs.next()) {                
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MANV"));
                nv.setHoTen(rs.getString("HOTEN"));
                nv.setMatKhau(rs.getString("matKhau"));
                nv.setVaiTro(rs.getBoolean("VaiTro"));
                list.add(nv);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
