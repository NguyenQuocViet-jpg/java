
package sd21301_37_lab5;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class main {
    static void MENU(){
        System.out.println("+=========================================================================+");
        System.out.println("|                                   MENU                                  |");
        System.out.println("+=========================================================================+");
        System.out.println("|    Chức Năng 1: Nhập Danh Sách Sản Phẩm.                                |");
        System.out.println("|    Chức Năng 2: Hiển Thị Danh Sách Vừa Nhập.                            |");
        System.out.println("|    Chức Năng 3: Xuất Giá trung Bình Của Sản Phẩm.                       |");
        System.out.println("|    Chức Năng 4: Sắp Xếp Giảm Dần Theo Giá Sản Phẩm Và Xuất Danh Sách.   |");
        System.out.println("|    Chức Năng 5: Tìm và Xóa Họ Tên Nhập Từ Bàn Phím.                     |");
        System.out.println("|    Chức Năng 6: Thêm Một Sản Phẩm Tại Vị Trí.                           |");
        System.out.println("|    Chức Năng 7: Cập Nhật Sản Phẩm Theo Tên.                             |");
        System.out.println("|    Chức Năng 8: Xuất Danh Sách Sản Phẩm Trên Giá Trung Bình.            |");
        System.out.println("|    Chức Năng 0: Thoát Chương Trình.                                     |");
        System.out.println("+=========================================================================+");
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
                    System.out.println("Giá Trung Bình Của Sản phẩm: " + sp.trungBinhGia());
                break;
                case 4: 
                    System.out.println("-----------------------------------------------");
                    sp.sapXepgiam();
                    sp.printSP(sc);
                break;
                case 5: 
                    System.out.println("-----------------------------------------------");
                    System.out.print("Nhập Tên Sản Phẩm Muốn Xóa: ");
                    String tensp = "";
                    tensp = sc.nextLine();
                    System.out.print("Bạn có Muốn Xóa Không(Y/N)");
                    String c = "";
                    c = sc.nextLine();
                    if(c.toLowerCase().equals("y")){
                        sp.deleteSP(tensp);
                        System.out.println("Đã Xóa Thành Công.");
                    }
                    
                break;
                case 6: 
                    System.out.println("-----------------------------------------------");
                    System.out.print("Vị Trí Muốn Thêm Sản Phẩm: ");
                    int b = sc.nextInt();
                    sc.nextLine();
                    sp.ThemSP(b, sc);
                break;
                case 8:
                    System.out.println("-----------------------------------------------");
                    sp.giaTrentb();
                break;
                case 0:
                    System.out.println("Đang Thoát Chương Trình,\nTạm Biệt Hẹn gặp Lại.");
                break; 
                default:
                    System.out.println("Chương Trình Chưa Có Chức Năng Này.");
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