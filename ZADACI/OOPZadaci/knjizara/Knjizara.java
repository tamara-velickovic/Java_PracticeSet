package ZADACI.OOPZadaci.knjizara;

import ZADACI.OOPZadaci.Osoba;

import java.util.ArrayList;

public class Knjizara {

  private ArrayList<Knjiga> knjigeKojeSuNaStanju;
  private ArrayList<Osoba> zaposleni;
  private ArrayList<Autor> autoreKojeIzdaju;

  public Knjizara(ArrayList<Knjiga> knjigeKojeSuNaStanju, ArrayList<Osoba> zaposleni, ArrayList<Autor> autoreKojeIzdaju) {
    this.knjigeKojeSuNaStanju = knjigeKojeSuNaStanju;
    this.zaposleni = zaposleni;
    this.autoreKojeIzdaju = autoreKojeIzdaju;
  }

  public ArrayList<Knjiga> getKnjigeKojeSuNaStanju() {
    return knjigeKojeSuNaStanju;
  }

  public void setKnjigeKojeSuNaStanju(ArrayList<Knjiga> knjigeKojeSuNaStanju) {
    this.knjigeKojeSuNaStanju = knjigeKojeSuNaStanju;
  }

  public ArrayList<Osoba> getZaposleni() {
    return zaposleni;
  }

  public void setZaposleni(ArrayList<Osoba> zaposleni) {
    this.zaposleni = zaposleni;
  }

  public ArrayList<Autor> getAutoreKojeIzdaju() {
    return autoreKojeIzdaju;
  }

  public void setAutoreKojeIzdaju(ArrayList<Autor> autoreKojeIzdaju) {
    this.autoreKojeIzdaju = autoreKojeIzdaju;
  }

  public double ukupnaCena() {

    double ukupnaCena = 0.0;

    for (Knjiga knjiga : knjigeKojeSuNaStanju)
          ukupnaCena += knjiga.getCena();


    return ukupnaCena;

  }

  ArrayList<Knjiga> knjigeOdAutora(Autor a) {

    ArrayList<Knjiga> knjigeOdAutora = new ArrayList<>();

    for (Knjiga knjiga: knjigeKojeSuNaStanju) {
      if (knjiga.getAutor().equals(a))
          knjigeOdAutora.add(knjiga);

    }

      return knjigeOdAutora;
  }

  @Override
  public String toString() {
    StringBuilder sb= new StringBuilder();
    sb.append("Knjige na stanju: ").append(knjigeKojeSuNaStanju);
    sb.append("Zaposleni:" ).append(zaposleni);
    sb.append("Autori koje izdajemo: ").append(autoreKojeIzdaju);

    return sb.toString();

  }
}
