package jobsheet3;
import java.util.Scanner;
public class Dosendemo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine(); 
        Dosen24[] daftarDosen = new Dosen24[jumlahDosen];
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nMasukkan data untuk dosen ke-" + (i + 1));

            System.out.print("Kode         : ");
            String kode = sc.nextLine();

            System.out.print("Nama         : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (L/P): ");
            char jk = sc.next().charAt(0);
            sc.nextLine(); 

            System.out.print("Usia         : ");
            int usia = sc.nextInt();
            sc.nextLine(); 

            boolean jenisKelamin = (jk == 'L' || jk == 'l');

            daftarDosen[i] = new Dosen24(kode, nama, jenisKelamin, usia);
        }
        System.out.println("\n=== Data Dosen ===");
        for (Dosen24 dosen : daftarDosen) {
            dosen.cetakInfo();
        }

        DataDosen24.dataSemuaDosen(daftarDosen);
        DataDosen24.jumlahDosenPerJenisKelamin(daftarDosen);
        DataDosen24.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        DataDosen24.infoDosenPalingTua(daftarDosen);
        DataDosen24.infoDosenPalingMuda(daftarDosen);
    }
}

