package ZADACI.PASTEBINOOP.ZADATAK17;

public class Ovca extends DomacaZivotinja {

    public Ovca(String naziv, String ime, double kilaza, int brojNogu) {
        super("Ovca", ime, kilaza, brojNogu);
    }


    @Override
    public int brojNogu(){
        return getBrojNogu();
    }

    @Override
    public boolean daLiSeJedem() {
        return true;
    }


    @Override
    public void oglasiSe() {
        System.out.println("bmee");
    }

}
