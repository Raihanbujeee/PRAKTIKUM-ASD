package KUIS1;
public class Kuis24 {
    String nama24;
    double harga24,diskon24;
    int stok24;

    public Kuis24 (String nama24, double harga24,double diskon24, int stok24) {
        this.nama24 = nama24;
        this.harga24 = harga24;
        this.stok24 = stok24;
        this.diskon24 = diskon24;
    
}

public void cetak(){
    System.out.println("Nama Produk : "+nama24);
    System.out.println("Harga Produk : "+ harga24);
    System.out.println("stock produk : "+ stok24);
    System.out.println(" diskon produk : "+ diskon24);
}
public void Hargadiskon(){
    double hargadiskon24 = harga24 - (harga24 * diskon24 / 100);
    System.out.println(" Harga diskon : " + hargadiskon24);
}
}
