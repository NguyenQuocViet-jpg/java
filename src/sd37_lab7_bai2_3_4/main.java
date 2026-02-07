
package sd37_lab7_bai2_3_4;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import sd21301_37_lab5.danhsach;

public class main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        dsSinhVien sv = new dsSinhVien();
        sv.nhapdanhsach();
        sv.xuatDanhSach();
    }
}
