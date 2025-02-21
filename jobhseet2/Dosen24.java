package jobhseet2;

public class Dosen24 {
    String idDosen,nama,bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    void tampilkanInformasi(){
        System.out.println("ID Dosen : "+idDosen);
        System.out.println("Nama Dosen : "+nama);
        System.out.println("Bidang Keahlian : "+bidangKeahlian);
        System.out.println("Status Aktif : "+statusAktif);
        System.out.println("Tahun Bergabung : "+tahunBergabung);

    }
    void setStatusAktif(boolean status) {
       
    }
    public int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

public void ubahKeahlian(String bidang) {
         this.bidangKeahlian = bidang;
    }


    public Dosen24() {

    }
    public Dosen24(String id,String nm, String bidang, boolean status,int thn ){
        idDosen=id;
        nama=nm;
        bidangKeahlian=bidang;
        statusAktif=status;
        tahunBergabung=thn;
   }
}
