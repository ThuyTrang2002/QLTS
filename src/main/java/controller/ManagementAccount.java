/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import entities.*;
import java.util.ArrayList;

/**
 *
 * @author Viet
 */
public class ManagementAccount {
    private ArrayList<Account> list = new ArrayList<>(); // Tạo danh sách để lưu trữ tài khoản
    private final AccountDao accountDao; // Khai báo class dùng để đọc ghi file
    
    public ManagementAccount(){ // Khi tạo class mới
        accountDao = new AccountDao();  // Khởi tạo class
        list = accountDao.read(); // Đọc dữ liệu ra list
    }
    
    // ====================================================================== //
    // ======================== Hàm thêm tài khoản ========================== //
    // ====================================================================== //
    public void addAccount(String code){
        Account account = new Account();
        account.setUserName(code);
        list.add(account);
        accountDao.write(list); // Viết dữ liệu vào file
    }
    
    // ====================================================================== //
    // ======================== Hàm xoá tài khoản ========================== //
    // ====================================================================== //
    public void removeAccount(String code){
        for(Account i : list){
            if(i.getUserName().equals(code)){
                list.remove(i);
                accountDao.write(list);
                break;
            }
        }
    }
    
    // ====================================================================== //
    // ======================== Hàm thay đổi passw ========================== //
    // ====================================================================== //
    public void changePassword(String userName, String passWord){
        for(Account i : list){
            if(i.getUserName().equals(userName)){
                i.setPassword(passWord);
                accountDao.write(list);
                break;
            }
        }
    }
    
    // ====================================================================== //
    // ======================== Hàm trả về list acc ========================= //
    // ====================================================================== //
    public ArrayList<Account> getList(){
        return list;
    }
}
