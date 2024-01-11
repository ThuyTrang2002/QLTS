/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import entities.ThiSinh;
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
public class ThiSinhDao {
    private final String filePath = "ThiSinh.txt"; // Tạo đường dẫn lưu file
    public static int id = 0; // Tạo id để tạo id tăng tự động
    
    // ====================================================================== //
    // ======================== Hàm đọc file ================================ //
    // ====================================================================== //
    public ArrayList<ThiSinh> read(){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        ArrayList<ThiSinh> list = new ArrayList<>();
        try{
            fis = new FileInputStream(filePath);
            ois = new ObjectInputStream(fis);
            id = ois.readInt(); // Đọc ra id cuối cùng tạo ra
            list = (ArrayList<ThiSinh>)ois.readObject(); // Đọc dữ liệu vào list
            if(list.isEmpty()){ // Nếu list trống thì gán id = 0
                id = 0;
            }
        } catch(IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return list;
    }
    
    // ====================================================================== //
    // ======================== Hàm ghi file ================================ //
    // ====================================================================== //
    public void write(ArrayList<ThiSinh> list){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(filePath);
            oos = new ObjectOutputStream(fos);
            oos.writeInt(id); // Ghi id cuối vào file
            oos.writeObject(list); // Ghi list vào file
        } catch(IOException ex){
            ex.printStackTrace();
        } finally{
            closeStream(fos);
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
