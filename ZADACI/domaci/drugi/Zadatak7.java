package ZADACI.domaci.drugi;

import java.util.Scanner;

public class Zadatak7 {


    static int pretragaNiza ( int[] niz, int trazeniBroj) {



        for (int i=0; i<niz.length; i++) {
            if (niz[i] == trazeniBroj) {

                System.out.println("Pronađen je traženi broj: " + trazeniBroj);
                break;
            } else
                System.out.println("Pogrešan element");

        }
            return 1;

        }

   //probaj sa boolean flag sve ponovo





    public static void main(String[] args) {

//Napisati funkciju koja ce primiti niz celih brojeva, i broj koji zelimo da lociramo unutar tog
//niza. Ukoliko prolaskom kroz niz naidjemo na pogresan broj, ispisati poruku da je pogresan
//element, cim naidjemo na zadati element, ispisati poruku da je pronadjen i zavrsiti funkciju
//(Cim naidje na taj element, ne treba da ga trazi dalje).


        Scanner sc= new Scanner(System.in);

        System.out.println("Unesite broj elemenata niza: ");

        int duzinaNiza = sc.nextInt();
        int [] niz = new int [duzinaNiza];

        System.out.println("Unesite redom elemente niza: ");

        for (int i=0; i<duzinaNiza; i++)

            niz[i]= sc.nextInt();

        System.out.println("Unesite broj koji zelite da locirate unutar niza:");

            int trazeniBroj= sc.nextInt();

            pretragaNiza(niz, trazeniBroj);



    }
}
