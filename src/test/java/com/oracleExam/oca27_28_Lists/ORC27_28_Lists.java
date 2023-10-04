package com.oracleExam.oca27_28_Lists;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ORC27_28_Lists {
    public static void main(String[] args) {
        /**
         * Listin Arraye Arrayin Liste cevrilmesi
         */
        List<Integer> list = Arrays.asList(10, 4, -1, 5);
        Collections.sort(list);
        Integer array[] = list.toArray(new Integer[4]);
        System.out.println(array[0]);

     /*
        A. –1
        B. 10
        C. 10. Satirdan dolayi kod calismaz.
        D. 11. Satirdan dolayi kod calismaz.
        E. 12. Satirdan dolayi kod calismaz.
        F. Kod exception olusturur.
         */


        /*Ikinci soru
        String[] names = {"Tom","Dick","Harry"};
        List<String> list1 = nnames.asList();
        list.set(0,"Sue");
        System.out.println(names[0]);
        Cevap D,

        /*
        A. Sue
        B. Tom
        C. 29. Satirdan dolayi kod calismaz.
        D. 30. Satirdan dolayi kod calismaz.
        E. Kod exception olusturur.

         */
        //Calisir hali
        String[] names = {"Tom","Dick","Harry"};
        List<String> list1 = Arrays.asList(names);
        list1.set(0,"Sue");
        System.out.println(names[0]);



    }
}
