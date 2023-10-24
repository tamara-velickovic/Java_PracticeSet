package ZADACI.domaci.sedmi;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {



            Planina planina1 = new Planina("Tara", 1200);
            Planina planina2 = new Planina("Kopaonik", 1700);
            Planina planina3 = new Planina("Durmitor", 2500);

            List<Planina> list = new ArrayList<>();
            list.add(planina1);
            list.add(planina2);
            list.add(planina3);

            Amater amater = new Amater("Tamara", list );
            Rekreativac rekreativac = new Rekreativac("Branko", list);
            Pro pro = new Pro("Milica", list);

            amater.popniSe(planina1);
            rekreativac.popniSe(planina2);
            pro.popniSe(planina3);



            System.out.println("Crna lista za " + amater.getImePlaninara() + ": " + amater.crnaLista());
            System.out.println("Crna lista za " + rekreativac.getImePlaninara() + ": " + rekreativac.crnaLista());
            System.out.println("Crna lista za " + pro.getImePlaninara() + ": " + pro.crnaLista());

            System.out.println("Ukupno metara za " + amater.getImePlaninara() + ": " + amater.ukupnoMetara() + "m");
            System.out.println("Ukupno metara za " + rekreativac.getImePlaninara() + ": " + rekreativac.ukupnoMetara() + "m");
            System.out.println("Ukupno metara za " + pro.getImePlaninara() + ": " + pro.ukupnoMetara() + "m");

    }













    }

