package ZADACI.pastebinZadaci.IIDeo.Easy;

public class Zadatak4 {




    static void ispisiSvakiTreciuNizu (int[] niz) {

        for (int i = niz.length-1; i >=0; i-=3) {

            System.out.println(niz[i]);

        }


    }








    public static void main(String[] args) {


        // 4. -//-. Ispisati svaki treci element u obrnutom redosledu.
        //    Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
        //   b) Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.


            int [] niz= {1,2,3,4,5,6,7,8,9,10,11,12};
            ispisiSvakiTreciuNizu(niz);













    }
}
