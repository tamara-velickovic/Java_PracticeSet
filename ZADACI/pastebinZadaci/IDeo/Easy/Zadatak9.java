package ZADACI.pastebinZadaci.IDeo.Easy;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {


        // 9. Ispisati proizvod prvih n celih brojeva [1, n].


        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite broj: " + " ");

        int n= sc.nextInt();
        int proizvod= 1;

        if (n>=0) {
        for (int i = 1; i <=n ; i++) {

            proizvod*= i;
        }}

        else {System.out.println("Uneti broj nije pozitivan. ");}

        System.out.println(proizvod);








    }
}
