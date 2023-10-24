package ZADACI.domaci.drugi;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//Napraviti niz brojeva kroz koji cete proci i istampati samo neparne brojeve.

        int[] niz = new int[10];

        //Unos vrednosti kreiranog niza
        Scanner sc= new Scanner(System.in);

        for (int i=0; i<niz.length; i++)

            niz[i]= sc.nextInt();

        //Provera da li su dobro uneti

        for (int i=0; i<niz.length; i++)

            System.out.println("Element:" + niz[i]);;

        System.out.println("========== STAMPANJE NEPARNIH ==========");

        //Stampanje neparnih


        for (int i=0; i<niz.length; i++) {

            if (!(niz[i] % 2 == 0))
                System.out.println("Element: " + niz[i]);

        }





    }
}
