package ZADACI.OOPZadaci;

public class Osoba {



   private String ime;
   private String prezime;
   private int brojGodina;

   static int jedinstveniBroj;

   int brojOsoba= 0;


    public Osoba(String ime, String prezime, int brojGodina) {

        brojOsoba ++;
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodina = brojGodina;
        jedinstveniBroj= brojOsoba;
    }

    public Osoba() {
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getBrojGodina() {

      /*  if (brojGodina==0){

            System.out.println("Osoba nije ziva.");

        } */ // Povratna vrednost String

        return brojGodina;
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



   /* toString():
            * "<ime> <prezime>\n
            * "broj godina: <brojGodina>" */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(ime).append(prezime).append("\n")
                .append("Broj godina: ").append(brojGodina);

        return sb.toString();
    }

}
