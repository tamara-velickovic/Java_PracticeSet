package ZADACI.pastebinZadaci.IDeo.Hard;

import java.util.Scanner;

public class Zadatak37 {
    public static void main(String[] args) {


        // 37.** Za zadati celi broj n izracunati njegov skriven broj. Skriven broj se racuna tako sto sabiramo njegove cifre sve dok ne dobijemo jednocifren broj.
        //        Npr 9999 -> 9 jer:
        //  38+9+9+9 = 36
        //  39+6 = 9

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite ceo broj n: ");
        int n = sc.nextInt();

        // Petlja za računanje skrivenog broja
        while (n >= 10) {
            int sumaCifara = 0;
            // Računanje sume cifara broja n
            while (n > 0) {
                sumaCifara += n % 10;
                n /= 10;
            }
            n = sumaCifara;
        }

        System.out.println("Skriveni broj je: " + n);











    }
}
