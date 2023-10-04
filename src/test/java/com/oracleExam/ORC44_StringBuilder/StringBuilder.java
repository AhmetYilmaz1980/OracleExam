package com.oracleExam.ORC44_StringBuilder;

public class StringBuilder {
    public static java.lang.StringBuilder work (java.lang.StringBuilder a,
                                                java.lang.StringBuilder b){
        a=new java.lang.StringBuilder("a");
        b.append("b");
        return a;
    }

    public static void main(String[] args) {
        java.lang.StringBuilder s1 = new java.lang.StringBuilder("s1");
        java.lang.StringBuilder s2 = new java.lang.StringBuilder("s2");
        java.lang.StringBuilder s3 = work(s1,s2);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
/*
s1 = s1
s2 = s2b
s3 = a

        A. s1 = a
        B. s1 = s1
        C. s2 = s2
        D. s2 = s2b
        E. s3 = a
        F. s3 = null
        G. Kod calismaz.

 */

    }
}
