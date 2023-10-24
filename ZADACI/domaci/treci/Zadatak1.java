package ZADACI.domaci.treci;

import java.util.Scanner;

public class Zadatak1 {


    // Napraviti funkciju koja prima dva niza celih brojeva i proverava da li su jednaki. Primer:





    static boolean daLiSuNizoviJednaki(int[] niz1, int[] niz2) {


        if (niz1.length != niz2.length)
            return false;

        else {


            for (int i = 0; i < niz1.length; i++) {

                if (niz1[i] != niz2[i])

                    return false;


            }

            return true;
        }
    }

    static int[] unetiIntNiz() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj elemenata niza: " + " ");
        int brojElemenata = sc.nextInt();

        int[] niz = new int[brojElemenata];

        System.out.println("Unesite redom vrednosti elemenata niza:" + " ");

        for (int i = 0; i < niz.length; i++) {

            niz[i] = sc.nextInt();


        }


        return niz;
    }


    public static void main(String[] args) {

       int[] niz1 = unetiIntNiz();
       int[] niz2 = unetiIntNiz();

        //int[] niz1 = new int[] {1,2,5};
       // int[] niz2 =new int[] {1,12,5};

        boolean odgovor = daLiSuNizoviJednaki(niz1, niz2);

        System.out.println("Da li su nizovi jednaki? -----> " + odgovor);
    }

}