
package ASSIGNMENT;

import java.util.Scanner;

public class NVTruongPhong extends nhanvien{
    private double trachNhiem;
    
    public double getTrachNhiem(){
        return trachNhiem;
    }
    public void setTrachNhiem(double trachnhiem){
        this.trachNhiem = trachnhiem;
    }

    public NVTruongPhong() {
    }

    public NVTruongPhong(String loainv) {
        super(loainv);
    }
    
    @Override public double thuNhap(){
        return getLuong() + getTrachNhiem();
    }
    @Override public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        setManv(sc.nextLine().trim());
        System.out.print("Nhập tên nhân viên: ");
        setHoten(sc.nextLine().trim());
        while(true){
            try{
                System.out.print("Nhập lương nhân viên: ");
                setLuong(sc.nextDouble());
                sc.nextLine();
                break;
            }catch (Exception e){
                System.out.println("Vui lòng Nhập số");
                sc.nextLine();
            }
        }
        while(true){
            try{
                System.out.print("Nhập lương trách nhiệm của trưởng phòng: ");
                setTrachNhiem(sc.nextDouble());
                sc.nextLine();
                break;
            }catch(Exception e){
                System.out.println("Vui lòng nhập số");
                sc.nextLine();
            }
        }
    }
    @Override public void xuat(){
        System.out.printf("%-12s | %-20s | %-10.2f | %-10.2f | %-10.2f | %-10.2f \n"
                , getManv(), getHoten(), getLuong(), getTrachNhiem(), thuNhap(), thueTN());
    }
}
