package ZADACI.pastebinZadaci.IDeo.Hard;

import java.util.Scanner;

public class Zadatak32 {
    public static void main(String[] args) {

        // 32.* Za uneto m i n (intovi) iscrtati mxn sahovsku tablu, gde je belo polje oznaceno sa ' ' (space karakter),
  /*      a crno polje sa '.' (tacka). Uzeti da je gornje levo polje uvek crno. Npr za m = 3, n = 3:
|. .|
| . |
|. .| */


        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj redova (m): ");
        int m = sc.nextInt();

        System.out.print("Unesite broj kolona (n): ");
        int n = sc.nextInt();

        // Petlja za iscrtavanje šahovske table
        for (int i = 0; i < m; i++) {
            // Počinjemo sa crnim poljem na svakom redu
            char trenutniKarakter = '.';

            // Unutrašnja petlja za iscrtavanje jednog reda
            for (int j = 0; j < n; j++) {
                // Ispisujemo trenutni karakter (crno ili belo polje)
                System.out.print(trenutniKarakter);

                // Menjamo trenutni karakter za sledeći red
                trenutniKarakter = (trenutniKarakter == '.') ? ' ' : '.';
            }

            System.out.println(); // Prelazak u novi red nakon svakog reda table
        }












    }
}
