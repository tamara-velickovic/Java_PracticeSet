package ZADACI.domaci.sedmi;

import java.util.ArrayList;
import java.util.List;

public abstract class Planinar {


    private String imePlaninara;

    private List<Planina> listaPlanina;

    private int maxVisina;

    //Getteri i Setteri

    public String getImePlaninara() {
        return imePlaninara;
    }

    public void setImePlaninara(String imePlaninara) {
        this.imePlaninara = imePlaninara;
    }

    public List<Planina> getListaPlanina() {
        return listaPlanina;
    }

    public void setListaPlanina(List<Planina> listaPlanina) {
        this.listaPlanina = listaPlanina;
    }

    public int getMaxVisina() {
        return maxVisina;
    }

    public void setMaxVisina(int maxVisina) {
        this.maxVisina = maxVisina;
    }


    //Konstruktori

    public Planinar(String imePlaninara, List<Planina> listaPlanina, int maxVisina) {
        this.imePlaninara = imePlaninara;
        this.listaPlanina = listaPlanina;
        this.maxVisina = maxVisina;
    }

    public Planinar() {
    }

    //Serilizacija


    @Override
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append("Ime planinara: ").append(imePlaninara).append("\n");
        sb.append("Max visina: ").append(maxVisina);
        sb.append("Planine na listi: ").append("\n");

        for (Planina p: listaPlanina) {

         sb.append(p.toString()).append("\n");

        }

        return sb.toString();

    }



    //Metode

    public void popniSe (Planina p) {

        if (p.getVisina() <= maxVisina && !(listaPlanina.contains(p))) {

            listaPlanina.add(p);
        }
    }

    public List<Planina> crnaLista (){

            List<Planina> crnaLista= new ArrayList<>();

            for(Planina p: listaPlanina) {

                if (p.getVisina() > maxVisina)
                    crnaLista.add(p);
            }

        return crnaLista;
        }

    public int ukupnoMetara (){

        int ukupnoMetara= 0;

     for(Planina p : listaPlanina) {

         if (p.getVisina()<= maxVisina) // razumela sam da na listi mogu da budu i planine na koje ne moze da se popne

         ukupnoMetara+= p.getVisina();

     }

       return ukupnoMetara;

    }





    }



   /* Kreirati apstraktnu klasu Planinar koja ima atribute za ime planinara, listu planina i maksimalnu visinu na koju planinar moze da se popne. Ova klasa takodje ima metode:
            -popniSe(Planina p) - Ukoliko planina nije previse visoka za planinara i nije u njegovoj listi, dodati je.
-crnaLista() - Vraca listu planina iz planinarovog spiska, na koje on ne moze da se popne.
-ukupnoMetara() - Vraca ukupnu visinu svih planina na koje se planinar popeo. */

    //Kreirati za date klase sve potrebne get i set metode, kao i konstruktore i toString.
