
package ASSIGNMENT;

import java.util.ArrayList;
import java.util.Scanner;

public class dsNhanVien {
    ArrayList<nhanvien> ds = new ArrayList<>();
    public void inputds(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn nhập nhân viên nào (tiếp thị | hành chính | trưởng phòng )");
        String nv = sc.nextLine().trim();
        nhanvien moi;
        if(nv.toLowerCase().equals("tiếp thị")){
            do{
                moi = new NVTiepThi("tiếp thị");
                moi.nhap();
                ds.add(moi);
                System.out.println("Bạn Có Muốn Nhập Nữa Hay Không(Y/N)?");
                    String chon = sc.nextLine();
                    if(chon.toLowerCase().equals("n"))
                        break;
            }while(true);
        }else if(nv.toLowerCase().equals("hành chính")){
            do{
                moi = new NVHanhChinh("hành chính");
                moi.nhap();
                ds.add(moi);
                System.out.println("Bạn Có Muốn Nhập Nữa Hay Không(Y/N)?");
                    String chon = sc.nextLine();
                    if(chon.toLowerCase().equals("n"))
                        break;
            }while(true);
        }else if(nv.toLowerCase().equals("trưởng phòng")){
            do{
                moi = new NVTruongPhong("trưởng phòng");
                moi.nhap();
                ds.add(moi);
                System.out.println("Bạn Có Muốn Nhập Nữa Hay Không(Y/N)?");
                    String chon = sc.nextLine();
                    if(chon.toLowerCase().equals("n"))
                        break;
            }while(true);
        }
        else {
            System.out.println("Không tìm thấy loại nhân viên này");
        }
    }
    public void printds(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn hiển thị nhân viên nào (tiếp thị | hành chính | trưởng phòng| Tất cả)");
        String nv = sc.nextLine().trim();
        if(nv.toLowerCase().equals("tiếp thị")){
            System.out.println("---------------------------------------------------");
            System.out.printf("%-12s | %-20s | %-10s | %-10s | %-10s | %-10s | %-10s\n"
                , "Mã Nhân viên", "Họ và Tên", "Doanh số", "Huê Hồng", "Lương", "Thu Nhập", "Thuế");
            
            for(nhanvien NV: ds){
                if(NV.getLoainv().equals("tiếp thị"))
                    NV.xuat();
            }
        }else if(nv.toLowerCase().equals("hành chính")){
            System.out.println("---------------------------------------------------");
            System.out.printf("%-12s | %-20s | %-10s | %-10s | %-10s \n"
                , "Mã Nhân Viên", "Họ và Tên", "Lương", "Thu Nhập", "Thuế");
            for(nhanvien NV: ds){
                if(NV.getLoainv().equals("hành chính"))
                    NV.xuat();
            }
        }else if(nv.toLowerCase().equals("trưởng phòng")){
            System.out.println("---------------------------------------------------");
            System.out.printf("%-12s | %-20s | %-10s | %-11s | %-10s | %-10s \n"
                , "Mã Nhân Viên", "Họ và Tên", "Lương", "trách Nhiệm", "Thu Nhập", "Thuế");
            for(nhanvien NV: ds){
                if(NV.getLoainv().equals("trưởng phòng"))
                    NV.xuat();
            }
        }else if(nv.equalsIgnoreCase("tất cả")){
            for(nhanvien NV: ds){
                if(NV instanceof NVTiepThi){
                    System.out.println("---------------------------------------------------");
                    System.out.printf("%-12s | %-20s | %-10s | %-10s | %-10s | %-10s | %-10s\n"
                        , "Mã Nhân viên", "Họ và Tên", "Doanh số", "Huê Hồng", "Lương", "Thu Nhập", "Thuế");
                    NV.xuat();
                }else if(NV instanceof NVHanhChinh){
                    System.out.println("---------------------------------------------------");
                    System.out.printf("%-12s | %-20s | %-10s | %-10s | %-10s \n"
                        , "Mã Nhân Viên", "Họ và Tên", "Lương", "Thu Nhập", "Thuế");
                    NV.xuat();
                }else if(NV instanceof NVTruongPhong){
                    System.out.println("---------------------------------------------------");
                    System.out.printf("%-12s | %-20s | %-10s | %-11s | %-10s | %-10s \n"
                        , "Mã Nhân Viên", "Họ và Tên", "Lương", "trách Nhiệm", "Thu Nhập", "Thuế");
                    NV.xuat();
                }
                
            }
        }else {
            System.out.println("Không tìm thấy loại nhân viên này");
        }
    }
    public int TimKiemNV(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        String MANV = sc.nextLine().trim();
        int index = -1;
        for(int i = 0; i < ds.size(); i++){
            nhanvien nv = (nhanvien) ds.get(i);
            if(nv.getManv().equalsIgnoreCase(MANV))
                return i;
        }
        return -1;
    }
    public void delete(){
        Scanner sc = new Scanner(System.in);
        int index = TimKiemNV();
        if(index < 0)
            System.out.println("Không tìm thấy nhân viên này");
        else{
            System.out.print("Bạn có Muốn Xóa Không(Y/N)");
            String c = "";
            c = sc.nextLine();
            if(c.toLowerCase().equals("y")){
                ds.remove(index);
                System.out.println("Đã Xóa Thành Công.");
            }
        }
    }
    
