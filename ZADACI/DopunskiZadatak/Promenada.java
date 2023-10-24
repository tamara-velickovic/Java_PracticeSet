package ZADACI.DopunskiZadatak;

import java.util.List;

public class Promenada extends TrzniCentar {

    //Konstruktori

    public Promenada(List<Prodavnica> prodavnice, String naziv) {
        super(prodavnice, naziv);
    }

    public Promenada() {
    }


    //Metode

    //Override metode iz Apstraktne klase
    // Klasa Promenada od ukupne zarade odbija 20% zbog poreza


    @Override
    public double ukupnaZarada() {

    return super.ukupnaZarada() * 0.8;
    }
}
