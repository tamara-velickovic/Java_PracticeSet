package ZADACI.TestZadatak;

public class Radnik extends Osoba {


    private int id;

    private double plata;


    static int brojObjekataRadnik = 0;

// Konstruktori

  //  Napisati za svaki nadkonstrukor jedan konstruktor koji prima double platu. Uzeti da je podrazumevana plata 0.0

    public Radnik(String ime, String prezime, int brojGodina, double plata) {
        super(ime, prezime, brojGodina);
        this.id = ++brojObjekataRadnik;
        this.plata = plata;
    }

    public Radnik(double plata) {
        this.id = ++brojObjekataRadnik;
        this.plata = 0.0;
    }

    //Getteri i Setteri

    public int getId() {
        return id;
    }

  //Necu da postoji setter za ID

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }


    //Serilizacija

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[").append(id).append("]");

        return sb.toString();
    }


    //Metodi

    //public boolean jednaki(Osoba o) // Vraca true ako je prosledjena osoba ista kao ovaj (this) radnik.
    // Ovaj radnik je isti kao Osoba o ako je o instanca klase Radnik i ako imaju isti id.


    @Override
    public boolean jednaki(Osoba o) {

        if (o instanceof Radnik && this.id==(((Radnik) o).getId()))
            return true;

        else
            return false;



    }
}
