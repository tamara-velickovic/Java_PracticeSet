package ZADACI.OOPZadaci.namirnice;

import java.util.ArrayList;

public class Prodavnica {

    private String ime;
    private ArrayList<Namirnice> namirnice;

   //Konstruktori


      // 1. Jedan koji prima sve argumente i Arraylistu namirnica duboko kopira

    public Prodavnica(String ime, ArrayList<Namirnice> namirnice) {
        this.ime = ime;
      //  this.namirnice = new ArrayList<Namirnice>();


       /* for (int i = 0; i < namirnice.size()-; i++) {

           for (Namirnice n: namirnice)
         n.getIme()= namirnice.getIme(i);

        }

        } */

   /* ArrayList<Namirnice> namirnice= new ArrayList<>();
        namirnice.add(n1);
        namirnice.add(n2);
        namirnice.add(n3);

        System.out.println(namirnice);

    //[jabuka | 50.0, jabuka | 50.0, kruska | 40.0] */

    }






   // 2. Jedan koji prima ime i postavlja Arraylistu na novu praznu ArrayListu.

    public Prodavnica(String ime) {
        this.ime = ime;
        this.namirnice= new ArrayList<>();

    }


    // 3. Jedan koji prima ime i niz Namirnica preko ...


    public Prodavnica(String ime, ArrayList<Namirnice> ... namirnice) {
        this.ime = ime;
        this.namirnice= new ArrayList<>();

    }




    //Getteri i Setteri

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public ArrayList<Namirnice> getNamirnice() {
        return namirnice;
    }

    public void setNamirnice(ArrayList<Namirnice> namirnice) {
        this.namirnice = namirnice;
    }


         //   1. dodajNamirnicu - koja dodaje namirnicu u listu namirnica

    public void dodajNamirnicu (Namirnice namirnica) {

        namirnice.add(namirnica);



    }


 //   2. ukoloniNamirnicu - koja uklanja namirnicu iz liste namirnica

    public void ukloniNamirnicu (Namirnice namirnica) {

        namirnice.remove(namirnica);


    }





  /*  Overridovati toString() metod na sledeci nacin:
            "Prodavnica <ime> ima sledece namirnice:
 <imeNamirnice1> | <cenaNamirnice1>
 ...
 <imeNamirniceN> | <cenaNamriniceN>" */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prodavnica ").append(ime).append(" ima sledece namirnice: ");
        for (Namirnice n : namirnice)
            sb.append(n.toString()).append("\n");


        return sb.toString();
    }



}
