
package ASSIGNMENT;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class assignment {
    static void MENU(){
        System.out.println("+===========================================================================+");
        System.out.println("|                                    MENU                                   |");
        System.out.println("+===========================================================================+");
        System.out.println("|    Chức Năng 1: Nhập danh sách nhân viên từ bàn phím.                     |");
        System.out.println("|    Chức Năng 2: Xuất danh sách nhân viên ra màn hình.                     |");
        System.out.println("|    Chức Năng 3: Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.       |");
        System.out.println("|    Chức Năng 4: Xóa nhân viên theo mã nhập từ bàn phím.                   |");
        System.out.println("|    Chức Năng 5: Cập nhật thông tin nhân viên theo mã nhập từ bàn phím .   |");
        System.out.println("|    Chức Năng 6: Tìm các nhân viên theo khoảng lương nhập từ bàn phím.     |");
        System.out.println("|    Chức Năng 7: Sắp xếp nhân viên theo họ và tên.                         |");
        System.out.println("|    Chức Năng 8: Sắp xếp nhân viên theo thu nhập.                          |");
        System.out.println("|    Chức Năng 9: Xuất 5 nhân viên có thu nhập cao nhất.                    |");
        System.out.println("|    Chức Năng 0: Nhập Thông Tin Sản Phẩm.                                  |");
        System.out.println("+===========================================================================+");
        System.out.print("Chức Năng: ");
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
                    
                break;
                case 2:
                    System.out.println("-----------------------------------------------");
                    
                break;
                case 3: 
                    System.out.println("-----------------------------------------------");
                    
                break;
                case 4: 
                    System.out.println("-----------------------------------------------");
                    
                break;
                case 5: 
                    System.out.println("-----------------------------------------------");
                    
                break;
                case 6: 
                    System.out.println("-----------------------------------------------");
                     
                break;
                case 7:
                    System.out.println("-----------------------------------------------");
                    
                break;
                case 8:
                    System.out.println("-----------------------------------------------");
                    
                break;
                case 9:
                    System.out.println("-----------------------------------------------");
                    
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
