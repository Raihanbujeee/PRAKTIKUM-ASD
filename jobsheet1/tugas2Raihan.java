package jobsheet1;
import java.util.Scanner;
public class tugas2Raihan {
     public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }
    public static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }
    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pilih perhitungan:");
        System.out.println("1. Volume Kubus");
        System.out.println("2. Luas Permukaan Kubus");
        System.out.println("3. Keliling Kubus");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();
        
        switch (pilihan) {
            case 1:
                System.out.println("Volume: " + hitungVolume(sisi));
                break;
            case 2:
                System.out.println("Luas Permukaan: " + hitungLuasPermukaan(sisi));
                break;
            case 3:
                System.out.println("Keliling: " + hitungKeliling(sisi));
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}

