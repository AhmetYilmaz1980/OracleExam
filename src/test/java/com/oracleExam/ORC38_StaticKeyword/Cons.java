package com.oracleExam.ORC38_StaticKeyword;

public class Cons {
    public static int length = 0; // statik keyword ile olusturulan variable kalicidir, tüm sinifta aynidir,
                                 // ve bir degisiklik yapildiginda kalici olur. bundan dolayi:
                                // cons1 ve cons 2 obje lerinde yapilan atamalar sadece bulunduklari class da olmaz
                                // Cons classda da deger degisir

}
class ConsLength {
    static Cons cons1 = new Cons(); //Class da statik bir member var ise main methoddan önce o calisir
    static Cons cons2 = new Cons();

    static {
        System.out.print(cons1.length); // il yazdirilan STATIC block daki cons1.length olacaktir.
                                            // burada hic atama yapilmadigi icin ilk yapilan atama yazdirilir
    }

    public static void main(String[] args) {
        cons1.length = 2; // burada yapilan atama Cons class daki length variablenin degerini 2 yapar.
                        // Cünkü cons1 objesinin ici bos, bagli oldugu classdaki static olan length variablini
                        // degistiriyor
        cons2.length = 8; // burada cons2.length ile yapilan atama da Cons classdaki degeri 2 olan length variable 8 yapar
        System.out.println(cons1.length);
    }      // output 08

    /*
            A. 02
            B. 08
            C. 2
            D. 8
            E. Kod calismaz.
            F. Kod calisir ancak exception olusur.
             */
}
