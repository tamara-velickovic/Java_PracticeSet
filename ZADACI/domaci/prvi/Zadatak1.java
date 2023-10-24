package ZADACI.domaci.prvi;

import java.util.Scanner;

public class Zadatak1 {


    public static void main(String[] args) {

// Napisati program gde korisnik unosi svoj broj godina. Ukoliko ima 18 ili vise godina, ispisati
        // poruku da korisnik sme da konzumira alkohol, u suprotnom ispisati neku drugu poruku.*/


        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj godina: ");

        if (!sc.hasNextInt()) {
            System.out.println("Neodgovarajuci format.Molimo unesite celi broj.");
        } else {
            int x = sc.nextInt();

            if (x >= 18 && x <= 125) //Najstarija verifikovana osoba koja je ikada zivela imala je 122 godine.
            {
                System.out.println("Konzumirate alkohola je dozvoljeno u vasem uzrastu.");
            } else if (x > 0 && x < 18) {
                System.out.println("Konzumiranje alkohola nije dozvoljeno u vasem uzrastu.");
            } else {
                System.out.println("Greska,unos nije validan.");


            }
        }


    }
}
