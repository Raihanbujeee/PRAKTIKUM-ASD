package jobhseet2;

public class DosenMain24 {
    public static void main(String[] args) {
        Dosen24 dosen1 = new Dosen24();
        dosen1.idDosen= "DSN01";
        dosen1.nama = "Budi Santoso";
        dosen1.statusAktif= true;
        dosen1.tahunBergabung= 2017;
        dosen1.bidangKeahlian= "K3";

        dosen1.setStatusAktif(true);
        dosen1.hitungMasaKerja(2025);
        dosen1.ubahKeahlian("Matematika");
        dosen1.tampilkanInformasi();

        Dosen24 dosen2 = new Dosen24("DSN02","Andik zaki","Matematika",true,2019);

        dosen2.ubahKeahlian("Dasar Pemograman");
        dosen2.hitungMasaKerja(2025);
        dosen2.tampilkanInformasi();
    }
}
