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
        Login LG = new Login();
        LG.Login();
        while (true) {
            // STATIC METHOD
            menu();
            try {
                int MenuUtama = Integer.parseInt(br.readLine());
                switch (MenuUtama) {
                    case 1 -> {
                        System.out.println("=========== MENU TAMBAH ============");
                        // METHOD INTERFACE
                        BB.menuBola();
                        System.out.println("====================================");     
                        System.out.print("Input: ");
                        int MenuTambah = Integer.parseInt(br.readLine());
                        switch (MenuTambah) {
                            case 1 -> {
                                BB.JenisBola();
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
                            }
                            case 2 -> {
                                BK.JenisBola();
                                int JenisBK = Integer.parseInt(br.readLine());
                                JenisBola = switch (JenisBK) {
                                    case 1 -> "Bola Golf";
                                    case 2 -> "Bola Baseball";
                                    case 3 -> "Bola Tenis Meja";
                                    case 4 -> "Kok Bulu Tangkis";
                                    case 5 -> "Bola Tolak Peluru";
                                    default -> "Bola Biliar";
                                };
                            }
                            default -> {
                                System.out.print("Jenis Bola       : ");
                                JenisBola = br.readLine();
                            }
                        }
                        ulang = true;
                        while (ulang) {
                            int cek = 0;
                            System.out.print("Merk Bola        : ");
                            MerkBola = br.readLine();
                            switch (MenuTambah) {
                                case 1 -> {
                                    for (BolaBesar bola : dataBB){
                                        if (bola.getMerk().equals(MerkBola) && bola.getJenis().equals(JenisBola)) {
                                            System.out.println("Merk bola sudah ada, silahkan coba lagi...");
                                            cek = 1;
                                            break;
                                        }
                                    }
                                }
                                case 2 -> {
                                    for (BolaKecil bola : dataBK){
                                        if (bola.getMerk().equals(MerkBola) && bola.getJenis().equals(JenisBola)) {
                                            System.out.println("Merk bola sudah ada, silahkan coba lagi...");
                                            cek = 1;
                                            break;
                                        }
                                    }
                                }
                                default -> {
                                    for (BolaMainan bola : dataBM){
                                        if (bola.getMerk().equals(MerkBola) && bola.getJenis().equals(JenisBola) ) {
                                            System.out.println("Merk bola sudah ada, silahkan coba lagi...");
                                            cek = 1;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (cek == 0) {
                                ulang = false;
                            }
                        }
                        System.out.print("Jumlah Stok Bola : ");
                        StokBola = Integer.parseInt(br.readLine());
                        System.out.print("Harga Bola       : ");
                        HargaBola = Integer.parseInt(br.readLine());
                        switch (MenuTambah) {
                            case 1 -> {
                                BolaBesar newBolaBesar = new BolaBesar(MerkBola, JenisBola, StokBola, HargaBola);
                                dataBB.add(newBolaBesar);
                            }
                            case 2 -> {
                                BolaKecil newBolaKecil = new BolaKecil(MerkBola, JenisBola, StokBola, HargaBola);
                                dataBK.add(newBolaKecil);
                            }
                            default -> {
                                System.out.print("Bahan Bola       : ");
                                BahanBola = br.readLine(); 
                                BolaMainan newBolaMainan = new BolaMainan(MerkBola, JenisBola, StokBola, HargaBola, BahanBola);
                                dataBM.add(newBolaMainan);
                            }
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
                            dataBB.get(i).dataBola();
                        }
                        System.out.println("\n======== Daftar Bola Kecil =========");
                        for (int i = 0; i < dataBK.size(); i += 1){
                            System.out.println("Data Bola Kecil ke-" + (i + 1));
                            dataBK.get(i).dataBola();
                        }
                        System.out.println("\n======== Daftar Bola Mainan ========");
                        for (int i = 0; i < dataBM.size(); i += 1){
                            System.out.println("Data Bola Mainan ke-" + (i + 1));
                            dataBM.get(i).dataBola();
                        }
                        System.out.println("====================================");
                        System.out.println("      Bola Berhasil Ditampilkan!    ");
                        System.out.println("====================================");
                        break;
                    }

                    case 3 -> {
                        System.out.println("============ MENU EDIT  ============");
                        // METHOD INTERFACE
                        BB.menuBola();
                        System.out.println("====================================");     
                        System.out.print("Input: ");
                        int MenuEdit = Integer.parseInt(br.readLine());
                        System.out.println("Input Merk Bola Yang Ingin Di edit: ");
                        System.out.print(">> ");
                        String EditMerk = br.readLine();
                        switch (MenuEdit) {
                            case 1 -> {
                                BB.JenisBola();
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
                            }
                            case 2 -> {
                                BK.JenisBola();
                                int JenisBK = Integer.parseInt(br.readLine());
                                JenisBola = switch (JenisBK) {
                                    case 1 -> "Bola Golf";
                                    case 2 -> "Bola Baseball";
                                    case 3 -> "Bola Tenis Meja";
                                    case 4 -> "Kok Bulu Tangkis";
                                    case 5 -> "Bola Tolak Peluru";
                                    default -> "Bola Biliar";
                                };
                            }
                        default -> {
                            System.out.print("Input Jenis Bola   : ");
                            JenisBola = br.readLine();
                            }
                        }
                        switch (MenuEdit) {
                            case 1 -> {
                                for (BolaBesar bola : dataBB) {
                                    if (bola.getMerk().equals(EditMerk) && bola.getJenis().equals(JenisBola)) {
                                        System.out.println("Memasuki Proses Edit...");
                                        System.out.println("============ Edit Bola =============");
                                        BB.JenisBola();
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
                                    System.out.println("Merk dan jenis bola tidak ada.\nSilahkan coba lagi...");
                                }
                        }
                        case 2 -> {
                            for (Bola bola : dataBK) {
                                if (bola.getMerk().equals(EditMerk) && bola.getJenis().equals(JenisBola)){
                                    System.out.println("Memasuki Proses Edit...");
                                    System.out.println("============ Edit Bola =============");
                                    BK.JenisBola();  
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
                        }
                        default -> {
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
                    }

                    case 4 -> {
                        System.out.println("===========  MENU HAPUS ============");
                        // METHOD INTERFACE
                        BB.menuBola();
                        System.out.println("====================================");     
                        System.out.print("Input: ");
                        int MenuHapus = Integer.parseInt(br.readLine());
                        System.out.println("============ Hapus Bola ============");
                        System.out.println("Input Merk Bola Yang Ingin Di hapus: ");
                        System.out.print(">> ");
                        String HapusMerk = br.readLine();
                        switch (MenuHapus) {
                            case 1 -> {
                                BB.JenisBola();
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
                            }
                            case 2 -> {
                                BK.JenisBola();
                                int JenisBK = Integer.parseInt(br.readLine());
                                JenisBola = switch (JenisBK) {
                                    case 1 -> "Bola Golf";
                                    case 2 -> "Bola Baseball";
                                    case 3 -> "Bola Tenis Meja";
                                    case 4 -> "Kok Bulu Tangkis";
                                    case 5 -> "Bola Tolak Peluru";
                                    default -> "Bola Biliar";
                                };
                            }
                            default -> {
                                System.out.print("Input Jenis Bola   : ");
                                JenisBola = br.readLine();
                            }
                        }
                        switch (MenuHapus) {
                            case 1 -> {
                                for (int i = 0; i < dataBB.size(); i++) {
                                    if (dataBB.get(i).getMerk().equals(HapusMerk) && dataBB.get(i).getJenis().equals(JenisBola)) {
                                        dataBB.remove(i);
                                        System.out.println("====================================");
                                        System.out.println("        Bola Berhasil Dihapus!      ");
                                        System.out.println("====================================");
                                        break;
                                    }
                                }
                            }
                            case 2 -> {
                                for (int i = 0; i < dataBK.size(); i++) {
                                    if (dataBK.get(i).getMerk().equals(HapusMerk) && dataBK.get(i).getJenis().equals(JenisBola)) {
                                        dataBK.remove(i);
                                        System.out.println("====================================");
                                        System.out.println("        Bola Berhasil Dihapus!      ");
                                        System.out.println("====================================");
                                        break;
                                    }
                                }
                            }
                            default -> {
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
                    }

                    case 5 -> {
                        LG.Login();
                    }

                    default -> System.out.println("Nomor menu tidak tersedia.\nSilahkan coba lagi...");
                }
            } catch (NumberFormatException e) {
                System.out.println("Harus di isi dengan angka!!! \nSilahkan coba lagi...");
            }
        }
    }
    
    // STATIC METHOD
    public static void menu(){
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
    }
}