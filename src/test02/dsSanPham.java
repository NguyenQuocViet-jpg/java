
package test02;

import java.util.ArrayList;
import java.util.Scanner;

public class dsSanPham {
    ArrayList<laptop> ds = new ArrayList<>();
    public void inputSP(){
        Scanner sc = new Scanner(System.in);
        laptop sp;
        do{
            sp = new laptop();
            sp.input();
            ds.add(sp);
            System.out.println("Bạn Có Muốn Nhập Tiếp Không (Y/N)");
            String nhap = sc.nextLine().trim();
            System.out.println("-------------------");
            if(nhap.equalsIgnoreCase("n"))
                break;
        }while(true);
    }
    public void printSP(){
        System.out.printf("%-10s | %-20s | %s\n", "Mã SP", "Tên SP", "Khối Lượng");
        System.out.println("----------------------------------------------");
        for(laptop moi: ds){
            moi.print();
        }
    }
}
