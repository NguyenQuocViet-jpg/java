
package sd37_lab7_bai2_3_4;

import java.util.Scanner;

public class sinhVienIT extends sinhVienPoly{
    private double diemjava;
    private double diemhtml;
    private double diemcss;

    public double getDiẹmava() {
        return diemjava;
    }

    public void setDiẹmava(double diẹmava) {
        this.diemjava = diẹmava;
    }

    public double getDiemhtml() {
        return diemhtml;
    }

    public void setDiemhtml(double diemhtml) {
        this.diemhtml = diemhtml;
    }

    public double getDiemcss() {
        return diemcss;
    }

    public void setDiemcss(double diemcss) {
        this.diemcss = diemcss;
    }

    public sinhVienIT() {
    }

    public sinhVienIT(String Nganh) {
        super(Nganh);
    }

    public sinhVienIT(double diẹmava, double diemhtml, double diemcss, String Nganh, String hoten) {
        super(Nganh, hoten);
        this.diemjava = diẹmava;
        this.diemhtml = diemhtml;
        this.diemcss = diemcss;
    }
    @Override public double getdiemtb(){
        return (2*diemjava + diemhtml + diemcss)/4;
    }
    @Override public void inputsv(){
    Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Họ và Tên: ");
        setHoten(sc.nextLine());
        System.out.print("Nhập Điểm CSS: ");
        diemcss = sc.nextDouble();
        System.out.print("Nhập Điểm HTML: ");
        diemhtml = sc.nextDouble();
        System.out.print("Nhập Điểm Java: ");
        diemjava = sc.nextDouble();
    }
    @Override public void printsv(){
        System.out.printf(" %-10S | %20s | %-4.2f | %-4.2f | %-4.2f | %-4.2f | %-10s\n", getNganh(), getHoten(), diemcss, diemhtml, diemjava, getdiemtb(), getHocLuc());
    }
}
