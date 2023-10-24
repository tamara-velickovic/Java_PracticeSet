package ZADACI.pastebinZadaci.IIDeo.Easy;

public class Zadatak8 {
    public static void main(String[] args) {


        //  8. Napisati funkciju koja ispisuje sve parne brojeve zadatog niza.


        int [] niz= {10,10,10, 3,5,7};

        ispisiParne(niz);




    }


    public  static void ispisiParne (int[] niz) {

        for (int i = 0; i < niz.length; i++) {

            if(niz[i]%2==0)

                System.out.println(niz[i]);


        }
    }
}
