package ZADACI.pastebinZadaci.IIDeo.Easy;

public class Zadatak7 {
    public static void main(String[] args) {


        //  7. Napisati funkciju koja ispisuje sve neparne brojeve zadatog niza.


        int [] niz= {10,10,10, 3,5,7};

       ispisiNeparne(niz);

    }

    static void ispisiNeparne (int[] niz){

        for (int i = 0; i < niz.length; i++) {

            if(niz[i]%2!=0)

                System.out.println(niz[i]);


        }
    }












}
