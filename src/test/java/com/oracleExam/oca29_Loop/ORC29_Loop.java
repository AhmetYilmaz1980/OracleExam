package com.oracleExam.oca29_Loop;

public class ORC29_Loop {
    public static void main(String[] args) {
        int sayi = 0;
        int sum = 0;
        for (sayi = 3; sayi>1; sayi/=sayi++) // True oldugu icin döngüye girer,
                                             //birinci döngüden geldiginde sayi / sayi =1
                                              // önce atama yapip artirim yapmadan karsilastirma yapar
                                              // 1>1 False oldugu icin ikinci döngüye girmeeeezzz
            sum+=sayi;    //Sum += sayi = 3 olur
        System.out.println(sum); // 3
        /*
            A. sonsuz loop olusur
            B. 1
            C. 3
            D. 8.satirdan dolayi kod calismaz
            E. Kod calistirilirsa exception olusur
         */

        //Ikinci Soru

    }
}
