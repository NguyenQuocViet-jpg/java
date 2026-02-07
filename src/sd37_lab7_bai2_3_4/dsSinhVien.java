
package sd37_lab7_bai2_3_4;

import java.util.ArrayList;
import java.util.Scanner;

public class dsSinhVien {
    ArrayList<sinhVienPoly> danhsach = new ArrayList<>();
    
    public void nhapdanhsach(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Bạn Muốn Nhập Sinh Viên IT Hay Sinh Viên biz ?");
            String Nganh = sc.nextLine();
            sinhVienPoly sv;
            if(Nganh.toLowerCase().equals("it"))
                sv = new sinhVienIT("IT");
            else 
                sv = new sinhVienBiz("BIZ");
            sv.inputsv();
            danhsach.add(sv);
            System.out.println("Bạn Có Muốn Nhập Nữa Hay Không(Y/N)?");
            String chon = sc.nextLine();
            if(chon.toLowerCase().equals("n"))
                break;
        }while(true);
    }
    
    public void xuatDanhSach(){
        
        System.out.printf(" %-10S | %-20s | %-10s | %-10s | %-10s | %-10s | %-10s\n"
                            , "Ngành", "Họ và Tên", "Điểm CSS", "Điểm HTML", "Điểm Java", "Điểm Trung Bình", "Học Lực");
        for(sinhVienPoly sv: danhsach){
            if(sv.getNganh().equals("IT"))
                sv.printsv();
        }
        
        System.out.printf(" %-10S | %-20s | %-10s | %-10s | %-10s | %-10s\n"
                            , "Ngành", "Họ và Tên", "Điểm Marketin", "Điểm Sale", "Điểm Trung Bình", "Học Lực");
        for(sinhVienPoly sv: danhsach){
            if(sv.getNganh().equals("BIZ"))
                sv.printsv();
        }
    }
}
