
package texr03;

import java.util.Scanner;

public class Smartphone extends DienThoai{
    int dungluongpin;
    
    public int getdungluongpin(){
        return dungluongpin;
    }
    public void setdungluongpin(int dungluong){
        this.dungluongpin = dungluong;
    }
    
    public Smartphone (){
    }
    
    public Smartphone(String ten, double Gia, int dungluong){
        super(ten, Gia);
        this.dungluongpin = dungluong;
    }
    @Override public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.print("Nhập dung lượng pin: ");
                setdungluongpin(sc.nextInt());
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
        System.out.printf("| %d\n", getdungluongpin());
    }
}
