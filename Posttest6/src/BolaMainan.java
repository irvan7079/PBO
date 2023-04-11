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
    
    // METHOD INTERFACE
    @Override
    public void dataBola(){
        super.dataBola();
        System.out.println("Bahan   : " + this.bahan);
    }
    
    // METHOD OVERLOADING
    public void dataBola(boolean showBahan){
        if (showBahan)dataBola();
        else super.dataBola();
    }
}