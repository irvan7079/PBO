public class BolaBesar extends Bola {

    public BolaBesar (String merk, String jenis, int stok, int harga){
        super(merk, jenis, stok, harga);
    }
    
    @Override
    void JenisBola(){
        System.out.print("""
                           ------------ Bola Besar ------------ 
                           1. Bola Sepak
                           2. Bola Basket
                           3. Bola Voli
                           4. Bola Futsal
                           5. Bola Rugbi
                           6. Bola Takraw
                           7. Bola Bowling
                           Pilih Jenis Bola [1/2/3/4/5/6/7] :  """);
    }
    
}