    public void ChinhSua(){
        Scanner sc = new Scanner(System.in);
        int index = TimKiemNV();
        if(index < 0)
            System.out.println("Không tìm thấy nhân viên này");
        else{
            nhanvien sua = (nhanvien) ds.get(index);
            if(sua instanceof NVTiepThi){
                NVTiepThi tt = (NVTiepThi) sua;
                System.out.println("Bạn muốn bạn muốn sửa thông tin nào (Mã | Tên | Lương | Doanh số | Huê hồng)");
                String loai = sc.nextLine().trim();
                if(loai.equalsIgnoreCase("mã")){
                    System.out.print("Nhập mã nhân viên mới: ");
                    String ma = sc.nextLine().trim();
                    tt.setManv(ma);
                }else if(loai.equalsIgnoreCase("tên")){
                    System.out.print("Nhập tên mới: ");
                    String ten = sc.nextLine().trim();
                    sua.setHoten(ten);
                }else if(loai.equalsIgnoreCase("lương")){
                    double luong;
                    while(true){
                        try{
                            System.out.print("Nhập lương mới: ");
                            luong = sc.nextDouble();
                            sc.nextLine();
                            break;
                        }catch (Exception e){
                            System.out.println("Vui lòng nhập số");
                            sc.nextDouble();
                        }
                    }
                    tt.setLuong(luong);
                }else if(loai.equalsIgnoreCase("doanh số")){
                    double doanhso;
                    while(true){
                        try{
                            System.out.print("Nhập doanh số mới: ");
                            doanhso = sc.nextDouble();
                            sc.nextLine();
                            break;
                        }catch (Exception e){
                            System.out.println("Vui lòng nhập số");
                            sc.nextLine();
                        }
                    }
                    tt.setDoanhso(doanhso);
                }else if(loai.equalsIgnoreCase("huê hồng")){
                    double huehong;
                    while(true){
                        try{
                            System.out.print("Nhập huê hồng mới: ");
                            huehong = sc.nextDouble();
                            sc.nextLine();
                            break;
                        }catch (Exception e){
                            System.out.println("Vui lòng nhập số");
                            sc.nextLine();
                        }
                    }
                    tt.setHuehong(huehong);
                }else{
                    System.out.println("không tìm thấy thông tin này");
                }
            }else if(sua instanceof NVHanhChinh){
                NVHanhChinh hc = (NVHanhChinh) sua;
                System.out.println("Bạn muốn sửa thông tin nào (Mã | Tên | Lương)");
                String loai = sc.nextLine().trim();
                if(loai.equalsIgnoreCase("mã")){
                    System.out.print("Nhập mã nhân viên mới; ");
                    String ma = sc.nextLine().trim();
                    hc.setManv(ma);
                }else if(loai.equalsIgnoreCase("tên")){
                    System.out.print("Nhập tên mới: ");
                    String ten = sc.nextLine().trim();
                    hc.setHoten(ten);
                }else if(loai.equalsIgnoreCase("lương")){
                    double luong;
                    while(true){
                        try{
                            System.out.print("Nhập lương mới: ");
                            luong = sc.nextDouble();
                            sc.nextLine();
                            break;
                        }catch (Exception e){
                            System.out.println("Vui lòng nhập số");
                            sc.nextLine();
                        }
                    }
                    hc.setLuong(luong);
                }
            }else if(sua instanceof NVTruongPhong){
                NVTruongPhong tp = (NVTruongPhong) sua;
                System.out.println("Bạn muốn sửa thông tin nào (Mã | Tên | Lương | Lương trách nhiệm)");
                String loai = sc.nextLine().trim();
                
                if(loai.equalsIgnoreCase("mã")){
                    System.out.print("Nhập mã nhân viên mới: ");
                    String ma = sc.nextLine();
                    tp.setManv(ma);
                }else if(loai.equalsIgnoreCase("tên")){
                    System.out.print("Nhập tên mới: ");
                    String ten = sc.nextLine();
                    tp.setHoten(ten);
                }else if(loai.equalsIgnoreCase("lương")){
                    double luong;
                    while(true){
                        try{
                            System.out.print("Nhập lương mới: ");
                            luong = sc.nextDouble();
                            sc.nextLine();
                            break;
                        }catch (Exception e){
                            System.out.println("Vui lòng nhập số");
                            sc.nextLine();
                        }
                    }
                }
            }
        }
    }
    public void timKiemtheoLuong(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mức lương: ");
        double luong = sc.nextDouble();
        sc.nextLine();
        int soluong = 0;
        
        for(int i = 0; i < ds.size(); i++){
            nhanvien moi = (nhanvien) ds.get(i);
            if(moi.getLuong() == luong){
                if(moi instanceof NVTiepThi){
                    System.out.printf("%-12s | %-20s | %-10s | %-10s | %-10s | %-10s | %-10s\n"
                            , "Mã Nhân viên", "Họ và Tên", "Doanh số", "Huê Hồng", "Lương", "Thu Nhập", "Thuế");
                    moi.xuat();
                }else if(moi instanceof NVHanhChinh){
                    System.out.printf("%-12s | %-20s | %-10s | %-10s | %-10s \n"
                        , "Mã Nhân Viên", "Họ và Tên", "Lương", "Thu Nhập", "Thuế");
                    moi.xuat();
                }else if(moi instanceof NVTruongPhong){
                    System.out.printf("%-12s | %-20s | %-10s | %-11s | %-10s | %-10s \n"
                        , "Mã Nhân Viên", "Họ và Tên", "Lương", "trách Nhiệm", "Thu Nhập", "Thuế");
                    moi.xuat();
                }
                
                soluong++;
            }
        }
        if(soluong == 0) 
            System.out.println("Không tìm thấy nhân viên nào có mức lương này");
    }
    public void sapXepHoTen(){
        for(int i = 0; i < ds.size() - 1; i++){
            for(int j = i + 1; j < ds.size(); j++){
                if(ds.get(i).getHoten().compareToIgnoreCase(ds.get(j).getHoten()) > 0){
                    nhanvien temp = ds.get(i);
                    ds.set(i, ds.get(j));
                    ds.set(j, temp);
                }
            }
        }
    }
    
