package ZADACI.pastebinZadaci.IDeo.Hard;

import java.util.Scanner;

public class Zadatak23 {
    public static void main(String[] args) {

        //  23.* Unose se double konstante a, b, c, a zatim i pozitivan ceo broj n. Zatim se unose n double brojeva jedan po jedan.
        //  Cim se unese jedan od tih brojeva, na standardni izlaz ispisuje se vrednost polinoma: a*x^2 + b*x + c, gde je x taj uneti broj.


        Scanner sc= new Scanner (System.in);
        System.out.println("Unesite konstante a, b i c: ");

        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();

        System.out.println("Unesite broj: ");

        int n= sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Unesite vrednost x: ");
            double x= sc.nextDouble();
            double rezultat =  (a*(Math.pow(x,2))) + (b*x) + c;
            System.out.println("Rezultat za x= " + x + " je :" + rezultat);

        }


    }
}
