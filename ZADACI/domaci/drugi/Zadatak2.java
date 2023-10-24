package ZADACI.domaci.drugi;

import java.util.Scanner;

public class Zadatak2 {

    public static void main (String [] args) {

        //Napraviti program koji ce za uneti ceo broj vratiti njegov faktorijel (3! = 3*2*1).

        Scanner sc= new Scanner (System.in);

        System.out.println("Unesite broj: ");
        int n = sc.nextInt();

        int i= 1;
        int faktorijel = 1;


        while (i<=n){
            faktorijel *= i;
            i++;
        }

        System.out.println("Faktorijel broja " + n + " je " + faktorijel + ".");

    }
}