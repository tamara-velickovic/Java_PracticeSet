package ZADACI.pastebinZadaci.IIDeo.Easy;

public class Zadatak5 {

    public static void main(String[] args) {


        //  5. -//-. Izracunati proizvod elemenata tog niza.
        //  Primer: [2, 4] -> 8
        // b) Napisati funkciju koja racuna proizvod elemenata zadatog niza.


        int [] niz= {10,10,10};



        System.out.println(proizvodElemenataNiza(niz));
    }



    static int proizvodElemenataNiza (int[] niz) {

        int proizvod= 1;

        for (int i = 0; i < niz.length; i++) {

            proizvod *= niz[i];

        }


        return proizvod;
    }




}
