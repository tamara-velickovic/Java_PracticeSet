package ZADACI.DopunskiZadatak;
import java.util.ArrayList;
public class Test {






        public static void main(String[] args) {

            Artikl a = new Artikl("Majica", 200.00);
            Artikl a1 = new Artikl("Duks", 700.00);
            Artikl a2 = new Artikl("Nakit", 3000.00);
            Artikl a3 = new Artikl("Patike", 2000.00);

            ArrayList<Artikl> artikli = new ArrayList<>();
            artikli.add(a);
            artikli.add(a1);
            artikli.add(a2);
            artikli.add(a3);

            Prodavnica zara = new Prodavnica("Zara", artikli);
            //System.out.println(zara.zarada());
            ArrayList<Prodavnica> prodavnice = new ArrayList<>();
            prodavnice.add(zara);
            TrzniCentar tc = new Promenada( prodavnice, "Promenada");

          //  tc.izlistaj();
            //System.out.println(tc.ukupnaZarada());
            //  System.out.println(tc.najskuplji());
           // tc.masovniPopust();
           // tc.izlistaj();
           // System.out.println(tc.ukupnaZarada());
          //  System.out.println(tc.najskuplji());

            tc.eleminisi(a1);
            tc.izlistaj();

        }




















   /* Napraviti klasu Artikl koja ima atribute za naziv i cenu artikla.


    Napraviti klasu Prodavnica koja ima listu Artikla i naziv. Ova klasa takodje ima metodu:
            -zarada() - koja vraca ukupnu zaradu od svih artikala


    Napraviti klasu TrzniCentar koja ima listu prodavnica, naziv i sledece metode:
    -ukupnaZarada() - vraca ukupnu zaradu Trznog centra iz svih prodavnica
    -najskuplji() - vraca najskuplji artikl u celoj prodavnici


    Kreirati interfejs Usluge koja ima sledece metode:
    -masovniPopust() - dodeljuje 20% popusta na sve artikle u svim prodavnicama
    -nalaziSe(Artikl a) - vraca prodavnicu u kojoj se nalazi dati artikl
    -eleminisi(Artikl a) - izbacuje dati artikl iz ponude

    Klasa TrzniCentar implementira interfejs Usluge.


    Klase Usce, Promenada i Galerija nasledjuju klasu TrzniCentar.

    Klasa Usce daje masovni popust samo na najskuplji artikl, i to 50% popusta.
    Klasa Promenada od ukupne zarade odbija 20% zbog poreza.

    Kreirati sve potrebne getere i setere, kao i konstruktor i toString. */


    //Konstruktori
    //Getteri i Setteri
    //Serilizacija
    //Metode











}
