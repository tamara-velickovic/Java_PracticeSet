package ZADACI.pastebinZadaci.IDeo.Easy;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

// 7. Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.


        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite broj: " + " ");

        int n= sc.nextInt();


       if (n<0) {
           for (int i = n; i <= 0; i++) {

               System.out.println(i);
           }
       }
        else {
           System.out.println("Uneti broj nije negativan. ");
       }


    }
}
