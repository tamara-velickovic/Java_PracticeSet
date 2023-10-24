package ZADACI.pastebinZadaci.IIDeo.Medium;

public class Zadatak14star {
    public static void main(String[] args) {


        //  14.* Napisati funkciju koja vraca zbir drugog najmanjeg i drugog najveceg elementa niza.


        int[] niz = {10, 11, 10, 3, 5, 7};


        System.out.println(saberiElementeNiza(niz));



    }

    static int saberiElementeNiza (int []niz) {

        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;

        int drugiNajveci= Integer.MIN_VALUE;
        int drugiNajmanji= Integer.MAX_VALUE;


        for (int i = 0; i < niz.length; i++) {


            max= Math.max(max,niz[i]);
            min= Math.min(min,niz[i]);

            if(niz[i]>drugiNajveci && niz[i]<max)
                drugiNajveci=niz[i];

            if(niz[i]<drugiNajmanji && niz[i]>min)
                drugiNajmanji=niz[i];
        }




        return drugiNajmanji+drugiNajveci;
    }



}
