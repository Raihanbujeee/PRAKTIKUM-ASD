package KUIS1;
import java.util.Scanner;
public class kuis24main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah produk: ");
        int jumlahProduk24 = sc.nextInt();
        sc.nextLine(); 
        Kuis24[] daftarProduk24 = new Kuis24 [jumlahProduk24];
        for (int i = 0; i < jumlahProduk24; i++) {
            System.out.println("\nMasukkan data untuk Produk ke-" + (i + 1));

            System.out.print("Nama Produk: " );
            String nama24 = sc.nextLine();
            System.out.print("Harga Produk: ");
            double harga24 = sc.nextDouble();
            System.out.println(" Jumlah stok: ");
            int stok24 = sc.nextInt();
            System.out.println(" Diskon : " );
            int diskon24 = sc.nextInt();
            daftarProduk24[i]= new Kuis24(nama24, harga24, diskon24, stok24);
    }
    System.out.println("\n=== Data Produk ===");
        for (Kuis24  produk : daftarProduk24) {
            produk.Hargadiskon();
            produk.cetak();
    }
}
}
