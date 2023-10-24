package ZADACI.pastebinZadaci.IDeo.Medium;

import java.util.Scanner;

public class Zadatak18 {
    public static void main(String[] args) {

        // 18. Uneti pozitivan ceo broj n. Zatim izracunati sumu unetih narednih n brojeva (double).


        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite broj: ");

        int n= sc.nextInt();
        double sum = 0;

        for (int i = 0; i < n; i++) {


            sum += sc.nextDouble();

        }

        System.out.println("Zbir brojeva je: " + sum);














    }
}
