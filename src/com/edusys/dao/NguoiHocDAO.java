/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.DomainModels.NguoiHoc;
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
public class NguoiHocDAO extends EduSysDAOO<NguoiHoc, String>{

    String insert ="INSERT INTO NGUOIHOC\n" +
"                         (MANH, HOTEN, NGAYSINH, GIOITINH, DIENTHOAI, EMAIL, GHICHU, MANV, NGAYDK)\n" +
"VALUES        (?,?,?,?,?,?,?,?,?)";
    String update ="UPDATE       NGUOIHOC\n" +
"SET                HOTEN =, NGAYSINH =, GIOITINH =, DIENTHOAI =, EMAIL =, GHICHU =, MANV =, NGAYDK =\n" +
"WHERE        (MANH = ?)";
    String selectALL ="SELECT * FROM dbo.NGUOIHOC";
    String selectByID ="SELECT        MANH, HOTEN, NGAYSINH, GIOITINH, DIENTHOAI, EMAIL, GHICHU, MANV, NGAYDK\n" +
"FROM            NGUOIHOC\n" +
"WHERE        (MANH = ?)";
    String delete ="DELETE FROM NGUOIHOC\n" +
"WHERE        (MANH = ?)";
    @Override
    public void ensert(NguoiHoc entity) {
        DBConnext.update(insert, entity.getMaNH(), entity.getHoTen(), entity.getNgaySinh(), entity.getGioiTinh(), entity.getDienThoai(), entity.getEmail(), entity.getGhiChu(), entity.getMaNV(), entity.getNgayDK());
    }

    @Override
    public void update(NguoiHoc entity) {
        DBConnext.update(update,entity.getHoTen(), entity.getNgaySinh(), entity.getGioiTinh(), entity.getDienThoai(), entity.getEmail(), entity.getGhiChu(), entity.getMaNV(), entity.getNgayDK(),entity.getMaNH());
    }

    @Override
    public void delete(String key) {
        DBConnext.update(delete, key);
    }

    @Override
    public List<NguoiHoc> selectAll() {
        return selectBySql(selectALL);
    }

    @Override
    public NguoiHoc selectById(String key) {
        List<NguoiHoc> list = selectBySql(selectByID, key);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NguoiHoc> selectBySql(String sql, Object... args) {
        List<NguoiHoc> list = new ArrayList<>();
        try {
            
            ResultSet rs = DBConnext.query(sql, args);
            while (rs.next()) {
                NguoiHoc nh = new NguoiHoc();
                nh.setMaNH(rs.getString("MANH"));
                nh.setHoTen(rs.getString("HOTEN"));
                nh.setNgaySinh(rs.getDate("ngaySINH"));
                nh.setGioiTinh(rs.getBoolean("GioiTinh"));
                nh.setDienThoai(rs.getString("DIENTHOAI"));
                nh.setEmail(rs.getString("EMAIL"));
                nh.setGhiChu(rs.getString("GHICHU"));
                nh.setMaNV(rs.getString("MANV"));
                nh.setNgayDK(rs.getDate("NGAYDK"));
                list.add(nh);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(NguoiHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public  List<NguoiHoc> selectByName(String name){
        String  sql = "SELECT * FROM dbo.NGUOIHOC WHERE HOTEN LIKE ?";
        return selectBySql(sql,"%"+name+"%");
    }
    public  List<NguoiHoc> selectNotInCours(int makh,String name){
        String  sql = "SELECT * FROM dbo.NGUOIHOC WHERE HOTEN LIKE ? AND MANH NOT IN (SELECT MANH FROM dbo.HOCVIEN WHERE MAKH=?)";
        return selectBySql(sql,"%"+name+"%",makh);
    }
    
}
