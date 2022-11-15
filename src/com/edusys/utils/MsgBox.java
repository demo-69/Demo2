/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class MsgBox {
    public  static void alert(Component pa,String mess){
        JOptionPane.showMessageDialog(pa, mess,"Hệ thống quản lý đào tạo",JOptionPane.INFORMATION_MESSAGE);
    }
    public  static boolean confirm(Component pa, String mess){
        int kq = JOptionPane.showConfirmDialog(pa, mess,"Hệ thống quản lý đào tạo" , JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        return kq == JOptionPane.YES_OPTION;
    }
    public  static String prompt(Component pa, String mess){
        return  JOptionPane.showInputDialog(pa, mess,"Hệ thống quản lý đào tạo" , JOptionPane.INFORMATION_MESSAGE);
        
    }
}
