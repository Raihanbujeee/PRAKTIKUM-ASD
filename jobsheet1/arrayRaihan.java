package jobsheet1;
import java.util.Scanner;
public class arrayRaihan {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = input.nextInt();
        String[] namaMatkul = new String[jumlahMatkul];
        int[] sks = new int[jumlahMatkul];
        double[] nilaiAngka = new double[jumlahMatkul];
        String[] nilaiHuruf = new String[jumlahMatkul];
        double[] nilaiSetara = new double[jumlahMatkul];
        double totalBobot = 0, totalSKS = 0;
        
        for (int i = 0; i < jumlahMatkul; i++) {
            input.nextLine();
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            namaMatkul[i] = input.nextLine();
            
            System.out.print("Masukkan bobot SKS: ");
            sks[i] = input.nextInt();
            
            System.out.print("Masukkan nilai angka: ");
            nilaiAngka[i] = input.nextDouble();
            
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }
            totalBobot += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }
        System.out.println("\n================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("================================");
        System.out.printf("%-30s %-10s %-10s %-10s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.printf("%-30s %-10.2f %-10s %-10.2f\n", namaMatkul[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
        }
        double ipSemester = totalBobot / totalSKS;
        System.out.println("================================");
        System.out.printf("IP Semester Anda: %.2f\n", ipSemester);
    }
}
