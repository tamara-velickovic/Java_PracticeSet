package ZADACI.pastebinZadaci.IDeo.Medium;

import java.util.Scanner;

public class Zadatak19 {
    public static void main(String[] args) {

        //  19. Uneti pozitivan ceo broj n. Zatim izracunati proizvod unetih narednih n brojeva (double).


        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite broj i nakon toga redom brojeve: ");

        int n= sc.nextInt();
        double prod = 1;

        for (int i = 0; i < n; i++) {


            prod *= sc.nextDouble();

        }

        System.out.println("Zbir brojeva je: " + prod);
















    }
}
