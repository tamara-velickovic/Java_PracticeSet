package ZADACI.pastebinZadaci.IDeo.Medium;

import java.util.Scanner;

public class Zadatak12 {
    public static void main(String[] args) {

        //  12. Za unet ceo broj n, ispisati za svaki od brojeva [1, n] "Fizz" ako je deljiv sa 3, "Buzz" ako je deljiv sa 5, "Zazz"
        //  ako je deljiv sa 7 i sve ostale varijacije ("BuzzZazz" ako je deljiv i sa 5 i sa 7, ...)
        // X +    FizzBuzzZuzz +  FizzBuzz, BuzzZuzz, FizzZuzz  +    3 Fizz    5 Buzz      7 Zazz


        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite broj: ");

        int n= sc.nextInt();


        for (int i = 1; i <= n; i++) {


            if ((i % 3 == 0) && (i % 5 == 0) && (i % 7 == 0)) {

                System.out.println(i + " : " + "FizzBuzzZuzz");
            } else if ((i % 3 == 0) && (i % 5 == 0)) {

                System.out.println(i + " : " + "FizzBuzz");
            } else if ((i % 5 == 0) && (i % 7 == 0)) {

                System.out.println(i + " : " +"BuzzZuzz");
            } else if ((i % 3 == 0) && (i % 7 == 0)) {

                System.out.println(i + " : " +"FizzZuzz");
            } else if (i % 3 == 0) {

                System.out.println(i + " : " +"Fizz");
            } else if (i % 5 == 0) {

                System.out.println(i + " : " +"Buzz");
            } else if (i % 7 == 0) {

                System.out.println(i + " : " +"Zuzz");
            }

        }


        //II nacin

     /*   Scanner sc= new Scanner(System.in);
        System.out.println("Unesite broj: ");

        int n= sc.nextInt();



        for (int i = 1; i <= n; i++) {

            String rezultat = "";

           if (i % 3 == 0){
               rezultat += "Fizz";}


           if (i % 5 == 0){
                rezultat += "Buzz";}


           if (i % 7 == 0) {
                 rezultat += "Zuzz";}


            if (!rezultat.isEmpty()) {
                System.out.println(i + " :  " + rezultat);
            }



        }
*/


    }
    }






