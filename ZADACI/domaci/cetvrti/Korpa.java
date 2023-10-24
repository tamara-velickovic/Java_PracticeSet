package ZADACI.domaci.cetvrti;

import java.util.ArrayList;


public class Korpa {

       /* Kreirati klasu Korpa koja ima listu namirnica(String). Kreirati:
            - metodu koja prima neku namirnicu i dodaje je u listu
- metodu koja za unetu namirnicu vraca true/false ukoliko se namirnica tu nalazi.
- metodu cenaKorpe koja vraca ukupnu cenu svih namirnica ako racunamo da je prosek jedne      namirnice 70 dinara
- metodu izlistaj koja prikazuje sve namirnice iz liste
    Takodje kreirati potreban konstruktor, get i set metode kao i toString. */

    ArrayList<String> namirnice;

    double cenaNamirnice= 70.0;
    double cenaKorpe;

    //Kosntruktor
    public Korpa (ArrayList<String> namirnice){

        this.namirnice=new ArrayList<String>();
        this.cenaKorpe= cenaKorpe();

    }

    //Get
    public ArrayList<String> getNamirnice() {
        return namirnice;
    }
    //Set
    public void setNamirnice (ArrayList<String> namirnice) {
        this.namirnice = namirnice ;
    }

    public void dodajNamirnicu(String namirnica) {

        namirnice.add(namirnica);
    }


    public boolean daLisadrziNamirnicu(String namirnica) {

        return namirnice.contains(namirnica);
    }



    public double cenaKorpe() {

        return namirnice.size() * cenaNamirnice;

    }

    public void izlistaj() {

        System.out.println(namirnice);

    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Korpa: ").append(namirnice).append("\n");
        sb.append("Cena namirnice: ").append(cenaNamirnice).append("\n");
        sb.append("Cena korpe: ").append(cenaKorpe).append(" dinara." + "\n");


        return sb.toString();
    }


    public static void main(String[] args) {

    }

}