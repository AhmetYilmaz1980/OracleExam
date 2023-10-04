package com.oracleExam.ORC43_Varargs;

public class Ornek {

    void m1(int a, int ...b){
        System.out.println(b.length); //5
    }
    void m1(String str, String ... str1){
        System.out.println(str1[3]);   //re
    }
    void m1(char c , int ... i){
        System.out.println(i[3]); // 116
    }

    public static void main(String[] args) {
        Ornek ornek = new Ornek();
        ornek.m1(2,3,4,5,6,7);
        ornek.m1('b','d','e','r','t');
        ornek.m1("Ali","de","as","we","re");
    }
}
