package com.oracleExam;

public class Or02_Ternary {
    public static void main(String[] args){

        int x = 5;

        System.out.println(x>4? x<4 ? 10 : 8 : 7);
        /**
         * Ana döngü ilk soru isareti ile son iki nokta  arasidir. arasindaki ? öncesi true ise calisacak alan
         * Die Hauptschleife liegt zwischen dem ersten Fragezeichen und den letzten beiden Punkten.
         * zwischen ? Wenn das Vorherige zutrifft, ist es das Feld, an dem gearbeitet werden muss
         */

        int sayi = 20;
        if (sayi%2==0){
            System.out.println("sayi cift bir sayidir");
        }else {
            System.out.println("sayi tek bir sayidir");
        }

        System.out.println(sayi%2==0 ? "sayi cifttir" : "sayi tektir");

    }




}
