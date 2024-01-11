/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author Viet
 */
public class QuanLyTuyenSinhDao {
    private final String filePath = "ChiTieu.txt"; // Tạo file lưu lại chỉ tiêu
    
    // ====================================================================== //
    // ======================== Hàm đọc dữ liệu ============================= //
    // ====================================================================== //
    public int read(){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        int targets = 1;
        
        try {
            fis = new FileInputStream(filePath);
            ois = new ObjectInputStream(fis);
            targets = ois.readInt();
        } catch(IOException ex) {
            ex.printStackTrace();
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return targets;
    }
    
    // ====================================================================== //
    // ======================== Hàm ghi dữ liệu ============================= //
    // ====================================================================== //
    public void write(int targets){
        ObjectOutputStream oos = null;
        
        try {
            oos = new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeInt(targets);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(oos);
        }
    }
    
    // ====================================================================== //
    // ======================== Hàm đóng luồng ============================== //
    // ====================================================================== //
    private void closeStream(InputStream is){
        if(is != null){
            try{
                is.close();
            } catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }
    
    // ====================================================================== //
    // ======================== Hàm đóng luồng ============================== //
    // ====================================================================== //
    private void closeStream(OutputStream is){
        if(is != null){
            try{
                is.close();
            } catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
