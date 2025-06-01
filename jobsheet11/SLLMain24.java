package jobsheet11;

import java.util.Scanner;

import org.w3c.dom.Node;

public class SLLMain24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList24 sll = new SingleLinkedList24();

        
        // int lanjut = 100;
        
        // for (int i = 0; i < lanjut ; i++) {
        //     System.out.println("Masukkan data mahasiswa ke- " + (i + 1) + " : ");
        //     System.out.print("NIM: ");
        //     String nim = sc.nextLine();
        //     System.out.print("Nama: ");
        //     String nama = sc.nextLine();
        //     System.out.print("Kelas: ");
        //     String kelas = sc.nextLine();
        //     System.out.print("IPK: ");
        //     double ipk = sc.nextDouble();
        //     sc.nextLine();

        //     Mahasiswa24 m = new Mahasiswa24(nim, nama, kelas, ipk);
        //     sll.addFirst(m);
        //     System.out.println();
        //     System.out.print("Apakah mau lanjut? (y/n) : ");
        //     String jawab = sc.nextLine();
        //     if (jawab.equalsIgnoreCase("n")) {
        //         System.out.println("Terima kasih.");
        //         break;
        //         }
        // }
        // sll.print();
        // sll.addFirst(mhs4);
        // sll.print();
        // sll.addLast(mhs1);
        // sll.print();
        // sll.insertAfter("Dirga", mhs3);
        // sll.insertAt(2, mhs2);
        // sll.print(); */
        
        Mahasiswa24 mhs1 = new Mahasiswa24("21212203", "Dirga", "4D", 3.6);
        Mahasiswa24 mhs3 = new Mahasiswa24("22212202", "Cintia", "3C", 3.5);
        Mahasiswa24 mhs2 = new Mahasiswa24("23212201", "Bimon", "2B", 3.8);
        Mahasiswa24 mhs4 = new Mahasiswa24("24212200", "Alvaro", "1A", 4.0);
        sll.addFirst(mhs1);
        sll.addFirst(mhs2);
        sll.addFirst(mhs3);
        sll.addFirst(mhs4);
        System.out.println("data index 1 :");
        sll.getdata(1);
        System.out.println();

        System.out.println("Data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
        
        
    }
}