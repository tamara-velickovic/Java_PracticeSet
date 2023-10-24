package ZADACI.domaci.peti;

public class Predmet {

    private int ocena;
    private String nazivPredmeta;

    //Getteri i Setteri


    public int getOcena() {

        return ocena;

    }

    public void setOcena(int ocena) {
        if (ocena >=1 && ocena<=5)
            this.ocena = ocena;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {  //Mozda nije ni potreban, zavisi
       this.nazivPredmeta = nazivPredmeta;
           }

    //Konstruktori


    public Predmet(int ocena, String nazivPredmeta) {
        if (ocena >=1 && ocena<=5)
        this.ocena = ocena;
        this.nazivPredmeta = nazivPredmeta;
    }

    public Predmet() {

    }

    //Serilizacija

    @Override
    public String toString() {
    StringBuilder sb= new StringBuilder();
    sb.append("Predmet: ").append(nazivPredmeta).append(" | ")
    .append("Ocena: ").append(ocena);

    return sb.toString();

    }

}
