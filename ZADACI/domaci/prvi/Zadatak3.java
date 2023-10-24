package ZADACI.domaci.prvi;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args){






        Scanner sc= new Scanner (System.in);

        System.out.println("Unesite prvi realni broj: ");


        boolean broj1 = sc.hasNextDouble();

        if (!broj1 )
        {System.out.println("Unos  nije validan.");}
        else
        {double x = sc.nextDouble();

            System.out.println("Unesite drugi realni broj: ");
            boolean broj2 = sc.hasNextDouble();

            if (!broj2 )
            {System.out.println("Unos  nije validan.");}

            else {
                double y = sc.nextDouble();


                System.out.println("Odaberite operaciju upisom odgovarajuceg naziva (sabiranje, oduzimanje, mnozenje, deljenje) :  ");


                String operacija = sc.next();
                operacija = operacija.trim();
                operacija = operacija.toUpperCase();

                double rezultat = 0.0;


                switch (operacija) {
                    case "SABIRANJE":
                        rezultat = x + y;
                        break;

                    case "ODUZIMANJE":
                        rezultat = x - y;
                        break;

                    case "MNOZENJE":
                        rezultat = x * y;
                        break;

                    case "DELJENJE":
                        if (y != 0) {
                            rezultat = x / y;
                        } else {
                            System.out.println("Deljenje nulom nije moguce.");
                        }

                        break;

                    default:
                        System.out.println("Nije odabrana ni jedna od 4 moguce operacije.");

                }


                DecimalFormat df = new DecimalFormat("#.##");
                String formatiraniRezultat = df.format(rezultat);

                System.out.println("Rezultat je: " + formatiraniRezultat);


            }
        }
    }
}
