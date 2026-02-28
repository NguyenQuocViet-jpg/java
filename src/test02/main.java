
package test02;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner sc = new Scanner(System.in);
        
        dsSanPham sp = new dsSanPham();
        int chucNang;
        do{
            System.out.println(">> Chức Năng 1: Nhập Laptop. ");
            System.out.println(">> Chức Năng 2: Xuất Laptop. ");
            System.out.println(">> Chức Năng 3: Thoát Chương Trình. ");
            System.out.println("------------------------------------");
            while(true){
                try{
                    System.out.print("Chức Năng: ");
                    chucNang = sc.nextInt();
                    sc.nextLine();
                    break;
                }catch (Exception e){
                    System.out.println("Vui Lòng Nhập Số");
                    sc.nextLine();
                }
            }
            
            switch(chucNang){
                case 1: 
                    System.out.println("------------------");
                    System.out.println("\n". repeat(50));
                    sp.inputSP();
                break;
                case 2: 
                    System.out.println("------------------");
                    System.out.println("\n". repeat(50));
                    sp.printSP();
                break;
                case 3: 
                    System.out.println("------------------");
                    System.out.println("Đang Thoát Chương Trình,\nTạm Biệt Hẹn Gặp Lại.");
                break;
                default: 
                    System.out.println("Hiện Chương Trình Chưa Có Chức Năng Này.");
            }
            if(chucNang != 3){
                System.out.println("\n". repeat(10));
                System.out.println("------------------");
                System.out.println("Bấm Phím 1 Để Quay Lại Menu.");
                int dung;
                do{
                    dung = sc.nextInt();
                    if(dung != 1)
                        System.out.println("Phím Nhập Không Đúng.");
                }while(dung != 1);
            }
            System.out.println("\n". repeat(50));
        }while(chucNang != 3);        
    }
}