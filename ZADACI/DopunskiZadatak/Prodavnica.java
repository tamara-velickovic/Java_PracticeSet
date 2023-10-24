package ZADACI.DopunskiZadatak;

import java.util.ArrayList;
import java.util.List;

public class Prodavnica {


   // Napraviti klasu Prodavnica koja ima listu Artikla i naziv. Ova klasa takodje ima metodu:
   //         -zarada() - koja vraca ukupnu zaradu od svih artikala


   private String naziv;

   private List<Artikl> artikli;

     //Konstruktori

    public Prodavnica(String naziv, List<Artikl> artikli) {
        this.naziv = naziv;
        this.artikli = artikli;
    }

    public Prodavnica() {
        this.naziv="Prodavnica";
        this.artikli= new ArrayList<>();
    }

    //Getteri i Setteri

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public List<Artikl> getArtikli() {
        return artikli;
    }

    public void setArtikli(List<Artikl> artikli) {
        this.artikli = artikli;
    }


    //Serilizacija


    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("Naziv: ").append(naziv).append("\n");
        sb.append("Artikli: ").append("\n");

        for (Artikl a: artikli)
            sb.append(a.toString());


        return sb.toString();
    }


    //Metode

    public double zarada(){

      double sum= 0.0;

      for(Artikl a: artikli)
          sum+= a.getCena();

      return sum;

    }




    // koja vraca ukupnu zaradu od svih artikala

}
