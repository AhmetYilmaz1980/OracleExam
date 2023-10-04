package com.oracleExam.oca23_24_ArrayBinnarySearch;

import java.util.Arrays;

public class ORC23_24_ArrayBinnarySearch {
    public static void main(String[] args) {
        int[] random = {16,-41,112,10,-110};

        int x =10;
        int y = Arrays.binarySearch(random,x);
        // bnarysearch metodu ile bir degerin arrayin icinde olup olmadigina bakariz
        // Binary Search Tree sistemini kullair, Araayin ortasindaki degeri merkeze alir,
        // aranan deger kücükse soldan devam eder, büyükse sagdan devam eder.
        // Yalniz dikkar edilmesi gereken siralanmanin kücükten büyüge dogru yapilmis olmasidir
        System.out.println(y); // -1 olur cünku bulamaz. armaya 112 yi merkeze koyarak basla x 112 den kücük oldugu icin soda arar bulamaz

        /*
      A.  2
      B.  3
      C.  6
      D.  Sonuc belirlenemez.
      E.  Bir exception olusur
      F.  Kod calismaz.
     */


    // ikinci soru

        String[] fruits ={
                "banana",
                "apple",
                "pears",
                "grapes"
        };

        Arrays.sort(fruits); // Sort islemi yaptiinda kücükten büyüge siralama yacaktir
        for (int i = 0; i< fruits.length;i++)
            System.out.print(fruits[i]+", "); //Yazdirirken de sort a göre sirali yazdiracaktir
    }
    /*
        A) apple banana grapes pears
        B) pears grapes banana apple
        C) banana apple pears grapes
        D) Kod calismaz
     */

    }

