package ZADACI.domaci.treci;

public class Zadatak3 {

  //  Napraviti funkciju koja prima niz Stringova nekih imena i kao rezultat vraca broj duplikata
   // imena(Ukoliko ih ima).



    static int brojDuplikata (String[] nizImena ) {


       int brojDuplikata=0;

        for (int i = 0; i < nizImena.length-1; i++) {

            for (int j = i + 1; j < nizImena.length; j++) {

                if (nizImena[i].equalsIgnoreCase(nizImena[j]))
                brojDuplikata++;
                break;

            }

        }

            return brojDuplikata;

    }







    public static void main(String[] args) {

        String[] NizImena = new String[]{ "Tamara", "Milena", "Stefan", "Branko", "Branko"} ;

       int rezultat= brojDuplikata(NizImena);


        System.out.println(rezultat);

    }








}
