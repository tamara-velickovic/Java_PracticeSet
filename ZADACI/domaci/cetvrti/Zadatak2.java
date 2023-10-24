package ZADACI.domaci.cetvrti;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {

    //   Napraviti funkciju koja prima listu celih brojeva i izbacuje iz nje sve elemente koji su deljivi sa 4.

    static void IzbaciBrojeveIzListe (ArrayList<Integer> lista) {

        for (int i = 0; i < lista.size(); i++) {

            int broj = lista.get(i);

            if (broj%4 == 0) {

                lista.remove(i);
                i--;

            }
        }


    }


    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(4);
        lista.add(8);
        lista.add(12);
        lista.add(1);
        lista.add(16);



        System.out.println(lista);

        IzbaciBrojeveIzListe(lista);

        System.out.println("Brojevi deljivi sa 4 izbaceni iz liste: " + lista);


    }
}