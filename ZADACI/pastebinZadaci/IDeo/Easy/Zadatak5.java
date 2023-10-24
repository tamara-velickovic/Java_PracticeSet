package ZADACI.pastebinZadaci.IDeo.Easy;

import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {

    // 5.* Za unet cetvorocifren broj ispisati razliku proizvoda njegovih prvih dveju cifara od zbira njegovih drugih dveju cifara.


        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite cetvorocifreni broj: " + " ");

        int n= sc.nextInt();

       //  n = (a*1000) + (b*100) + (c*10) + (d*1);

        int a = n / 1000;
        int b = (n/ 100) % 10;
        int c = (n/10) % 10;
        int d = n % 10;

       // System.out.println(a + " " + b + " " + c + " "   + d);

       int rezultat = (a*b) - (c+d);

        System.out.println(rezultat);

    }




}
