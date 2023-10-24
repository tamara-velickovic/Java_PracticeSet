package ZADACI.domaci.peti;

import java.util.ArrayList;

public class Ucenik {


   private int id;
   private ArrayList<Predmet> listaPredmeta;
   private int godinaSkolovanja;

   private static int idBrojac = 0;

   //Getteri i Setteri

    public int getId() {
        return id;
    }


    public ArrayList<Predmet> getListaPredmeta() {
        return listaPredmeta;
    }

  /* public Predmet getPredmet(int i) {

       for (int j = 0; j < listaPredmeta.size(); j++) {

           return listaPredmeta.get(i);

       }


   } */



    public void setListaPredmeta(ArrayList<Predmet> listaPredmeta) {
        this.listaPredmeta = listaPredmeta;
    }

    public int getGodinaSkolovanja() {
        return godinaSkolovanja;
    }

    public void setGodinaSkolovanja(int godinaSkolovanja) {
        this.godinaSkolovanja = godinaSkolovanja;
    }




    //Konstruktori

    public Ucenik(ArrayList<Predmet> listaPredmeta, int godinaSkolovanja, int brojObjekataUcenik) {

        ;

        this.listaPredmeta = listaPredmeta; // Za svakog ucenika nova lista predmeta?
        this.godinaSkolovanja = godinaSkolovanja;
        this.id = ++idBrojac;
    }

    public Ucenik() {

        this.id= ++ idBrojac;
    }


    //Serilizacija




    @Override
    public String toString(){
     StringBuilder sb= new StringBuilder();
     sb.append("ID ucenika: ").append(this.id);
     sb.append("Godina skolovanja: ").append(godinaSkolovanja);
      sb.append("Lista predmeta: ");

      for (Predmet p: listaPredmeta)
            sb.append(p.toString()).append("\n");

      return sb.toString();



    }


    // izracunajProsek ocena iz svih predmeta

    public double izracunajProsek () {

     double prosek= 0.0;
     int sumOcena= 0;

        for (int i = 0; i <= listaPredmeta.size()-1 ; i++) { // 0 1 2 3 4 5

            Predmet predmet= listaPredmeta.get(i);
            int ocena= predmet.getOcena();

            if (ocena==1)
                return prosek=1.0;
            else
            sumOcena += ocena;

          //  sumOcena += getPredmet(i).getOcena(); -Imam metodu za dohvatanje predmeta na indexu
        }


       return prosek = (double) sumOcena / listaPredmeta.size();


    }






}
