package ZADACI.pastebinZadaci.IIIDeo;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadaci1do12 {

    public static void main(String[] args) {


        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(50);
        lista.add(100);


      //  duplirajElemente(lista);
       // IspisiElementeListe(lista);

        ArrayList<Double> lista1 = new ArrayList<>();
        lista1.add(10.0);
        lista1.add(20.0);
        lista1.add(30.0);
        lista1.add(50.0);
        lista1.add(100.0);

        ArrayList<Double> lista2 = new ArrayList<>();
        lista2.add(10.0);
        lista2.add(20.0);
        lista2.add(30.0);
        lista2.add(50.0);
        lista2.add(105.0);

      //  System.out.println(DaLisuListeIste(lista1,lista2));


      //  System.out.println(NajveciElement(lista));

        ArrayList<Integer> newlista = new ArrayList<>();
        newlista.add(10);
        newlista.add(20);
        newlista.add(30);



       // ArrayList<Integer> nadovezana = nadoveziListe(newlista, lista);
       // System.out.println(nadovezana);


      //  System.out.println(sumElemenata(newlista));
       // System.out.println(proizvodElemenata(newlista));

       // System.out.println(neparniBrojevi(newlista));

       // System.out.println(prosekListe(newlista));

        ArrayList<String> s = new ArrayList<>();
        s.add("Tamara");
        s.add("Milica");
        s.add("Aleksandra");

       // System.out.println(najduziElement(s));

        ArrayList<Integer> al = UnesiDoNule();
        System.out.println(al);

    }
       // 1. Napisati fukciju koja prima ArrayListu integera i ispisuje sve njene elemente.


            public static void IspisiElementeListe (ArrayList<Integer> lista){

                System.out.println(lista);

            }



       // 2. Napisati funkciju koja prima ArrayListu integera i vraca ArrayListu ciji su elementi duplirani u odnosu na
       // proslednjenju ArrayListu.



            public static void duplirajElemente (ArrayList<Integer> lista) {

                int duzinaListe = lista.size();

                for (int i = 0; i < lista.size() ; i++) {

                    int broj = lista.get(i);
                    lista.set(i, broj*2);
                }



            }



       // 3. Napisati funkciju koja proverava da li su dve double ArrayListe potpuno iste.


            public static boolean DaLisuListeIste (ArrayList<Double> lista1, ArrayList<Double> lista2) {

                    boolean daLiSuListeIste = false;

                if (lista1.size() == lista2.size()) {

                    for (int i = 0; i < lista1.size(); i++) {

                       double element = lista1.get(i);
                       if (element != lista2.get(i)) {

                           daLiSuListeIste= false;
                           break;
                       }

                       else daLiSuListeIste= true;

                    }

                }
                    else daLiSuListeIste= false;


                    return daLiSuListeIste;

            }




      //  4. Napisati funkciju koja vraca najveci element iz ArrayListe.


        static int NajveciElement (ArrayList<Integer> lista){

                int najveciElement= Integer.MIN_VALUE;

            for (int i = lista.size()-1; i >=0 ; i--) {

                najveciElement= Math.max(najveciElement, lista.get(i));

            }


            return najveciElement;



        }





      //  5. Napisati funkciju koja vraca drugi najmanji element iz ArrayListe. (Pretpostaviti da ce prosledjena ArrayLista uvek da ima barem 3
       // elemenata).




      //  6.* Napisati funkciju koja trazi najveci element medju tri ArrayListe.


    static int NajveciElement (ArrayList<Integer> lista1,ArrayList<Integer> lista2,ArrayList<Integer> lista3){

        int najveciElement= Integer.MIN_VALUE;

        for (int i = lista1.size()-1; i >=0 ; i--) {

            najveciElement= Math.max(najveciElement, lista1.get(i));

        }

        for (int i = lista2.size()-1; i >=0 ; i--) {

            najveciElement= Math.max(najveciElement, lista2.get(i));

        }

        for (int i = lista3.size()-1; i >=0 ; i--) {

            najveciElement= Math.max(najveciElement, lista3.get(i));

        }

        return najveciElement;


        //Ili moze se i objediniti ovako:

       /* int najveciElement = Integer.MIN_VALUE;

        for (ArrayList<Integer> lista : liste) {
            for (int broj : lista) {
                if (broj > najveciElement) {
                    najveciElement = broj;
                }
            }
        } */



    }




      //  7. Napisati funkciju koja prima dve ArrayListe i vraca listu dobijenu nadovezivanjem druge liste na prvu.


    static ArrayList<Integer> nadoveziListe (ArrayList<Integer> lista1, ArrayList<Integer> lista2) {


            //MOZE DA SE KORISTI I ADDALL
        ArrayList<Integer> novaLista = new ArrayList<>();

        for (Integer element : lista1) {

            novaLista.add(element);

        }

        for (Integer element2 : lista2) {

            novaLista.add(element2);

        }


        return novaLista;


    }



      //  8. Napisati funkciju koja vraca zbir svih elemenata iz ArrayListe.

    static int sumElemenata (ArrayList<Integer> lista) {

       int sum= 0;

        for (Integer element: lista){


            sum+= element;



        }



        return sum;



    }





     //   9. Napisati funkciju koja vraca proizvod svih elemenata uvecanih za 3 iz ArrayListe.


    static int proizvodElemenata (ArrayList<Integer> lista) {

        int proizvod = 1;

        for (Integer element : lista) {

            element += 3;
            proizvod *= element;


        }


        return proizvod;
    }


      //  10. Napisati funkciju koja vraca sve neparne brojeve iz ArrayListe.



        static ArrayList<Integer> neparniBrojevi (ArrayList<Integer> lista){

           ArrayList<Integer> neparni = new ArrayList<>();

            for (Integer element:lista){

                if (element%2 != 0)
                    neparni.add(element);

            }



            return neparni;


        }




     //   11. Napisati funkciju koja vraca prosecnu vrednost iz ArrayListe.


            static double prosekListe (ArrayList<Integer> lista) {

            int sum= 0;

            for(Integer element: lista){

                sum+= element;

            }

            int brojElemenata= lista.size();

            double prosek = (double) sum / (double) brojElemenata;

            return prosek;

            }


     //   12. Napisati funkciju koja vraca najduzi String iz ArrayListe Stringova.


            static String najduziElement (ArrayList<String> s) {

                int najduzi= 0;
                String najduziElement= "";

            for (String element : s){

                if( element.length() > najduzi){

                    najduziElement= element;
                }




            }


            return najduziElement;



            }



        //ZADATAK SA PREDAVANJA
    public static ArrayList<Integer> UnesiDoNule (int ... x) {


        ArrayList<Integer> lista = new ArrayList<>();

        Scanner sc= new Scanner(System.in);

        System.out.println("Unesite broj:");
        int broj= sc.nextInt();

        while (broj !=0) {

            lista.add(broj);
            broj= sc.nextInt();

        }

        return lista;


    }



}



































