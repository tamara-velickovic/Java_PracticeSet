package ZADACI.pastebinZadaci.IIDeo.Medium;

public class Resenja12do22 {



    static int[] nadoveziNizove (int[] niz1, int[] niz2) {


        int[] noviNiz = new int[niz1.length + niz2.length];


        for (int i = 0; i < niz1.length; i++) {

            noviNiz[i] = niz1[i];
        }

        for (int k = niz1.length; k < noviNiz.length; k++) {
            noviNiz[k] = niz2[k - niz1.length];
        }

        return noviNiz;

    }




    public static void main(String[] args) {


        int [] niz1= new int[] {1,2,3,4,5};
        int [] niz2= new int[] {1,2,3,4,5};

        int[] abc= nadoveziNizove(niz1,niz2) ;

        for  (int e: abc)

        {
            System.out.println(e);
        }

    }




    //  12. Napisati funkciju koja sabira 2 niza iste duzine element po element. (Dakle prosledjujemo 2 niza, a vracamo taj novi niz)
        //  Primer: [2, 4, 6] + [1, 4, 4]  -> [3, 8, 10]

     /*   int [] niz1 = new int[] {10,20,30,40,50};
        int [] niz2 = new int[] {10,20,30,40,50};

        int[] noviniz = new int[niz1.length];


        if (niz1.length == niz2.length) {





            for (int i = 0; i < noviniz.length; i++) {

                int sum = niz1[i] + niz2[i];
                noviniz[i] = sum;


            }


        }

        */








    //  13. Napisati funkciju koja nadovezuje 2 niza, drugi na kraj prvog.
        //  Primer: [1, 2, 3] [17, 20, -3, 14, 20] -> [1, 2, 3, 17, 20, -3, 14, 20]



    /*  Scanner sc=new Scanner(System.in);
        System.out.println("Unesite n i brojeve niza:");
        int n = sc.nextInt();
        int[] niz1 = new int[n];

        for (int i = 0; i < n; i++) {
            niz1[i] = sc.nextInt();
        }

        System.out.println("Unesite n i brojeve niza:");
        int n1 = sc.nextInt();
        int[] niz2 = new int[n1];

        for (int j = 0; j < n1; j++) {
            niz2[j] = sc.nextInt();
        }*/


              /*  //Uzela sam podatke i sad krecem da spajam nizove


                int[] noviniz = new int[niz1.length + niz2.length];
                //novi niz je duzine sabranih nizova


                //Prvo upisujem

                for (int k = 0; k < niz1.length; k++) {
                    noviniz[k] = niz1[k];
                }


                //OVAJ DEO KODA TREBA RAZUMETI!!!!
                //Pocinjem brojac tamo gde se zavrsava prvi niz, a zavrsavam ga na kraju novog niza
                //Unos vrsim tako sto od k oduzmem niz1length kako bih prakticno bila na "0"
                for (int k = niz1.length; k < noviniz.length; k++) {
                    noviniz[k] = niz2[k - niz1.length];
                }

                for (int e : noviniz) {
                    System.out.println(e);
                } */





        // 15. Napisati funkciju koja ispituje da li je suma niza veca od njegovog proizvoda.


               /* int[] niz = new int[]{10, 20, 30, 40, 50};

                int sum = 0;
                int proizvod = 1;

                for (int i = 0; i < niz.length; i++) {

                    sum += i;
                    proizvod *= i;
 }
*/


    //  21.** Napisati funkciju koja vraca maximum od dva broja bez koriscenja if-ova, switch-ova ili ? operatora.
   /*  static int maxDvaBroja (int a, int b){

        return Math.max(a,b);


    } */


// 22.*
    //   a) Napisati funkciju koja ispituje da li je niz monoton ili nije. Niz je monoton ako je ili rastuci ili opadajuci ili konstantan,
    //    ali ne i rastuci i opadajuci.


                /*    static boolean daLiJeNizMonoton (int[] niz){

                    // 1 2 3 4 5      5 4 3 2 1   1 1 1 1 1

                   boolean daLiJeNizMonoton = false;

                        for (int i = 0; i < niz.length; i++) {

                           if(!(niz[i] > niz[i+1]))
                               return false;

                            if(!(niz[i] <= niz[i+1]))
                                return false;

                            else return true;

                        }




               } */


/*
    public static void main(String[] args) {


        int[] niz1= new int[] {1,2,3,4,5};
        int[] niz2= new int[] {5,4,3,2,1};
        int[] niz3= new int[] {1,1,1,3,1};
        int[] niz4= new int[] {1,2,1,4,1};

        boolean rezultat = daLiJeNizMonoton(niz3);

        System.out.println("Da li je niz monoton? ---> " + rezultat);



    }


    static boolean daLiJeNizMonoton(int[] niz) {
        boolean rastuci = true;
        boolean opadajuci = true;
        boolean konstantan= true;

        for (int i = 0; i < niz.length - 1; i++) {
            if (niz[i] == niz[i + 1]) {

                konstantan= false;
            } else if (niz[i] > niz[i + 1]) {
                rastuci = false;
            } else if (niz[i] < niz[i + 1]) {
                opadajuci = false;
            }

            // Ako nije rastuci niti opadajuci, nema potrebe dalje prolaziti
            if (!rastuci && !opadajuci) {
                return false;
            }
        }

        return true;
    }

*/


    //  b) Napisati funkciju koja ispituje da li je niz strogo monoton ili nije. Niz je strogo monoton ako je iskljucivo rastuci
    //  ili iskljucivo  opadajuci i u nikojem delu nije konstantan (nema ponavljajucih elemenata)







}






















































