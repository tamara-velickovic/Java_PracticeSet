package ZADACI.domaci.treci;

public class Zadatak2 {

    // Napraviti funkciju koja prima dva niza celih brojeva jednake duzine i kao rezultat vraca zbir
    // svih elemenata na istoj poziciji.
    //(Neobavezan deo) Implementirati funkciju da prima nizove razlicitih velicina, tako da
    // sabira sve elemente na istim pozicijama, ukoliko jednom nizu ponestaje elemenata, prepisati
//preostale elemente iz veceg niza.


    static int[] ZbirElemenataDvaNiza(int[] niz1, int[] niz2) {


        if (niz1.length == niz2.length) {

            int[] noviNiz = new int[niz1.length];

            for (int i = 0; i < niz1.length; i++) {

                noviNiz[i] = niz1[i] + niz2[i];

            }

            return noviNiz;
        } else {

            //Ideja je da druga funkcija izracuna koji je duzi od dva niza i da samo jednom obavimo ostatak
            // koda, ali za sada ovako:


            if (niz1.length > niz2.length) {

                int[] noviNiz = new int[niz1.length];

                for (int i = 0; i < niz2.length; i++) {

                    noviNiz[i] = niz1[i] + niz2[i];
                }

                for (int i = niz2.length; i < niz1.length; i++) {

                    noviNiz[i] = niz1[i];
                }

                return noviNiz;
            } else {

                int[] noviNiz = new int[niz2.length];

                for (int i = 0; i < niz1.length; i++) {

                    noviNiz[i] = niz1[i] + niz2[i];
                }

                for (int i = niz1.length; i < niz2.length; i++) {

                    noviNiz[i] = niz2[i];
                }

                return noviNiz;


            }

        }


    }




        public static void main (String[] args) {


          //  int[] niz1 = unetiIntNiz();
          //  int[] niz2 = unetiIntNiz();

             int[] niz1 = new int[] {1,2,5,10};
             int[] niz2 =new int[] {1,12,5};

            int [] noviniz = ZbirElemenataDvaNiza(niz1, niz2);


            for (int e: noviniz)

                System.out.println(e);

        }

    }











