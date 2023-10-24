package ZADACI.pastebinZadaci.IDeo.Hard;

import java.util.Scanner;

public class Zadatak33 {
    public static void main(String[] args) {



        // 33.* Za unetu stranicu a, iscrtati jednakostranicni trougao. Npr za a = 5: /*
/*    *
|   * *
|  * * *
| * * * *
|* * * * * */


        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite dužinu stranice a: ");
        int a = sc.nextInt();

        // Petlja za iscrtavanje trougla
        for (int i = 1; i <= a; i++) {
            // Petlja za dodavanje razmaka na početku svakog reda
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            // Petlja za dodavanje '*' znakova za trenutni red
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Prelazak u novi red nakon svakog reda trougla
        }









    }
}
