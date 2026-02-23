
package ASSIGNMENT;

abstract public class nhanvien {
    private String manv;
    private String hoten;
    private String loainv;
    private double luong;

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    public String getLoainv() {
        return loainv;
    }

    public void setLoainv(String loainv) {
        this.loainv = loainv;
    }

    public nhanvien() {
    }

    public nhanvien(String loainv) {
        this.loainv = loainv;
    }

    public nhanvien(String manv, String hoten, double luong) {
        this.manv = manv;
        this.hoten = hoten;
        this.luong = luong;
    }
    
    abstract public double thuNhap();
    abstract public void nhap();
    abstract public void xuat();
    
    public double thueTN(){
        double tn = thuNhap();
        if(tn < 9000000){
            return 0;
        }else if(tn <= 15000000){
            return tn * 0.1;
        }else 
            return tn * 0.12;
    }
}