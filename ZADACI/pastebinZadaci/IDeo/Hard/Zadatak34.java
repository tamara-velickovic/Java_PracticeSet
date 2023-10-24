package ZADACI.pastebinZadaci.IDeo.Hard;

import java.util.Scanner;

public class Zadatak34 {
    public static void main(String[] args) {



          /*  34.* Korisnik unosi novac na racunu kojim raspolaze kao i cenu nekog artikla. Na standardni izlaz ispisati koliko kopija tog
        artika korisnik moze da kupi. */



        Scanner sc= new Scanner (System.in);
        System.out.println("Unesite stanje na racunu i cenu artikla: ");

        int stanje= sc.nextInt();
        int cena= sc.nextInt();

        int brojArtikala= 0;


        if (cena!=0 && stanje>=cena)
        brojArtikala= stanje/cena;
        else
            System.out.println("Cena ne moze biti 0.");

        System.out.println("Broj artikala koje mozete kupiti: " + brojArtikala);


        // 1000 100







    }
}
