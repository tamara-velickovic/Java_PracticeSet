package ZADACI.pastebinZadaci.IIDeo.Easy;

public class Zadatak10 {

    public static void main(String[] args) {


        //   10. Napisati funkciju koja vraca najmanji element niza.


        int [] niz= {10,11,10, 3,5,7};

        System.out.println(NajmanjiElementNiza(niz));

    }


        static int NajmanjiElementNiza (int[] niz) {

        int min= Integer.MAX_VALUE;

            for (int i = 0; i < niz.length; i++) {

                if (niz[i] < min)
                    min= niz[i];


            }

                return min;




        }








}
