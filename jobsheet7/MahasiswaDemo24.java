package jobsheet7;
import java.util.Scanner;
public class MahasiswaDemo24 {
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

        list.tampil();
        //melakukan pencarian data sequential
        // System.out.println("Pencarian data");
        // System.out.println("----------------------------------------------------");
        // System.out.println("masukkan ipk mahasiswa yang dicari: ");
        // System.out.print("IPK: ");
        // double cari = input.nextDouble();
        
        // System.out.println("menggunakan sequential searching");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int)posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

        //melakukan pencarian data Binary
        System.out.println("----------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("----------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = input.nextDouble();

        System.out.println("----------------------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("----------------------------------------------------");

        double posisi2 = list.findBinarySearch(cari, 0, jumlah - 1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

     }
       
    }