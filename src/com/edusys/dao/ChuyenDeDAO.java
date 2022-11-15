/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.DomainModels.ChuyenDe;
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
public class ChuyenDeDAO extends EduSysDAOO<ChuyenDe, String>{

    String insert = "INSERT INTO CHUYENDE\n" +
"                         (MACD, TENCD, HOCPHI, THOILUONG, HINH, MOTA)\n" +
"VALUES        (?,?,?,?,?,?)";
    String update = "UPDATE       CHUYENDE\n" +
"SET                TENCD = ?, HOCPHI = ?, THOILUONG = ?, HINH = ?, MOTA = ?\n" +
"WHERE        (MACD = ?)";
    String selectAll = "SELECT * FROM dbo.CHUYENDE";
    String selectById="SELECT        MACD, TENCD, HOCPHI, THOILUONG, HINH, MOTA, MACD\n" +
"FROM            CHUYENDE\n" +
"WHERE        (MACD = ?)";
    String selectByName="SELECT        MACD, TENCD, HOCPHI, THOILUONG, HINH, MOTA, MACD\n" +
"FROM            CHUYENDE\n" +
"WHERE        (TENCD = ?)";
    String delete = "DELETE FROM CHUYENDE\n" +
"WHERE        (MACD = ?)";

 

    @Override
    public void ensert(ChuyenDe entity) {
        DBConnext.update(insert, entity.getMaCD(),entity.getTenCD(),entity.getHocPhi(),entity.getThoiLuong(),entity.getHinh(),entity.getMoTa());
    }

    @Override
    public void update(ChuyenDe entity) {
        DBConnext.update(update, entity.getTenCD(),entity.getHocPhi(),entity.getThoiLuong(),entity.getHinh(),entity.getMoTa(),entity.getMaCD());
    }

    @Override
    public void delete(String key) {
        DBConnext.update(delete,key);
    }

    @Override
    public List<ChuyenDe> selectAll() {
        return  this.selectBySql(selectAll);
    }

    @Override
    public ChuyenDe selectById(String key) {
         List<ChuyenDe> list = selectBySql(selectById, key);
         if(list.isEmpty()){
             return null;
         }
         return list.get(0);
    }

    public ChuyenDe selectByName(String key) {
         List<ChuyenDe> list = selectBySql(selectByName, key);
         if(list.isEmpty()){
             return null;
         }
         return list.get(0);
    }
    @Override
    public List<ChuyenDe> selectBySql(String sql, Object... args) {
        List<ChuyenDe> list = new ArrayList<>();
        
        try {
            ResultSet rs = DBConnext.query(sql, args);
            while (rs.next()) {                
                ChuyenDe cd = new ChuyenDe();
                cd.setMaCD(rs.getString("maCd"));
                cd.setHinh(rs.getString("Hinh"));
                cd.setTenCD(rs.getString("TENCD"));
                cd.setHocPhi(rs.getFloat("HOCPHI"));
                cd.setThoiLuong(rs.getInt("THOILUONG"));
                cd.setMoTa(rs.getString("MOTA"));
                list.add(cd);
                
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ChuyenDeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
