/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.utils;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author ASUS
 */
public class XImage {
  public  static  Image getAppicon(){
      URL url = XImage.class.getResource("/com/edusys/icon/fpt.png");
      return new ImageIcon(url).getImage();
  }
  public static void save(File src){
      File dst = new File("logos",src.getName());
      //kiem tra thu muc logos ton tai hay chua
      if(!dst.getParentFile().exists()){
          //Tap thu muc logos neu chua ton tai
          dst.getParentFile().mkdirs();
      }
      try {
          Path from = Paths.get(src.getAbsolutePath());
          Path to = Paths.get(dst.getAbsolutePath());
          //copy file vao thu muc logos
          Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
      } catch (Exception e) {
          System.out.println("loi o chinh sua anh");
      }
  }
  public  static  ImageIcon read(String fileName){
      File path = new File("logos",fileName);
      return new ImageIcon(path.getAbsolutePath());
  }
}
