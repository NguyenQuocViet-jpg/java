
package sd37_lab4;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner sc = new Scanner(System.in);
        
        
        // cách 1 
        sanpham v1 = new sanpham();
        sanpham v2 = new sanpham("Bánh gạo");
        sanpham v3 = new sanpham("bánh mì", 18);
        sanpham v4 = new sanpham("bột ngọt", 30, 3);

        v1.ThueNK();
        v2.ThueNK();
        v3.ThueNK();
        v4.ThueNK();
        v1.input(sc);

        System.out.printf("%-30s | %-12s | %-12s | %-10s \n", "Tên", "Đơn Giá", "Giảm Giá", "Thuế");
        System.out.println("-------------------------------------------------------------------");
        v1.print();
        v2.print();
        v3.print();
        v4.print();

        //cách 2 

        // System.out.print("Bạn muốn nhập bao nhiêu sản phẩm: ");
        // int n = sc.nextInt();
        // sc.nextLine();
        // sanpham taphoa[] = new sanpham[n];
        // for(int i = 0; i < taphoa.length; i++){
        //     taphoa[i] = new sanpham();
        //     System.out.println("Nhập sản phẩm thứ " + (i + 1));
        //     taphoa[i].input(sc);
        // }

        // System.out.printf("%-30s | %-12s | %-12s | %-10s \n", "Tên", "Đơn Giá", "Giảm Giá", "Thuế");
        // System.out.println("-------------------------------------------------------------------");
        // for(int i = 0; i < taphoa.length; i ++){
        //     taphoa[i].print();
        // }

    }
}
