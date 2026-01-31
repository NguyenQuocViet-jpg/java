package sd21301_37_lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class danhsach {
    ArrayList <sanpham> danhSach = new ArrayList<>();
    
    public void inputSP(Scanner sc)
    {
        System.out.print("Số Lượng Sản Phẩm Muốn Nhập: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            sanpham sp = new sanpham();
            System.out.println("--- Nhập Sản Phẩm thứ " + (i + 1) + " ---");
            sp.input(sc);
            danhSach.add(sp);
        }
    }
    public void printSP(Scanner sc)
    {
        System.out.printf("%-15s | %-12s | %-12s | %-10s \n", "Tên", "Đơn Giá", "Giảm Giá", "Thuế");
        System.out.println("-------------------------------------------------------------------");
        for(sanpham x : danhSach){
            x.print();
        }
    }
    public int timkiemSP(String tensp)
    {
        int index = -1;
        for(int i = 0; i < danhSach.size(); i++)
        {
            sanpham s = (sanpham) danhSach.get(i);
            if(s.getTen().equals(tensp))
                return i;
        }
        return -1;
    }
    public void deleteSP(String tensp)
    {
        int index = timkiemSP(tensp);
        if(index < 0){
            System.out.println("Không tìm thấy sản phẩm trong danh sách");
        }else{
            danhSach.remove(index);
        }
    }
    public void ThemSP(int vitri, Scanner sc)
    {
        sanpham sp = new sanpham();
        sp.input(sc);
        if(vitri > danhSach.size())
            danhSach.add(sp);
        else 
            danhSach.add(vitri,sp);
    }
    public void sapXepgiam(){
        for(int i = 0; i < danhSach.size(); i++){
            for(int j = 0; j < danhSach.size() - 1 - i; j++){
                sanpham sp1 = danhSach.get(j);
                sanpham sp2 = danhSach.get(j + 1);
                if(sp1.getdonGia() < sp2.getdonGia()){
                    Collections.swap(danhSach, j, j + 1);
                }
            }
        }
    }
    public double trungBinhGia(){
        int tong = 0;
        for(int i = 0; i < danhSach.size(); i++){
            sanpham sp = danhSach.get(i);
            tong += sp.getdonGia();
        }
        double tb = tong / danhSach.size();
        return tb;
    }
    public void giaTrentb(){
        for(int i = 0; i < danhSach.size(); i++){
            sanpham sp = danhSach.get(i);
            if(sp.getdonGia() > trungBinhGia()){
                sp.print();
            }
        }
    }
}