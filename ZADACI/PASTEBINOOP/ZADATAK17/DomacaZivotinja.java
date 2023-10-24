package ZADACI.PASTEBINOOP.ZADATAK17;

public abstract class DomacaZivotinja extends Zivotinja {

    private String ime;
    private double kilaza;
    private int brojNogu;


    //Konstruktori

    public DomacaZivotinja(String naziv, String ime, double kilaza, int brojNogu) {
        super(naziv);
        this.ime = ime;
        this.kilaza = kilaza;
        this.brojNogu = brojNogu;
    }



    public DomacaZivotinja() {

    }


    //Getteri i Setteri

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getKilaza() {
        return kilaza;
    }

    public void setKilaza(double kilaza) {
        this.kilaza = kilaza;
    }

    public int getBrojNogu() {
        return brojNogu;
    }

    public void setBrojNogu(int brojNogu) {
        this.brojNogu = brojNogu;
    }

    //Apstraktni metodi
    public abstract boolean daLiSeJedem() ;


    //Overrideovani metodi


    @Override
    public void leti(){

           System.out.println("Ja ne mogu da letim. ");

    }


    @Override
    public void pliva(){

            System.out.println("Ja ne plivam. ");

    }

    @Override
    public boolean daLiJeDomaca() {
        return true;
    }





     /*   Napisati abstraktne metode:
            1. void leti() koja ispisuje poruku:
            "Ja letim"; ukoliko zivotinja moze da leti
 "Ja ne mogu da letim"; inace
2. void pliva() koja ispisuje poruku:
            "Ja plivam"; ukoliko zivtonja iskljucivo pliva
 "Ja ne plivam"; inace
3. int brojNogu() koja vraca broj nogu zivotinje
4. boolean daLiJeDomaca() koja vraca odgovor na pitanje da li je zivotinja domaca ili ne
5. void oglasiSe() - koja ispisuje onomatopeju koja ta zivotinja izgovara.
            (pas -> "woof"
    macka -> "nyaa"
    konj -> "pfff"
    ovca -> "bmee"
    krava -> "muuu"
    lav -> "roar"
    kokoska -> "kukuriku"
    zmija -> "ssss"
    delfin -> "<3") */










}
