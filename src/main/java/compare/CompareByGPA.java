/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compare;

import entities.ThiSinh;
import java.util.Comparator;

/**
 *
 * @author Viet
 */
// Tạo class sắp xếp thí sinh theo điểm thi giảm dần
public class CompareByGPA implements Comparator<ThiSinh>{
    @Override
    public int compare(ThiSinh ts1, ThiSinh ts2){
        return ts1.getDiemThi() > ts2.getDiemThi()? -1 : 1;
    }
}
