package ZADACI.OOPZadaci.studije;

import java.util.ArrayList;
import java.util.List;

public abstract class Departman {

    private List<Student> listaStudenta;

    private String naziv;


    //Konstruktori
    public Departman(List<Student> listaStudenta, String naziv) {
        this.listaStudenta = listaStudenta;
        this.naziv = naziv;
    }

    public Departman() {
    }

    //Getteri i Setteri

    public List<Student> getListaStudenta() {
        return listaStudenta;
    }

    public void setListaStudenta(List<Student> listaStudenta) {
        this.listaStudenta = listaStudenta;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    //Pomocne metode


    //Metode

    public List<Student> vredni(int prosek) {

        List<Student> vredni = new ArrayList<>();


        return vredni;

        // Metoda koja vraca listu Studenata koji imaju veci prosek od prosledjenog
    }


    public double prosekSvih(){

        double sum=0;


        for(Student s: listaStudenta)
            sum+= s.prosek();

        return sum/(double) listaStudenta.size();

        // Metoda koja vraca prosek svih Studenata sa Departmana

        }



    public abstract double finansije();







}










