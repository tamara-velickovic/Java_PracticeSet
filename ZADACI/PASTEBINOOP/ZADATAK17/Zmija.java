package ZADACI.PASTEBINOOP.ZADATAK17;

public class Zmija extends DivljaZivotinja {

    public Zmija(String naziv, int brojNogu, String staniste) {
        super("Zmija", brojNogu, staniste);
    }


    @Override
    public  int brojNogu(){
        return 0;
    }

    public void oglasiSe(){
        System.out.println("ssss"
        );
    }

    @Override
    public boolean daLiSamOpasna() {
        return true;
    }
}
