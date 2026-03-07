
package thi;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class dsSanPham {
    ArrayList<sanpham> dsSanPham = new ArrayList<>();
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        sanpham moi = new sanpham();
        System.out.print("Bạn muốn nhập loại sản phẩm nào (Sách | Đồ chơi)\n:");
        String luachon = sc.nextLine().trim();
        if(luachon.equalsIgnoreCase("Sách")){
            do{
                moi = new sach();
                moi.nhap();
                dsSanPham.add(moi);
                System.out.print("Bạn có muốn nhập nữa không (Y/N): ");
                String tiep = sc.nextLine().trim();
                if(tiep.equalsIgnoreCase("n"))
                    break;
            }while(true);
        }else if(luachon.equalsIgnoreCase("Đồ Chơi")){
            do{
                moi = new dochoi();
                moi.nhap();
                dsSanPham.add(moi);
                System.out.print("Bạn có muốn nhập nữa không (Y/N): ");
                String tiep = sc.nextLine().trim();
                if(tiep.equalsIgnoreCase("n"))
                    break;
            }while(true);
        }else{
            System.out.println("Không tìm thấy loại sản phẩm này");
        }
    }
    public void xuat(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn xuất sản phẩm nào (Sách | Đồ chơi | Tất cả)");
        String luachon = sc.nextLine().trim();
        if(luachon.equalsIgnoreCase("sách")){
            System.out.printf("%-20s | %-13s | %-20s\n", "Tên SP", "Giá SP", "Tác Giả");
            System.out.println("---------------------------------------");
            for(sanpham moi: dsSanPham){
                if(moi instanceof sach)
                    moi.xuat();
            }    
        }else if(luachon.equalsIgnoreCase("đồ chơi")){
            System.out.printf("%-20s | %-13s | %s\n", "Tên SP", "Giá SP", "Độ tuổi phù hợp");
            System.out.println("---------------------------------------");
            for(sanpham moi: dsSanPham)
                if(moi instanceof dochoi)
                    moi.xuat();
        }else if(luachon.equalsIgnoreCase("tất cả")){
            System.out.println("--- SÁCH ---");
            System.out.printf("%-20s | %-13s | %-20s\n", "Tên SP", "Giá SP", "Tác Giả");
            System.out.println("---------------------------------------");
            for(sanpham moi: dsSanPham){
                if(moi instanceof sach)
                    moi.xuat();
            }  
            System.out.println("\n". repeat(2));
            System.out.println("=======================================");
            System.out.println("--- ĐỒ CHƠI ---");
            System.out.printf("%-20s | %-13s | %s\n", "Tên SP", "Giá SP", "Độ tuổi phù hợp");
            System.out.println("---------------------------------------");
            for(sanpham moi: dsSanPham)
                if(moi instanceof dochoi)
                    moi.xuat();
            
        }else{
            System.out.println("Không Tìm Thấy Loại Sản Phẩm này.");
        }
    }
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner sc = new Scanner(System.in);
        int chucnang;
        dsSanPham sp = new dsSanPham();
        do{
            System.out.println("+-------------------------------------------+");
            System.out.println("|   Chức Năng 1: Nhập Danh Sách Sản Phẩm.   |");
            System.out.println("|   Chức Năng 2: Xuất Danh Sách Sản phẩm.   |");
            System.out.println("|   Chức Năng 0: Thoát Chương trình.        |");
            System.out.println("+-------------------------------------------+");
            
            while(true){
                try{
                    System.out.print("Chức Năng: ");
                    chucnang = sc.nextInt();
                    sc.nextLine();
                    break;
                }catch (Exception e){
                    System.out.println("Vui lòng nhập số");
                    sc.nextLine();
                }
            }
            
            switch(chucnang){
                case 1: 
                    System.out.println("-------------------");
                    do{
                        sp.nhap();
                        System.out.print("Bạn muốn nhập loại sản phẩm khác không (Y/N)");
                        String tiep = sc.nextLine().trim();
                        if(tiep.equalsIgnoreCase("n"))
                            break;
                    }while(true);
                break;
                case 2: 
                    System.out.println("-------------------");
                    sp.xuat();
                break;
                case 0: 
                    System.out.println("-------------------");
                    System.out.println("Đang Thoát Chương Trình");
                    System.out.println("Tạm Biệt, Hẹn Gặp Lại.");
                break;
                default:
                    System.out.println("Hiện Chương Trình Chưa Có Chức Năng Này.");
            }
            
            if(chucnang != 0){
                System.out.println("-------------------");
                System.out.println("Vui Lòng Bấm Phím 1 Để Quay Lại Menu.");
                int tiep;
                do{
                    tiep = sc.nextInt();
                    if(tiep != 1 ){
                        System.out.println("Phím Chọn Không Đúng.");
                        System.out.println("Vui Lòng Bấm Phím 1 Để Quay Lại Menu.");
                    }
                }while(tiep != 1);
            }
            System.out.println("\n". repeat(50));
        }while(chucnang != 0);
    }
            
}
