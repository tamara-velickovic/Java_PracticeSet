package ZADACI.pastebinZadaci.IDeo.Easy;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {


    //3. Za uneta dva broja a i b ispisati rezultat svih 5 osnovnih aritmetickih operacija: a+b, a-b, a*b, a/b, a%b.

        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite dva broja: " + " ");

        double a= sc.nextDouble();
        double b= sc.nextDouble();

        double rezultat;


            rezultat= a+b;
            System.out.println("Rezultat sabiranja: " + " " + rezultat);



            rezultat= a-b;
            System.out.println("Rezultat oduzimanja: " + " " + rezultat);



            rezultat= a*b;
            System.out.println("Rezultat mnozenja: " + " " + rezultat);


            if (b != 0) {
            rezultat= a/b;
            System.out.println("Rezultat deljenja: " + " " + rezultat);}

            else {
                System.out.println("Deljenje nulom nije moguce.");
            }



            if (b != 0) {
            rezultat= a%b;
            System.out.println("Ostatak pri deljenju je : " + " " + rezultat);}

            else {
                System.out.println("Deljenje nulom nije moguce.");
            }









    }


}
