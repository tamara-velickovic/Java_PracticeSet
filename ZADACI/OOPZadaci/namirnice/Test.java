package ZADACI.OOPZadaci.namirnice;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Namirnice n1= new Namirnice("jabuka", 50.0);
        Namirnice n2= new Namirnice("jabuka", 50.0);
        Namirnice n3= new Namirnice("kruska", 40.0);


      //  System.out.println(n1);

       // System.out.println(daLiSuIste(n1, n2));

        ArrayList<Namirnice> namirnice= new ArrayList<>();
        namirnice.add(n1);
        namirnice.add(n2);
        namirnice.add(n3);

        System.out.println(namirnice);

        //[jabuka | 50.0, jabuka | 50.0, kruska | 40.0]

    }
}
