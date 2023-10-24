package ZADACI.pastebinZadaci.IIDeo.Medium;

public class Zadatak13star {
    public static void main(String[] args) {

        //  13. Napisati funkciju koja nadovezuje 2 niza, drugi na kraj prvog.
        //  Primer: [1, 2, 3] [17, 20, -3, 14, 20] -> [1, 2, 3, 17, 20, -3, 14, 20]

        int[] niz = {10, 11, 10, 3, 5, 7};

        int[] niz2 = {10, 11, 10, 3, 5, 7};

        int[] noviNiz= nadoveziNizove(niz,niz2);

        for(int e: noviNiz)

            System.out.println(e);

    }


    static int[] nadoveziNizove (int[] niz, int[] niz2) {

        int [] noviNiz = new int[niz.length + niz2.length];

        for (int i = 0; i < niz.length; i++) {

            noviNiz[i]= niz[i];

        }

        for (int i = 0; i < niz2.length; i++) {

            noviNiz[i+niz.length]= niz2[i];

        }



        return noviNiz;

    }



}
