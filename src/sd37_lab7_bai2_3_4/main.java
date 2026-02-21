
package sd37_lab7_bai2_3_4;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner sc = new Scanner(System.in);
        dsSinhVien sv = new dsSinhVien();
        int chuc_nang;
        do{
            System.out.println("+--------------------------------------------------+");
            System.out.println("|                        MENU                      |");
            System.out.println("+--------------------------------------------------+");
            System.out.println("|    Chức năng 1: Nhập Danh Sách Sinh Viên.        |");
            System.out.println("|    Chức Năng 2: Xuất Danh Sách Sinh Viên.        |");
            System.out.println("|    Chức Năng 3: Tìm Và Xóa Sinh Viên Theo tên.   |");
            System.out.println("|    Chức Năng 4: Thêm Sinh Viên.                  |");
            System.out.println("|    Chức Năng 5: Chỉnh Sửa Thông Tin Sinh Viên.   |");
            System.out.println("|    Chức Năng 0: Thoát Chương Trình.              |");
            System.out.println("+--------------------------------------------------+");
            
            while(true){
                try{
                    System.out.print("Chức Năng: ");
                    chuc_nang = sc.nextInt();
                    sc.nextLine();
                    break;
                }catch(Exception e){
                    System.out.println("Vui Lòng Nhập Số.");
                    sc.nextLine();
                }
            }
            
            switch(chuc_nang){
                case 1:
                    System.out.println("----------------------------------------------------");
                    System.out.println("Chức năng 1: Nhập Danh Sách Sinh Viên.");
                    sv.nhapdanhsach();
                    System.out.println("Bạn Muốn nhập sinh viên của ngành khác không(Y/N)?");
                    String chon = sc.nextLine();
                    if(chon.toLowerCase().equals("y")){
                        sv.nhapdanhsach();
                    }else
                        break;
                break;
                case 2:
                    System.out.println("----------------------------------------------------");
                    System.out.println("Chức năng 2: Xuất Danh Sách Sinh Viên.");
                    sv.xuatDanhSach();
                break;
                case 3: 
                    System.out.println("----------------------------------------------------");
                    System.out.println("Chức năng 3: Tìm Và Xóa Sinh Viên Theo tên.");
                    sv.delete_SV();
                break;
                case 4:
                    System.out.println("----------------------------------------------------");
                    System.out.println("Chức năng 4: Thêm Sinh Viên.");
                    sv.them_SV();
                break;
                case 5:
                    System.out.println("----------------------------------------------------");
                    System.out.println("Chức năng 4: Thêm Sinh Viên.");
                    sv.chinhsua_SV();
                break;
                case 0:
                    System.out.println("----------------------------------------------------");
                    System.out.println("Đang Thoát Chương Trình.");
                    System.out.println("Tạm Biệt, Hẹn Gặp lại");
                break;
                default:
                    System.out.println("----------------------------------------------------");
                    System.out.println("Hiện Chương Trình Chưa Có Chức Năng này.");
            }
            if(chuc_nang != 0){
                System.out.println("----------------------------------------------------");
                System.out.println("Vui Lòng Bấm Phím 1 Để Quay Lại Menu.");
                int chon;
                do{
                    while(true){
                        try{
                            chon = sc.nextInt();
                            sc.nextLine();
                            break;
                        }catch(Exception e){
                            System.out.println("Vui Lòng Nhập Số.");
                            sc.nextLine();
                        }
                    }
                    if(chon != 1){
                        System.out.println("----------------------------------------------------");
                        System.out.println("Phím Chọn Không Đúng.");
                        System.out.println("Vui Lòng Bấm Phím 1 Để Quay Lại Menu.");
                    }
                }while(chon != 1);
            }
            
            System.out.println("\n". repeat(50));
        }while(chuc_nang != 0);
    }
}
