
package sd37_lab7_bai1;

public class hinhvuong extends hinhchunhat{
    
    private float canh;
    
    public float getcanh(){
        return canh;
    }
    
    public void setcanh(float Canh){
        this.canh = Canh;
    }
    
    public hinhvuong(float canh){
        super(canh,canh);
    }
    
    public void printhv(){
        super.printcn();
    }
}
