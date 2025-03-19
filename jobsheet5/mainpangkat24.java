package jobsheet5;
import java.util.Scanner;
public class mainpangkat24 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Jumlah elemen : ");
        int elemen =input.nextInt();

        pangkat24 [] png = new pangkat24 [elemen];
        for (int i = 0;i<elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke- " + (i+1) + " : ");
            int basis = input.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke- " + (i+1) +": " );
            int pangkat = input.nextInt();
            png [i] = new pangkat24 (basis, pangkat);

    }
    System.out.println("HASIL PANGKAT BRUTEFORCE:");
    for (pangkat24 p : png) {
        System.out.println(p.nilai + "^" + p.pangkat + " = " + p.pangkatBF(p.nilai, p.pangkat));
    }

    System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
    for (pangkat24 p : png) {
        System.out.println(p.nilai + "^" + p.pangkat + " = " + p.pangkatDC(p.nilai, p.pangkat));
    }
 
}
}
