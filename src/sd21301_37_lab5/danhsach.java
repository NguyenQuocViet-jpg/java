
package sd21301_37_lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class danhsach {
    ArrayList <sanpham> danhSach = new ArrayList<>();
    
    public void inputSP(Scanner sc)
    {
        System.out.print("Số Lượng Sản Phẩm Muốn Nhập: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            sanpham sp = new sanpham();
            System.out.println("--- Nhập Sản Phẩm thứ " + (i + 1) + " ---");
            sp.input(sc);
            danhSach.add(sp);
        }
    }
    public void printSP(Scanner sc)
    {
        System.out.printf("%-15s | %-12s | %-12s | %-10s \n", "Tên", "Đơn Giá", "Giảm Giá", "Thuế");
        System.out.println("-------------------------------------------------------------------");
        for(sanpham x : danhSach){
            x.print();
        }
    }
}
