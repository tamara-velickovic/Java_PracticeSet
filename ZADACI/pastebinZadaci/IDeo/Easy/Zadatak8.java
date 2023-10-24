package ZADACI.pastebinZadaci.IDeo.Easy;

import java.util.Scanner;

public class Zadatak8 {

    public static void main(String[] args) {

        //  8. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa -14 do i zakljucno sa 2n.


        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite broj: " + " ");

        int n= sc.nextInt();

       if (n>0) {
        for (int i = -14; i <= 2*n ; i++) {

            System.out.println(i);

        }}

        else {
           System.out.println("Uneti broj nije pozitivan.");
       }



    }
}
