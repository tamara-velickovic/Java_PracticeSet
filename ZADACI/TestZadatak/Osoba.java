package ZADACI.TestZadatak;

public class Osoba {

    private String ime, prezime;

    private int brojGodina;



    // Konstruktori


    public Osoba(String ime, String prezime, int brojGodina) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodina = brojGodina;
    }

    public Osoba() {

        this.ime = "";
        this.prezime = "";
        this.brojGodina = 18;

    }


    //Getteri i Setteri

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojGodina() {
        return brojGodina;
    }

    public void setBrojGodina(int brojGodina) {
        this.brojGodina = brojGodina;
    }


    //Serilizacija

    @Override
    public String toString() {
     StringBuilder sb = new StringBuilder();
     sb.append(ime).append(" ").append(prezime).append(" ");
     sb.append("(").append(brojGodina).append(")");

     return sb.toString();
    }



    //Metodi

    public boolean jednaki(Osoba o) {

    if (this.equals(o))
        return true;

    else
        return false;



    }

    // Vraca true ako je prosledjena osoba jednaka ovoj (this) osobi. Dve osobe su jednake ako su im svi atributi isti













}
