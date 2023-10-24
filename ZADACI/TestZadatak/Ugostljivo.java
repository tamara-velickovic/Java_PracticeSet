package ZADACI.TestZadatak;

import java.util.List;

public interface Ugostljivo {


    void usluzi(Osoba o); // Usluzava osobu o

    void usluziSve(List<Osoba> osobe); //Usluzava citavu listu osoba


    void usluziSve(Osoba ... osobe); //Prima promenjiv broj osoba




}
