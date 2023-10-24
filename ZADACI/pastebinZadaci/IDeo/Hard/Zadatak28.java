package ZADACI.pastebinZadaci.IDeo.Hard;

import java.util.Scanner;

public class Zadatak28 {
    public static void main(String[] args) {

        // 28.* Korisnik unosi cene artikala sve dok ne unese 0. Ispisati prosecnu vrednost artikala.


        Scanner sc= new Scanner (System.in);
        System.out.println("Unosite cene artikala, ispisite <0> za zaustavljanje: ");


        int brojac= 0;
        double cena= 0;
        double sum= 0;
        double prosek= 0;

       while (true)

       { cena= sc.nextDouble();

         if (cena==0)
             break;

         sum+= cena;
         brojac++;


       }


        prosek= sum/ (double)brojac;
        System.out.println(prosek);





    }
}
