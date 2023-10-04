package com.oracleExam.oca05_Nullpointer;

public class ORC05_NullPointer {
    public static void main(String[] args) {
        /** Soru :
         * int x = 0;
         String s = null;
         if(x==s){System.out.println("Success");}
         else {System.out.println("Failure");}

         Kod blogunda Output nedir? Was ist Ausgabe im Code-Blog?
         A ) Success
         B ) Failure
         C ) The code will not compile because of line 8
         **    D ) The code will not compile because of line 10
         */


        /*int sayi = null;
        boolean bl = null;
        ptimitive data türleri icin nullPointer kullanilamaz.
        Null pointer können nicht für primitive Datentypen verwendet werden.
         */

        //non-primitive tüm data türlerinde null-Pointer kulanilabilir
        //Null-Point können in allen nicht-primitiven Datentypen verwendet werden.
        Integer sayi = null;
        Boolean bl = null;

        String str1; //--> Stack memori de referans olusur, deger atamasi olmadigi icin Heap memoride hicbirsey olusmaz
                     //--> Im Stapelspeicher wird eine Referenz erstellt, aber da keine Wertzuweisung erfolgt, w
                     // ird im Heap-Speicher nichts erstellt.
                    // Deger atamasi yapilmadigindan yazdirilamaz
                    // Der Ausdruck ist nicht möglich, da keine Wertzuweisung erfolgt ist.
        String str2 = new String(); //--> atama oldugu icin hem referans olusturuldu hem de Heap memoride obje olusturuldu, deger atanmadigi icin bos bir obje olustu
                                    //--> Da es sich um eine Zuweisung handelte, wurde sowohl eine Referenz als auch ein Objekt im Heap-Speicher erstellt.
                                    // Da kein Wert zugewiesen wurde, wurde ein leeres Objekt erstellt.
                                    // atama yapildigi icn bosluk yazdirir
                                    // Es wird ein Leerzeichen gedruckt, da die Zuweisung erfolgt ist
        String str3 = ""; // Atamada var deger verme de var, burada atanan  deger  hiclik degeri
                          //Es gibt eine Zuordnung und es gibt auch eine Bewertung. Der hier zugewiesene Wert ist der Wert des Nichts.
                          // / atama yapildigi icn bosluk yazdirir
        //                // Es wird ein Leerzeichen gedruckt, da die Zuweisung erfolgt ist
        String str4 = null; // Burada referans olusuyor pointer olusuyor ama obje olusmuyor
                            // Hier wird eine Referenz erstellt, ein Zeiger erstellt, aber kein Objekt erstellt.
                            // NULL atamasi yapilan String yazdirildiginda NULL yazdirir.Bu bir String degil, sadece NULL atandigini gösterir
                            //Die NULL zugewiesene String gibt beim Drucken NULL aus,Dies ist kein String, sondern zeigt lediglich an, dass NULL zugewiesen ist


        /**
         * Bu dört String atama acisindan ayni durumdadir
         * Diese vier Strings sind hinsichtlich der Zuordnung gleich
         * hepsine yeni deger atanabilir, ve yeni hali kullanilabilir
         * Allen kann ein neuer Wert zugewiesen und die neue Version verwendet werden.
         */

        /**
         * STACK Memoride sadece refaransi koyuyor, Objenin kendisi de HEAP MEMORi'de oluyor
         * STACK legt nur die Referenz im Speicher ab, das Objekt selbst befindet sich im HEAP MEMORI.
         */
        System.out.println(str4.length());// str4 icin nullPointerException verir












    }
}
