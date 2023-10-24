package ZADACI.PASTEBINOOP.ZADATAK17;

public class Konj extends DomacaZivotinja {


    public Konj(String naziv, String ime, double kilaza, int brojNogu) {
        super("Konj", ime, kilaza, brojNogu);
    }

    public Konj() {
    }


    @Override
    public int brojNogu() {

        return getBrojNogu();

    }

    @Override
    public void oglasiSe() {

        System.out.println("pfff");

    }

    @Override
    public boolean daLiSeJedem() {
        return true;
    }
}

