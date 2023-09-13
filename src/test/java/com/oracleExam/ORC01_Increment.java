package com.oracleExam;

public class ORC01_Increment {
    public static void main (String[] args) {

        int num1= 9;

        int num2 = num1++;

        if(num2 < 10){
            System.out.println( num2 + " Hello World");
        } else {
            System.out.println( num2 + "Hello Universal");
        }



    }
}
