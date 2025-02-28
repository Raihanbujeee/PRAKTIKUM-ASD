package jobsheet3;

public class DataDosen24 {
    public static void dataSemuaDosen(Dosen24[] arrayOfDosen) {
        System.out.println("\n=== Data Semua Dosen ===");
        for (Dosen24 d : arrayOfDosen) {
            d.cetakInfo();
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen24[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen24 d : arrayOfDosen) {
            if (d.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("\nJumlah Dosen Pria  : " + pria);
        System.out.println("Jumlah Dosen Wanita: " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen24[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0, countPria = 0, countWanita = 0;

        for (Dosen24 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                countPria++;
            } else {
                totalWanita += d.usia;
                countWanita++;
            }
        }

        System.out.println("\nRata-rata Usia Dosen:");
        System.out.println("Pria  : " + (countPria > 0 ? (totalPria / countPria) : 0));
        System.out.println("Wanita: " + (countWanita > 0 ? (totalWanita / countWanita) : 0));
    }

    public static void infoDosenPalingTua(Dosen24[] arrayOfDosen) {
        Dosen24 tertua = arrayOfDosen[0];
        for (Dosen24 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }
        System.out.println("\n=== Dosen Paling Tua ===");
        tertua.cetakInfo();
    }

    public static void infoDosenPalingMuda(Dosen24[] arrayOfDosen) {
        Dosen24 termuda = arrayOfDosen[0];
        for (Dosen24 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }
        System.out.println("\n=== Dosen Paling Muda ===");
        termuda.cetakInfo();
    }
}

