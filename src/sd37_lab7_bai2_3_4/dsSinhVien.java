
package sd37_lab7_bai2_3_4;

import java.util.ArrayList;
import java.util.Scanner;

public class dsSinhVien {
    ArrayList<sinhVienPoly> danhsach = new ArrayList<>();
    
    public void nhapdanhsach(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bạn Muốn Nhập Sinh Viên IT Hay Sinh Viên biz ?");
        String Nganh = sc.nextLine();
        sinhVienPoly sv;
        if(Nganh.toLowerCase().equals("it")){
            do{
                sv = new sinhVienIT("IT");
                sv.inputsv();
                danhsach.add(sv);
                System.out.println("Bạn Có Muốn Nhập Nữa Hay Không(Y/N)?");
                String chon = sc.nextLine();
                if(chon.toLowerCase().equals("n"))
                    break;
            }while(true);
        }else if(Nganh.toLowerCase().equals("biz")){
            do{
                sv = new sinhVienBiz("BIZ");
                sv.inputsv();
                danhsach.add(sv);
                System.out.println("Bạn Có Muốn Nhập Nữa Hay Không(Y/N)?");
                String chon = sc.nextLine();
                if(chon.toLowerCase().equals("n"))
                    break;
            }while(true);
        }else{
                System.out.println("Không Có Ngành Này Trong chương trình.");
        }
    }
    
