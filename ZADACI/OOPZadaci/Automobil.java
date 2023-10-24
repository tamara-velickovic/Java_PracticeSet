package ZADACI.OOPZadaci;

public class Automobil {


    private String marka;
    private String tip;
    private char boja;
    private int brojSedista;
    private int brojSasije;
    private double kubikaza;


    Automobil (String marka, String tip, char boja, int brojSedista, int brojSasije, double Kubikaza) {

        this.marka= marka;
        this.tip= tip;
        this.boja=boja;
        this.brojSedista=brojSedista;
        this.brojSasije= brojSasije;
        this.kubikaza= kubikaza;

    }

    Automobil () {

      marka= "Ford";
      tip= "Ka";
      boja= 'p';
      brojSedista= 4;
      brojSasije = 000;
      kubikaza=1.3;

    }


    public String getMarka (){
        return marka;
    }

    public String getTip () {
        return tip;
    }

    public char getBoja() {
        return boja;
    }

    public int getBrojSedista (){
        return brojSedista;
    }

    public int getBrojSasije() {
        return brojSasije;
    }

    public double getKubikaza() {
        return kubikaza;
    }

    public void setMarka (String novaMarka) {
        marka=novaMarka;
    }

    public void setTip (String noviTip){
        tip=noviTip;

    }

    public void setBoja (char novaBoja){
        boja=novaBoja;

    }

    public void setBrojSedista (int noviBrojSedista) {
        brojSedista=noviBrojSedista;

    }

    public void setKubikaza (double novaKubikaza) {
        kubikaza=novaKubikaza;
    }



    public String informacija() {
        String ret = "";
        ret += "Marka: " + marka + "\n";
        ret += "Tip: " + tip + "\n";
        ret += "Boja: " + boja + "\n";
        ret += "Broj sedista: " + brojSedista + "\n";
        ret += "Broj sasije: " + brojSasije + "\n";
        ret += "CC: " + kubikaza;
        return ret;
    }

    public boolean daLiSuIsti(Automobil a) {
        //Poredim svaki par atributa
        //poredim atribute od proslednjog automobila a sa this-om
        if (!this.marka.equalsIgnoreCase(a.getMarka()))
            return false;
        if (!this.tip.equalsIgnoreCase(a.getTip()))
            return false;
        if (this.boja != a.getBoja())
            return false;
        if (this.brojSedista != a.getBrojSedista())
            return false;
        if (this.brojSasije != a.getBrojSasije())
            return false;
        if (kubikaza != a.getKubikaza()) //nisam morao da koristim this uopste
            return false;
        return true;

        /*
         * Nismo morali da pisemo this.
         * jer java zna da su ovi atributi iz objekata nad kojim
         * pozivamo metodu jer su enkapsulirani i samo on moze da ih
         * vidi (tj. ne moze da direktno dobije atribute iz prosledjenog automobila)
         *
         * */
    }



}
