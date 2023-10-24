package ZADACI.pastebinZadaci.IIDeo.Medium;

public class Zadatak12 {
    public static void main(String[] args) {

        //  12. Napisati funkciju koja sabira 2 niza iste duzine element po element. (Dakle prosledjujemo 2 niza, a vracamo taj novi niz)
        //  Primer: [2, 4, 6] + [1, 4, 4]  -> [3, 8, 10]

        int[] niz = {10, 11, 10, 3, 5, 7};

        int[] niz2 = {10, 11, 10, 3, 5, 7};


      int[] noviNiz= saberiElementeNiza(niz,niz2);

      for(int e: noviNiz)

          System.out.println(e);

    }


    static int[] saberiElementeNiza (int[] niz, int[]niz2){

        int[] noviNiz = new int[ niz.length];

        for (int i = 0; i < niz.length; i++) {

            noviNiz[i] = niz[i] + niz2[i];

        }


        return noviNiz;






    }





}
