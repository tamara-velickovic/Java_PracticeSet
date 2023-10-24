package ZADACI.domaci.peti;

import java.util.ArrayList;

public class Skola {

   private ArrayList<Ucenik> listaUcenika;


   //Getteri i Settei
    public ArrayList<Ucenik> getListaUcenika() {
        return listaUcenika;
    }

    public void setListaUcenika(ArrayList<Ucenik> listaUcenika) {
        this.listaUcenika = listaUcenika;
    }



    //Konstruktori

    public Skola(ArrayList<Ucenik> listaUcenika) {
        this.listaUcenika = listaUcenika;
    }

    public Skola() {
        this.listaUcenika = new ArrayList<Ucenik>();
    }

    //Serilizacija

    @Override
    public String toString(){

     StringBuilder sb= new StringBuilder();
     sb.append("Lista ucenika: ");

     for(Ucenik u: listaUcenika)
         sb.append(u.toString()).append("\n");

        return sb.toString();
    }


    // ProsekOcenaSvihUcenikaIsteGeneracije

        public double prosekGeneracije (int godina) {

        double sum= 0;
        int brojUcenika= 0;

        for(Ucenik u: listaUcenika)

        if (godina== u.getGodinaSkolovanja()) {

            sum += u.izracunajProsek();
            brojUcenika++;
        }

        if (brojUcenika>0)
        return sum/(double) brojUcenika;
        else
        return 0.0;


        }



  //  prosekPredmeta


    public double prosekPredmeta (Predmet predmet) {

        int sum= 0;
        int brojUcenika= 0;

        for (Ucenik u : listaUcenika) {
            for (Predmet p: u.getListaPredmeta())

            if (predmet.getNazivPredmeta().equalsIgnoreCase(p.getNazivPredmeta())){

               sum+= p.getOcena();
                brojUcenika++; }


        }

        if(brojUcenika>0)
        return (double) sum / (double) brojUcenika;
        else
        return 0.0;

    }



   // ucenikSaMinProsekom


    public Ucenik ucenikSaMinProsekom () {


        double minProsek= 1.0; // ili Double POSITIVE_INFINITY, ali ako je ovo definisani minProsek u skoli, onda mozda bolje tako
        Ucenik ucenikMinProsek= null;


        for (int i = 0; i <= listaUcenika.size()-1; i++) {

            if (listaUcenika.get(i).izracunajProsek() < minProsek ) {
                minProsek= listaUcenika.get(i).izracunajProsek();
                ucenikMinProsek = listaUcenika.get(i); }

        }

        return ucenikMinProsek; // ako ima vise ucenika sa istim minProsekom, onda bi trebalo da napravim listu da prima sve i redefinisem kod



       /* for (Ucenik u: listaUcenika)

            if (u.izracunajProsek() < minProsek )
                minProsek= u.izracunajProsek();
                ucenikMinProsek = listaUcenika.get(u); // Treba mi index,dakle jos jedna metoda */




    }




}
