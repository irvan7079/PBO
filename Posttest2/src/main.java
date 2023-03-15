import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;
/**
 *
 * @author 2109106057_Muhammad Irvan Hakim
 */
public class main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        String MerkBola, JenisBola;
        int StokBola, HargaBola;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<Bola> dt = new ArrayList<>();
        while (true) {
            System.out.println("""
                            \n
                            ====================================
                                PENDATAAN BOLA INAZUMA SPORT         
                            ====================================
                            | 1. Tambah Bola                   |
                            | 2. Lihat Bola                    |
                            | 3. Edit Bola                     |
                            | 4. Hapus Bola                    |
                            | 5. Keluar Program                |
                            ====================================
                            """);
            System.out.print("Masukkan Pilihan Anda: ");
            int select = Integer.parseInt(br.readLine());
            switch (select) {
                case 1 -> {
                    System.out.println("=========== Tambah Bola ============");
                    System.out.print("Merk Bola : ");
                    MerkBola = br.readLine(); 
                    System.out.print("Jenis Bola : ");
                    JenisBola = br.readLine();
                    System.out.print("Jumlah Stok Bola : ");
                    StokBola = Integer.parseInt(br.readLine());
                    System.out.print("Harga Bola : ");
                    HargaBola = Integer.parseInt(br.readLine());

                    Bola dataBola = new Bola(MerkBola, JenisBola, StokBola, HargaBola);
                    
                    dt.add(dataBola);
                    System.out.println("====================================");
                    System.out.println("       Bola Berhasil Ditambah!      ");
                    System.out.println("====================================");
                }

                case 2 -> {
                    System.out.println("============ Lihat Bola ============");
                    for (int i = 0; i < dt.size(); i += 1) {
                        System.out.println("Data Bola ke-" + (i + 1));
                        dt.get(i).display();
                    }
                    System.out.println("====================================");
                    System.out.println("      Bola Berhasil Ditampilkan!    ");
                    System.out.println("====================================");
                }
                    
                case 3 -> {
                    System.out.println("============ Edit Bola =============");
                    System.out.print("Input Merk Bola Yang Ingin Di edit : ");
                    String EditMerk = br.readLine();
                    for (Bola bola : dt) { 
                        if (bola.getMerk().equals(EditMerk)) {
                            System.out.print("Input Merk : ");
                            bola.setMerk(br.readLine());
                            System.out.print("Input Jenis : ");
                            bola.setJenis(br.readLine());
                            System.out.print("Input Stok Bola : ");
                            bola.setStok(Integer.parseInt(br.readLine()));
                            System.out.print("Input Harga Bola : ");
                            bola.setHarga(Integer.parseInt(br.readLine()));
                            System.out.println("====================================");
                            System.out.println("        Bola Berhasil Diedit!       ");
                            System.out.println("====================================");
                            break;
                        }
                    }
                }
                    
                case 4 -> {
                    System.out.println("============ Hapus Bola ============");
                    System.out.print("Input Merk Bola Yang Ingin Di hapus : ");
                    String HapusMerk = br.readLine();
                    for (int i = 0; i < dt.size(); i++) {
                        if (dt.get(i).getMerk().equals(HapusMerk)) {
                            dt.remove(i);
                            System.out.println("====================================");
                            System.out.println("        Bola Berhasil Dihapus!      ");
                            System.out.println("====================================");
                            break;
                        }
                    }
                }
                    
                case 5 -> {
                    System.out.println("""
                                        ====================================
                                            Berhasil keluar dari program!
                                        ====================================
                                        """);
                    System.exit(0);
                }
                
                default -> System.out.println("Menu tidak ada");
            }
        }
    }
}