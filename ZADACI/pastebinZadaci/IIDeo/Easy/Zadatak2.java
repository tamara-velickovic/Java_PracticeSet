package ZADACI.pastebinZadaci.IIDeo.Easy;

import java.util.Scanner;

public class Zadatak2 {




    public static int[] unesiNiz (int n) {

       Scanner sc= new Scanner(System.in);

        int[] niz = new int[n];

        for (int i = 0; i < n; i++) {

            niz[i] = sc.nextInt();

        }

        return niz;

    }





    public static void main(String[] args) {


        //  2. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati svaki drugi element tog niza
        // Primer: [1, 2, 3, 4, 5] -> 1 3 5
        //b) Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj brojeva, a zatim redom vrednosti niza: ");

        int n = sc.nextInt();

        int[] niz = unesiNiz(n);

        ispisiElementeNiza(niz);




    }



    static void ispisiElementeNiza (int[] niz) {

        for (int i = 0; i < niz.length; i+=2) {

            System.out.println(niz[i]);

        }




    }

}