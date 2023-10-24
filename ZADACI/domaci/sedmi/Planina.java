package ZADACI.domaci.sedmi;

public class Planina  {

    private String naziv;

    private int visina;

    //Getteri i Setteri

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getVisina() {
        return visina;
    }

    public void setVisina(int visina) {
        this.visina = visina;
    }


    //Konstruktori
    public Planina(String naziv, int visina) {
        this.naziv = naziv;
        this.visina = visina;
    }

    public Planina() {
    }

    //Serilizacija

    @Override
    public String toString(){
    StringBuilder sb= new StringBuilder();
    sb.append("Planina: ").append(naziv).append("\n");
    sb.append("Visina: ").append(visina);

    return sb.toString();

    }


    //  Napraviti klasu Planina koja ima vrednosti za naziv planine i njenu visinu.

    //Kreirati za date klase sve potrebne get i set metode, kao i konstruktore i toString.
}
