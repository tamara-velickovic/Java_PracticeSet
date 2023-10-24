package ZADACI.OOPZadaci.knjizara;

public class Knjiga   {

   private String naziv;
    private int brojStranica;

   private double cena;

   private Autor autor;

    int isbn;

    static int brojKnjiga= 0;

    public Knjiga(String naziv, int brojStranica, double cena, Autor autor) {

        brojKnjiga++;
        this.naziv = naziv;
        this.brojStranica = brojStranica;
        this.cena = cena;
        this.autor = autor;
        this.isbn = brojKnjiga;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojStranica() {
        return brojStranica;
    }

    public void setBrojStranica(int brojStranica) {
        this.brojStranica = brojStranica;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }


    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("Naziv: ").append(naziv);
        sb.append("Broj stranica:" ).append(brojStranica);
        sb.append("Cena: ").append(cena);
        sb.append("Autor: ").append(autor);
        sb.append("ISBN: ").append(isbn);


        return sb.toString(); }

  /*  ArrayList<Knjiga> ostaleKnjigeKojeJeAutorNapisao(string nazivKnjige) {

     ArrayList<Knjiga> ostaleKnjige = new ArrayList<>();


      for (Knjiga knjiga : autor.getKnjigeKojeJeNapisao()) {

          if (!knjiga.getNaziv().equals(nazivKnjige)) {
          ostaleKnjige.add(knjiga);
        }
        }

            return ostaleKnjige;
        } */



    }




        /* Metoda Knjiga:
            * - ArrayList<Knjige> ostaleKnjigeKojeJeAutorNapisao() <- vraca listu ostalih knjiga koje je autor ispisao */



