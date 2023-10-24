package ZADACI.pastebinZadaci.IIDeo.Easy;

public class Zadatak9 {

    public static void main(String[] args) {



        // 9. Napisati funkciju koja vraca najveci element niza.


        int [] niz= {10,11,10, 3,5,7};

        System.out.println(najveciElementNiza(niz));

    }


    static int najveciElementNiza (int[] niz) {


        int max= Integer.MIN_VALUE;

        for (int i = 0; i < niz.length; i++) {

            max= Math.max(max,niz[i]);

        }

        return max;

    }






}
