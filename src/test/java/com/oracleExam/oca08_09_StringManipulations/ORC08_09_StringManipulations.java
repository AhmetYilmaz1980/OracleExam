package com.oracleExam.oca08_09_StringManipulations;

public class ORC08_09_StringManipulations {
    public static void main(String[] args){

        String numbers = "012345678";
        System.out.println(numbers.substring(1, 3)); // 12// ilk index (dahil) den son index(haric)e kadar
        System.out.println(numbers.substring(7, 7)); // A blank line
        System.out.println(numbers.substring(7)); // 78 // 7. indexten sona kadar
        /*
        A. 12
        B. 123
        C. 7
        D. 78
        E. A blank line
        F. An exception is thrown
        G. The code does not compile
         */

        String s = "purr";
        s.toUpperCase(); // --> PURR atama olmadigi icin s'nin degeri degismez.
                        //Da keine Zuweisung erfolgt, ändert sich der Wert von s nicht.
        s.trim();// bastaki ve sondaki bosluklari siler. bosluk olmadigi icin degisiklik olmaz.
                //Löscht führende und nachfolgende Leerzeichen. Da es keine Lücke gibt, gibt es keine Änderung.
        s.substring(1,3);// --> PURR atama olmadigi icin s'nin degeri degismez.
        //Da keine Zuweisung erfolgt, ändert sich der Wert von s nicht.

        s +=" two"; // burada s degiskenine " two" eklenir s= "purr two" olur
                    //Hier wird „ two“ zur s-Variablen hinzugefügt und s= „purr two“
        System.out.println(s.length());// length ölcme oldugu icin direk 1 den baslar, index sifirdan baslar
        //Da es sich um eine (length) Längenmessung handelt, beginnt sie direkt bei 1 und der Index beginnt bei Null.

        // Output ist s.length = 8


    }
}
