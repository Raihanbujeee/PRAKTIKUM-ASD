package jobsheet9;

public class Mahasiswa24 {
    String nama,nim,kelas;
    int nilai;
    Mahasiswa24(String nama, String nim, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }
    
    void tugasDinilai (int nilai){
        this.nilai = nilai;
    }
}
