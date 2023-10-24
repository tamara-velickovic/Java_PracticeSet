package ZADACI.domaci.cetvrti;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {


    //  Napraviti funkciju koja prima listu Stringova, neki String i proverava da li se taj String nalazi u listi.


    static boolean daLiSeNalaziUListi(ArrayList<String> lista, String s) {


        boolean daLiSeNalaziUListi = false;

        for (int i = 0; i < lista.size(); i++) {

            String item = lista.get(i);

            if (s.equalsIgnoreCase(item)) {

                daLiSeNalaziUListi = true;
                break;
            }
        }

        return daLiSeNalaziUListi;
    }


    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        lista.add("jabuka");
        lista.add("banana");
        lista.add("lubenica");
        lista.add("mandarina");
        lista.add("kivi");



        System.out.println(lista);


        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite item liste");
        String s = sc.next();



        boolean rezultat = daLiSeNalaziUListi(lista, s);

        System.out.println("Da li se nalazi u listi? -----> " +  rezultat);


    }





}
