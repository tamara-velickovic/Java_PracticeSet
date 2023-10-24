package ZADACI.PASTEBINOOP.ZADATAK17;

public class Macka extends DomacaZivotinja {


    public Macka(String naziv, String ime, double kilaza, int brojNogu) {
        super("Macka", ime, kilaza, brojNogu);
    }

    @Override
    public boolean daLiSeJedem() {
        return false;
    }



    @Override
    public int brojNogu() {
        return getBrojNogu();
    }

    @Override
    public void oglasiSe() {
        System.out.println("Mjau");
    }
}
