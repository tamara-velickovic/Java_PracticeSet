package ZADACI.DopunskiZadatak;

import java.util.List;

public class Usce extends TrzniCentar {


    //Konstruktori

    public Usce(String naziv, List<Prodavnica> prodavnice) {
        super( prodavnice, naziv );
    }

    public Usce() {
    }





    //Metode

    // Klasa Usce daje masovni popust samo na najskuplji artikl, i to 50% popusta.




    @Override
    public void masovniPopust() {

    Artikl najskuplji = najskuplji();

    for (Prodavnica p : getProdavnice()) {

        for (Artikl artikl : p.getArtikli()) {

         if (artikl.equals(najskuplji))
             artikl.setCena(artikl.getCena()*0.5);

        }
    }



    }
}
