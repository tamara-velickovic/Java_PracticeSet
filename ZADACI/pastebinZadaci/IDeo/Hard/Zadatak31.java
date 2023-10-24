package ZADACI.pastebinZadaci.IDeo.Hard;

import java.util.Scanner;

public class Zadatak31 {
    public static void main(String[] args) {

        //  31. Za unetu visinu h, iscrtati desnu Mario kulu. Npr za h = 5:
        /*
|    #
|   ##
|  ###
| ####
|#####
 */
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite visinu kule (h): ");
        int h = sc.nextInt();

        // Petlja za iscrtavanje kule
        for (int i = 1; i <= h; i++) {
            // Petlja za dodavanje razmaka
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }
            // Petlja za dodavanje znakova "#"
            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println(); // Prelazak u novi red nakon svakog reda kule
        }



    }
}
