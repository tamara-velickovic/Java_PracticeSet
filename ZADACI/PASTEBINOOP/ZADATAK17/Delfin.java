package ZADACI.PASTEBINOOP.ZADATAK17;

public class Delfin extends DivljaZivotinja {

    public Delfin(String naziv, int brojNogu, String staniste) {
        super("Delfin", brojNogu, staniste);
    }


    @Override
    public  int brojNogu(){
        return 0;
    }

    public void oglasiSe(){
        System.out.println("<3"
        );
    }

    @Override
    public boolean daLiSamOpasna() {
        return false;
    }

    @Override

    public void pliva(){
        System.out.println("Ja plivam.");
    }

}
