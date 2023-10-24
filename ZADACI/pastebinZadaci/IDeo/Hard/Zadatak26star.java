package ZADACI.pastebinZadaci.IDeo.Hard;

import java.util.Scanner;

public class Zadatak26star {
    public static void main(String[] args) {

         /*  26.* Korisnik unosi pozitivan ceo broj n, n >= 2 sa konzole. Zatim se unose imena korisnika. Ispisati "da" ako
        su uneta dva korisnika sa istim imenom za redom (jedan za drugim), a "ne" inace.
                Npr:
        "Ana", "Marija", "Milica", "Milica", "Jelena", "Zorica" -> "da" (zbog "Milica", "Milica")
        "Branko", "Aleksandar", "Marko" -> "ne"
        "Tara", "Jana", "Tara", "Jana" -> "ne" (iako imamo duplikate nisu uneti za redom) */


        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int n = sc.nextInt();
        int duplikat = 0;
        String prethodnoIme = "";

        for (int i = 0; i < n; i++) {

            String ime = sc.next();

            if (ime.equalsIgnoreCase(prethodnoIme)) {
                duplikat++;
            }

            prethodnoIme = ime;
        }

        if (duplikat > 0) {
            System.out.println("DA");
        } else {
            System.out.println("NE");
        }
    }
}
