package ZADACI.OOPZadaci;

public class Profesor {

    /*
     * Svaki profesor ima:
     * - String ime;
     * - String prezime;
     * - int brojGodina;
     * - double plata;
     *
     *
     *
     * */


    private String ime;
    private String prezime;
    private int brojGodina;

    private double plata;


    public Profesor(String ime, String prezime, int brojGodina, double plata) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodina = brojGodina;
        this.plata = plata;
    }


    public Profesor() {
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getBrojGodina() {
        return brojGodina;
    }

    public double getPlata() {
        return plata;
    }


    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setBrojGodina(int brojGodina) {
        this.brojGodina = brojGodina;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }


   /* - toString():
            * "<ime> <prezime>\n
            *  broj godina: <brojGodina>\n
     *  plata: <plata>"
            */





    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(ime).append(prezime).append("\n")
        .append("Broj godina: ").append(brojGodina).append("\n")
        .append("Plata: ").append(plata);

        return sb.toString();
    }
}





