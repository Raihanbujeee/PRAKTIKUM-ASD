package jobsheet7;
public class DataDosen24 {
    Dosen24[] dataDosen = new Dosen24[10];
    int idx = 0;

    void tambah(Dosen24 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data Dosen sudah penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data.");
        } else {
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
            }
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen24 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIndex].usia) {
                    maxIndex = j;
                }
            }
            Dosen24 temp = dataDosen[maxIndex];
            dataDosen[maxIndex] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen24 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
     }

    }
    void pencarianDataSequential13(String cariNama){
        int cari = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(cariNama)) {
                dataDosen[i].tampil();
                cari++;
            }
        }
        if (cari == 0) {
            System.out.println("dosen dengan nama " + cariNama + " tidak ditemukan");
            }else if (cari > 1) {
                System.out.println("ditemukan lebih dari satu data dosen dengan nama yang sama!");
            }
        }
    
    void pencarianDataBinary(int cariUsia){

        int awal = 0, akhir = idx -1, tengah = -1;
        boolean ditemukan = false;

        while (awal <= akhir) {
            tengah = (awal + akhir) / 2;
            if (dataDosen[tengah].usia == cariUsia) {
                ditemukan = true;
                break;
            }
            if (dataDosen[tengah].usia < cariUsia) {
                awal = tengah + 1;
            } else {
                akhir = tengah - 1;
            }
        }
         if (!ditemukan) {
            System.out.println("Dosen dengan usia " + cariUsia + " tidak ditemukan");
            return;
         }       

         int kiri = tengah, kanan = tengah;
         while (kiri >= 0 && dataDosen[kiri].usia == cariUsia) kiri--; {
         while (kanan < idx && dataDosen[kanan].usia == cariUsia)kanan++; {
            System.out.println("hasil pencarian dosen dengan usia " + cariUsia+": ");

        for (int i = kiri + 1; i < kanan; i++) {
            dataDosen[i].tampil();
        }
        if (kanan - kiri - 1 > 1) {
            System.out.println("Peringatan! ada lebih dari 1 dosen dengan usia yang sama");
        }
         }   

  }
}
}

    

