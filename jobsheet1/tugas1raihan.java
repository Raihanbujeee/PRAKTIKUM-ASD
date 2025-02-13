package jobsheet1;
import java.util.Scanner;
public class tugas1raihan {
      public static void main(String[] args) {
        String[] KODE = {"A", "B", "D", "E", "G", "H", "L", "N", "M", "T"};
        String[] KOTA = {"BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "MADURA", "TEGAL"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        String inputKode = scanner.next().toUpperCase(); 
        scanner.close();
        
        boolean ditemukan = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i].equals(inputKode)) {
                System.out.println("Kota dari plat nomor " + inputKode + " adalah " + KOTA[i]);
                ditemukan = true;
                break;
            }
        }
      
        if (!ditemukan) {
            System.out.println("Kode plat nomor tidak ditemukan.");
        }
    }
}

