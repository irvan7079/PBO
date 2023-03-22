public class Bola {
    protected String merk, jenis;
    protected int stok, harga;

    public Bola (String merk, String jenis, int stok, int harga){
        this.merk = merk;
        this.jenis = jenis;
        this.stok = stok;
        this.harga = harga;
    }

    public void display() {
        System.out.println("Merk    : " + this.merk);
        System.out.println("Jenis   : " + this.jenis);
        System.out.println("stok    : " + this.stok);
        System.out.println("harga   : " + this.harga);
    }

    public void setMerk(String merk_bola) {
        this.merk = merk_bola;
    }
    
    public void setJenis(String jenis_bola) {
        this.jenis = jenis_bola;
    }

    public void setStok(int stok_bola) {
        this.stok = stok_bola;
    }
    
    public void setHarga(int Harga_bola) {
        this.harga = Harga_bola;
    }

    public String getMerk() {
        return merk;
    }

    public String getJenis() {
        return jenis;
    }

    public int getStok() {
        return stok;
    }

    public int getHarga() {
        return harga;
    }
    
}