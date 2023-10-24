package ZADACI.PASTEBINOOP.ZADATAK17;

public class Pas extends DomacaZivotinja {

    public Pas(String naziv, String ime, double kilaza, int brojNogu) {
        super("Pas", ime, kilaza, brojNogu);
    }


    @Override
    public int brojNogu(){
       return getBrojNogu();
    }

    @Override
    public boolean daLiSeJedem() {
        return false;
    }


    @Override
    public void oglasiSe() {
        System.out.println("Woof woof");
    }
}
