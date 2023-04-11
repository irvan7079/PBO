public class BolaKecil extends Bola {

    public BolaKecil (String merk, String jenis, int stok, int harga){
        super(merk, jenis, stok, harga);
    }
    
    @Override
    void JenisBola(){
        System.out.print("""
                           ------------ Bola Kecil ------------
                           1. Bola Golf
                           2. Bola Baseball
                           3. Bola Tenis Meja
                           4. Kok Bulu Tangkis
                           5. Bola Tolak Peluru
                           6. Bola Biliar
                           Pilih Jenis Bola [1/2/3/4/5/6] :  """);
    }
}