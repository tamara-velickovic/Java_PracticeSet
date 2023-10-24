package ZADACI.domaci.drugi;

import java.util.Scanner;

public class Zadatak3string {
    public static void main(String[] args) {

        //Napraviti program gde cete unositi neki tekst sve dok se ne unese tacka("."), cim se unese
        //tacka program se zavrsava i vraca prethodno unete tekstove.


      System.out.println("Unosite tekst, dok se ne unese tacka: ");

        Scanner sc= new Scanner (System.in);
        String Unos ;
        String Tekst = "";

        do {

            Unos= sc.nextLine();
            Tekst+= Unos + " "; //moze i /n umesto space
        }
        while( !Unos.equals(".") );


        System.out.println(Tekst);








    }
}