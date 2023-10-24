package ZADACI.pastebinZadaci.IIDeo.Medium;

public class Zadatak15 {
    public static void main(String[] args) {



        // 15. Napisati funkciju koja ispituje da li je suma niza veca od njegovog proizvoda.


        int[] niz = {1,1,3};


        System.out.println("Da li je suma veca od proizvoda? -----> " + daLiJeSumaVecaOdProizvoda(niz));
    }

    static boolean daLiJeSumaVecaOdProizvoda (int[] niz) {

        int sum=0;
        int proizvod= 1;



        for (int i = 0; i < niz.length; i++) {

            sum+= niz[i];
            proizvod*= niz[i];

        }


        if (sum>proizvod)
            return true;

        else
            return false;



    }


}
