package sd21301_37_lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class danhsach {
    ArrayList <sanpham> danhSach = new ArrayList<>();
    
    public void inputSP(Scanner sc)
    {
         
        int n;
        while(true){
            try{
                System.out.print("Số Lượng Sản Phẩm Muốn Nhập: ");
                n = sc.nextInt();
                sc.nextLine();
                break;
            }catch(Exception e){
                System.out.println("Vui Lòng Nhập Số.");
                sc.nextLine();
            }
        }
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
    public int timkiemSP()
    {
        Scanner sc = new Scanner(System.in);
        String tensp = sc.nextLine().trim();
        int index = -1;
        for(int i = 0; i < danhSach.size(); i++)
        {
            sanpham s = (sanpham) danhSach.get(i);
            if(s.getTen().equals(tensp))
                return i;
        }
        return -1;
    }
    public void deleteSP()
    {
        Scanner sc = new Scanner(System.in);
        int index = timkiemSP();
        if(index < 0){
            System.out.println("Không tìm thấy sản phẩm trong danh sách");
        }else{
            System.out.print("Bạn có Muốn Xóa Không(Y/N)");
            String c = sc.nextLine();
            if(c.toLowerCase().equals("y")){
                danhSach.remove(index);
                System.out.println("Đã Xóa Thành Công.");
            }
            
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
        for(int i = 0; i < danhSach.size() - 1; i++){
            for(int j = i + 1; j < danhSach.size(); j++){
                sanpham sp1 = danhSach.get(i);
                sanpham sp2 = danhSach.get(j);
                if(sp1.getdonGia() < sp2.getdonGia()){
                    Collections.swap(danhSach, i, j);
                    sp1 = danhSach.get(i);
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
    public void chinhSuaSP(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tên Sản Phẩm Muốn Sửa: ");
        int index = timkiemSP();
        if(index < 0) System.out.println("Không Tìm Thấy Sản Phẩm Này.");
        else{
            sanpham moi = danhSach.get(index);
            System.out.println("Bạn Muốn Thay Đổi Thông Tin Nào (Tên Sản Phẩm | Giá Sản Phẩm | Giảm Giá)");
            String sp = sc.nextLine().trim();
            if(sp.toLowerCase().equals("tên sản phẩm")){
                System.out.print("Nhập Tên Mới: ");
                moi.setTen(sc.nextLine().trim());
            }else if(sp.toLowerCase().equals("giá sản phẩm")){
                while(true){
                    try{
                        System.out.print("Nhập Giá mới Của Sản Phẩm: ");
                        moi.setdonGia(sc.nextDouble());
                        sc.nextLine();
                        break;
                    }catch(Exception e){
                        System.out.println("Vui Lòng Nhập Số.");
                        sc.nextLine();
                    }
                } 
                
            }else if(sp.toLowerCase().equals("giảm giá")){
                while(true){
                    try{
                        System.out.print("Nhập Mức Giảm Mới Của Sản Phẩm: ");
                        moi.setgiamGia(sc.nextDouble());
                        sc.nextLine();
                        break;
                    }catch(Exception e){
                        System.out.println("Vui Lòng Nhập Số.");
                        sc.nextLine();
                    }
                } 
            }
        }
    }
}