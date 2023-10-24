package ZADACI.OOPZadaci.knjizara;

import ZADACI.OOPZadaci.Osoba;

import java.util.ArrayList;

public class Autor extends Osoba {

     private ArrayList<Knjiga> knjigeKojeJeNapisao;


    public ArrayList<Knjiga> getKnjigeKojeJeNapisao() {
        return knjigeKojeJeNapisao;
    }

    public void setKnjigeKojeJeNapisao(ArrayList<Knjiga> knjigeKojeJeNapisao) {
        this.knjigeKojeJeNapisao = knjigeKojeJeNapisao;
    }

    public Autor (String ime, String prezime, int brojGodina, ArrayList<Knjiga> knjigeKojeJeNapisao) {

        super(ime, prezime, brojGodina);
        knjigeKojeJeNapisao = new ArrayList<Knjiga>();

    }


        public int brojKnjigaKojeJeNapisao() {
            return knjigeKojeJeNapisao.size();
        }

        public void ispisKnjiga (){

        StringBuilder sb = new StringBuilder();
        sb.append("Knjige koje je napisao: ").append(knjigeKojeJeNapisao);

        }


        @Override
        public String toString() {
           StringBuilder sb= new StringBuilder();
           sb.append(super.toString()).append("\n");
           sb.append("Knjige koje je napisao: ").append(knjigeKojeJeNapisao);

            return sb.toString();


        }


    }






