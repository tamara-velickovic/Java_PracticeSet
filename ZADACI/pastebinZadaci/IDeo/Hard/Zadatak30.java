package ZADACI.pastebinZadaci.IDeo.Hard;

import java.util.Scanner;

public class Zadatak30 {
    public static void main(String[] args) {

        // 30. Za unetu visinu h, iscrtati levu Mario kulu. Npr za h = 5:
                /*
|#
|##
|###
|####
|#####
        (| obelezava pocetak reda i to ne crtate)    */

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite visinu kule (h): ");
        int h = sc.nextInt();

        for (int i = 1; i <= h; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print("#");
            }


            System.out.println();

        }






    }
}
