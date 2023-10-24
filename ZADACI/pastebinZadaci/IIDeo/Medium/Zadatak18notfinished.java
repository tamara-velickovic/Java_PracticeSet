package ZADACI.pastebinZadaci.IIDeo.Medium;

public class Zadatak18notfinished {
    public static void main(String[] args) {


        //  18.* Napisati funkciju koja deli proslednjen niz na dva jednaka dela i onda ih sabira element po element.
      /*  Npr:
[1, 2, 3, 4, 5, 6] -> [1, 2, 3] + [4, 5, 6] -> [5, 7, 9]
[1, 2, 3, 4, 5] -> [1, 2, 3] + [3, 4, 5] -> [4, 6, 8] */

        int[] niz = {1, 2, 3, 4, 5, 6};
        int[] niz2 = {1, 2, 3, 4, 5};

        int [] a = podeliISaberiNiz(niz);
        int [] b = podeliISaberiNiz(niz2);

        for (int e: a)
            System.out.println(e);

        System.out.println("=======================");

        for (int k: b)
            System.out.println(k);

    }

        static int [] podeliISaberiNiz (int [] niz){

        int[] noviNiz = new int[niz.length/2];
            int[] noviNiz2 = new int[niz.length - niz.length/2];

            int[] sabraniNiz= new int[niz.length/2];

            for (int i = 0; i < noviNiz.length; i++) {

                noviNiz[i]=niz[i];


            }


            for (int i = 0; i < noviNiz2.length; i++) {


                noviNiz2[i]=niz[i+(niz.length/2)];


            }




            for (int i = 0; i < niz.length/2; i++) {

                sabraniNiz[i]= noviNiz[i] + noviNiz2[i];


            }

            return sabraniNiz;

        }










}
