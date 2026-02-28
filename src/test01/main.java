
package test01;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        dsxe danhsach = new dsxe();
        
        xe loai1 = new xehoi(25.6, "honda", 250);
        xe loai2 = new xetai(25, "thaco", 200);
        xe loai3 = new xehoi(17.5, "honda",180);
        xe loai4 = new xehoi(19, "audi", 350);
        
       xe[] mangxe = {loai1, loai2, loai3, loai4};
       
       for(int i = 0; i < mangxe.length; i++){
           danhsach.add(mangxe[i]);
       }
       
       danhsach.xuatthongtinxe();
    }
}
