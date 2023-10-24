package ZADACI.pastebinZadaci.IIDeo.Easy;

import java.util.Scanner;

public class Zadatak1 {




    static void obrniNiz (int[] niz){


        for (int i = niz.length-1; i >= 0 ; i--) {

             System.out.println(niz[i]);

        }



    }






    public static void main(String[] args) {


        //  1. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati taj niz u obrtnutom redosledu
        // Primer: [4, 2, 3, 5] -> 5 3 2 4
        //  b) Napraviti funkciju koja ispisuje dat niz u obrnutom redosledu.


        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite broj brojeva, a zatim redom vrednosti niza: ");

        int n= sc.nextInt();
        int[] niz= new int[n];

        for (int i = 0; i < n; i++) {

            niz[i]= sc.nextInt();

        }


       obrniNiz(niz);






    }
}
