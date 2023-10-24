package ZADACI.pastebinZadaci.IIDeo.Medium;

public class Zadatak16 {
    public static void main(String[] args) {


        //  16. Napisati funkciju koja racuna prosecnu vrednost double[] niza.


        double[] niz = {3.0,3.0,3.0};

        System.out.println(prosekNiza(niz));

    }


    static double prosekNiza (double[] niz) {

        double sum= 0;


        for (int i = 0; i < niz.length; i++) {

            sum+= niz[i];

        }

        return sum/ (double) niz.length;


    }




}
