import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//FINAL CLASS
public final class Login {
    // FINAL VARIABLE
    final String Username = "Irvan";
    final String Password = "057";
    
    // FINAL METHOD
    final void Login() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String InputUsername;
        String InputPassword;
        System.out.println("""
                            \n
                            ====================================
                                     LOGIN INAZUMA SPORT         
                            ====================================            
                            [Masukkan "00" untuk exit program]""");
        boolean ulang = true;
        while (ulang) {
            System.out.print("Masukkan Username: ");
            InputUsername = br.readLine();
            if ("00".equals(InputUsername)) {
                System.out.println("""
                                        ====================================
                                            Berhasil keluar dari program!
                                        ====================================
                                        """);
                System.exit(0);
            }
            System.out.print("Masukkan Password: ");
            InputPassword = br.readLine();
            if (InputUsername.equals(Username) && InputPassword.equals(Password)) {
                ulang = false;
            } else {
                System.out.println("Username atau Password anda salah. \n\nSilahkan coba lagi...");
            }
        }
    }
}