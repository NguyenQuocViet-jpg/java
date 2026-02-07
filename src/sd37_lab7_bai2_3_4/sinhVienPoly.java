
package sd37_lab7_bai2_3_4;

abstract public class sinhVienPoly {
    private String Nganh;
    private String hoten;

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public sinhVienPoly() {
    }

    public sinhVienPoly(String Nganh) {
        this.Nganh = Nganh;
    }


    public sinhVienPoly(String Nganh, String hoten) {
        this.Nganh = Nganh;
        this.hoten = hoten;
    }
    abstract public double getdiemtb();
    abstract public void inputsv();
    abstract public void printsv();
    
    public String getHocLuc(){
        double dtb = getdiemtb();
        if(dtb >= 9) return "Xuất Sắc";
        else if(dtb >=8 ) return "Giỏi";
        else if(dtb >= 6.5) return "Khá";
        else if(dtb >= 5) return "Trung Bình";
        else return "Yếu";
    }
}
