package jobsheet3;
import java.util.Scanner;

public class Matakuliahdemo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlahMatkul = sc.nextInt();
        sc.nextLine(); 
        Matakuliah24[] arrayOfMatakuliah = new Matakuliah24[jumlahMatkul];
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("\nMasukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah24();
            arrayOfMatakuliah[i].tambahData();
        }

        System.out.println("\nData Matakuliah yang telah dimasukkan:");
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("\nMatakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
