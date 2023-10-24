package ZADACI.pastebinZadaci.IDeo.Hard;

public class Zadatak27 {
    public static void main(String[] args) {

        //  27.* Izracunati sumu povrsina svih kvadrata koji imaju celobrojne stranice cija je duzina manja od 200.


            // P= a^2   a<200 sum(P)


        double povrsina= 0;
        double sum= 0;

        for (int a = 1; a < 200; a++) {

            povrsina= Math.pow(a,2);
            sum+= povrsina;
           // System.out.println("Povrsina za a=" + a + "  : " + povrsina);
           // System.out.println("Trenutni zbir povrsina: " + sum);
        }

        System.out.println(sum);





    }
}
