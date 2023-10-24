package ZADACI.domaci.prvi;

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args){


        Scanner sc= new Scanner(System.in);

        System.out.println("Unesite ceo broj:");


        if(!sc.hasNextInt())

        {System.out.println ("Unos nije validan. Unesite ceo broj.");}
        else {
            int broj = sc.nextInt();

            if (broj % 2 == 0)
            {broj+= 1;
                System.out.println("Broj promenjen u neparan: " + broj);}

            else
            {System.out.println(" Broj je neparan. ");}



        }

    }

}
