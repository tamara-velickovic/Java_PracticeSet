package ZADACI.PASTEBINOOP.ZADATAK17;

public class Lav extends DivljaZivotinja {

    public Lav(String naziv, int brojNogu, String staniste) {
        super("Lav", brojNogu, staniste);

    }

    public Lav() {
    }

    @Override
    public  int brojNogu(){
        return getBrojNogu();
    }

    public void oglasiSe(){
        System.out.println("roar"
        );
    }

    @Override
    public boolean daLiSamOpasna() {
        return true;
    }
}
