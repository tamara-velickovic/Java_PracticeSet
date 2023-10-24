package ZADACI.domaci.drugi;

import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {

//Napraviti niz brojeva i kao rezultat vratiti sumu svih parnih brojeva iz tog niza.


        int[] niz = new int[10];

        //Unos vrednosti kreiranog niza
        Scanner sc= new Scanner(System.in);

        for (int i=0; i<niz.length; i++)

            niz[i]= sc.nextInt();

        //Provera da li su dobro uneti

        for (int i=0; i<niz.length; i++)

            System.out.println("Element:" + niz[i]);;

        System.out.println("========== SUMA SVIH PARNIH ==========");

        int sum= 0;

        for (int i=0; i<niz.length; i++) {

            if (niz[i] % 2 == 0)

                sum+= niz[i];

        }
        System.out.println("Suma parnih elemenata " + sum);








    }
}
