package ZADACI.pastebinZadaci.IDeo.Hard;

import java.util.Scanner;

public class Zadatak35 {
    public static void main(String[] args) {



        // 35.* Za unet trocifren broj n izracunati sumu n1 - n2 + n3, gde je n1 vodeca cifra, n2 sredisnja cifra, a n3 polsednja cifra broja n.
        // (Dakle, n = n1n2n3)
        //  Npr:
        //  n = 876 -> 7 (jer imamo 8 - 7 + 6 | n1 = 8, n2 = 7, n3 = 6)


        Scanner sc= new Scanner (System.in);
        System.out.println("Unesite trocifreni broj: ");

        int n= sc.nextInt();

        int n1= n/100;
        int n2= (n/10)%10;
        int n3= n%10;

        System.out.println("Broj 1: " + n1 );
        System.out.println("Broj 2: " + n2 );
        System.out.println("Broj 3: " + n3 );

        System.out.println(n1-n2+n3);
    }
}
