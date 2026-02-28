
package test01;

import java.util.ArrayList;
import java.util.Scanner;

public class dsxe{
    ArrayList<xe> ds = new ArrayList<>();
    public void xuatthongtinxe(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn muốn xuất loại xe nào (xe hơi | xe tải | tất cả)\n: ");
        String loai = sc.nextLine().trim();
        if(loai.equalsIgnoreCase("xe hơi")){
            System.out.println("+===================================================");
            System.out.printf("|%-20s | %-6s | %s\n", "Tên xe", "Tốc Độ", "Dung tích bình xăng");
            System.out.println("|---------------------------------------------------");
            for(xe moi: ds){
                if(moi instanceof xehoi){
                    moi.xuat();
                }
            }
        }else if(loai.equalsIgnoreCase("xe tải")){
            System.out.println("+=========================================");
            System.out.printf("|%-20s | %-6s | %s \n", "Tên xe", "Tốc độ", "Tải trọng");
            for(xe moi: ds){
                if(moi instanceof xetai)
                    moi.xuat();
            }
        }else if(loai.equalsIgnoreCase("tất cả")){
            System.out.println("+===================================================");
            System.out.printf("|%-20s | %-6s | %s\n", "Tên xe", "Tốc Độ", "Dung tích bình xăng");
            System.out.println("|---------------------------------------------------");
            for(xe moi: ds){
                if(moi instanceof xehoi){
                    
                    moi.xuat();
                }
            }
            System.out.println("+===================================================");
            System.out.println("\n");
            System.out.println("+=========================================");
            System.out.printf("|%-20s | %-6s | %s \n", "Tên xe", "Tốc độ", "Tải trọng");
            System.out.println("|-----------------------------------------");
            for(xe moi: ds){
                if(moi instanceof xetai){
                    
                    moi.xuat();
                }
            }
            System.out.println("+=========================================");
        }
    }
    
    public void add(xe x){
        ds.add(x);
    }
}
