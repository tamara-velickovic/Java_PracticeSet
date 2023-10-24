package ZADACI.OOPZadaci.studije;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Integer> listaOcena= new ArrayList<>();
        listaOcena.add(10);
        listaOcena.add(10);
        listaOcena.add(10);

        Student s1= new Student("Tamara", listaOcena,4 ) ;

        System.out.println(s1);





    }



}
