
package texr03;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    ArrayList<DienThoai> danhsach = new ArrayList<>();
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        DienThoai moi = new DienThoai();

        System.out.print("Bạn muốn nhập loại nào (Smartphone = SP | FeaturePhone = FP)\n:");
        String loai = sc.nextLine().trim();
        if(loai.equalsIgnoreCase("SP")){
            
            do{
                moi = new Smartphone();
                moi.nhap();
                danhsach.add(moi);
                System.out.print("Bạn muốn nhập nữa hay không(Y/N): ");
                String tiep = sc.nextLine().trim();
                if(tiep.equalsIgnoreCase("n"))
                    break;
            }while(true);
        }else if(loai.equalsIgnoreCase("FP")){
            
            do{
                moi = new Featurephone();
                moi.nhap();
                danhsach.add(moi);
                System.out.print("Bạn muốn nhập nữa hay không(Y/N): ");
                String tiep = sc.nextLine().trim();
                if(tiep.equalsIgnoreCase("n"))
                    break;
            }while(true);
        }else{
            System.out.println("Không tìm thấy loại hàng này.");
        }
    }
    
    public void print(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn Muốn xuất loại nào (Smartphone = SP | FeaturePhone = FP | Tất cả)\n:");
        String tiep = sc.nextLine().trim();
        if(tiep.equalsIgnoreCase("SP")){
            System.out.printf("%-20s | %-13s | %s\n", "Tên ĐT", "Giá", "Dung Lượng Pin");
            for(DienThoai moi: danhsach)
                if(moi instanceof Smartphone)
                    moi.xuat();
        }else if(tiep.equalsIgnoreCase("FP")){
            System.out.printf("%-20s | %-13s | %s\n", "Tên ĐT", "Giá", "Bàn Phím");
            for(DienThoai moi: danhsach)
                if(moi instanceof Featurephone)
                    moi.xuat();
        }else if(tiep.equalsIgnoreCase("tất cả")){
            
            System.out.printf("%-20s | %-13s | %s\n", "Tên ĐT", "Giá", "Dung Lượng Pin");
            for(DienThoai moi: danhsach)
                if(moi instanceof Smartphone)
                    moi.xuat();
            System.out.println("=======================================================");
            System.out.printf("%-20s | %-13s | %s\n", "Tên ĐT", "Giá", "Bàn Phím");
            for(DienThoai moi: danhsach)
                if(moi instanceof Featurephone)
                    moi.xuat();
        }else{
            System.out.println("Không tìm thấy loại hàng này.");
        }
    }
    
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner sc = new Scanner(System.in);
        main sp = new main();
        
        do{
            sp.input();
            System.out.print("Bạn có muốn nhập sản phẩm khác Không (Y/N)\n:");
            String tiep = sc.nextLine().trim();
            if(tiep.equalsIgnoreCase("n"))
                break;
            System.out.println("\n". repeat(50));
        }while(true);
        System.out.println("\n". repeat(50));
        do{
            sp.print();
            System.out.print("Bạn có muốn xuất sản phẩm khác Không (Y/N)\n:");
            String tiep = sc.nextLine().trim();
            if(tiep.equalsIgnoreCase("n"))
                break;
            System.out.println("\n". repeat(50));
        }while(true);
        System.out.println("\n". repeat(5));
        System.out.println("Tạm Biệt, Hẹn Gặp Lại.");
    }
}
