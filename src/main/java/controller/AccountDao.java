/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import entities.Account;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *
 * @author Viet
 */
public class AccountDao {
    private final String filePath = "Account.txt"; // Tạo đường dẫn lưu file
    
    // ====================================================================== //
    // =================== Hàm viết dữ liệu vào file ======================== //
    // ====================================================================== //
    public void write(ArrayList<Account> list){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try{
            fos = new FileOutputStream(filePath);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        } catch(IOException ex){
            ex.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }
    
    // ====================================================================== //
    // =================== Hàm đọc dữ liệu từ file ========================== //
    // ====================================================================== //
    public ArrayList<Account> read(){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        ArrayList<Account> list = new ArrayList<>();
        
        try {
            fis = new FileInputStream(filePath);
            ois = new ObjectInputStream(fis);
            list = (ArrayList < Account >) ois.readObject();
        } catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return list;
    }
    
    // ====================================================================== //
    // ============================ Hàm đóng luồng ========================== //
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
    // ============================ Hàm đóng luồng ========================== //
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
