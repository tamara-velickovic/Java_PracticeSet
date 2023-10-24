package ZADACI.domaci.drugi;

import java.util.Scanner;

public class Zadatak6string {


    static int brojanjeSamoglasnika (String S) {

        int brojSamoglasnika= 0;


        for ( int i=0;  i< S.length(); i++) {

            S = S.toUpperCase();
            char karakter= S.charAt(i);

            if (karakter == 'A' || karakter == 'E' || karakter == 'I' || karakter == 'O' || karakter == 'U' )
            brojSamoglasnika ++;

        }

        return brojSamoglasnika;
    }


    public static void main(String[] args) {

//Napisati funkciju koja ce za prosledjeni String da vrati broj samoglasnika u tom Stringu
//(Koristiti .charAt(index) da pristupite svakom pojedinacnom karakteru iz Stringa).


        Scanner sc= new Scanner (System.in);

        System.out.println("Unesite neki tekst: ");
        String Tekst= sc.nextLine();

        int brojSamoglasnika= brojanjeSamoglasnika(Tekst);

        System.out.println("U tekstu ima " + brojSamoglasnika + " samoglasnika. ");



    }
}
