package com.oracleExam;

public class ORC03_SwitchCase {
    public static void main(String[] args) {
        final char a = 'A', d = 'D'; // final keyword variable nin son degerini belirler
                                     //Das Schlüsselwort final bestimmt den Endwert der Variablen
        char grade = 'B';

        /**
         * Switch parantezinin icinde boolean, long , double, float yer alamaz.
         * Boolean, long, double, float dürfen nicht im Klammen von Switch platziert werden.
         */

        switch (grade) {
            case a: /**normalde burada variable adi yazilamaz, final keyword oldugu icin yazilabildi
                    //Normalerweise kann der Variablenname hier nicht geschrieben werden, aber er könnte geschrieben werden,
                    // da es sich um das final Schlüsselwort handelt.
                    */
            case 'B':
                System.out.print("great"); /**burada eslesme saglanigi icin "great" yazdirir
                                           //Hier wird „great“ gedruckt, um eine Übereinstimmung sicherzustellen.
                                          //  "break" görünceye kadar calismaya devam eder
                                          //Es läuft weiter, bis es „break“ sieht. */
            case 'C':
                System.out.print("good");
                break;  /** break oldugu icin burada "good" yazdirip döngüden cikar
                        //Da es „break“ ist, gibt es hier „good“ aus und verlässt die Schleife.
                       // println olmadigi icin yanyana yazar// "greatgood"
                       //Da kein println vorhanden ist, wird nebeneinander geschrieben */
            case d:
            case 'F':
                System.out.print("not good");
        }


    }
}
