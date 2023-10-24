package ZADACI.domaci.cetvrti;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {


    //  Napraviti funkciju koja kreira i vraca listu od 30 parnih brojeva.


    static ArrayList<Integer> kreirajListuParnihBrojeva () {

        ArrayList<Integer> listaParnih = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite 30 parnih brojeva:");

        while (listaParnih.size()<30) {

            int broj= sc.nextInt();

            if (broj%2== 0)
                listaParnih.add(broj);

            else
                System.out.println("Uneti broj nije paran.");
        }

        return listaParnih;

    }

    public static void main(String[] args) {

        ArrayList<Integer> listaParnih = kreirajListuParnihBrojeva();


        System.out.println("Lista parnih brojeva: ");

        System.out.print(listaParnih);

    }




}