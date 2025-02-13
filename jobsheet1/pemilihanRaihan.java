package jobsheet1;
import java.util.Scanner;

public class pemilihanRaihan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tugas, kuis, uts, uas, nilaiAkhir;
        String nilaiHuruf, status;
        
        System.out.println("\nProgram Menghitung Nilai Akhir");
        System.out.println("================================");
        System.out.print("Masukkan nilai Tugas: ");
        tugas = scanner.nextDouble();
        System.out.print("Masukkan nilai Kuis: ");
        kuis = scanner.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        uts = scanner.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        uas = scanner.nextDouble();
        
        System.out.println("================================");
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("\nNilai tidak valid\n");
        } else {
            nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
     
            if (nilaiAkhir >= 80) {
                nilaiHuruf = "A";
                status = "LULUS";
            } else if (nilaiAkhir >= 73) {
                nilaiHuruf = "B+";
                status = "LULUS";
            } else if (nilaiAkhir >= 65) {
                nilaiHuruf = "B";
                status = "LULUS";
            } else if (nilaiAkhir >= 60) {
                nilaiHuruf = "C+";
                status = "LULUS";
            } else if (nilaiAkhir >= 50) {
                nilaiHuruf = "C";
                status = "LULUS";
            } else if (nilaiAkhir >= 39) {
                nilaiHuruf = "D";
                status = "TIDAK LULUS";
            } else {
                nilaiHuruf = "E";
                status = "TIDAK LULUS";
            }
            System.out.printf("\nNilai Akhir : %.1f\n", nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            
            System.out.println("================================");
            if (status.equals("LULUS")) {
                System.out.println("SELAMAT ANDA LULUS\n");
            } else {
                System.out.println("ANDA TIDAK LULUS\n");
            }
        }
    }
}