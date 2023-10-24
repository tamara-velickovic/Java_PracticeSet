package ZADACI.DopunskiZadatak;

import java.util.ArrayList;
import java.util.List;

public abstract class TrzniCentar implements Usluge {

 /*   Napraviti klasu TrzniCentar koja ima listu prodavnica i sledece metode:
            -ukupnaZarada() - vraca ukupnu zaradu Trznog centra iz svih prodavnica
            -najskuplji() - vraca najskuplji artikl u celoj prodavnici


              Klasa TrzniCentar implementira interfejs Usluge. */

    private String naziv;

    private List<Prodavnica> prodavnice;

    //Konstruktori

    public TrzniCentar(List<Prodavnica> prodavnice, String naziv) {
        this.prodavnice = prodavnice;
        this.naziv=naziv;
    }

    public TrzniCentar() {
        this.prodavnice = new ArrayList<>();
        this.naziv="Trzni centar";
    }

    //Getteri i Setteri

    public List<Prodavnica> getProdavnice() {
        return prodavnice;
    }

    public void setProdavnice(List<Prodavnica> prodavnice) {
        this.prodavnice = prodavnice;
    }


    //Serilizacija

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("Lista prodavnica: ").append("\n");

        for (Prodavnica p: prodavnice)
            sb.append(p.toString());


        return sb.toString();
    }

    //Implementacija metoda

     //dodeljuje 20% popusta na sve artikle u svim prodavnicama


    @Override
    public void masovniPopust(){

       for(Prodavnica p: prodavnice ) {

           for (Artikl a: p.getArtikli()) {

               a.setCena(a.getCena()* 0.8);

           }

       }
    }



    // vraca prodavnicu u kojoj se nalazi dati artikl

    @Override
    public Prodavnica nalaziSe (Artikl a) {


        for (Prodavnica p : prodavnice) {

            for (Artikl artikl : p.getArtikli()) {

                if (artikl.equals(a))
                    return p;

            }

        }
        return null;
    }


    //eleminisi(Artikl a) - izbacuje dati artikl iz ponude


    @Override
    public void eleminisi(Artikl a){

        for (int i = 0; i < prodavnice.size(); i++) {

            for (int j = 0; j < prodavnice.get(i).getArtikli().size(); j++) {

                if (prodavnice.get(i).getArtikli().get(j).equals(a)){

                    prodavnice.get(i).getArtikli().remove(prodavnice.get(i).getArtikli().get(j));

                }
            }

        }




    }


    //Metode

    public double ukupnaZarada () {

     double sum= 0.0;

     for (Prodavnica p: prodavnice)
         sum += p.zarada();

     return sum;

    }



     public Artikl najskuplji() {

    Artikl najskuplji= new Artikl();

    for (Prodavnica p: prodavnice) {

        for (Artikl a : p.getArtikli()) {
            if (a.getCena() > najskuplji.getCena())
                najskuplji = a;

        }


    }
        return najskuplji;
    }


    public void izlistaj() {

     for (Prodavnica p: prodavnice) {
         for (Artikl a: p.getArtikli()){

             System.out.println(a);

         }



     }



    }




    //ukupnaZarada() - vraca ukupnu zaradu Trznog centra iz svih prodavnica
      //najskuplji() - vraca najskuplji artikl u celoj prodavnici


}
