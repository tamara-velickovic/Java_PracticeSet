package ZADACI.domaci.drugi;

import java.util.Scanner;

public class Zadatak1 {

    public static void main (String [] args){

        //Napraviti program gde cete uneti neki broj ponavljanja i tekst koji ce se toliko puta ispisati

        Scanner sc= new Scanner (System.in);

        System.out.println("Broj ponavljanja: ");
        int n = sc.nextInt();

        sc.nextLine();

        System.out.println("Tekst:");
        String tekst= sc.nextLine();

        for (int i=0; i<n; i++)
            System.out.println(tekst);






    }
}
