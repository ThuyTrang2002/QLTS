/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import entities.*;

/**
 *
 * @author Viet
 */
public class ManagementStudent {
    private final ThiSinhDao thiSinhDao; // Class đọc ghi dữ liệu thí sinh
    private final ArrayList<ThiSinh> list; // List lưu danh sách thí sinh
    private final ManagementAccount mAccount; // Class quản lý tài khoản
    public static int ID; // ID dùng để tăng tự động
    
    public ManagementStudent(){ // Khi khởi tạo class
        thiSinhDao = new ThiSinhDao(); // Khởi tạo class đọc ghi file thí sinh
        mAccount = new ManagementAccount(); // Khởi tạo class đọc ghi file tài khoản
        list = thiSinhDao.read(); // Đọc dữ liệu thí sinh ra list
        ID = ThiSinhDao.id; // Lấy id cuối cùng
    }
    
    // ====================================================================== //
    // ======================== Hàm thêm thí sinh =========================== //
    // ====================================================================== //
    public void themThiSinh(ThiSinh ts){
        list.add(ts);
        // Khi một thí sinh được tạo ra thì tự tạo tài khoản, tên đăng nhập là mã thí sinh
        mAccount.addAccount(ts.getMaTS()); // Tự tạo tài khoản
        ThiSinhDao.id = ID; // Cập nhật id tăng tự động trong file
        thiSinhDao.write(list); // Ghi dữ liệu vào file
    }
    
    // ====================================================================== //
    // ======================== Hàm sửa thí sinh ============================ //
    // ====================================================================== //
    public String suaThiSinh(ThiSinh ts){
        boolean flag = false; // Tạo cờ check mã thí sinh
        String messsage = ""; // Tạo thông báo
        for(ThiSinh i : list){ // Duyệt danh sách thí sinh
            if(i.getMaTS().equals(ts.getMaTS())){ // Nếu mã thí sinh tồn tại
                i.setTenST(ts.getTenST());
                i.setNgaySinh(ts.getNgaySinh());
                i.setGioiTinh(ts.getGioiTinh());
                i.setQueQuan(ts.getQueQuan());
                i.setDiemThi(ts.getDiemThi());
                flag = true; // Đánh dấu là mã thí sinh tồn tại
                break;
            }
        }
        if(!flag){
            messsage += "Không tồn tại mã thí sinh!";
        } else {
            thiSinhDao.write(list);
            messsage += "Đã sửa thành công!";
        }
        return messsage;
    }
    
    // ====================================================================== //
    // ======================== Hàm xoá thí sinh ============================ //
    // ====================================================================== //
    public String xoaThiSinh(ThiSinh ts){
        int index = -1; // Khởi tạo vị trí cần xoá
        String message = ""; // Tạo thông báo
        for(int i = 0; i < list.size(); ++ i){ // Tìm thí sinh cần xoá
            if(list.get(i).getMaTS().equals(ts.getMaTS())){
                index = i; // Lưu vị trí cần xoá
                break;
            }
        }
        if(index == -1){ // Kiểm tra
            message += "Không tồn tại mã thí sinh!";
        } else {
            // Khi xoá thí sinh thì tài khoản của thí sinh cũng tự động bị xoá
            mAccount.removeAccount(list.get(index).getMaTS()); // Xoá tài khoản
            list.remove(index); // Xoá thí sinh
            thiSinhDao.write(list); // Ghi lại dữ liệu vào file
            message += "Đã xoá thành công!";
        }
        return message;
    }
    
    public ArrayList<ThiSinh> getList(){
        return list;
    }
}
