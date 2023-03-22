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
        String MerkBola, JenisBola;
        int StokBola, HargaBola;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<BolaBesar> dataBB = new ArrayList<>();
        ArrayList<BolaKecil> dataBK = new ArrayList<>();
        BolaBesar BB = new BolaBesar("Mikasa", "Bola Voli", 30, 75000);
        dataBB.add(BB);
        BolaKecil BK = new BolaKecil("Doniic P40+", "Bola Tenis Meja", 20, 45000);
        dataBK.add(BK);
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
                    System.out.println("====================================");     
                    System.out.print("Input: ");
                    int MenuTambah = Integer.parseInt(br.readLine());
                    if (MenuTambah == 1) {
                        JenisBolaBesar();
                        int JenisBB = Integer.parseInt(br.readLine());
                        if (JenisBB == 1) {
                            JenisBola = "Bola Sepak";
                        } else if (JenisBB == 2) {
                            JenisBola = "Bola Basket";
                        } else if (JenisBB == 3) {
                            JenisBola = "Bola Voli";
                        } else if (JenisBB == 4) {
                            JenisBola = "Bola Futsal";
                        } else if (JenisBB == 5) {
                            JenisBola = "Bola Rugbi";
                        } else if (JenisBB == 6) {
                            JenisBola = "Bola Takraw";
                        } else {
                            JenisBola = "Bola Bowling";
                        }
                    } else {
                        JenisBolaKecil();
                        int JenisBK = Integer.parseInt(br.readLine());
                        if (JenisBK == 1) {
                            JenisBola = "Bola Golf";
                        } else if (JenisBK == 2) {
                            JenisBola = "Bola Baseball";
                        } else if (JenisBK == 3) {
                            JenisBola = "Bola Tenis Meja";
                        } else if (JenisBK == 4) {
                            JenisBola = "Kok Bulu Tangkis";
                        } else if (JenisBK == 5) {
                            JenisBola = "Bola Tolak Peluru";
                        } else {
                            JenisBola = "Bola Biliar";
                        }
                    }
                    System.out.println("=========== Tambah Bola ============");
                    System.out.print("Merk Bola : ");
                    MerkBola = br.readLine(); 
                    System.out.print("Jumlah Stok Bola : ");
                    StokBola = Integer.parseInt(br.readLine());
                    System.out.print("Harga Bola : ");
                    HargaBola = Integer.parseInt(br.readLine());
                    if (MenuTambah == 1) {
                        BolaBesar newBolaBesar = new BolaBesar(MerkBola, JenisBola, StokBola, HargaBola);
                        dataBB.add(newBolaBesar);
                    } else {
                        BolaKecil newBolaKecil = new BolaKecil(MerkBola, JenisBola, StokBola, HargaBola);
                        dataBK.add(newBolaKecil);
                    }
                    System.out.println("====================================");
                    System.out.println("       Bola Berhasil Ditambah!      ");
                    System.out.println("====================================");
                    break; 
                }
                

                case 2 -> {
                    System.out.println("======== Daftar Bola Besar =========");
                    for (int i = 0; i < dataBB.size(); i += 1) {
                        System.out.println("Data Bola ke-" + (i + 1));
                        dataBB.get(i).display();
                    }
                    System.out.println("\n======== Daftar Bola Kecil =========");
                    for (int i = 0; i < dataBK.size(); i += 1) {
                        System.out.println("Data Bola ke-" + (i + 1));
                        dataBK.get(i).display();
                    }
                    System.out.println("====================================");
                    System.out.println("      Bola Berhasil Ditampilkan!    ");
                    System.out.println("====================================");
                }
                    
                    
                case 3 -> {
                    System.out.println("============ MENU EDIT  ============");
                    System.out.println("| 1. Edit Data Bola Besar        |");
                    System.out.println("| 2. Edit Data Bola Kecil        |");
                    System.out.println("====================================");     
                    System.out.print("Input: ");
                    int MenuEdit = Integer.parseInt(br.readLine());
                    System.out.println("============ Edit Bola =============");
                    System.out.print("Input Merk Bola Yang Ingin Di edit : ");
                    String EditMerk = br.readLine();
                    if (MenuEdit == 1) {
                        for (Bola bola : dataBB) {
                            if (bola.getMerk().equals(EditMerk)) {
                                System.out.print("Input Merk : ");
                                bola.setMerk(br.readLine());
                                JenisBolaBesar();
                                int JenisBB = Integer.parseInt(br.readLine());
                                if (JenisBB == 1) {
                                    JenisBola = "Bola Sepak";
                                } else if (JenisBB == 2) {
                                    JenisBola = "Bola Basket";
                                } else if (JenisBB == 3) {
                                    JenisBola = "Bola Voli";
                                } else if (JenisBB == 4) {
                                    JenisBola = "Bola Futsal";
                                } else if (JenisBB == 5) {
                                    JenisBola = "Bola Rugbi";
                                } else if (JenisBB == 6) {
                                    JenisBola = "Bola Takraw";
                                } else {
                                    JenisBola = "Bola Bowling";
                                }
                                bola.setJenis(JenisBola);
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
                    } else {
                        for (Bola bola : dataBK) {
                            if (bola.getMerk().equals(EditMerk)) {
                                System.out.print("Input Merk : ");
                                bola.setMerk(br.readLine());
                                JenisBolaKecil();   
                                int JenisBK = Integer.parseInt(br.readLine());
                                if (JenisBK == 1) {
                                    JenisBola = "Bola Golf";
                                } else if (JenisBK == 2) {
                                    JenisBola = "Bola Baseball";
                                } else if (JenisBK == 3) {
                                    JenisBola = "Bola Tenis Meja";
                                } else if (JenisBK == 4) {
                                    JenisBola = "Kok Bulu Tangkis";
                                } else if (JenisBK == 5) {
                                    JenisBola = "Bola Tolak Peluru";
                                } else {
                                    JenisBola = "Bola Biliar";
                                }
                                bola.setJenis(JenisBola);
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
                }
                    
                case 4 -> {
                    System.out.println("===========  MENU HAPUS ============");
                    System.out.println("| 1. Hapus Data Bola Besar        |");
                    System.out.println("| 2. Hapus Data Bola Kecil        |");
                    System.out.println("====================================");     
                    System.out.print("Input: ");
                    int MenuHapus = Integer.parseInt(br.readLine());
                    System.out.println("============ Hapus Bola ============");
                    System.out.print("Input Merk Bola Yang Ingin Di hapus : ");
                    String HapusMerk = br.readLine();
                    if (MenuHapus == 1) {
                        for (int i = 0; i < dataBB.size(); i++) {
                            if (dataBB.get(i).getMerk().equals(HapusMerk)) {
                                dataBB.remove(i);
                                System.out.println("====================================");
                                System.out.println("        Bola Berhasil Dihapus!      ");
                                System.out.println("====================================");
                                break;
                            }
                        }
                    } else {
                        for (int i = 0; i < dataBK.size(); i++) {
                            if (dataBK.get(i).getMerk().equals(HapusMerk)) {
                                dataBK.remove(i);
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
    
    public static void JenisBolaBesar() {
        System.out.print("""
                           ============ Bola Besar ============
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
                           ============ Bola Kecil ============
                           1. Bola Golf
                           2. Bola Baseball
                           3. Bola Tenis Meja
                           4. Kok Bulu Tangkis
                           5. Bola Tolak Peluru
                           6. Bola Biliar
                           Pilih Jenis Bola [1/2/3/4/5/6] :  """);
    }
}