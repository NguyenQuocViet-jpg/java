
package thi;

import java.util.Scanner;

public class sanpham {
    private String tenSp;
    private double giaSp;

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getGiaBan() {
        return giaSp;
    }

    public void setGiaBan(double giaBan) {
        this.giaSp = giaBan;
    }

    public sanpham() {
        this.tenSp = "Chưa có tên";
        this.giaSp = 0;
        
    }

    public sanpham(String tenSp, double giaBan) {
        this.tenSp = tenSp;
        this.giaSp = giaBan;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        setTenSp(sc.nextLine().trim());
        
        while(true){
            try{
               System.out.print("Nhập giá sản phẩm: ");
                setGiaBan(sc.nextDouble()); 
                sc.nextLine();
                break;
            }catch (Exception e){
                System.out.println("VUi lòng nhập số");
                sc.nextLine();
            }
        }
        
    }
    public void xuat(){
        System.out.printf("%-20s | %-13.2f ", getTenSp(), getGiaBan());
    }
}
