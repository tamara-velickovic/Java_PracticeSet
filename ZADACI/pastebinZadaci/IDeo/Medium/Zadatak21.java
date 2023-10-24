package ZADACI.pastebinZadaci.IDeo.Medium;

import java.util.Scanner;

public class Zadatak21 {
    public static void main(String[] args) {

        //  21. Korisnik unosi imena cveca sve dok ne unese nisku "stop". Izracunati koliko ukupno korisnik treba da plati cvece koje je izabrao.
        //  //Cvece koje se mogu kupiti i njihova cena je:
        // - "Ruza" - 100 din
        //   - "Zumbul" - 200 din
        //  - "Lala" - 300 din


        Scanner sc= new Scanner(System.in);
        String Unos= "";


        int sum= 0;
        int cenaRuza= 100;
        int cenaZumbul= 200;
        int cenaLala= 300;


        while (true) {

            Unos = sc.nextLine().trim().toUpperCase();

            if ((Unos.equals("STOP")))
                break;

            if (Unos.equals("RUZA"))
                sum += cenaRuza;

            if (Unos.equals("ZUMBUL"))
                sum += cenaZumbul;

            if (Unos.equals("LALA"))
                sum += cenaLala;

        }



        System.out.println("Ukupna cena: " + sum );














    }
}
