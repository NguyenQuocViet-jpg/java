
package texr03;

import java.util.Scanner;

public class Featurephone extends DienThoai{
    boolean coBanPhim;
    
    public boolean getcoBanPhim(){
        return coBanPhim;
    }
    public void setcoBanPhim(boolean banphim){
        this.coBanPhim = banphim;
    }
    
    public Featurephone(){
    }
    
    public Featurephone(String ten, double Gia, boolean banphim){
        super(ten, Gia);
        this.coBanPhim = banphim;
    }
    
    @Override public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Có bàn phím không (Y/N): ");
        String phim = sc.nextLine().trim();
        if(phim.equalsIgnoreCase("n"))
            setcoBanPhim(false);
        else 
            setcoBanPhim(true);
    }
    
    @Override public void xuat(){
        super.xuat();
        String banphim;
        if(getcoBanPhim())
            banphim = "Có";
        else 
            banphim = "Không";
        System.out.printf("| %-6s\n", banphim);
    }
}
