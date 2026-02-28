
package sd37_lab6;

import java.util.Scanner;

public class sinhvien {
    private String ten;
    private String masv;
    private float diem;
    private String email;
    private String sdt;
    private String cccd;
    private String Email = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private String SDT = "^0\\d{9}$";
    private String CCCD = "^\\d{12}$";
    
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
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
    
    public boolean kiemTraEmail(String email) {
        return email.matches(Email);
    }

    public boolean kiemTraSDT(String sdt) {
        return sdt.matches(SDT);
    }

    public boolean kiemTraCCCD(String cccd) {
        return cccd.matches(CCCD);
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã số sinh viên: ");
        setMasv(sc.nextLine().trim());
        System.out.print("Nhập họ và tên: ");
        setTen(sc.nextLine().trim());
        
        String eMail;
        do{
            System.out.print("Nhập Email: ");
            eMail = sc.nextLine().trim();
            if(!kiemTraEmail(eMail))
                System.out.println("Bạn nhập không đúng định dạng email,\nVui lòng nhập lại.");
        }while(!kiemTraEmail(eMail));
        setEmail(eMail);
        
        String sDt;
        do{
            System.out.print("Nhập SĐT: ");
            sDt = sc.nextLine().trim();
            if(!kiemTraSDT(sDt))
                System.out.println("Bạn nhập không đúng đinh dạng số điện thoại,\nVui lòng nhập lại.");
        }while(!kiemTraSDT(sDt));
        setSdt(sDt);
        
        String cCcd;
        do{
            System.out.print("Nhập CCCD: ");
            cCcd = sc.nextLine().trim();
            if(!kiemTraCCCD(cCcd))
                System.out.println("Bạn nhập không đúng của định dạng CCCD,\nVui lòng nhập lại.");
        }while(!kiemTraCCCD(cCcd));
        setCccd(cCcd);
        
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
        System.out.printf("%-10s | %-25s | %-5.2f | %-10s | %-12s | %-12s | %s\n", getMasv(), getTen(), getDiem(), hocluc(), getSdt(), getCccd(), getEmail());
    }
}
