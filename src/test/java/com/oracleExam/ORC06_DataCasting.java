package com.oracleExam;

public class ORC06_DataCasting {
    public static void main(String[] args){



        long x = 10;
        //int y = 2 * x; //Burada java hata veriyor
        /** SORU :
         * yukaridaki kod blogunda hangi degisiklikler yapilirsa kod calisir
         * A -> No change , it compiles as is
         * B -> Cast x online on line 9 to int
         * C -> Change the datatype of x on line 8 to short
         * D -> Cast 2 * x on line 9 to int
         * E -> Change datatype of y on 9 to short
         * F -> Change datatype of y on 9 to long
         */
        int y = 2 * (int)x;
        short xx =10;
        int yy = 2*xx;
        int yyy = (int) (2*x);
        long y1 = 2 * x;

        /**
         * casting : primitive ve sayisal data türlerini birbirine cevirmektir
         * byte , short , int , long , float, double
         * kücük esya büyük kaba otomatik olarak sigar
         *
         */
        byte sayi =15;
        short sayi2 = sayi;

        long sayi3 = 1500;
        double sayi4 = sayi3;

        int sayi5 = 150;
        short sayi6 = (short) sayi5;
        sayi5 = 500;
        byte sayi7  =  (byte) sayi5;

    }
}
