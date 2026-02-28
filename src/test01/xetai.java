
package test01;

public class xetai extends xe{
    private int taitrong;

    public int getTaitrong() {
        return taitrong;
    }

    public void setTaitrong(int taitrong) {
        this.taitrong = taitrong;
    }

    public xetai() {
    }

    public xetai(int taitrong) {
        this.taitrong = taitrong;
    }

    public xetai(int taitrong, String tenxe, int tocdo) {
        super(tenxe, tocdo);
        this.taitrong = taitrong;
    }
    
    @Override public void xuat(){
        System.out.printf("|%-20s | %-6s | %d \n", getTenxe(), getTocdo(), taitrong);
    }
}
