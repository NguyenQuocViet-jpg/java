
package texr03;

import java.util.Scanner;

public class DienThoai {
    String tendt;
    double gia;
    
    public String gettendt(){
        return tendt;
    }
    public void settendt(String tenDT){
        this.tendt = tenDT;
    }
    
    public double getgia(){
        return gia;
    }
    public void setgia(double Gia){
        this.gia = Gia;
    }
    
    public DienThoai (){
        this.tendt = "Chưa có tên";
        this.gia = 0;
    }
    
    public DienThoai (String ten, double Gia){
        this.gia = Gia;
        this.tendt = ten;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên ĐT: ");
        settendt(sc.nextLine().trim());
        
        while(true){
            try{
                System.out.print("Nhập Giá: ");
                setgia(sc.nextDouble());
                sc.nextLine();
                break;
            }catch (Exception e){
                System.out.println("Vui lòng nhập số");
                sc.nextLine();
            }
        }
    }
    
    public void xuat(){
        System.out.printf("%-20s | %-13.2f ", gettendt(), getgia());
    }
}

