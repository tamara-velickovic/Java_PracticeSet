package ZADACI.pastebinZadaci.IDeo.Hard;

import java.util.Scanner;

import static java.lang.Double.NEGATIVE_INFINITY;

public class Zadatak24 {
    public static void main(String[] args) {


        // 24.* Uneti pozitivan ceo broj n. Zatim ispisati najmanji i najveci broj od unetih narednih n brojeva (double).


        Scanner sc= new Scanner (System.in);
        System.out.println("Unesite broj: ");

        int n= sc.nextInt();
        double min= Double.POSITIVE_INFINITY;
        double max= NEGATIVE_INFINITY;


        for (int i = 0; i < n; i++) {

            double broj= sc.nextDouble();

            if(broj<min)
                min= broj;

            if (broj>max)
                max= broj;

        }
        System.out.println("Najveci: " + max);
        System.out.println("Najmanji: " + min);







    }
}
