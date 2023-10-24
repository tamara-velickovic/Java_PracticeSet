package ZADACI.PASTEBINOOP.ZADATAK17;

public class Krava extends DomacaZivotinja {

    public Krava(String naziv, String ime, double kilaza, int brojNogu) {
        super("Krava", ime, kilaza, brojNogu);
    }

    public Krava() {
        super();
    }

    @Override
    public boolean daLiSeJedem() {
        return true;
    }

    @Override
    public int brojNogu() {
        return getBrojNogu();
    }

    @Override
    public void oglasiSe() {
        System.out.println("Muuuu"
        );
    }
}