    public void sapXepthunhap(){
        for(int i = 0; i < ds.size() - 1; i++){
            for(int j = i + 1; j < ds.size(); j++){
                if(ds.get(i).thuNhap() < ds.get(j).thuNhap()){
                    nhanvien temp = ds.get(i);
                    ds.set(i, ds.get(j));
                    ds.set(j, temp);
                }
            }
        }
    }
    
    public void print(){
        for(nhanvien NV: ds){
            if(NV instanceof NVTiepThi){
                System.out.println("--------------");
                System.out.printf("%-12s | %-20s | %-10s | %-10s | %-10s | %-10s | %-10s\n"
                    , "Mã Nhân viên", "Họ và Tên", "Doanh số", "Huê Hồng", "Lương", "Thu Nhập", "Thuế");
                NV.xuat();
            }else if(NV instanceof NVHanhChinh){
                System.out.println("--------------");
                System.out.printf("%-12s | %-20s | %-10s | %-10s | %-10s \n"
                    , "Mã Nhân Viên", "Họ và Tên", "Lương", "Thu Nhập", "Thuế");
                NV.xuat();
            }else if(NV instanceof NVTruongPhong){
                System.out.println("--------------");
                System.out.printf("%-12s | %-20s | %-10s | %-11s | %-10s | %-10s \n"
                    , "Mã Nhân Viên", "Họ và Tên", "Lương", "trách Nhiệm", "Thu Nhập", "Thuế");
                NV.xuat();
            }
        }
    }
    
    public void xuat5thunhap(){
        sapXepthunhap();
        for(int i = 0; i < 5; i++){
            ds.get(i).xuat();
        }
    }
}