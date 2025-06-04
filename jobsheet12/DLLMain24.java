package jobsheet12;

import java.util.Scanner;

public class DLLMain24 {
    static Scanner sc = new Scanner(System.in);

    public static Mahasiswa24 inputMahasiswa() {
        System.out.print("Nim : ");
        String nim = sc.nextLine();
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("IPK : ");
        double ipk = sc.nextDouble();
        sc.nextLine();
        return new Mahasiswa24(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        DoubleLinkedList24 list = new DoubleLinkedList24();
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1: {
                    Mahasiswa24 mhs = inputMahasiswa();
                    list.addFirst(mhs);
                    break;
                }
                case 2: {
                    Mahasiswa24 mhs = inputMahasiswa(); 
                    list.addLast(mhs);
                    break;
                }
                case 3:
                    list.removeFirst();
                    break;
                case 4:
                    list.removeLast();
                    break;
                case 5:
                    list.print();
                    break;
                case 6: {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = sc.nextLine();
                    Node24 found = list.search(nim); 
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
                }
                case 7: {
                    System.out.print("Masukkan NIM mahasiswa yang ingin dicari : ");
                    String nim = sc.nextLine();
                    Node24 found = list.search(nim);
                    if (found != null) {
                        Mahasiswa24 mhs = inputMahasiswa(); 
                        list.insertAfter(nim, mhs);
                    } else {
                        System.out.println("Data not found");
                    }
                    break;
                }
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}
