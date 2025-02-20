package jobhseet2;

public class MahasiswaMAin24 {
    public static void main(String[] args) {
        Mahasiswa24 mhsl = new Mahasiswa24();
        mhsl.nama= "Muhammad Ali Farhan";
        mhsl.nim = "2241720171";
        mhsl.kelas = "SI 2J";
        mhsl.ipk =  3.55;

        mhsl.tampilkanInformasi();
        mhsl.ubahKelas("SI 2K");
        mhsl.updateIpk(3.60);
        mhsl.tampilkanInformasi();

        Mahasiswa24 mhs2 = new Mahasiswa24("Annisa Nabila","2141720160",3.25,"TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa24 mhsRaihanAkbar = new Mahasiswa24("Raihan Akbar Putra Prasetyo","244107020087",3.98,"TI 1E");
        mhsRaihanAkbar.tampilkanInformasi();
    }
    
}
