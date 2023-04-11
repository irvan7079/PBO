// ABSTRACT CLASS
public abstract class Bola implements DisplayBola {
    protected String merk, jenis;
    protected int stok, harga;

    public Bola (String merk, String jenis, int stok, int harga){
        this.merk = merk;
        this.jenis = jenis;
        this.stok = stok;
        this.harga = harga;
    }
    
    // ABSTRACT METHOD
    abstract void JenisBola();

    // METHOD INTERFACE
    @Override
    public void dataBola() {
        System.out.println("Merk    : " + this.merk);
        System.out.println("Jenis   : " + this.jenis);
        System.out.println("stok    : " + this.stok);
        System.out.println("harga   : " + this.harga);
    }
    
    // METHOD INTERFACE
    @Override
    public void menuBola(){
        System.out.println("| 1. Data Bola Besar               |");
        System.out.println("| 2. Data Bola Kecil               |");
        System.out.println("| 3. Data Bola Mainan              |");
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