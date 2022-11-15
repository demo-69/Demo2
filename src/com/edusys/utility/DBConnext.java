/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class DBConnext {
    public static  Connection openConnection(){
        
        Connection connection=null;
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String chuoi = "jdbc:sqlserver://localhost:1433;databaseName = EduSys ; encrypt = true; trustServerCertificate = true;user = sa;password=123456";
            try {
                connection = DriverManager.getConnection(chuoi);
            } catch (SQLException ex) {
                Logger.getLogger(DBConnext.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Thành công");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
    public static void main(String[] args) {
        System.out.println(DBConnext.openConnection().toString());
    }
    
    public static PreparedStatement getStmt(String sql,Object... args) throws SQLException{
        Connection con = openConnection();
        PreparedStatement stmt;
        if(sql.trim().startsWith("EXEC")){
            stmt = con.prepareCall(sql);
        }else{
            stmt = con.prepareStatement(sql);
        }
        for(int i=0;i<args.length;i++){
            stmt.setObject(i+1, args[i]);
        }
        return stmt;
    }
    //truy vấn
    public  static ResultSet query(String sql,Object... args) throws SQLException{
        PreparedStatement stmt = DBConnext.getStmt(sql, args);
        return stmt.executeQuery();
    }
    //đưa vào 1 câu lệnh sql trả về 1 giá trị duyu nhất
    public static Object value(String sql,Object... args){
        try {
            ResultSet rs = DBConnext.query(sql, args);
            if(rs.next()){
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public  static int update(String sql,Object... args){
        try {
            PreparedStatement stmt = DBConnext.getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            } catch (Exception e) {
                stmt.getConnection().close();
            }
        } catch (Exception e) {
           throw new RuntimeException(e);
        }
        return 0;
    }
}
