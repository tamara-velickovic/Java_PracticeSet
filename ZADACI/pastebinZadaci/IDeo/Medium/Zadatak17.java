package ZADACI.pastebinZadaci.IDeo.Medium;

import java.util.Scanner;

public class Zadatak17 {
    public static void main(String[] args) {


        // 17. Napraviti digitron koji prima double, char, double, gde je char neki od simbola: {+, -, *, /, %, ^} i ispisuje resenje odgovarajuce operacije.


        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite brojeve a,b i operaciju: ");

        double a= sc.nextDouble();
        char znak = sc.next().charAt(0);
        double b= sc.nextDouble();



        switch (znak) {

            case '+' :

                System.out.println(a+b);
                break;

            case '-' :

                System.out.println(a-b);
                break;

            case '*' :

                System.out.println(a*b);
                break;

            case '/' :

                System.out.println(a/b);
                break;

            case '%' :

                System.out.println(a%b);
                break;

            case '^' :

                System.out.println(Math.pow(a,b));
                break;
            default:
                System.out.println("Neodgovarajuca operacija");


        }












    }
}
