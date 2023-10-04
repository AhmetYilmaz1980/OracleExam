package com.oracleExam.oca12_ForLoop;

public class ORC12_ForLoop {
    public static void main(String[] args){
        /*for (int i = 0; i<10;){
            i = i++; // Post incriment oldugu icin sonsuz döngü oluyor
                        önce atama sonra artirma oluyor
                      // dolayisi ile i ye 0 ataniyor sonra artiriliyor
                    // i yukariya sifir olarak dönüyor ve sonsuz döngüye giriyor
            System.out.println(" Hello World");
        }

        A. 9
        B. 10
        C. 11
        DKod sonsuz bir döngüye girer

         */




        for (int i = 0; i<10;){
            //i =++i; preincriment oldugu icin istendigi gibi calisir
           // i++;
            i = i+1;
            System.out.println(i + "Hello World");
        }
    }
}
