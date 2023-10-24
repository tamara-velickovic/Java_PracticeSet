package ZADACI.OOPZadaci;

import ZADACI.OOPZadaci.knjizara.Autor;
import ZADACI.OOPZadaci.knjizara.Knjiga;
import ZADACI.OOPZadaci.knjizara.Knjizara;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Osoba o1= new Osoba ("Pera","Peric", 30);
        Osoba o2= new Osoba ("Marija","Markovic", 25);
        Osoba o3= new Osoba ("Marko","Markovic", 42);

      /*  Osoba o4= new Osoba ("Fjodor","Dostojevski", 0);
        Osoba o5= new Osoba ("Umerto","Eko", 0);
        Osoba o6= new Osoba ("Erih","From", 0); */

        ArrayList<Knjiga> knjigeAutora1 = new ArrayList<>();
        ArrayList<Knjiga> knjigeAutora2 = new ArrayList<>();
        ArrayList<Knjiga> knjigeAutora3 = new ArrayList<>();


        Autor a1= new Autor ("Fjodor","Dostojevski", 0, knjigeAutora1 );
        Autor a2= new Autor ("Umerto","Eko", 0, knjigeAutora2);
        Autor a3= new Autor ("Erih","From", 0, knjigeAutora3);


        Knjiga prva = new Knjiga("Idiot", 500, 1500, a1);
        Knjiga druga = new Knjiga("Braca Karamazovi", 500, 1500, a1);
        Knjiga treca = new Knjiga("Kockar", 200, 1500, a1);
        Knjiga cetvrta = new Knjiga("Zlocin i kazna", 600, 1500, a1);
        Knjiga peta = new Knjiga("Fukoovo klatno", 600, 1500, a2);
        Knjiga sesta = new Knjiga("Covek za sebe", 600, 1500, a3);
        Knjiga sedma = new Knjiga("Kriza psihoanalize", 600, 1500, a3);



        ArrayList<Knjiga> naStanju = new ArrayList<>();
        naStanju.add(prva);
        naStanju.add(druga);
        naStanju.add(treca);


        ArrayList<Osoba> radnici = new ArrayList<>();
        radnici.add(o1);
        radnici.add(o2);
        radnici.add(o3);


        ArrayList<Autor> autori = new ArrayList<>();
        autori.add(a1);
        autori.add(a2);
        autori.add(a3);

        Knjizara odiseja = new Knjizara(naStanju,radnici,autori);


        System.out.println();




















    }

}
