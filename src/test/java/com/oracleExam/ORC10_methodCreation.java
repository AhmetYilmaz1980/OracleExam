package com.oracleExam;

public class ORC10_methodCreation {
    public static void main(String[] args) {

    }
    public void methodA(){return;} // birsey döndürmedigi icin sorun cikarmiyor
   // public void methodB(){return null;} voi oldugu icin birsey döndüremez
    public void methodC(){}

    public int methodD(){return 9;}
    //public int methodE(){return 9.0;} integer döndürmesi gerekiyor ama double
   // public int methodF(){return ;} integer döndürmeli ama bos
    //public int methodG(){return null;} primitive data türlerine null atanamaz
}
