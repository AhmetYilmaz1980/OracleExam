package com.oracleExam.ORC39_StaticBlock;

public class Order {
    /**
     * 1. calisak satir Static Bloktur Value ya a ekler = value = ta
     * 2. calisacak satir main methoddur
     * 3. calisacak satir order objesinin olusturuldugu satir
     * 4. calisacak satir normalde parametreli obje olusturuldugu icin Contruktor2 devreyegirmesi
     *    gerekirdi, ama static olmayan  blok oldugu icin obje olusturulurmadan önce statick olmayan Blok calisir
     *    Value +="c"; calisinca Value = tac olur
     * 5. Calisacak satir Construktor2 dir.
     * 6. calisacak satirda valuye s variablenin  degerini (f) ekliyor value = tacf
     * 7. calisacak Satirda m nin degerini k yapiyor
     * 8. calisacak Satirda constructorun sonuna geldigi icin basa dönecek main method a
     * 9. calisacak Satirda objenin degerini degistiriyor degeri degisince java yeni bir obje olusturur , ,
     * yeni olusan objede instance variable m nin degeri bastaki degerine döne m olur
     *  !! bu objeyi olusturmak icin parametresiz Contructor calisacak
     * 10. calisacak satir, ama burada static olmayan blok obje olusmadan yeniden calisacaktir ve value degerine  c ekleyecek
     *     value tacfc olacak
     * 11. calisacak satir : Constructor calisacak
     * 12. calisacak satir : m nin degerini h olarak atadi
     * 13. calisacak satir : value ye b ekleyecek tacfcb olacak
     * 14. satir constructorun sonu geldigimiz yere dönüyoruz 9. un altina
     * 15. Satir System.out.println(order.value + order.m); calistirir output tacfcbh
     *
     *
     */
    String m = "m";             // Instance Variable
    static String value = "t";  // Static Variable
    static {value +="a";}       //Static Blok            1.Satir
    {value +="c";}              //Static olmayan Blok    4.Satir // 10.Satir
    public Order(){             // CONSTRUCTOR 1        11. Satir
        m="h";                                          //12.Satir
        value +="b";                                    //13. Satir
    }                                                   //14.Satir
    public Order(String s){     // CONSTRUCTOR 2        5.Satir
        value += s;                                     //6.Satit
        m = "k";                                        //7.Satir
    }                                                   //8Satir

    public static void main(String[] args) {              //2.Satir
        Order order = new Order("f");                  // 3. Satir
        order = new Order();                            // 9. Satir
        System.out.println(order.value + order.m);     //15. Satir  output = tacfcbh
    }
   /*
        A. tacb
        B. tacfcbk
        C. tacbfh
        D. tacfcbh
        E. tacftach
        F. Kod calismaz.
        G. Kod calisir ama exception olusur.

 */
}
