
package sd37_lab6;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner s = new Scanner(System.in);
        dsSinhvien sv = new dsSinhvien();
        int chuc_nang;
        do{
            System.out.println("+===========================================================================+");
            System.out.println("|                                    MENU                                   |");
            System.out.println("+===========================================================================+");
            System.out.println("|    Chức Năng 1: Nhập Danh Sách Sinh Viên.                                 |");
            System.out.println("|    Chức Năng 2: Hiển Thị Danh Sách Vừa Nhập.                              |");
            System.out.println("|    Chức Năng 3: Xuất Điểm trung Bình Của Sinh Viên.                       |");
            System.out.println("|    Chức Năng 4: Sắp Xếp Giảm Dần Theo Điểm Sinh Viên Và Xuất Danh Sách.   |");
            System.out.println("|    Chức Năng 5: Tìm và Xóa Họ Tên Nhập Từ Bàn Phím.                       |");
            System.out.println("|    Chức Năng 6: Thêm Một Sinh viên Tại Vị Trí.                            |");
            System.out.println("|    Chức Năng 7: Cập Nhật Thông Tin Sinh Viên Theo Tên.                    |");
            System.out.println("|    Chức Năng 8: Xuất Danh Sách Sinh viên Trên Điểm Trung Bình.            |");
            System.out.println("|    Chức Năng 0: Thoát Chương Trình.                                       |");
            System.out.println("+===========================================================================+");
            while(true){
                try{
                    System.out.print("Chức năng: ");
                    chuc_nang = s.nextInt();
                    s.nextLine();
                    break;
                }catch (Exception e){
                    System.out.println("Vui lòng nhập số");
                    s.nextLine();
                }
            }
            switch(chuc_nang){
                case 0: 
                    System.out.println("--------------------");
                    System.out.println("Đang thoát chương trình.");
                    System.out.println("Tạm biệt, hẹn gặp lại.");
                break;
                case 1:
                    System.out.println("--------------------");
                    do{
                        sv.inputsv();
                        System.out.println("Bạn muốn nhập nữa hay không (Y/N)");
                        String y = s.nextLine();
                        if(y.equalsIgnoreCase("n"))
                            break;
                    }while(true);
                break;
                case 2: 
                    System.out.println("--------------------");
                    sv.printsv();
                break;
                case 3: 
                    System.out.println("--------------------");
                    System.out.println("Điểm trung bình của sinh viên là: " + sv.diemTrungBinh());
                break;
                case 4:
                    System.out.println("--------------------");
                    System.out.println("Sắp xếp sinh viên theo điểm giảm dần: ");
                    sv.sapXepgiam();
                    sv.printsv();
                break;
                case 5:
                    System.out.println("--------------------");
                    System.out.print("Nhập mã của sinh viên muốn xóa: ");
                    sv.deleteSP();
                break;
                case 6:
                    System.out.println("--------------------");
                    sv.ThemSP();
                break;
                case 7:
                    System.out.println("--------------------");
                    System.out.print("Nhập mã của sinh viên muốn chỉnh sửa: ");
                    sv.chinhSuaSV();
                break;
                case 8:
                    System.out.println("--------------------");
                    sv.diemTrentb();
                break;
                default:
                    System.out.println("Hiện chương trình chưa có chức năng này.");
            }
            if(chuc_nang != 0){
                System.out.println("-----------------------------------------------");
                System.out.println("Vui Lòng Bấm Phím 1 Để Quay Lại Menu.");
                int k;
                do{
                    k = s.nextInt();
                    if(k != 1 ){
                        System.out.println("-----------------------------------------------");
                        System.out.println("Phím Nhập Không Đúng. \nVui Lòng Bấm Phím 1 Để Quay Lại Menu.");
                    }
                }while(k != 1);
            }
            System.out.println("\n". repeat(50));
            
        }while(chuc_nang != 0);
    }
}
