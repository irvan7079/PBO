import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

/**
 *
 * @author 2109106057_Muhammad Irvan Hakim
 */
public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        String MerkBola = null, JenisBola, BahanBola;
        int StokBola, HargaBola;
        boolean ulang;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<BolaBesar> dataBB = new ArrayList<>();
        ArrayList<BolaKecil> dataBK = new ArrayList<>();
        ArrayList<BolaMainan> dataBM = new ArrayList<>();
        BolaBesar BB = new BolaBesar("Mikasa", "Bola Voli", 30, 75000);
        dataBB.add(BB);
        BolaKecil BK = new BolaKecil("Doniic P40+", "Bola Tenis Meja", 20, 45000);
        dataBK.add(BK);
        BolaMainan BM = new BolaMainan("Bola Disney Frozen", "Sepak Bola", 20, 45000, "Karet");
        dataBM.add(BM);
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
            int MenuUtama = Integer.parseInt(br.readLine());
            switch (MenuUtama) {
                case 1 -> {
                    System.out.println("=========== MENU TAMBAH ============");
                    System.out.println("| 1. Tambah Data Bola Besar        |");
                    System.out.println("| 2. Tambah Data Bola Kecil        |");
                    System.out.println("| 3. Tambah Data Bola Mainan       |");
                    System.out.println("====================================");     
                    System.out.print("Input: ");
                    int MenuTambah = Integer.parseInt(br.readLine());
                    if (MenuTambah == 1) {
                        JenisBolaBesar();
                        int JenisBB = Integer.parseInt(br.readLine());
                        JenisBola = switch (JenisBB) {
                            case 1 -> "Bola Sepak";
                            case 2 -> "Bola Basket";
                            case 3 -> "Bola Voli";
                            case 4 -> "Bola Futsal";
                            case 5 -> "Bola Rugbi";
                            case 6 -> "Bola Takraw";
                            default -> "Bola Bowling";
                        };
                    } else if (MenuTambah == 2){
                        JenisBolaKecil();
                        int JenisBK = Integer.parseInt(br.readLine());
                        JenisBola = switch (JenisBK) {
                            case 1 -> "Bola Golf";
                            case 2 -> "Bola Baseball";
                            case 3 -> "Bola Tenis Meja";
                            case 4 -> "Kok Bulu Tangkis";
                            case 5 -> "Bola Tolak Peluru";
                            default -> "Bola Biliar";
                        };
                    } else {
                        System.out.print("Jenis Bola       : ");
                        JenisBola = br.readLine();
                    }
                    ulang = true;
                    while (ulang) {
                        int cek = 0;
                        System.out.print("Merk Bola        : ");
                        MerkBola = br.readLine();
                        if (MenuTambah == 1){
                            for (BolaBesar bola : dataBB){
                                if (bola.getMerk().equals(MerkBola) && bola.getJenis().equals(JenisBola)) {
                                    System.out.println("Merk bola sudah ada, silahkan coba lagi...");
                                    cek = 1;
                                    break;
                                }
                            }
                        } else if (MenuTambah == 2){
                            for (BolaKecil bola : dataBK){
                                if (bola.getMerk().equals(MerkBola) && bola.getJenis().equals(JenisBola)) {
                                    System.out.println("Merk bola sudah ada, silahkan coba lagi...");
                                    cek = 1;
                                    break;
                                }
                            }
                        } else {
                            for (BolaMainan bola : dataBM){
                                if (bola.getMerk().equals(MerkBola) && bola.getJenis().equals(JenisBola) ) {
                                    System.out.println("Merk bola sudah ada, silahkan coba lagi...");
                                    cek = 1;
                                    break;
                                }
                            }
                        } if (cek == 0) {
                            ulang = false;
                        }
                    }
                    System.out.print("Jumlah Stok Bola : ");
                    StokBola = Integer.parseInt(br.readLine());
                    System.out.print("Harga Bola       : ");
                    HargaBola = Integer.parseInt(br.readLine());
                    if (MenuTambah == 1){
                        BolaBesar newBolaBesar = new BolaBesar(MerkBola, JenisBola, StokBola, HargaBola);
                        dataBB.add(newBolaBesar);
                    }else if (MenuTambah == 2){
                        BolaKecil newBolaKecil = new BolaKecil(MerkBola, JenisBola, StokBola, HargaBola);
                        dataBK.add(newBolaKecil);
                    }else{
                        System.out.print("Bahan Bola       : ");
                        BahanBola = br.readLine(); 
                        BolaMainan newBolaMainan = new BolaMainan(MerkBola, JenisBola, StokBola, HargaBola, BahanBola);
                        dataBM.add(newBolaMainan);
                    }
                    System.out.println("====================================");
                    System.out.println("       Bola Berhasil Ditambah!      ");
                    System.out.println("====================================");
                    break;
                }
                
                case 2 -> {
                    System.out.println("======== Daftar Bola Besar =========");
                    for (int i = 0; i < dataBB.size(); i += 1){
                        System.out.println("Data Bola Besar ke-" + (i + 1));
                        dataBB.get(i).display();
                    }
                    System.out.println("\n======== Daftar Bola Kecil =========");
                    for (int i = 0; i < dataBK.size(); i += 1){
                        System.out.println("Data Bola Kecil ke-" + (i + 1));
                        dataBK.get(i).display();
                    }
                    System.out.println("\n======== Daftar Bola Mainan ========");
                    for (int i = 0; i < dataBM.size(); i += 1){
                        System.out.println("Data Bola Mainan ke-" + (i + 1));
                        dataBM.get(i).display();
                    }
                    System.out.println("====================================");
                    System.out.println("      Bola Berhasil Ditampilkan!    ");
                    System.out.println("====================================");
                    break;
                }
                    
                case 3 -> {
                    System.out.println("============ MENU EDIT  ============");
                    System.out.println("| 1. Edit Data Bola Besar          |");
                    System.out.println("| 2. Edit Data Bola Kecil          |");
                    System.out.println("| 3. Edit Data Bola Mainan         |");
                    System.out.println("====================================");     
                    System.out.print("Input: ");
                    int MenuEdit = Integer.parseInt(br.readLine());
                    System.out.println("Input Merk Bola Yang Ingin Di edit: ");
                    System.out.print(">> ");
                    String EditMerk = br.readLine();
                    if (MenuEdit == 1) {
                        JenisBolaBesar();
                        int JenisBB = Integer.parseInt(br.readLine());
                        JenisBola = switch (JenisBB) {
                            case 1 -> "Bola Sepak";
                            case 2 -> "Bola Basket";
                            case 3 -> "Bola Voli";
                            case 4 -> "Bola Futsal";
                            case 5 -> "Bola Rugbi";
                            case 6 -> "Bola Takraw";
                            default -> "Bola Bowling";
                        };
                    } else if (MenuEdit == 2){
                        JenisBolaKecil();
                        int JenisBK = Integer.parseInt(br.readLine());
                        JenisBola = switch (JenisBK) {
                            case 1 -> "Bola Golf";
                            case 2 -> "Bola Baseball";
                            case 3 -> "Bola Tenis Meja";
                            case 4 -> "Kok Bulu Tangkis";
                            case 5 -> "Bola Tolak Peluru";
                            default -> "Bola Biliar";
                        };
                    } else {
                        System.out.print("Input Jenis Bola   : ");
                        JenisBola = br.readLine();
                    }
                    if (MenuEdit == 1) {
                        for (BolaBesar bola : dataBB) {
                            if (bola.getMerk().equals(EditMerk) && bola.getJenis().equals(JenisBola)) {
                                System.out.println("Memasuki Proses Edit...");
                                System.out.println("============ Edit Bola =============");
                                JenisBolaBesar();
                                int JenisBB = Integer.parseInt(br.readLine());
                                JenisBola = switch (JenisBB) {
                                    case 1 -> "Bola Sepak";
                                    case 2 -> "Bola Basket";
                                    case 3 -> "Bola Voli";
                                    case 4 -> "Bola Futsal";
                                    case 5 -> "Bola Rugbi";
                                    case 6 -> "Bola Takraw";
                                    default -> "Bola Bowling";
                                };
                                bola.setJenis(JenisBola);
                                ulang = true;
                                while (ulang){
                                    int cek = 0;
                                    System.out.print("Input Merk Bola  : ");
                                    MerkBola = br.readLine();
                                    for (int i = 0; i < dataBB.size(); i++) {
                                        if (dataBB.get(i).getMerk().equals(MerkBola) && dataBB.get(i).getJenis().equals(JenisBola)) {
                                            System.out.println("Merk bola sudah ada, silahkan coba lagi...");
                                            cek = 1;
                                            break;
                                        }
                                    } if (cek == 0) {
                                        ulang = false;
                                    }
                                }
                                bola.setMerk(MerkBola);
                                System.out.print("Input Stok Bola  : ");
                                bola.setStok(Integer.parseInt(br.readLine()));
                                System.out.print("Input Harga Bola : ");
                                bola.setHarga(Integer.parseInt(br.readLine()));
                                System.out.println("====================================");
                                System.out.println("        Bola Berhasil Diedit!       ");
                                System.out.println("====================================");
                                break;
                            }
                        }
                    } else if (MenuEdit == 2){
                        for (Bola bola : dataBK) {
                            if (bola.getMerk().equals(EditMerk) && bola.getJenis().equals(JenisBola)){
                                System.out.println("Memasuki Proses Edit...");
                                System.out.println("============ Edit Bola =============");
                                JenisBolaKecil();   
                                int JenisBK = Integer.parseInt(br.readLine());
                                JenisBola = switch (JenisBK) {
                                    case 1 -> "Bola Golf";
                                    case 2 -> "Bola Baseball";
                                    case 3 -> "Bola Tenis Meja";
                                    case 4 -> "Kok Bulu Tangkis";
                                    case 5 -> "Bola Tolak Peluru";
                                    default -> "Bola Biliar";
                                };
                                bola.setJenis(JenisBola);
                                ulang = true;
                                while (ulang) {
                                    int cek = 0;
                                    System.out.print("Input Merk Bola  : ");
                                    MerkBola = br.readLine();
                                    for (int i = 0; i < dataBK.size(); i++){
                                        if (dataBK.get(i).getMerk().equals(MerkBola) && dataBK.get(i).getJenis().equals(JenisBola)) {
                                            System.out.println("Merk bola sudah ada, silahkan coba lagi...");
                                            cek = 1;
                                            break;
                                        }
                                    } if (cek == 0) {
                                        ulang = false;
                                    }
                                }
                                bola.setMerk(MerkBola);
                                System.out.print("Input Stok Bola  : ");
                                bola.setStok(Integer.parseInt(br.readLine()));
                                System.out.print("Input Harga Bola : ");
                                bola.setHarga(Integer.parseInt(br.readLine()));
                                System.out.println("====================================");
                                System.out.println("        Bola Berhasil Diedit!       ");
                                System.out.println("====================================");
                                break;
                            }
                        }
                    } else {
                        for (BolaMainan bola : dataBM) {
                            if (bola.getMerk().equals(EditMerk) && bola.getJenis().equals(JenisBola)){
                                System.out.println("Memasuki Proses Edit...");
                                System.out.println("============ Edit Bola =============");
                                System.out.print("Input Jenis Bola : ");
                                JenisBola = br.readLine();
                                ulang = true;
                                while (ulang) {
                                    int cek = 0;
                                    System.out.print("Input Merk Bola  : ");
                                    MerkBola = br.readLine();
                                    for (int i = 0; i < dataBM.size(); i++) {
                                        if (dataBM.get(i).getMerk().equals(MerkBola) && dataBM.get(i).getJenis().equals(JenisBola)) {
                                            System.out.println("Merk bola sudah ada, silahkan coba lagi...");
                                            cek = 1;
                                            break;
                                        }
                                    }
                                    if (cek == 0){
                                        ulang = false;
                                    }
                                }
                                bola.setJenis(JenisBola);
                                bola.setMerk(MerkBola);
                                System.out.print("Input Stok Bola  : ");
                                bola.setStok(Integer.parseInt(br.readLine()));
                                System.out.print("Input Harga Bola : ");
                                bola.setHarga(Integer.parseInt(br.readLine()));
                                System.out.print("Input Bahan      : ");
                                bola.setBahan(br.readLine());
                                System.out.println("====================================");
                                System.out.println("        Bola Berhasil Diedit!       ");
                                System.out.println("====================================");
                                break;
                            }
                        }
                    }
                }
                    
                case 4 -> {
                    System.out.println("===========  MENU HAPUS ============");
                    System.out.println("| 1. Hapus Data Bola Besar         |");
                    System.out.println("| 2. Hapus Data Bola Kecil         |");
                    System.out.println("| 3. Hapus Data Bola Mainan        |");
                    System.out.println("====================================");     
                    System.out.print("Input: ");
                    int MenuHapus = Integer.parseInt(br.readLine());
                    System.out.println("============ Hapus Bola ============");
                    System.out.println("Input Merk Bola Yang Ingin Di hapus: ");
                    System.out.print(">> ");
                    String HapusMerk = br.readLine();
                    if (MenuHapus == 1) {
                        JenisBolaBesar();
                        int JenisBB = Integer.parseInt(br.readLine());
                        JenisBola = switch (JenisBB) {
                            case 1 -> "Bola Sepak";
                            case 2 -> "Bola Basket";
                            case 3 -> "Bola Voli";
                            case 4 -> "Bola Futsal";
                            case 5 -> "Bola Rugbi";
                            case 6 -> "Bola Takraw";
                            default -> "Bola Bowling";
                        };
                    } else if (MenuHapus == 2){
                        JenisBolaKecil();
                        int JenisBK = Integer.parseInt(br.readLine());
                        JenisBola = switch (JenisBK) {
                            case 1 -> "Bola Golf";
                            case 2 -> "Bola Baseball";
                            case 3 -> "Bola Tenis Meja";
                            case 4 -> "Kok Bulu Tangkis";
                            case 5 -> "Bola Tolak Peluru";
                            default -> "Bola Biliar";
                        };
                    } else {
                        System.out.print("Input Jenis Bola   : ");
                        JenisBola = br.readLine();
                    }
                    if (MenuHapus == 1) {
                        for (int i = 0; i < dataBB.size(); i++) {
                            if (dataBB.get(i).getMerk().equals(HapusMerk) && dataBB.get(i).getJenis().equals(JenisBola)) {
                                dataBB.remove(i);
                                System.out.println("====================================");
                                System.out.println("        Bola Berhasil Dihapus!      ");
                                System.out.println("====================================");
                                break;
                            }
                        } 
                    } else if (MenuHapus == 2){
                        for (int i = 0; i < dataBK.size(); i++) {
                            if (dataBK.get(i).getMerk().equals(HapusMerk) && dataBK.get(i).getJenis().equals(JenisBola)) {
                                dataBK.remove(i);
                                System.out.println("====================================");
                                System.out.println("        Bola Berhasil Dihapus!      ");
                                System.out.println("====================================");
                                break;
                            }
                        }
                    } else {
                        for (int i = 0; i < dataBM.size(); i++) {
                            if (dataBM.get(i).getMerk().equals(HapusMerk) && dataBM.get(i).getJenis().equals(JenisBola)) {
                                dataBM.remove(i);
                                System.out.println("====================================");
                                System.out.println("        Bola Berhasil Dihapus!      ");
                                System.out.println("====================================");
                                break;
                            }
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
    
    public static void JenisBolaBesar(){
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
    
    public static void JenisBolaKecil(){
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