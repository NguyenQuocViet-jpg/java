package test01;

import java.util.ArrayList;

public class xehoi extends xe{
    private double dungtichbinhxang;

    public double getDungtichbinhxang() {
        return dungtichbinhxang;
    }

    public void setDungtichbinhxang(double dungtichbinhxang) {
        this.dungtichbinhxang = dungtichbinhxang;
    }

    public xehoi() {
    }

    public xehoi(double dungtichbinhxang) {
        this.dungtichbinhxang = dungtichbinhxang;
    }

    public xehoi(double dungtichbinhxang, String tenxe, int tocdo) {
        super(tenxe, tocdo);
        this.dungtichbinhxang = dungtichbinhxang;
    }
    
    @Override public void xuat(){
        System.out.printf("|%-20s | %-6s | %f \n", getTenxe(), getTocdo(), dungtichbinhxang);
    }
}
