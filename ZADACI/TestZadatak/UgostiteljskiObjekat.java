package ZADACI.TestZadatak;

import java.util.ArrayList;
import java.util.List;

public abstract class UgostiteljskiObjekat implements Ugostljivo {

    private String naziv;

    private List<Radnik> radnici;



    // Konstruktori

    public UgostiteljskiObjekat(String naziv, List<Radnik> radnici) {
        this.naziv = naziv;
        this.radnici = radnici;
    }

    public UgostiteljskiObjekat(String naziv) {
        this.naziv = naziv;
        this.radnici = new ArrayList<>();
    }

    public UgostiteljskiObjekat(List<Radnik> radnici) {
        this.naziv = "";
        this.radnici = radnici;
    }


    //Getteri i Setteri

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public List<Radnik> getRadnici() {
        return radnici;
    }

    public void setRadnici(List<Radnik> radnici) {
        this.radnici = radnici;
    }


    //Serilizacija

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(naziv).append(" | ").append("Broj zaposlenih: ").append(radnici.size());

        return sb.toString();
    }



    //Metodi za implementaciju


    //Metodi

    public String ispisiRadnike() {
    StringBuilder sb = new StringBuilder();

     for (Radnik r : radnici)
         sb.append(r.toString()).append("\n");

      return sb.toString().substring(0, sb.toString().length()-1); //
    }

   public double ukupnaPlata() {

    double sum= 0.0;

    for (Radnik r : radnici)
        sum+= r.getPlata();


     return sum;

   }


   //Apstraktni metodi
    public abstract double bruto(); //Vraca bruto zaradu UgostiteljskogObjekta
    public abstract double neto(); //Vraca neto zaradu UgostiteljskogObjekta





}
