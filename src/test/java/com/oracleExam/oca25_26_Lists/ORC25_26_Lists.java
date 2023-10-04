package com.oracleExam.oca25_26_Lists;

import java.util.ArrayList;
import java.util.List;

public class ORC25_26_Lists {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();

        list.add("one");
        list.add("two");
        //list.add(7);
        for (int i = 0; i<list.size();i++)//burada süslü parantez yok,
                                          // forLoop ta süslüparantez body yoksa
                                         //ilk noktali virgüle kadaki kismi body olarak kabul eder
            System.out.println(list.get(i));
    /*
        A. onetwo
        B. onetwo7
        C. onetwo yazar ve sonra exception olusur
        D. 12. Satirdan dolayi kod calismaz.
        E. 14. Satirdan dolayi kod calismaz.
         */

        //ikinci Soru

         ArrayList<Integer> values = new ArrayList<>();
         values.add(4);
         values.add(5);
         values.set(1,6);
         values.remove(0);
         for (int i = 0; i<values.size();i++){
             System.out.println(values.get(i));
         }

          /*
        A. 4
        B. 5
        C. 6
        D. 46
        E. 45
        F. exception olusur.
        G. Kod calismaz.

         */

    }
}
