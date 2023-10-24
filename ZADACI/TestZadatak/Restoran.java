package ZADACI.TestZadatak;

import java.util.ArrayList;
import java.util.List;

public class Restoran extends UgostiteljskiObjekat {

    private final int BROJ_STOLOVA; //Oznacava koliko ukupno raspolozivih stolova ima u restoranu. Pretpostaviti da su svi za jednu osobu
    private double cenaRucka; // Pretpostaviti da je to jedina stavka na meniju
    private double zarada; //Ukupna zarada restorana
    private List<Osoba> gosti;


    // Konstruktori

    //Za svaki nadkonstruktor napisati jedan konstruktor koji prima broj stolova sa kojima raspolaze i cenu rucka,
    //goste postavlja na novu praznu ArrayList-u a ukupnu zaradu postavlja na 0.0

    public Restoran(String naziv, List<Radnik> radnici, int brojStolova, double cenaRucka) {
        super(naziv, radnici);
        this.BROJ_STOLOVA = brojStolova;
        this.cenaRucka = cenaRucka;
        this.gosti= new ArrayList<>();
        this.zarada=0.0; //ne mora
    }

    public Restoran(String naziv, int brojStolova, double cenaRucka) {
        super(naziv);
        this.BROJ_STOLOVA = brojStolova;
        this.cenaRucka = cenaRucka;
        this.gosti= new ArrayList<>();
        this.zarada=0.0;
    }

    public Restoran(List<Radnik> radnici, int brojStolova, double cenaRucka) {
        super(radnici);
        this.BROJ_STOLOVA = brojStolova;
        this.cenaRucka = cenaRucka;
        this.gosti= new ArrayList<>();
        this.zarada=0.0;
    }

    //Getteri i Setteri

    //Ne stavljam set za BrojStolova

    public int getBROJ_STOLOVA() {
        return BROJ_STOLOVA;
    }

    public double getCenaRucka() {
        return cenaRucka;
    }

    public void setCenaRucka(double cenaRucka) {
        this.cenaRucka = cenaRucka;
    }

    public double getZarada() {
        return zarada;
    }

    public void setZarada(double zarada) {
        this.zarada = zarada;
    }

    public List<Osoba> getGosti() {
        return gosti;
    }

    public void setGosti(List<Osoba> gosti) {
        this.gosti = gosti;
    }


    //Serilizacija


    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("Restoran ").append(getNaziv()).append("\n");
        sb.append("Meni: ").append("Rucak").append(" | ").append(cenaRucka);


        return sb.toString();
    }




    //Metodi


    // Izbacuje osobu o iz liste gostiju i oslobadja njegov sto ako je to moguce.
    //(Moguce je proslediti i duboku kopiju osobe koja ruca u restoranu ili osobu koja uopste nije gost restorana)

     public void odjaviOsobu(Osoba o) {

     for (Osoba gost: gosti){

         if (gost.equals(o)){

         gosti.remove(gost);

         }
     }


     }



    //Metodi za implementaciju


    //Ubacuje osobu o u listu gostiju ako je to moguce.

    @Override
    public void usluzi(Osoba o){

    int brojSlobodnihStolova = BROJ_STOLOVA-gosti.size();

    if (brojSlobodnihStolova>0) {
        gosti.add(o);
        zarada += cenaRucka; }
    //Moglo i jednostavnije, BROJ STOLOVA > gosti.size()
    }

    //Ubacuje SVE osobe iz prosledjene liste u listu gostiju ako je to moguce. Ako nije moguce ubaciti SVE osobe iz prosledjene liste,
    // ne ubacuje NI JEDNU osobu iz prosledjene liste

    @Override
    public void usluziSve(List<Osoba> o){

    int brojSlobodnihStolova = BROJ_STOLOVA-gosti.size();

    if (brojSlobodnihStolova>= o.size()) {  // for (Osoba gost : o) { //usluzi(gost);

        gosti.addAll(o);
        brojSlobodnihStolova-= o.size();
        zarada+= cenaRucka * o.size();
    }

    }



    // Ubacuje osobe SVE DOK JE TO MOGUCE u listu gostiju.
    @Override
    public void usluziSve(Osoba ... o) {

    int brojSlobodnihStolova = BROJ_STOLOVA-gosti.size(); // Sto: 5 - Gosti: 7  Sto: 5 - Gosti: 5  Sto: 0 - Gosti: 7

        if (brojSlobodnihStolova>= o.length){

            for (int i = 0; i <= o.length-1; i++) {

                gosti.add(o[i]);
                brojSlobodnihStolova--;
                zarada+= cenaRucka; //pod pretpostavkom da jedan gost moze da poruci samo jedan rucak
            }

        }

        else if (brojSlobodnihStolova< o.length)  {

            for (int i = 0; i < brojSlobodnihStolova; i++) {

                gosti.add(o[i]);
                brojSlobodnihStolova--;
                zarada+= cenaRucka; //pod pretpostavkom da jedan gost moze da poruci samo jedan rucak
                System.out.println("Gost " + o[i].toString() + " je primljen."); //Ni ovo nije potrebno
            }

        }


    }





    //Metodi apstraktne klase = override
    // Vraca bruto zaradu Restorana. Bruto zarada se racuna kao zbir svih ruckova napravljenih do tog momenta.
    @Override
    public double bruto(){

      return zarada;

    }



    // Vraca neto zaradu Restorana. Neto zarada se racuna kada se od bruto zarade oduzme sve sto restoran treba da
    // plati svojim zaposlenima (kada isplati plate svojim zaposlenima) i kada se oduzme porez od 1_000
    @Override
    public double neto(){

     return zarada - ukupnaPlata() - 1000;



    }

}
