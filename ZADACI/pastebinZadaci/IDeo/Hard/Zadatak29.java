package ZADACI.pastebinZadaci.IDeo.Hard;

import java.util.Scanner;

public class Zadatak29 {
    public static void main(String[] args) {

        /*  29.* Za unete dve godine g1 i g2 ispisati koliko ima prestupnih godina u intervalu [g1, g2]. Godina je prestupna akko:
        - Deljiva je sa 4
                - Nije deljiva sa 100 ili je deljiva sa 400  */


        Scanner sc= new Scanner (System.in);
        System.out.println("Unesite godine: ");

        int g1= sc.nextInt();
        int g2= sc.nextInt();
        int brojac= 0;

        for ( int i = g1; i <= g2  ; i++) {

                if (i%4==0 && (!(i%100==0) || (i%400==0))) {
                    System.out.println(i + " = " + "Prestupna");
                    brojac ++;}
        }

        System.out.println("Ukupno prestupnih godina u intervalu: " + brojac);








    }
}
