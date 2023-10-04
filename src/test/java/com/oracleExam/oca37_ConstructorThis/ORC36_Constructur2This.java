package com.oracleExam.oca37_ConstructorThis;

public class ORC36_Constructur2This {
    int num;
    public ORC36_Constructur2This(int num){
        this.num= num;

    }

    public static void main(String[] args) {
        System.out.println(new ORC36_Constructur2This(50).num);
    }
     /*
        A. num = num;
        B. num = this.num;
        C. this.num = num;
        D. Yukaridakilerden hicbiri
         */
}
