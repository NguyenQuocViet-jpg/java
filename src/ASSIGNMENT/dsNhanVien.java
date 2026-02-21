
package ASSIGNMENT;

import java.util.ArrayList;
import java.util.Scanner;

public class dsNhanVien {
    ArrayList<nhanvien> ds = new ArrayList<>();
    public void inputds(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn nhập nhân viên nào (tiếp thị | hành chính | trưởng phòng)");
        String nv = sc.nextLine().trim();
        nhanvien moi;
        if(nv.toLowerCase().equals("tiếp thị")){
            do{
                moi = new NVTiepThi("tiếp thị");
                moi.nhap();
                ds.add(moi);
                System.out.println("Bạn Có Muốn Nhập Nữa Hay Không(Y/N)?");
                    String chon = sc.nextLine();
                    if(chon.toLowerCase().equals("n"))
                        break;
            }while(true);
        }else if(nv.toLowerCase().equals("hành chính")){
            do{
                moi = new NVHanhChinh("hành chính");
                moi.nhap();
                ds.add(moi);
                System.out.println("Bạn Có Muốn Nhập Nữa Hay Không(Y/N)?");
                    String chon = sc.nextLine();
                    if(chon.toLowerCase().equals("n"))
                        break;
            }while(true);
        }else if(nv.toLowerCase().equals("trưởng phòng")){
            do{
                moi = new NVTruongPhong("trưởng phòng");
                moi.nhap();
                ds.add(moi);
                System.out.println("Bạn Có Muốn Nhập Nữa Hay Không(Y/N)?");
                    String chon = sc.nextLine();
                    if(chon.toLowerCase().equals("n"))
                        break;
            }while(true);
        }else {
            System.out.println("Không tìm thấy loại nhân viên này");
        }
    }
    public void printds(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn hiển thị nhân viên nào (tiếp thị | hành chính | trưởng phòng)");
        String nv = sc.nextLine().trim();
        if(nv.toLowerCase().equals("tiếp thị")){
            System.out.printf("%-12s | %-20s | %-10s | %-10s | %-10s | %-10s | %-10s\n"
                , "Mã Nhân viên", "Họ và Tên", "Doanh số", "Huê Hồng", "Lương", "Thu Nhập", "Thuế");
            for(nhanvien NV: ds){
                if(NV.getLoainv().equals("tiếp thị"))
                    NV.xuat();
            }
        }else if(nv.toLowerCase().equals("hành chính")){
            System.out.printf("%-12s | %-20s | %-10s | %-10s | %-10s \n"
                , "Mã Nhân Viên", "Họ và Tên", "Lương", "Thu Nhập", "Thuế");
            for(nhanvien NV: ds){
                if(NV.getLoainv().equals("hành chính"))
                    NV.xuat();
            }
        }else if(nv.toLowerCase().equals("trưởng phòng")){
            System.out.printf("%-12s | %-20s | %-10s | %-11s | %-10s | %-10s \n"
                , "Mã Nhân Viên", "Họ và Tên", "Lương", "trách Nhiệm", "Thu Nhập", "Thuế");
            for(nhanvien NV: ds){
                if(NV.getLoainv().equals("trưởng phòng"))
                    NV.xuat();
            }
        }else {
            System.out.println("Không tìm thấy loại nhân viên này");
        }
    }
}
