package ZADACI.TestZadatak;

import java.util.List;

public class Kafic extends UgostiteljskiObjekat{

    private double zarada; //Ukupna zarada kafica

    private int brojKafaProdatih= 0;


    // Konstruktori

  //  Za svaki nadkonstruktor napisati jedan konstruktor koji postavlja ukupnu zaradu na 0.0


    public Kafic(String naziv, List<Radnik> radnici) {
        super(naziv, radnici);
        this.zarada = 0.0;
    }

    public Kafic(String naziv) {
        super(naziv);
        this.zarada = 0.0;
    }

    public Kafic(List<Radnik> radnici) {
        super(radnici);
        this.zarada = 0.0;
    }

    //Getteri i Setteri

    public double getZarada() {
        return zarada;
    }

    public void setZarada(double zarada) {
        this.zarada = zarada;
    }


    //Serilizacija

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Kafic ").append(getNaziv()).append("\n");
        sb.append("Do sada prodato: ").append(brojKafaProdatih);

        return sb.toString();
    }



    //Metodi
    //Metodi za implementaciju

   @Override
   public void usluzi(Osoba o) { //Prodaje kafu osobi. Cena kafe iznosi 20 * <k>, gde je k zbir duzine karaktera u imenu i prezimenu osobe kojoj se prodaje kafa

   int k= o.getIme().length() + o.getPrezime().length();
   double cenaKafe= 20 * k;
   brojKafaProdatih++;
   zarada += cenaKafe;

   }

    @Override
    public void usluziSve(List<Osoba> o) { //Prodaje kafu svim osobama iz liste na isti nacin kao gore definisan

    for (Osoba gost : o)
        usluzi(gost);



   }

    @Override
    public void usluziSve(Osoba ... o) { //Prodaje kafu svim prosledjenim osoba na isti nacin kao gore definisan.

        for (int i = 0; i <= o.length-1; i++) {

            usluzi(o[i]);

        }


   }
    //Metodi apstraktne klase = override

   @Override
    public double bruto() { // Vraca bruto zaradu Kafica. Bruto zarada se racuna kao zbir svih kafa prodatih do tog momenta.

    return zarada;
   }

    @Override
    public double neto() {// Vraca neto zaradu Kafica. Neto zarada se racuna kada se od bruto zarade oduzme porez od 1_000.

    return zarada-1000;

    }





}
