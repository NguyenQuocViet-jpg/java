
package ASSIGNMENT;

import java.util.Scanner;

public class NVTiepThi extends nhanvien{
    private double doanhso;
    private double huehong;

    public double getDoanhso() {
        return doanhso;
    }

    public void setDoanhso(double doanhso) {
        this.doanhso = doanhso;
    }

    public double getHuehong() {
        return huehong;
    }

    public void setHuehong(double hueHong) {
        this.huehong = hueHong;
    }

    public NVTiepThi() {
    }

    public NVTiepThi(double doanhso, double hueHong) {
        this.doanhso = doanhso;
        this.huehong = hueHong;
    }
    
    public NVTiepThi(String loaiNV){
        super(loaiNV);
    }
    
    @Override public double thuNhap(){
        return getLuong() + doanhso * huehong;
    }
    @Override public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        setManv(sc.nextLine());
        System.out.print("Nhập tên nhân viên: ");
        setHoten(sc.nextLine());
        System.out.print("Nhập lương nhân viên: ");
        setLuong(sc.nextDouble());
        System.out.print("Nhập doanh số: ");
        setDoanhso(sc.nextDouble());
        System.out.print("Nhập huê hồng (%): ");
        setHuehong(sc.nextDouble()/100);
    }
    @Override public void xuat(){
        System.out.printf("%-12s | %-20s | %-10.2f | %-10.2f | %-10.2f | %-10.2f | %-10.2f\n"
                , getManv(), getHoten(), getDoanhso(), getHuehong(), getLuong(), thuNhap(), thueTN());
    }
}