    public void xuatDanhSach(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn Muốn Xuất Sinh Viên IT Hay Sinh Viên biz ?");
        String Nganh = sc.nextLine();
        
        if(Nganh.toLowerCase().equals("it")){
            System.out.printf(" %-10S | %-20s | %-10s | %-10s | %-10s | %-10s | %-10s\n"
                            , "Ngành", "Họ và Tên", "Điểm CSS", "Điểm HTML", "Điểm Java", "Điểm Trung Bình", "Học Lực");
            for(sinhVienPoly sv: danhsach){
                if(sv.getNganh().equals("IT"))
                    sv.printsv();            }
        }else if(Nganh.toLowerCase().equals("biz")){
            System.out.printf(" %-10S | %-20s | %-10s | %-10s | %-10s | %-10s\n"
                            , "Ngành", "Họ và Tên", "Điểm Marketin", "Điểm Sale", "Điểm Trung Bình", "Học Lực");
            for(sinhVienPoly sv: danhsach){
                if(sv.getNganh().equals("BIZ"))
                    sv.printsv();
            }
        }
    }
    public int timkiem_SV(){
        Scanner sc = new Scanner(System.in);
        
        String Ten = sc.nextLine().trim();
        int index = -1;
        for(int i = 0; i < danhsach.size(); i++){
            sinhVienPoly s = (sinhVienPoly) danhsach.get(i);
            if(s.getHoten().equals(Ten))
                return i;
        }
        return -1;
    }
    public void delete_SV(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tên Sinh Viên Muốn Xóa: ");
        int index = timkiem_SV();
        if(index < 0){
            System.out.println("Không Tìm Thấy Sinh Viên Này");
        }else{
            System.out.print("Bạn có Muốn Xóa Không(Y/N)");
            String c = "";
            c = sc.nextLine();
            if(c.toLowerCase().equals("y")){
                danhsach.remove(index);
                System.out.println("Đã Xóa Thành Công.");
            }
        }
    }
    public void them_SV(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn Muốn Thêm Sinh Ngành Nào (IT/BIZ) ");
        String Nganh = sc.nextLine();
        sinhVienPoly sv;
        if(Nganh.toLowerCase().equals("it")){
            do{
                sv = new sinhVienIT("IT");
                sv.inputsv();
                danhsach.add(sv);
                System.out.println("Bạn Có Muốn Nhập Nữa Hay Không(Y/N)?");
                String chon = sc.nextLine();
                if(chon.toLowerCase().equals("n"))
                    break;
            }while(true);
        }else if(Nganh.toLowerCase().equals("biz")){
            do{
                sv = new sinhVienBiz("BIZ");
                sv.inputsv();
                danhsach.add(sv);
                System.out.println("Bạn Có Muốn Nhập Nữa Hay Không(Y/N)?");
                String chon = sc.nextLine();
                if(chon.toLowerCase().equals("n"))
                    break;
            }while(true);
        }else{
                System.out.println("Không Có Ngành Này Trong chương trình.");
        }
    }
    public void chinhsua_SV(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tên Sinh Viên Muốn Chỉnh Sửa: ");
        int index = timkiem_SV();
        if(index < 0 )
            System.out.println("Không Tìm Thấy Sinh Viên Này.");
        else{
            sinhVienPoly sv = danhsach.get(index);
            if(sv.getNganh().equals("IT")){
                sinhVienIT it = (sinhVienIT) sv;
                System.out.println("Bạn Thay Đổi Thông Tin Nào (Tên | Điểm CSS | điểm HTML | Điểm JAVA) ?");
                String td = sc.nextLine().trim();
                if(td.toLowerCase().equals("tên")){
                    System.out.print("Nhập Tên mới: ");
                    it.setHoten(sc.nextLine().trim());
                }else if(td.toLowerCase().equals("điểm css")){
                    double diem;
                    while(true){
                        try{
                            System.out.print("Nhập Điểm CSS mới: ");
                            diem = sc.nextDouble();
                            sc.nextLine();
                            break;
                        }catch(Exception e){
                            System.out.println("Vui Lòng Nhập Số.");
                            sc.nextLine();
                        }
                    } 
                    
                    it.setDiemcss(diem);
                    }else if(td.toLowerCase().equals("điểm html")){
                        double diem;
                        while(true){
                            try{
                                 System.out.print("Nhập Điểm HTML Mới: ");
                                diem = sc.nextDouble();
                                sc.nextLine();
                                break;
                            }catch(Exception e){
                                System.out.println("Vui Lòng Nhập Số.");
                                sc.nextLine();
                            }
                        } 
                        
                        it.setDiemhtml(diem);
                        }else if(td.toLowerCase().equals("điểm java")){
                            double diem;
                            while(true){
                                try{
                                    System.out.print("Nhập Điểm Java mới: ");
                                    diem = sc.nextDouble();
                                    sc.nextLine();
                                    break;
                                }catch(Exception e){
                                    System.out.println("Vui Lòng Nhập Số.");
                                    sc.nextLine();
                                }
                            } 
                            
                            it.setDiemjava(diem);
                        }else{
                            System.out.println("Ngành IT Không Có Môn Này.");
                        }
                        
            }else if(sv.getNganh().equals("biz")){
                sinhVienBiz biz = (sinhVienBiz) sv;
                System.out.println("Bạn Muốn Thay Đổi Thông TIn Nào (Tên | Điểm Marketing | Điểm Sale) ?");
                String td = sc.nextLine();
                if(td.toLowerCase().equals("tên")){
                    System.out.print("Nhập Tên Mới: ");
                    biz.setHoten(sc.nextLine().trim());
                }else if(td.toLowerCase().equals("điểm marketing")){
                    double diem;
                    while(true){
                        try{
                            System.out.print("Nhập Điểm Marketing mới: ");
                            diem = sc.nextDouble();
                            sc.nextLine();
                            break;
                        }catch(Exception e){
                            System.out.println("Vui Lòng Nhập Số.");
                            sc.nextLine();
                        }
                    }
                    biz.setDiemMarKeting(diem);
                    }else if(td.toLowerCase().equals("điểm sale")){
                        
                        double diem;
                        while(true){
                            try{
                                System.out.print("Nhập Điểm Sale Mới: ");
                                diem = sc.nextDouble();
                                sc.nextLine();
                                break;
                            }catch(Exception e){
                                System.out.println("Vui Lòng Nhập Số.");
                                sc.nextLine();
                            }
                        }
                        
                        biz.setDiemSale(diem);
                        }else{
                            System.out.println("Ngành BIZ Không Có Ngành Này.");
                        }
            }
        }
    }
}
