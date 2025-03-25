package jobsheet6;
import java.util.Scanner;
public class MahasiswaDemo {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        MahasiswaBerprestasi24 list = new MahasiswaBerprestasi24();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine(); 

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM: ");
            String nim = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Kelas: ");
            String kelas = input.nextLine();
            System.out.print("IPK: ");
            double ipk = input.nextDouble();
            input.nextLine(); 

            Mahasiswa24 m = new Mahasiswa24(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("\nData Mahasiswa Sebelum sorting:");
        list.tampil();

        // System.out.println("\nData Mahasiswa setelah sorting berdasarkan IPK (DESC):");
        // list.bubblesort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan selection sort (ASC)");
        // list.selectionSort();
        // list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
    }
       
    }