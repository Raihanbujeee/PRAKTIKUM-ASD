package jobsheet7;
import java.util.Scanner;
public class DosenMain24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen24 listDosen = new DataDosen24();

        while (true) {
            System.out.println("======== Menu ========");
            System.out.println("1. Tambahkan Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Urutkan Data Bubble Sort (ASC)");
            System.out.println("4. Urutkan Data Selection Sort (DSC)");
            System.out.println("5. Cari Data dengan Insertion Sort + Binary Search");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L = true, P = false): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine(); 
                    listDosen.tambah(new Dosen24(kode, nama, jk, usia));
                    break;
                case 2:
                    listDosen.tampil();
                    break;
                case 3:
                    listDosen.sortingASC();
                    System.out.println("Data setelah sorting ASC:");
                    listDosen.tampil();
                    break;
                case 4:
                    listDosen.sortingDSC();
                    System.out.println("Data setelah sorting DSC:");
                    listDosen.tampil();
                    break;
                case 5:
                    System.out.print("Masukkan usia dosen yang ingin dicari: ");
                    int usiaCari = sc.nextInt();
                    sc.nextLine();
                    listDosen.sortingASC();
                    listDosen.pencarianDataBinary(usiaCari);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
