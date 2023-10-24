package ZADACI.OOPZadaci.studije;

import java.util.List;

public class Student {

    private String ime;

    private List<Integer> listaOcena;

    int trenutnaGodinaStudija;


    // Konstruktori
    public Student(String ime, List<Integer> listaOcena, int trenutnaGodinaStudija) {
        this.ime = ime;
        this.listaOcena = listaOcena;
        this.trenutnaGodinaStudija = trenutnaGodinaStudija;
    }

    //Probati da radi unosa ocena listaOcena= new ArrayList<>();

    public Student() {
    }


    //Getteri i Setteri

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public List<Integer> getListaOcena() {
        return listaOcena;
    }

    public void setListaOcena(List<Integer> listaOcena) {
        this.listaOcena = listaOcena;
    }

    public int getTrenutnaGodinaStudija() {
        return trenutnaGodinaStudija;
    }

    public void setTrenutnaGodinaStudija(int trenutnaGodinaStudija) {
        this.trenutnaGodinaStudija = trenutnaGodinaStudija;
    }


    //Prosek svih ocena studenta

    public double prosek() {

    double sum=0;

        for (int i = 0; i <= listaOcena.size()-1; i++) {

            sum+= listaOcena.get(i);

        }

        double prosek= sum/ (double) listaOcena.size();


    return prosek;
    }


    //Serilizacija


    @Override
    public String toString() {
    StringBuilder sb= new StringBuilder();
    sb.append("Ime studenta ").append(ime).append("\n");
    sb.append("Trenutna godina studija: ").append(trenutnaGodinaStudija).append("\n");
    sb.append("Lista ocena: ");

       for (int ocena: listaOcena)
           sb.append(ocena).append(" | ");

    sb.append("\n").append("Prosek: ").append(prosek()).append("\n");

    return sb.toString();

    }
}
