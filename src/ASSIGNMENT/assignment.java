
package ASSIGNMENT;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class assignment {
    static void MENU(){
        System.out.println("+====================================================+");
        System.out.println("|                       MENU                         |");
        System.out.println("+====================================================+");
        System.out.println("|    Chức Năng 1: Nhập Thông Tin Sản Phẩm.           |");
        System.out.println("|    Chức Năng 2: Hiển Thị Thông Tin Sản Phẩm.       |");
        System.out.println("|    Chức Năng 3: Tính Tiền Hóa Đơn.                 |");
        System.out.println("|    Chức Năng 4: Cập Nhật THông Tin Sản Phẩm.       |");
        System.out.println("|    Chức Năng 5: Nhập Sản Phẩm.                     |");
        System.out.println("|    Chức Năng 6: Tìm Kiếm Sản Phẩm.                 |");
        System.out.println("|    Chức Năng 7: Xóa Sản Phẩm.                      |");
        System.out.println("|    Chức Năng 8: Sắp Xếp Sản Phẩm Theo Tên.         |");
        System.out.println("|    Chức Năng 9: Xây Dựng Lớp Sản Phẩm Tiêu Dùng.   |");
        System.out.println("|    Chức Năng 0: Nhập Thông Tin Sản Phẩm.           |");
        System.out.println("+====================================================+");
        System.out.print("Chức Năng: ");
    }
    static void cn1(){
        System.out.println("Chức Năng 1: Nhập Thông Tin Sản Phẩm.");
    }
    
    static void cn2(){
        System.out.println("Chức Năng 2: Hiển Thị Thông Tin Sản Phẩm.");
    }
    
    static void cn3(){
        System.out.println("Chức Năng 3: Tính Tiền Hóa Đơn.");
    }
    
    static void cn4(){
        System.out.println("Chức Năng 4: Cập Nhật THông Tin Sản Phẩm.");
    }
    
    static void cn5(){
        System.out.println("Chức Năng 5: Nhập Sản Phẩm.");
    }
    
    static void cn6(){
        System.out.println("Chức Năng 6: Tìm Kiếm Sản Phẩm.");
    }
    
    static void cn7(){
        System.out.println("Chức Năng 7: Xóa Sản Phẩm.");
    }
    
    static void cn8(){
        System.out.println("Chức Năng 8: Sắp Xếp Sản Phẩm Theo Tên.");
    }
    
    static void cn9(){
        System.out.println("Chức Năng 9: Xây Dựng Lớp Sản Phẩm Tiêu Dùng.");
    }
    
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner sc = new Scanner(System.in);
        
        int chuc_nang;
        do{
            MENU();
            chuc_nang = sc.nextInt();
            sc.nextLine();
            
            switch(chuc_nang){
                case 1:
                    System.out.println("-----------------------------------------------");
                    cn1();
                break;
                case 2:
                    System.out.println("-----------------------------------------------");
                    cn2();
                break;
                case 3: 
                    System.out.println("-----------------------------------------------");
                    cn3();
                break;
                case 4: 
                    System.out.println("-----------------------------------------------");
                    cn4();
                break;
                case 5: 
                    System.out.println("-----------------------------------------------");
                    cn5();
                break;
                case 6: 
                    System.out.println("-----------------------------------------------");
                    cn6();
                break;
                case 7:
                    System.out.println("-----------------------------------------------");
                    cn7();
                break;
                case 8:
                    System.out.println("-----------------------------------------------");
                    cn8();
                break;
                case 9:
                    System.out.println("-----------------------------------------------");
                    cn9();
                break;
                case 0:
                    System.out.println("-----------------------------------------------");
                    System.out.println("Đang Thoát Chương Trình.\nTạm Biệt, Hẹn Gặp Lại.");
                break;
                default:
                    System.out.println("-----------------------------------------------");
                    System.out.println("Hiện Chương Trình Chưa Có Chức Năng Này.");
            }
            if(chuc_nang != 0){
                System.out.println("-----------------------------------------------");
                System.out.println("Vui Lòng Bấm Phím 1 Để Quay Lại Menu.");
                int k;
                do{
                    k = sc.nextInt();
                    if(k != 1 ){
                        System.out.println("-----------------------------------------------");
                        System.out.println("Phím Nhập Không Đúng. \nVui Lòng Bấm Phím 1 Để Quay Lại Menu.");
                    }
                }while(k != 1);
            }
        }while(chuc_nang != 0);
    }
}
