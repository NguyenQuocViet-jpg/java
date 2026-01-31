
package sd37_lab3;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class new1 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,5,3,4,5};
        int nguyen = sc.nextInt();
        int vitri = -1;
        for(int i = 0; i < arr.length; i++){
            if(nguyen == arr[i]){
                vitri = i;
                break;
            }
        }
        if(vitri < 0) System.out.println("không có giá trị " + nguyen + " trong mảng");
        else System.out.println("Giá trị " + nguyen + " ở index " + vitri);
    }
}
