
package thi;

import java.util.Scanner;

public class dochoi extends sanpham{
    private int doTuoiPhuHop;

    public int getDoTuoiPhuHop() {
        return doTuoiPhuHop;
    }

    public void setDoTuoiPhuHop(int doTuoiPhuHop) {
        this.doTuoiPhuHop = doTuoiPhuHop;
    }

    public dochoi() {
    }

    public dochoi(int doTuoiPhuHop, String tenSp, double giaBan) {
        super(tenSp, giaBan);
        this.doTuoiPhuHop = doTuoiPhuHop;
    }
    @Override public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        while(true){
            try{
                System.out.print("Nhập tuổi phù hợp: ");
                setDoTuoiPhuHop(sc.nextInt());
                sc.nextLine();
                break;
            }catch (Exception e){
                System.out.println("Vui lòng nhập số");
                sc.nextLine();
            }
        }
    }
    
    @Override public void xuat(){
        super.xuat();
        System.out.printf("| %-2d\n", getDoTuoiPhuHop());
    }
}
