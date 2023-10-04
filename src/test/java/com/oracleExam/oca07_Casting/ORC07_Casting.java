package com.oracleExam.oca07_Casting;

public class ORC07_Casting {
    public static void main(String[] args ){
        byte a =40 , b = 50;
        //byte sum = (byte) a+b; bu durumda sadece a casting yapildigindan b int olarak kalmaya devam ettiginden hata verir
        byte sum = (byte) (a+b);
        System.out.println(sum);
    }
}
