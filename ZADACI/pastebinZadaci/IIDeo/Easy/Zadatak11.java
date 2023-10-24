package ZADACI.pastebinZadaci.IIDeo.Easy;

public class Zadatak11 {


    public static void main(String[] args) {

        //  11. Napisati funkciju koja duplira sve elemente niza.
        //         Primer: [1, 2, 3, 4, 5] -> [2, 4, 6, 8, 10]

        int[] niz = {10, 11, 10, 3, 5, 7};


        duplirajElemente(niz);

        for (int e : niz) {
            System.out.println(e);

        }

    }

    static void duplirajElemente(int[] niz) {


        for (int i = 0; i < niz.length; i++) {

            niz[i] *= 2;


        }


    }

}
