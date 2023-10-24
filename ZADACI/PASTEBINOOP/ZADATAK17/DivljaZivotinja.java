package ZADACI.PASTEBINOOP.ZADATAK17;

public abstract class DivljaZivotinja extends Zivotinja {



    private int brojNogu;
    private String staniste;

    public DivljaZivotinja(String naziv, int brojNogu, String staniste) {
        super(naziv);
        this.brojNogu = brojNogu;
        this.staniste = staniste;
    }


    public DivljaZivotinja() {

    }


    public int getBrojNogu() {
        return brojNogu;
    }

    public void setBrojNogu(int brojNogu) {
        this.brojNogu = brojNogu;
    }

    public String getStaniste() {
        return staniste;
    }

    public void setStaniste(String staniste) {
        this.staniste = staniste;
    }


    public abstract boolean daLiSamOpasna();

    @Override
    public  void leti(){

        System.out.println("Ja ne letim. ");
    }

    @Override

    public void pliva(){
        System.out.println("Ja ne plivam.");
    }


    @Override

    public  boolean daLiJeDomaca(){
        return false;
    }





/*Napisati klase Lav, Zmija, Delfin koje nasledjuju klasu DivljeZivotinje i nemaju atribute

Napisati sve odgovarajuce konstruktore

Napisati sve gettre i settere

Overridovati sve metode. */


}
