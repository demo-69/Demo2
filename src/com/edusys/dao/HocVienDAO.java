/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.DomainModels.HocVien;
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
public class HocVienDAO extends EduSysDAOO<HocVien, String>{

    String insert = "INSERT INTO HOCVIEN\n" +
"                         (MAHV, MAKH, MANH, DIEM)\n" +
"VALUES        (?,?,?,?)";
    String update = "UPDATE       HOCVIEN\n" +
"SET                MAKH =?, MANH =?, DIEM =?\n" +
"WHERE        (MAHV = ?)";
    String delete = "DELETE FROM HOCVIEN\n" +
"WHERE        (MAHV = ?)";
    String selectAll = "SELECT        MAHV, MAKH, MANH, DIEM\n" +
"FROM            HOCVIEN";
    String selectByID = "SELECT        MAHV, MAKH, MANH, DIEM\n" +
"FROM            HOCVIEN\n" +
"WHERE        (MAHV = ?)";
    
    @Override
    public void ensert(HocVien entity) {
        DBConnext.update(insert, entity.getMaHV(), entity.getMaKH(), entity.getMaNH(), entity.getDiem());
    }

    @Override
    public void update(HocVien entity) {
        DBConnext.update(update, entity.getMaKH(), entity.getMaNH(), entity.getDiem(),entity.getMaHV());
    }

    @Override
    public void delete(String key) {
        DBConnext.update(delete, key);
    }

    @Override
    public List<HocVien> selectAll() {
        return selectBySql(selectAll);
    }

    @Override
    public HocVien selectById(String key) {
        List<HocVien> list = selectBySql(selectByID, key);
        if(list.isEmpty()){
            return null;
        }
        return  list.get(0);
    }

    @Override
    public List<HocVien> selectBySql(String sql, Object... args) {
        List<HocVien> list = new ArrayList<>();
        try {
            ResultSet rs = DBConnext.query(sql, args);
            while (rs.next()) {                
                HocVien hv = new HocVien();
                hv.setMaHV(rs.getInt("MAHV"));
                hv.setMaKH(rs.getInt("maKH"));
                hv.setMaNH(rs.getString("MANH"));
                hv.setDiem(rs.getFloat("Diem"));
                list.add(hv);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(HocVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public  List<HocVien> selectByKhoaHoc(int maKh){
        String sql = "SELECT * FROM dbo.HOCVIEN WHERE MAKH = ?";
        return selectBySql(sql, maKh);
    }
}
