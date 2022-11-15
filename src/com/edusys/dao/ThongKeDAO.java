/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

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
public class ThongKeDAO {
    private List<Object[]> getListOfArray(String sql,String[] cols,Object... args){
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = DBConnext.query(sql, args);
            while (rs.next()) {                
                Object[] val = new Object[cols.length];
                for(int i=0;i<cols.length;i++){
                    val[i] = rs.getObject(cols[i]);
                }
                list.add(val);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public  List<Object[]> getBangDiem(Integer makh){
        String sql = " EXEC dbo.sp_BANGDIEM @MAKH = ? ";
        String[] cols = {"MANH","HOTEN","Diem"};
        return this.getListOfArray(sql, cols, makh);
    }
    public  List<Object[]> getLuongNguoihoc(){
        String sql = " EXEC dbo.sp_THONGKENGUOIHOC ";
        String[] cols = {"NAM","SOLUONG","DauTien","CuoiCung"};
        return this.getListOfArray(sql, cols);
    }
    
    public  List<Object[]> getDiemChuyenDe(){
        String sql = " EXEC dbo.sp_THONGKEDIEM ";
        String[] cols = {"MANH","HOTEN","Diem"};
        return this.getListOfArray(sql, cols);
    }
    public  List<Object[]> getDoanhThu(int nam){
        String sql = " EXEC dbo.sp_THONGKEDOANHTHU @YEAR = ? ";
        String[] cols = {"ChuyenDe","SOKH","SoHV","DoanhThu","ThapNhat","CaoNhat","TrungBinh"};
        return this.getListOfArray(sql, cols,nam);
    }
}
