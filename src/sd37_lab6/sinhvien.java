
package sd37_lab6;

import java.util.Scanner;

public class sinhvien {
    private String ten;
    private String masv;
    private float diem;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public sinhvien() {
    }

    public sinhvien(String ten, String masv, float diem) {
        this.ten = ten;
        this.masv = masv;
        this.diem = diem;
    }
    public String hocluc(){
        if(getDiem() < 5 ) return "Yếu";
        else if(getDiem() < 6.5) return "Trung bình";
        else if(getDiem() < 7.5) return "Khá";
        else if(getDiem() < 9) return "Giỏi";
        else return "Xuất sắc";
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã số sinh viên: ");
        setMasv(sc.nextLine().trim());
        System.out.print("Nhập họ và tên: ");
        setTen(sc.nextLine().trim());
        while(true){
            try{
                System.out.print("Nhập điểm: ");
                setDiem(sc.nextFloat());
                sc.nextLine();
                break;
            }catch (Exception e){
                System.out.println("Vui lòng nhập số");
                sc.nextLine();
            }
        }
    }
    
    public void print(){
        System.out.printf("%-10s | %-25s | %-5.2f | %s\n", getMasv(), getTen(), getDiem(), hocluc());
    }
}
