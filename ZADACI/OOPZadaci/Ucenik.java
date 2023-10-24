package ZADACI.OOPZadaci;

public class Ucenik {


    private String ime;
    private String prezime;
    private int brojGodina;
    private double prosek;


    public Ucenik(String ime, String prezime, int brojGodina, double prosek) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodina = brojGodina;
        if(prosek>=1.0 && prosek <= 5.0)
        this.prosek = prosek;
    }

    public Ucenik() {
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

    public double getProsek() {
        return prosek;
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

    public void setProsek(double prosek) {
        this.prosek = prosek;
    }

    /* - toString():
     * "<ime> <prezime>\n
     *  broj godina: <brojGodina>\n
     *  prosek: <prosek>"
     *
     * */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(ime).append(prezime).append("\n")
                .append("Broj godina: ").append(brojGodina)
                .append("\n").append("Prosek: ").append(prosek);

        return sb.toString();


    }
}