package ZADACI.pastebinZadaci.IIDeo.Medium;

import java.util.Scanner;

public class Zadatak20notfinished {
    public static void main(String[] args) {

        //  20.** Napisati funkciju koja kreira niz od brojeva koji korisnik unosi sa konzole sve dok ne unese 0.
        //  Npr: 1 2 3 3 4 5 0 -> [1, 2, 3, 4, 4, 5]


        int[] niz=kreirajNiz();

        System.out.println("=============");

        for (int e:niz)

            System.out.println(e);

    }



  /*  static int[] kreirajNiz () {

        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite brojeve niza i koristite <0> za zaustavljanje: ");

        int[] niz= null;
        int i=0;

        while (true) {

            if (sc.nextInt()==0)
                break;

            niz[i] = sc.nextInt();
            i++;

        }


        return niz;



    } */

    static int[] kreirajNiz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite brojeve niza i koristite <0> za zaustavljanje: ");

        int[] niz = new int[10]; // Početna veličina niza
        int i = 0;

        while (true) {
            int broj = sc.nextInt();
            if (broj == 0)
                break;

            niz[i] = broj;
            i++;

            // Proveravamo da li je potrebno povećati veličinu niza
            if (i == niz.length) {
                int[] noviNiz = new int[niz.length * 2];
                for (int j = 0; j < niz.length; j++) {
                    noviNiz[j] = niz[j];
                }
                niz = noviNiz;
            }
        }

        // Kreiramo novi niz sa tačnom dužinom
        int[] rezultat = new int[i];
        for (int j = 0; j < i; j++) {
            rezultat[j] = niz[j];
        }

        return rezultat;
    }



}
