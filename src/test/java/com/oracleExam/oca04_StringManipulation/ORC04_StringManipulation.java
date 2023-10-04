package com.oracleExam.oca04_StringManipulation;

public class ORC04_StringManipulation {
    public static void main(String[] args){
        /**
         * 10. satira hangisi yazdirilirsa  konsolda "Equal" yazdirir
         */
        String str1 = "Java";
        String str2 = new String("java"); /** New keywordu ile olusturulan hersey yeni bir referans degeri alir
                                                    Alles, was mit dem "new" Schlüsselwort erstellt wird, erhält einen neuen Referenzwert
                                                */
        if( str2.equals(str1.toLowerCase()))
        {
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }

        /**
         *  A -> str1.toLowerCase(); --> str1'e atama olmadigi icin str1 kalici olarak degismez
         *                           --> Da keine Zuweisung zu str1 vorliegt, ändert sich str1 nicht dauerhaft.
         *                           --> Es ändert sich nur die aktuelle Zeile.
         *         if(str1==str2)    --> String'de == kullanmamayi tercih ederiz
         *                           --> Wir ziehen es vor, == nicht in String zu verwenden
         *                           --> String'de bunun yerine equals() metodunu kullaniriz
         *                           --> Für String verwenden wir stattdessen die Methode equal()
         *                           --> equals() metodu sadece icerige bakarken, == hem icerige hem referansa bakar.
         *                           --> Die Methode equal() betrachtet nur den Inhalt, während == sowohl den Inhalt als auch die Referenz betrachtet.
         *
         *  B ->if( str2.equals(str1.toLowerCase())) --> Önce parantez icerisine bakilir
         *                                           --> Schauen Sie zunächst in die Klammern
         *                                           --> equals() metodu icerik karsilastirir
         *                                           --> Die Methode equal() vergleicht den Inhalt

         C -> str1.toLowerCase();                    --> Deger atamasi olmadigi icin kalici degisiklik olmaz
                                                     --> Da es keine Wertzuweisung gibt, gibt es keine dauerhafte Änderung.
                if(str1.equals(str1.toLowerCase()))

         D ->  if(str1.toLowerCase()==str2.toLowerCase()) --> icerik ayni fakat == dan dolayi referans farkli oldugu icin false verir
                                                          --> Es gibt „false“ zurück, da der Inhalt derselbe ist, die Referenz jedoch aufgrund von == unterschiedlich ist
         */


    }
}
