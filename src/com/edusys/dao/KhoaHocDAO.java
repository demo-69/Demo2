/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.DomainModels.KhoaHoc;
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
public class KhoaHocDAO extends EduSysDAOO<KhoaHoc, String> {

    String insert = "INSERT INTO KHOAHHOC\n"
            + "                         (MAKH, MACD, HOCPHI, THOILUONG, NGAYKG, GHICHU, MANV, NGAYTAO)\n"
            + "VALUES        (?,?,?,?,?,?,?,?)";
    String update = "UPDATE       KHOAHHOC\n"
            + "SET                MACD =?, HOCPHI =?, THOILUONG =?, NGAYKG =?, GHICHU =?, MANV =?, NGAYTAO =?\n"
            + "WHERE        (MAKH = ?)";
    String selectALL = "SELECT * FROM dbo.KHOAHHOC";
    String selectByID = "SELECT        MAKH, MACD, HOCPHI, THOILUONG, NGAYKG, GHICHU, MANV, NGAYTAO\n"
            + "FROM            KHOAHHOC\n"
            + "WHERE        (MAKH = ?)";

    String selectByChuyenDe = "SELECT        MAKH, MACD, HOCPHI, THOILUONG, NGAYKG, GHICHU, MANV, NGAYTAO\n"
            + "FROM            KHOAHHOC\n"
            + "WHERE        (MACD = ?)";
    String delete = "DELETE FROM KHOAHHOC\n"
            + "WHERE        (MAKH = ?)";

    @Override
    public void ensert(KhoaHoc entity) {
        DBConnext.update(insert, entity.getMaKH(), entity.getMaCD(), entity.getHocPhi(), entity.getThoiLuong(), entity.getNgayKG(), entity.getGhiChu(), entity.getMaNV(), entity.getNgayTao());
    }

    @Override
    public void update(KhoaHoc entity) {
        DBConnext.update(update, entity.getMaCD(), entity.getHocPhi(), entity.getThoiLuong(), entity.getNgayKG(), entity.getGhiChu(), entity.getMaNV(), entity.getNgayTao(), entity.getMaKH());
    }

    @Override
    public void delete(String key) {
        DBConnext.update(delete, key);
    }

    public void deleteID(int key) {
        DBConnext.update(delete, key);
    }
    
    @Override
    public List<KhoaHoc> selectAll() {
        return selectBySql(selectALL);
    }

    @Override
    public KhoaHoc selectById(String key) {
//        List<KhoaHoc> list = selectBySql(selectByID, key);
//        if (list.isEmpty()) {
//            return null;
//        }
//        return list.get(0);
        return null;
    }

    public KhoaHoc selectByChuyenDe(String key) {
        List<KhoaHoc> list = selectBySql(selectByChuyenDe, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<KhoaHoc> selectBySql(String sql, Object... args) {
        List<KhoaHoc> list = new ArrayList<>();
        try {
            ResultSet rs = DBConnext.query(sql, args);
            while (rs.next()) {
                KhoaHoc kh = new KhoaHoc();
                kh.setMaKH(rs.getInt("MAKH"));
                kh.setMaCD(rs.getString("MACD"));
                kh.setHocPhi(rs.getFloat("HOCPHI"));
                kh.setThoiLuong(rs.getInt("THOILUONG"));
                kh.setNgayKG(rs.getDate("ngayKG"));
                kh.setGhiChu(rs.getString("GHICHU"));
                kh.setMaNV(rs.getString("MANV"));
                kh.setNgayTao(rs.getDate("NGAYTAO"));
                list.add(kh);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(KhoaHocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public KhoaHoc selectById(Integer maKH) {
        List<KhoaHoc> list = selectBySql(selectByID, maKH);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

}
