package ZADACI.pastebinZadaci.IDeo.Medium;

import java.util.Scanner;

public class Zadatak15 {
    public static void main(String[] args) {


        // 15. Za unete brojeve a, b i c ispisati najmanji od njih


        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite tri broja: " + " ");

        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();


        if ((a<= b) && (a<= c)){
            System.out.println(a);
        }

       else if ((b<= a) && (b<= c)){
            System.out.println(b);
        }

       else { System.out.println(c); }


        //  System.out.println(Math.min(Math.min(a,b),c));












    }
}
