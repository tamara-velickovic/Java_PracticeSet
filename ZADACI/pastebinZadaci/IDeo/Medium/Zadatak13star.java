package ZADACI.pastebinZadaci.IDeo.Medium;

import java.util.Scanner;

public class Zadatak13star {
    public static void main(String[] args) {

        // 13.* Za unet pozitivan ceo broj n, ispisati za svaki pozitivan ceo broj t, koji je strogo manji od njega (dakle t < n),
        // //sumu svih pozitivnih celih brojeva od 1 do tog broja (dakle 1 + 2 + 3 + ... + t).


        //n=5 (t)4=10    (t)3=6    (t)2=3    (t)1=1

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");

        int n = sc.nextInt();

        for (int t = n - 1; t > 0; t--) {
            int suma = 0;

            for (int i = 1; i <= t; i++) {
                suma += i;
            }

            System.out.println("Za t = " + t + ", zbir svih prethodnika je: " + suma);
        }
    }

}




























