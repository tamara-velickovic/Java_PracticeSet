package ZADACI.pastebinZadaci.IDeo.Medium;

public class Resenja11do22 {

    public static void main(String[] args) {


       // 11. Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
       /* "Dobrodosao u {x}. razred, {ime} {prezime}",
                pod pretpostavkom da je trenutna godina 2023. Pretpostavimo da ima 12 razreda. A ako korisnik nije djak ispisati jednu odgovarajucu
        poruku od:
        "{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"*/


        /* Scanner sc= new Scanner (System.in);
        System.out.println("Unesite ime, prezime i godinu rodjenja: " );

        String ime= sc.nextLine();
        String prezime= sc.nextLine();


        int godinaRodjenja= sc.nextInt();
        int brojGodina= 2023 - godinaRodjenja;
        int razred= 0;

        if(brojGodina >= 7 && brojGodina<18) {

            switch (brojGodina) {
                case 7:
                    razred = 1;
                    break;
                case 8:
                    razred = 2;
                    break;
                case 9:
                    razred = 3;
                    break;
                case 10:
                    razred = 4;
                    break;
                case 11:
                    razred = 5;
                    break;
                case 12:
                    razred = 6;
                    break;
                case 13:
                    razred = 7;
                    break;
                case 14:
                    razred = 8;
                    break;
                case 15:
                    razred = 9;
                    break;
                case 16:
                    razred = 10;
                    break;
                case 17:
                    razred = 11;
                    break;
                case 18:
                    razred = 12;
                    break;
            }

            System.out.println(" Dobrodosao/la u " + razred + "." + "razred, " + ime + " " + prezime + "!");


        }

       else if (brojGodina>18)
            System.out.println(ime+ " " + prezime + " je zavrsio/la skolu. ");
       else if (brojGodina>0 && brojGodina<7)
            System.out.println(ime + " " + prezime + " tek treba da zapocne obrazovanje. ");


*/




      //  12. Za unet ceo broj n, ispisati za svaki od brojeva [1, n] "Fizz" ako je deljiv sa 3, "Buzz" ako je deljiv sa 5, "Zazz" ako je deljiv sa 7 i sve ostale varijacije ("BuzzZazz" ako je deljiv i sa 5 i sa 7, ...)

        // X +    FizzBuzzZuzz +  FizzBuzz, BuzzZuzz, FizzZuzz  +    3 Fizz    5 Buzz      7 Zazz


      /*  Scanner sc= new Scanner (System.in);
        System.out.println("Unesite broj: " );

        int n = sc.nextInt();
        int brojac = 1;


        for (int i = 1; i <= n ; i++) {

            if (((i%3)==0) && ((i%5)==0) && ((i%7)==0) )
                System.out.println( i + " :" + " FizzBuzzZuzz" );

            else if(((i%3)==0) && ((i%5)==0))
                System.out.println( i + " :" + " FizzBuzz " );

            else if(((i%5)==0) && ((i%7)==0))
                System.out.println( i + " :" + " BuzzZuzz " );

            else if(((i%3)==0) && ((i%7)==0))
                System.out.println( i + " :" + " FizzZuzz " );

            else if((i%3)==0)
                System.out.println( i + " :" + " Fizz " );

            else if((i%5)==0)
                System.out.println(i + " :" + " Buzz " );
            else  if ((i%7)==0)
                System.out.println(i + " :" + " Zuzz " );

            ;
        } */





        // 13.* Za unet pozitivan ceo broj n, ispisati za svaki pozitivan ceo broj t, koji je strogo manji od njega (dakle t < n),
        // //sumu svih pozitivnih celih brojeva od 1 do tog broja (dakle 1 + 2 + 3 + ... + t).


      /*  Scanner sc= new Scanner (System.in);
        System.out.println("Unesite broj: " );

        int n = sc.nextInt();
        int sum = 0;


        for (int t=1; t<n; t++) {
                    sum +=t;
                    System.out.println("Za broj t =" + t + " , zbir svih prethodnih brojeva je " + sum );
                }
*/



        // 14. Za unete brojeve a i b ispisati veci od njih.

      /*  Scanner sc= new Scanner (System.in);
        System.out.println("Unesite brojeve: " );

        double a = sc.nextInt();
        double b = sc.nextInt();

        if (a>b)
            System.out.println(a);
        else
            System.out.println(b); */



       // 15. Za unete brojeve a, b i c ispisati najmanji od njih

      /*  Scanner sc= new Scanner (System.in);
        System.out.println("Unesite brojeve: " );

        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();

        if ((a>c && b>c) || (a==b && a>c) )
            System.out.println(c);


        else if ((b>a && c>a ) || (b==c && b>a))
            System.out.println(a);

        else if ((a>b && c>b ) || (a==c && a>b))
            System.out.println(b);

        else
            System.out.println(a); */






       // 16. Ispisati tablicu mnozemnja jednocifrenih brojeva (dakle tabela 10x10, 0 u prvom polju, 81 u poslednjem polju)







       // 17. Napraviti digitron koji prima double, char, double, gde je char neki od simbola: {+, -, *, /, %, ^} i ispisuje resenje odgovarajuce operacije.






       // 18. Uneti pozitivan ceo broj n. Zatim izracunati sumu unetih narednih n brojeva (double).


       /*  Scanner sc= new Scanner (System.in);
        System.out.println("Unesite broj brojeva i njihove vrednosti redom: " );

       int n = sc.nextInt();
        double sum= 0;

        for (int i = 0; i < n; i++) {

            sum += sc.nextDouble();

        }

        System.out.println("Zbir unetih brojeva je " + sum ); */


      //  19. Uneti pozitivan ceo broj n. Zatim izracunati proizvod unetih narednih n brojeva (double).

/*
        Scanner sc= new Scanner (System.in);
        System.out.println("Unesite broj brojeva i njihove vrednosti redom: " );

        int n = sc.nextInt();
        double proizvod= 1;


       // Moze se staviti jedno if n>0 i else niste uneli pozitivan broj ili ceo broj
        for (int i = 1; i <= n; i++) {

            proizvod *= sc.nextDouble();

        }

        System.out.println("Proizvod unetih brojeva je " + proizvod ); */



      //  20. Uneti pozitivan ceo broj n. Zatim izracunati prosek unetih narednih n brojeva (double).

/*
        Scanner sc= new Scanner (System.in);
        System.out.println("Unesite broj brojeva i njihove vrednosti redom: " );

        int n = sc.nextInt();
        double prosek= 0;
        double sum= 0;


        for (int i = 0; i < n; i++) {

            sum += sc.nextDouble();

        }
        if (n>0) {
            prosek = sum / (double) n;
            System.out.println("Prosek unetih brojeva je " + prosek);
        }
        else
            System.out.println("Ne mozete izracunati prosek"); */


      //  21. Korisnik unosi imena cveca sve dok ne unese nisku "stop". Izracunati koliko ukupno korisnik treba da plati cvece koje je izabrao. Cvece koje se mogu kupiti i njihova cena je:
        // - "Ruza" - 100 din
        //   - "Zumbul" - 200 din
        //  - "Lala" - 300 din


/* MOJE PRVOBITNO RESENJE NIJE OBILAZILO SVE SLUCAJEVE
        Scanner sc= new Scanner (System.in);
        System.out.println("Unesite imena cveca koja zelite da kupite i upisite <stop> za obracun cene: ");

        String Unos= "";


        int sum= 0;
        int cenaRuza= 100;
        int cenaZumbul= 200;
        int cenaLala= 300;

        do { sc.nextLine() ;

            Unos= sc.nextLine().trim().toUpperCase();
            if (Unos.equals ("RUZA"))
                sum += cenaRuza;

            if (Unos.equals ("ZUMBUL"))
                sum += cenaZumbul;

            if (Unos.equals ("LALA"))
                sum += cenaLala;

        }

        while (!(Unos.equals ("STOP")));

        System.out.println("Ukupna cena: " + sum ); */

/*
        Scanner sc= new Scanner (System.in);
        System.out.println("Unesite imena cveca koja zelite da kupite i upisite <stop> za obracun cene: ");

        String Unos= "";


        int sum= 0;
        int cenaRuza= 100;
        int cenaZumbul= 200;
        int cenaLala= 300;


        while (true) {

            Unos = sc.nextLine().trim().toUpperCase();

            if ((Unos.equals("STOP")))
            break;

            if (Unos.equals("RUZA"))
                sum += cenaRuza;

            if (Unos.equals("ZUMBUL"))
                sum += cenaZumbul;

            if (Unos.equals("LALA"))
                sum += cenaLala;

        }



        System.out.println("Ukupna cena: " + sum );



//22. Korisnik unosi neke pozitivne cele brojeve n i k. Ispisati sve parne brojeve od 2 do n ali zaustaviti program ako se ispise paran broj koji je deljiv sa k.


    /*
        Scanner sc= new Scanner (System.in);
        System.out.println("Unesite do kog broja n i sa kojim brojem je deljiv - k: " );

       int n = sc.nextInt();
       int k = sc.nextInt();


       if (k>0 && n>0) {
           for (int i = 2; i <= n; i += 2) {

               System.out.println(i);

               if ((i % k) == 0)
                   break;

           }
       }

       else {
           System.out.println("Deljenje nulom nije dozvoljeno.Oba broja moraju biti pozitivna");
       }

     */












    }

}
