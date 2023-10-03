package com.oracleExam;

public class ORC30__Scope {

    private static int $;   // Klass düzeyinde variable, atanmasina da calismasinada müsade eder
                            // _ , $, ve harf ile baslanabilir

    public static void main(String[] args) {
        String a_b; // main method icinde lokal bir variable,
                    // atanmasina müsade eder , ama calismasina müsaade etmez
        System.out.println($);
       // System.out.println(a_b);

         /*
        A. 3.satirdan dolayi kod calismaz // Class adi 3. satirda _Scope oldugu icin  bu secenek var
        B. 4.satirdan dolayi kod calismaz
        C. 7.satirdan dolayi kod calismaz
        D. 8.satirdan dolayi kod calismaz
        E. 11.satirdan dolayi kod calismaz
        F. 0null
        G. nullnull
     */
    }
}
