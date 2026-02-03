
package sd37_lab7_bai1;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        hinhchunhat cn = new hinhchunhat(4, 5);
        hinhvuong hv = new hinhvuong(6);
        System.out.println("HÌNH CHỮ NHẬT");
        System.out.println("Diện tích Hình Chữ Nhật: " + cn.dientich());
        System.out.println("Chu Vi Hình Chữ Nhật: " + cn.chuvi());
        System.out.println("");
        System.out.println("HÌNH VUÔNG");
        System.out.println("Diện Tích Hình Vuông: " + hv.dientich());
        System.out.println("Chu Vi Hình Vuông: " + hv.chuvi());
    }
}
