package ZADACI.pastebinZadaci.IDeo.Medium;

import java.util.Scanner;

public class Zadatak22 {
    public static void main(String[] args) {



        //22. Korisnik unosi neke pozitivne cele brojeve n i k. Ispisati sve parne brojeve od 2 do n ali zaustaviti program ako se ispise paran broj
        // koji je deljiv sa k.


        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite brojeve: ");

        int n= sc.nextInt();
        int k= sc.nextInt();

        for (int i = 0; i <= n; i+=2) {

            if (i%k==0)
                System.out.println(i);
                break;



        }













    }
}
