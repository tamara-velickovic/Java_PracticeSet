package ZADACI.pastebinZadaci.IDeo.Medium;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {


        // 11. Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
       /* "Dobrodosao u {x}. razred, {ime} {prezime}",
                pod pretpostavkom da je trenutna godina 2023. Pretpostavimo da ima 12 razreda. A ako korisnik nije djak ispisati jednu odgovarajucu
        poruku od:
        "{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"*/


        Scanner sc= new Scanner (System.in);
        System.out.println("Unesite ime, prezime i goinu rodjenja: ");

        String ime = sc.nextLine();
        String prezime = sc.nextLine();

        int godinaRodjenja= sc.nextInt();

        int trenutnaGodina= 2023;
        int brojGodina= trenutnaGodina-godinaRodjenja;
        int razred= brojGodina - 6;

        // 7 8 9 10 -  11 12 13 14 - 15 16 17 18

        if (razred>=7 && razred<=12)

        System.out.println("Dobrodosao u " + razred + " " + "razred " + ime + " " + prezime + "!");

        else if (brojGodina<7) {
            System.out.println(ime + " " + prezime + " tek treba da zapocne obrazovanje." );
        }

        else if (brojGodina>18) {
            System.out.println(ime + " " + prezime + " je zavrsio skolu." );
        }




    }
}
