
package test01;

abstract public class xe {
    private String tenxe;
    private int tocdo;

    public String getTenxe() {
        return tenxe;
    }

    public void setTenxe(String tenxe) {
        this.tenxe = tenxe;
    }

    public int getTocdo() {
        return tocdo;
    }

    public void setTocdo(int tocdo) {
        this.tocdo = tocdo;
    }

    public xe() {
    }

    public xe(String tenxe, int tocdo) {
        this.tenxe = tenxe;
        this.tocdo = tocdo;
    }
    abstract public void xuat(); 
    public void xuatxe(){
        System.out.printf("%-20s | %d\n", getTenxe(), getTocdo());
    }
}
