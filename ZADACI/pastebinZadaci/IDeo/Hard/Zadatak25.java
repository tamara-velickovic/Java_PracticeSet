package ZADACI.pastebinZadaci.IDeo.Hard;

import java.util.Scanner;

public class Zadatak25 {
    public static void main(String[] args) {

    /*  25. Korisnik unosi ime i prezime (jedan String), ime predmeta (String) i prosecnu ocenu istog (double). Validni predmeti su:
        {Srpski, Engleski, Matematika, Fizika, Hemija, Fizicko, Biologija, Istorija, Geografija}
        Na standardni izlaz ispisati poruku:
        "{ime i prezime} je {atribut} iz {kategorija predmeta}, jer je imao/la prosecnu ocenu {prsoecnu ocenu} iz predmeta {ime predmeta}",
                gde je atribut:
        1.) "veoma dobar/ra", ako je prosecna ocena iznad 3.5
        2.) "dobar/ra", ako je prosecna ocena izmedju 2.5 i 3.5
        3.) "veoma los/a", ako je prsoecna ocena ispod 2.5


        kategorija predmeta:
        1.) "prirodnih nauka" - Matematika, Fizika, Hemija
        2.) "jezika" - Srpski, Engleski
        3.) "opstih predmeta" - Biologoija, Istorija, Geografija


        Dakle, za unos:
        - "Ana Brankovic", "Biologija", 4.2
        poruka bi izgledala:
        "Ana Brankovic je veoma dobar/ra iz opstih predmeta, jer je imao/la prosecnu ocenu 4.2 iz predmeta Biologija" */


        Scanner sc= new Scanner (System.in);
        System.out.println("Unesite ime i prezime, ime predmeta i prosecnu ocenu iz tog predmeta: ");

        String imeIPrezime = sc.nextLine();


        String predmet= sc.nextLine();
        predmet= predmet.trim().toUpperCase();

        String kategorija= "";
        String atribut= "";


        //Uradila sam prvo sa switch.
           if(predmet.equalsIgnoreCase("SRPSKI"))
               kategorija= "jezika";

            else if(predmet.equalsIgnoreCase("ENGLESKI"))
                kategorija= "jezika";

            else if(predmet.equalsIgnoreCase("MATEMATIKA"))
                kategorija= "prirodnih nauka";


            else if(predmet.equalsIgnoreCase("FIZIKA"))
                kategorija= "prirodnih nauka";


            else if(predmet.equalsIgnoreCase("HEMIJA"))
                kategorija= "prirodnih nauka";


            else if(predmet.equalsIgnoreCase("BIOLOGIJA"))
                kategorija= "opstih predmeta";


            else if(predmet.equalsIgnoreCase("GEOGRAFIJA"))
                kategorija= "opstih predmeta";


            else if(predmet.equalsIgnoreCase("ISTORIJA"))
                kategorija= "opstih predmeta";



            else if(predmet.equalsIgnoreCase("FIZICKO"))
                kategorija= "opstih predmeta";



            else
                System.out.println("Uneti predmet nije validan.");



        double ocena= sc.nextDouble();

        if (ocena>=3.5)
            atribut= "veoma dobar/ra";

        else if (ocena>= 2.5 && ocena<3.5)
            atribut= "dobar/ra";

        else if (ocena<2.5)
            atribut= "veoma los/a";


        System.out.println(imeIPrezime + " je " + atribut + " iz " + kategorija + " jer je imao/la prosecnu ocenu " + ocena + " iz predmeta " + predmet + ".");







    }
}
