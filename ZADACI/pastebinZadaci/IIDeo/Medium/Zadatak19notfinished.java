package ZADACI.pastebinZadaci.IIDeo.Medium;

public class Zadatak19notfinished {
    public static void main(String[] args) {


        // 19.* Napisati funkciju koja sabira dva niza proizvoljne duzine.
        //   Npr: [1, 2, 3, 4, 5] + [1, 2, 3] -> [2, 4, 6, 4, 5]
        // b)** -//- bez kreiranja dodatnih nizova


        int[] niz = {1, 2, 3, 4, 5};
        int[] niz2 = {1, 2, 3};

        int[] novi = sabiranjeNizova(niz, niz2);

        for (int e : novi)
            System.out.println(e);


    }


    static int[] sabiranjeNizova(int[] niz1, int[] niz2) {

        int[] noviNiz;


        if (niz1.length >= niz2.length)
            noviNiz = new int[niz1.length];
        else
            noviNiz = new int[niz2.length];


        if (niz1.length >= niz2.length) {

            for (int i = 0; i < niz1.length; i++) {

                noviNiz[i] = niz1[i] + niz2[i];


            }
        } else if (niz1.length > niz2.length) {


            for (int i = 0; i < niz2.length; i++) {


                noviNiz[i] = niz1[i] + niz2[i];
            }

            for (int i = niz2.length; i < niz1.length; i++)
                noviNiz[i] = niz1[i];


        } else {

            for (int i = 0; i < niz1.length; i++) {


                noviNiz[i] = niz1[i] + niz2[i];
            }

            for (int i = niz1.length; i < niz2.length; i++)
                noviNiz[i] = niz2[i];


        }


        return noviNiz;


    }

}










