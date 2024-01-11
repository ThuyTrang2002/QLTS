/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;

/**
 *
 * @author Viet
 */
public class ThiSinh implements Serializable{
    private String maTS, tenST, ngaySinh, gioiTinh, queQuan;
    float diemThi;

    public ThiSinh() {
        
    }
    
    public ThiSinh(ThiSinh ts){
        this.maTS = ts.maTS;
        this.tenST = ts.tenST;
        this.ngaySinh = ts.ngaySinh;
        this.gioiTinh = ts.gioiTinh;
        this.queQuan = ts.queQuan;
        this.diemThi = ts.diemThi;
    }

    public ThiSinh(String maTS, String tenST, String ngaySinh, String gioiTinh, String queQuan, float diemThi) {
        this.maTS = maTS;
        this.tenST = tenST;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.diemThi = diemThi;
    }

    public String getMaTS() {
        return maTS;
    }

    public void setMaTS(String maTS) {
        this.maTS = maTS;
    }

    public String getTenST() {
        return tenST;
    }

    public void setTenST(String tenST) {
        this.tenST = tenST;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public float getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(float diemThi) {
        this.diemThi = diemThi;
    }
}
