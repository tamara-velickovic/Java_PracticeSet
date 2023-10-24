package ZADACI.OOPZadaci.geometrija;

public class Trougao extends Geometrija2D {


    // Stranice
    private double x;
    private double y;

    private double z;
    private int a;
    private int b;

    private int c;


    //Konstruktori


    // Trougao sa decimalnim vrednostima

    public Trougao(double x, double y, double z) {

        //X+Y>Z  X+Z>Y Y+Z>X

        if ((x + y > z) && (x + z > y) && (y + z > x)) {

            if (x > 0) this.x = x;

            if (y > 0) this.y = y;

            if (z > 0) this.z = z;


        }

        //Jednakostranicni
        //Jednakokraki
        // Nepravi


        // Getteri i Setteri


    }

}


