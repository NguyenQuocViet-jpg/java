
package sd21301_37_lab5;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class main {
    static void MENU(){
        System.out.println("+=======================================================+");
        System.out.println("|                          MENU                         |");
        System.out.println("+=======================================================+");
        System.out.println("|    Chức Năng 1: Nhập Danh Sách Họ Và Tên.             |");
        System.out.println("|    Chức Năng 2: Hiển Thị Danh Sách Vừa Nhập.          |");
        System.out.println("|    Chức Năng 3: Xuất Danh Sách Ngẫu Nhiên.            |");
        System.out.println("|    Chức Năng 4: Sắp Xếp Giảm Dần Và Xuất Danh Sách.   |");
        System.out.println("|    Chức Năng 5: Tìm và Xóa Họ Tên Nhập Từ Bàn Phím.   |");
        System.out.println("|    Chức Năng 0: Thoát Chương Trình.                   |");
        System.out.println("+=======================================================+");
        System.out.print("Chức Năng: ");
    }
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner sc = new Scanner(System.in);
        
        danhsach sp = new danhsach();
        int chucnang;
        do{
            MENU();
            chucnang = sc.nextInt();
            sc.nextLine();
            switch(chucnang){
                case 1:
                    System.out.println("-----------------------------------------------");
                    sp.inputSP(sc);
                break;
                case 2:
                    System.out.println("-----------------------------------------------");
                    sp.printSP(sc);
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
            }
            if(chucnang != 0){
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
            System.out.println("\n". repeat(50));
        }while(chucnang != 0);
    }
}
