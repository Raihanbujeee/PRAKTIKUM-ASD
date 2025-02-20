package jobhseet2;
import java.util.Scanner;
public class mataKuliah24 {
    String kodeMk,nama;
    int jumlahjam,sks;

    void tampilkanInformasi(){
        System.out.println("Kode Mata Kuliah : "+kodeMk);
        System.out.println("Nama : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah jam  : " + jumlahjam);
    }
    void ubahsks( int sksbaru){
        sks = sksbaru;
    }
    void tambahjam( int tambahjam){
        jumlahjam = jumlahjam + tambahjam;
    }
    void kurangijam(int kurangjam){
        jumlahjam = jumlahjam - kurangjam;
    }
    public mataKuliah24(){

    }
    public mataKuliah24 (String kodeMk, String nm, int sks, int jam){
        this.kodeMk = kodeMk;
        nama = nm;
        this.sks = sks;
        jumlahjam = jam;
    }
}
