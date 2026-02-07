
package sd37_lab7_bai2_3_4;

import java.util.Scanner;

public class sinhVienBiz extends sinhVienPoly{
    private double diemMarKeting;
    private double diemSale;

    public double getDiemMarKeting() {
        return diemMarKeting;
    }

    public void setDiemMarKeting(double diemMarKeting) {
        this.diemMarKeting = diemMarKeting;
    }

    public double getDiemSale() {
        return diemSale;
    }

    public void setDiemSale(double diemSale) {
        this.diemSale = diemSale;
    }

    public sinhVienBiz() {
    }

    public sinhVienBiz(String Nganh) {
        super(Nganh);
    }

    public sinhVienBiz(double diemMarKeting, double diemSale, String Nganh, String hoten) {
        super(Nganh, hoten);
        this.diemMarKeting = diemMarKeting;
        this.diemSale = diemSale;
    }
    
    @Override public double getdiemtb(){
        return (2*diemMarKeting + diemSale) / 3;
    }
    @Override public void inputsv(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Họ và Tên: ");
        setHoten(sc.nextLine());
        System.out.print("Nhập Điểm marketing: ");
        diemMarKeting = sc.nextDouble();
        System.out.print("Nhập Điểm Sale: ");
        diemSale = sc.nextDouble();
    }
    @Override public void printsv(){
        System.out.printf(" %-10S | %20s | %-4.2f | %-4.2f | %-4.2f | %-10s\n", getNganh(), getHoten(), diemMarKeting, diemSale, getdiemtb(), getHocLuc());
    }
}