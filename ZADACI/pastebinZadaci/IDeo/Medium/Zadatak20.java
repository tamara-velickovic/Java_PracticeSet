package ZADACI.pastebinZadaci.IDeo.Medium;

import java.util.Scanner;

public class Zadatak20 {
    public static void main(String[] args) {

        //  20. Uneti pozitivan ceo broj n. Zatim izracunati prosek unetih narednih n brojeva (double).


        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite broj i nakon toga redom brojeve: ");

        int n= sc.nextInt();
        double prosek = 0;
        double sum= 0;

        for (int i = 0; i < n; i++) {


            sum += sc.nextDouble();

        }
            if (n>0)
            prosek= sum/ (double)n;

            else
                System.out.println("Prosek se ne moze izracunati. ");


        System.out.println("Zbir brojeva je: " + prosek);














    }
}
