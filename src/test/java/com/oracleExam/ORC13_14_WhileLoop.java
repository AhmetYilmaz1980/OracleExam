package com.oracleExam;

public class ORC13_14_WhileLoop {
    public static void main(String[] args) {
        int x = 0;
        // while (x++<10){}
        //  String message = x> 10 ? "Greater than" : false; Bu satirdan dolayi kod calismaz
        //System.out.println(message + x);

        /**
         * A. Greater than, 10
         * B. false, 10
         * C. Greater than, 11
         * D. false,11
         * E. 6. Satirdan dolayi kod calismaz
         * F. 7. Satirdan dolayi kod calismaz
         */

        while (x++ < 10) {
        } //Önce sarti kontrol eder sonra artirir
        // 0 < 10 -> T x = 1
        // 1 < 10 -> T x = 2
        // 2 < 10 -> T x = 3
        // ..
        // ..
        // 9 < 10 -> T x = 10
        // 10 < 10 -> F x = 11

        String message = x > 10 ? " Greater than" : "Sart yanlis";
        System.out.println(message + "," + x); //Greater than,11 yazdirir


        // 2: Frage

        int x1 = 1, y = 15;
       //  while x < 10  parantes olmadigi icin boolean deger olarak algilamadigi icin hata verip calismaz
            y--; //
            x1++;//

        int x2 = 1, y2 = 15;
        while (x<10) // burada body süslü parantes olmadigi icin ilk noktali virgülü body olarak kabul eder. y yi bir eksiltir
                    // fakat x i artirma islemi yapmayacagindan sonsuz döngüye girer
            y--;
        x++;


    }


}
