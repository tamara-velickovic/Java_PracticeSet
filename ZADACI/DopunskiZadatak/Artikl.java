package ZADACI.DopunskiZadatak;

public class Artikl {

   // Napraviti klasu Artikl koja ima atribute za naziv i cenu artikla.

    private String naziv;

    private double cena;


    //Konstruktori

    public Artikl(String naziv, double cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public Artikl() {
        this.naziv = "Artikl";
        this.cena = 0.0; // moglo je i bez
    }

    //Getteri i Setteri

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }


    //Serilizacija

    @Override
    public String toString() {
    StringBuilder sb= new StringBuilder();
    sb.append("Naziv: ").append(naziv).append("\n");
    sb.append("Cena: ").append(cena);

    return sb.toString();
    }




}
