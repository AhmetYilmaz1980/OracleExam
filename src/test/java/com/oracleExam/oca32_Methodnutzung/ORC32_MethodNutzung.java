package com.oracleExam.oca32_Methodnutzung;

public class ORC32_MethodNutzung {
    public static void addToInt(int x, int amountToAdd){
        x=x+amountToAdd; //X = 15 + 10 ; x = 25; olur
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        ORC32_MethodNutzung.addToInt(a,b);
        System.out.println(a); //15

         /*
        A. 10
        B. 15
        C. 25
        D. 5.satirdan dolayi kod calismaz
        E. 10.satirdan dolayi kod calismaz
        F. Yukaridakilerden hicbiri.
         */
    }
}