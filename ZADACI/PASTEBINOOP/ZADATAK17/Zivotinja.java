package ZADACI.PASTEBINOOP.ZADATAK17;

public abstract class Zivotinja {


    private String naziv;


    //Konstruktori

    public Zivotinja(String naziv) {
        this.naziv = naziv;
    }

    public Zivotinja() {
    }

    //Getteri i setteri
    public String getNaziv() {
        return naziv;
    }



    public void setNaziv(String naziv) {
        this.naziv = naziv;


    }


    //Apstraktne metode

    public abstract void leti();

    public abstract void pliva();

    public abstract int brojNogu();

    public abstract boolean daLiJeDomaca();

    public abstract void oglasiSe();














}
