package jobsheet6;

public class Mahasiswa24 {
    String nim,nama,kelas;
    double ipk;

    Mahasiswa24 (){

    }
    Mahasiswa24(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
   void tampilkaninformasi(){
    System.out.println("Nama : " + nama);
    System.out.println("NIM : " + nim);
    System.out.println("kelas : " + kelas);
    System.out.println("IPK : " + ipk);
   } 
}