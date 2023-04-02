public class BolaMainan extends Bola {
    private String bahan;
    
    public BolaMainan (String merk, String jenis, int stok, int harga, String bahan){
        super(merk, jenis, stok, harga);
        this.bahan = bahan;
    }
    
    @Override
    void JenisBola(){
        
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Bahan   : " + this.bahan);
    }
    public void display(boolean showBahan){
        if (showBahan)display();
        else super.display();
    }
}