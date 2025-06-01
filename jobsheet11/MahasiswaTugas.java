package jobsheet11;

public class MahasiswaTugas {
      String nama, nim, kelas, prodi;
    

     public MahasiswaTugas(String nim, String nama, String kelas, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.prodi = prodi;
    }

     public void tampilInformasi() {
        System.out.printf("Nama: %s\n", nama);
        System.out.printf("NIM: %s\n", nim);
        System.out.printf("Prodi: %s\n", prodi);
        System.out.printf("Kelas: %s\n", kelas);
        System.out.println();
    }
    
    
}
