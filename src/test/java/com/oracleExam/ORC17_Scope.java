package com.oracleExam;

public class ORC17_Scope {
    public static void main(String[] args) {
       /** do {
            int y = 1;
            System.out.println(y++ + " ");
        }while (y<=10);
        bu satirdan dolayi Kod calismaz Cünkü Loop icerisinde
        olusturulan bir Variable sadece o loopta kullanilabilir
        Der Code funktioniert aufgrund dieser Zeile nicht,
        da eine in der Schleife erstellte Variable nur in dieser Schleife verwendet werden kann.


        /*
        A. 1 2 3 4 5 6 7 8 9
        B. 1 2 3 4 5 6 7 8 9 10
        C. 1 2 3 4 5 6 7 8 9 10 11
        D. 10. Satirdan dolayi kod calismaz.
        E. Kod sonsuz bir donguye girer.
        */



        int y;
        do {
            y = 1;
            System.out.println(y++ + " ");
        }while (y<=10);  /**
         Burada y loop disinda olusturuldugu icin kod calisir
         */
    }


}
