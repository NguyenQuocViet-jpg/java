
package sd37_lab4;

import java.util.Scanner;

public class sanpham {
    private String Ten;
    private double donGia;
    private double giamGia;
    public String getTen()
    {
        return Ten;
    }
    public void setTen(String ten)
    {
        Ten = ten;
    }
    
    public double getdonGia()
    {
        return donGia;
    }
    public void setdonGia(double DonGia)
    {
        donGia = DonGia;
    }
    
    public double getgiamGia()
    {
        return giamGia;
    }
    public void setgiamGia(double GiamGia)
    {
        giamGia = GiamGia;
    }
    
    public sanpham(){}
    
    public sanpham(String ten)
    {
        Ten = ten;
        donGia = 0;
        giamGia = 0;
    }
    public sanpham(String ten, double dongia)
    {
        Ten = ten;
        donGia = dongia;
        giamGia = 0;
    }
    public sanpham(String ten, double dongia, double giamgia)
    {
        Ten = ten;
        donGia = dongia;
        giamGia = giamgia;
    }
    
    public double ThueNK()
    {
        return donGia * 0.1;
    }

    public void input(Scanner sc){
        System.out.print("Tên sản phẩm: ");
        Ten = sc.nextLine();

        System.out.print("Đơn giá: ");
        donGia = sc.nextDouble();

        System.out.print("Giảm Giá: ");
        giamGia = sc.nextDouble();
        sc.nextLine();
    }
    public void print(){
        
        System.out.printf("%-30s | %-12.2f | %-12.2f | %.2f \n", Ten, donGia, giamGia, ThueNK());
    }

}
