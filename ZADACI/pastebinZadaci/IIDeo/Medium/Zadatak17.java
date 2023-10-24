package ZADACI.pastebinZadaci.IIDeo.Medium;

public class Zadatak17 {
    public static void main(String[] args) {




        //  17. Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".


        String [] niz = { "Milica", "Branko", "Tamara"};

        System.out.println("Da li je u nizu? -----> " + daLiJeuNizu(niz) );

    }


    static boolean daLiJeuNizu (String[] niz) {

       boolean daLiJeuNizu= false;

        for (int i = 0; i < niz.length; i++) {

            if(niz[i].equalsIgnoreCase("Petar") || niz[i].equalsIgnoreCase("Marija"))
                daLiJeuNizu= true;


        }


        return daLiJeuNizu;

    }




}
