
package thi;

import java.util.Scanner;

public class sach extends sanpham{
    private String tacGia;

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public sach() {
    }

    public sach(String tacGia, String tenSp, double giaBan) {
        super(tenSp, giaBan);
        this.tacGia = tacGia;
    }
    @Override public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhập tên tác giả: ");
        setTacGia(sc.nextLine().trim());
    }
    @Override public void xuat(){
        super.xuat();
        System.out.printf("| %-20s\n", getTacGia());
    }
}
