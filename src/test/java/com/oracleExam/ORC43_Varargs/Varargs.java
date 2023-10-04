package com.oracleExam.ORC43_Varargs;

public class Varargs {

    /**
     * Varargs Datatype dan sonra ... ile yapilir istedigimiz kadar deger ekleyebiliri, Array olusturmus oluruz.#
     * Varargs lar methodlarda daima en son yazilmalidir, bir siniri olmadigi icin gönderilen bütün degerleri kendine alir
     * Char lari int olarak görür ama integer leri char olarak görmez
     */
    void m1(int a,int ... b){                   // 1. Method
        System.out.println(b.length);
    }
    void m1(char c, String... d){               // 2. Method
        System.out.println(d.length);
    }
    /**void m1(String... e, int f){                // 3. Method
        System.out.println(e.length);
    }
     */
     public static void main(String[] args){
        Varargs vrg = new Varargs();
        vrg.m1(3,4,5,6,7);        //  Birinci method ile calisir
       // vrg.m1(67,"Hello","Hi");      //67 char olmadigindan 2. method calismaz
        vrg.m1('c',75,80,90);     // 1. Method 'c' yi integer olarak kabul eder
        vrg.m1('d',"Hello");      // 2. method ile calisir
     }

}
