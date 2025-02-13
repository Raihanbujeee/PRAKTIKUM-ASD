package jobsheet1;
import java.util.Scanner;
public class tugas3Raihan {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        String[] namaMatkul = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hari = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data untuk mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMatkul[i] = scanner.nextLine();
            System.out.print("SKS: ");
            sks[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Hari: ");
            hari[i] = scanner.nextLine();
        }
        
        while (true) {
            System.out.println("\nPilih opsi:");
            System.out.println("1. Tampilkan seluruh jadwal");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            
            if (pilihan == 5) break;
            
            switch (pilihan) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.println(namaMatkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
                    }
                    break;
                case 2:
                    System.out.print("Masukkan hari: ");
                    String hariCari = scanner.nextLine();
                    for (int i = 0; i < n; i++) {
                        if (hari[i].equalsIgnoreCase(hariCari)) {
                            System.out.println(namaMatkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Masukkan semester: ");
                    int semesterCari = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (semester[i] == semesterCari) {
                            System.out.println(namaMatkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String matkulCari = scanner.nextLine();
                    for (int i = 0; i < n; i++) {
                        if (namaMatkul[i].equalsIgnoreCase(matkulCari)) {
                            System.out.println(namaMatkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
                        }
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
