package ZADACI.domaci.cetvrti;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {


    // Napraviti funkciju koja izbacuje svako pojavljivanje n u listi



    static void IzbaciUljeza (ArrayList<Integer> lista, int n) {

        for (int i = 0; i < lista.size(); i++) {

            int broj = lista.get(i);

            if (broj == n) {

                lista.remove(i);
                i--;

            }
        }


    }


    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(4);
        lista.add(8);
        lista.add(1);
        lista.add(12);
        lista.add(1);
        lista.add(16);
        lista.add(1);
        lista.add(1);



        System.out.println(lista);


        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite uljeza");
        int n = sc.nextInt();

        IzbaciUljeza(lista, n);

        System.out.println("Redukovana lista: " + lista);


    }
}





