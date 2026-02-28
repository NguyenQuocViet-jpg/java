
package test02;

import java.util.Scanner;

public class laptop {
    private String masp;
    private String tensp;
    private float cannang;

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public double getCannang() {
        return cannang;
    }

    public void setCannang(float cannang) {
        this.cannang = cannang;
    }

    public laptop() {
    }

    public laptop(String masp, String tensp, float cannang) {
        this.masp = masp;
        this.tensp = tensp;
        this.cannang = cannang;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Mã SP: ");
        setMasp(sc.nextLine().trim());
        System.out.print("Nhập Tên SP: ");
        setTensp(sc.nextLine().trim());
        
        
        while(true){
            try{
                System.out.print("Nhập Cân Nặng SP: ");
                setCannang(sc.nextFloat());
                sc.nextLine();
                break;
            }catch (Exception e){
                System.out.println("Vui Lòng Nhập Số");
                sc.nextLine();
            }
        }
    }
    public void print(){
        System.out.printf("%-10s | %-20s | %.2f\n", getMasp(), getTensp(), getCannang());
    }
}
