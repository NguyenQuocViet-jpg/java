
package sd37_lab7_bai1;

import java.util.Scanner;

public class hinhchunhat {
    private float chieuDai;
    private float chieuRong;

    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }

    public hinhchunhat() {
    }

    public hinhchunhat(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public float chuvi(){
        return (chieuDai+chieuRong)*2;
    }
    public float dientich(){
        return chieuDai*chieuRong;
    }
    public void inputcn(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Chiều Dài: ");
        setChieuDai(sc.nextFloat());
        System.out.print("Chiều Rộng: ");
        setChieuRong(sc.nextFloat());
    }
    public void printcn(){
        System.out.println("Chu Vi: " + (chuvi()));
        System.out.println("Diện Tích: " + (dientich()));
    }
        
}
