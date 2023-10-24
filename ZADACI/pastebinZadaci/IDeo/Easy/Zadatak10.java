package ZADACI.pastebinZadaci.IDeo.Easy;

import java.util.Scanner;

public class Zadatak10 {

    public static void main(String[] args) {

        // 10. Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.


        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite dan (1-31) i mesec (1-12): " + " ");

        int dan= sc.nextInt();
        int mesec= sc.nextInt();


            switch (mesec) {

                case 1:

                if (dan >=1 && dan <=19)
                    System.out.println("Jarac");
                else
                    System.out.println("Vodolija");

                    break;

                case 2:

                    if (dan >=1 && dan <=18)
                        System.out.println("Vodolija");
                    else
                        System.out.println("Ribe");

                    break;

                case 3:

                    if (dan >=1 && dan <=20)
                        System.out.println("Ribe");
                    else
                        System.out.println("Ovan");

                    break;

                case 4:

                    if (dan >=1 && dan <=19)
                        System.out.println("Ovan");
                    else
                        System.out.println("Bik");


                    break;

                case 5:

                    if (dan >=1 && dan <=20)
                        System.out.println("Bik");
                    else
                        System.out.println("Blizanci");


                    break;

                case 6:

                    if (dan >=1 && dan <=20)
                        System.out.println("Blizanci");
                    else
                        System.out.println("Rak");

                    break;

                case 7:

                    if (dan >=1 && dan <=21)
                        System.out.println("Rak");
                    else
                        System.out.println("Lav");

                    break;

                case 8:

                    if (dan >=1 && dan <=22)
                        System.out.println("Lav");
                    else
                        System.out.println("Devica");

                    break;

                case 9:

                    if (dan >=1 && dan <=23)
                        System.out.println("Devica");
                    else
                        System.out.println("Vaga");

                    break;

                case 10:

                    if (dan >=1 && dan <=22)
                        System.out.println("Vaga");
                    else
                        System.out.println("Skorpija");

                    break;

                case 11:

                    if (dan >=1 && dan <=22)
                        System.out.println("Skorpija");
                    else
                        System.out.println("Strelac");

                    break;

                case 12:

                    if (dan >=1 && dan <=21)
                        System.out.println("Strelac");
                    else
                        System.out.println("Jarac");

                    break;

                default:
                    System.out.println("Neadekvatan mesec ili dan.");
            }





      /*  Oba pristupa - korišćenje switch izraza i niza if i else if izraza - mogu se koristiti za rešavanje ovog problema, a izbor između njih zavisi od preferencija i konteksta. Evo nekoliko razmatranja:

        Preglednost koda: Korišćenje switch izraza može činiti kod čitljivijim i preglednijim, jer jasno prikazuje mapiranje između meseca i horoskopskih znakova. Međutim, u slučaju mnogo uslova, switch može postati dugačak i manje pregledan.

        Efikasnost i memorijska potrošnja: U pogledu efikasnosti i memorijske potrošnje, oba pristupa su obično slična. Razlika između njih je često zanemarljiva u modernim računarima. Međutim, switch izraz se može bolje optimizovati od strane kompilatora u nekim slučajevima.

                Dodavanje i izmena uslova: Ako planirate dodavati ili izmenjivati uslove za horoskopske znakove u budućnosti, if i else if izrazi mogu biti fleksibilniji, jer možete lako dodavati nove uslove ili menjati postojeće. Sa switch, dodavanje novih uslova može zahtevati promenu samog izraza.

        Čitljivost koda: Kada imate mnogo uslova, if i else if izrazi mogu postati nešto manje čitljivi, a switch izraz može biti jasniji, mada ovo zavisi od stilskih preferencija programera.

        U krajnjoj liniji, oba pristupa su prihvatljiva i memorijska potrošnja i performanse su obično zanemarljive. Glavni faktor za izbor između njih trebalo bi da bude čitljivost i održavanje koda, kao i vaša sopstvena preferencija ili stilski standardi u projektu u kojem radite. */
























        /* Jarac (22. 12 - 19. 1)
           Vodolija (20. 1 - 18. 2)
           Ribe (19. 2 - 20. 3)
           Ovan (21. 3 - 19. 4)
           Bik (20. 4 - 20. 5)
           Blizanci (21. 5 - 20. 6)
           Rak (21. 6 - 22. 7)
           Lav (23. 7 - 22. 8)
           Devica (23. 8 - 22. 9)
           Vaga (23. 9 - 22. 10)
           Škorpija (23. 10 - 21. 11)
           Strelac (22. 11 - 21. 12)
            */












    }

}
