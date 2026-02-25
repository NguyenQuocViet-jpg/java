
package sd37_lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class dsSinhvien {
    ArrayList<sinhvien> ds = new ArrayList<>();
    public void inputsv(){
        sinhvien sv = new sinhvien();
        sv.input();
        ds.add(sv);
    }
    public void printsv(){
        System.out.printf("%-10s | %-25s | %-5s | %s\n", "Mã SV", "Họ và Tên", "Điểm", "Học lực");
        System.out.println("-------------------------------------------------------------------");
        for(sinhvien f: ds){
            f.print();
        }
    }
    public float diemTrungBinh(){
        int tong = 0;
        for(int i = 0; i < ds.size(); i++){
            sinhvien sp = ds.get(i);
            tong += sp.getDiem();
        }
        float tb = tong / ds.size();
        return tb;
    }
    public void sapXepgiam(){
        for(int i = 0; i < ds.size() - 1; i++){
            for(int j = i + 1; j < ds.size(); j++){
                sinhvien sp1 = ds.get(i);
                sinhvien sp2 = ds.get(j);
                if(sp1.getDiem()< sp2.getDiem()){
                    Collections.swap(ds, i, j);
                }
            }
        }
    }
    public int timkiemSP(){
        Scanner sc = new Scanner(System.in);
        
        String ma = sc.nextLine().trim();
        int index = -1;
        for(int i = 0; i < ds.size(); i++)
        {
            sinhvien s = (sinhvien) ds.get(i);
            if(s.getMasv().equalsIgnoreCase(ma))
                return i;
        }
        return -1;
    }
    public void deleteSP(){
        Scanner sc = new Scanner(System.in);
        int index = timkiemSP();
        if(index < 0){
            System.out.println("Không tìm thấy sản phẩm trong danh sách");
        }else{
            System.out.print("Bạn có Muốn Xóa Không(Y/N)");
            String c = sc.nextLine();
            if(c.toLowerCase().equals("y")){
                ds.remove(index);
                System.out.println("Đã Xóa Thành Công.");
            }
            
        }
    }
    public void ThemSP(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Vị trí bạn muốn thêm sinh viên: ");
        int vitri = sc.nextInt();
        sinhvien sp = new sinhvien();
        sp.input();
        if(vitri > ds.size())
            ds.add(sp);
        else
            ds.add(vitri,sp);
    }
    public void chinhSuaSV(){
        Scanner sc = new Scanner(System.in);
        int index = timkiemSP();
        if(index < 0) System.out.println("Không tìm thấy sinh viên này.");
        else{
            sinhvien moi = ds.get(index);
            System.out.println("Bạn muốn chỉnh sửa thông tin nào ( Mã | Tên | Điểm )");
            String sua = sc.nextLine().trim();
            if(sua.equalsIgnoreCase("mã")){
                System.out.print("Nhập mã mới: ");
                moi.setMasv(sc.nextLine().trim());
            }else if(sua.equalsIgnoreCase("tên")){
                System.out.print("Nhập tên mới: ");
                moi.setTen(sc.nextLine().trim());
            }else if(sua.equalsIgnoreCase("điểm")){
                while(true){
                    try{
                        System.out.print("Nhập điểm mới: ");
                        moi.setDiem(sc.nextFloat());
                        sc.nextLine();
                        break;
                    }catch (Exception e){
                        System.out.println("Vui lòng nhập số");
                        sc.nextLine();
                    }
                }
            }else{
                System.out.println("Không tìm thấy thông tin mà bạn muốn sửa.");
            }
        }
    }
    public void diemTrentb(){
        for(int i = 0; i < ds.size(); i++){
            sinhvien sp = ds.get(i);
            if(sp.getDiem()> diemTrungBinh()){
                sp.print();
            }
        }
    }
}