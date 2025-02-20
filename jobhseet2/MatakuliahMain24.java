package jobhseet2;

public class MatakuliahMain24 {
    public static void main(String[] args) {
        mataKuliah24 matkul1 = new mataKuliah24();
        matkul1.kodeMk = "MK01";
        matkul1.nama = "Struktur data";
        matkul1.sks = 3;
        matkul1.jumlahjam= 2;

        matkul1.tambahjam(2);
        matkul1.kurangijam(1);
        matkul1.ubahsks(4);
        matkul1.tampilkanInformasi();

        mataKuliah24 matkul2 = new mataKuliah24("MK02"," Dasar pemograman",3,4);
        matkul2.tambahjam(1);
        matkul2.ubahsks(3);
        matkul2.tampilkanInformasi();
    }
}
