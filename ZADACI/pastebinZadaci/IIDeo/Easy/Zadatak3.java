package ZADACI.pastebinZadaci.IIDeo.Easy;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        //   3. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Izracunati sumu tog niza.
        // Primer: [1, 2, 3, 4, 5] -> 15 (1 + 2 + 3 + 4 + 5 = 15)
        // b) Napraviti funkciju koja vraca sumu prosledjenog niza.


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj brojeva, a zatim redom vrednosti niza: ");

        int n = sc.nextInt();

        int[] niz = Zadatak2.unesiNiz(n);



        System.out.println(sumaNiza(niz));
    }



    static int sumaNiza (int[] niz) {

        int sumaNiza= 0;

        for (int i = 0; i < niz.length ; i++) {

            sumaNiza+= niz[i];

        }


        return sumaNiza;
    }






}
