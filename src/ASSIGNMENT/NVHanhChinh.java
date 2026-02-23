package ASSIGNMENT;

import java.util.Scanner;

public class NVHanhChinh extends nhanvien{

    public NVHanhChinh() {
    }

    
    public NVHanhChinh(String loainv) {
        super(loainv);
    }

    @Override public double thuNhap(){
        return getLuong();
    }
    @Override public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        setManv(sc.nextLine());
        System.out.print("Nhập tên nhân viên: ");
        setHoten(sc.nextLine());
        while(true){
            try{
                System.out.print("Nhập lương nhân viên: ");
                setLuong(sc.nextDouble());
                sc.nextLine();
                break;
            }catch (Exception e){
                System.out.println("Vui lòng nhập số");
                sc.nextLine();
            }
        }
        
    }
    @Override public void xuat(){
        System.out.printf("%-12s | %-20s | %-10.2f | %-10.2f | %-10.2f \n"
                , getManv(), getHoten(), getLuong(), thuNhap(), thueTN());
    }
    
}
