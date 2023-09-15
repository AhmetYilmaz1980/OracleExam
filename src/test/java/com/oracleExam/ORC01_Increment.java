package com.oracleExam;

public class ORC01_Increment {
    public static void main (String[] args) {

        int num1= 9;

        int num2 = num1++; //önce atama yapilir sonra num1 bie artirilir
                            //Zuerst wird die Zuordnung vorgenommen und dann die Anzahl um 1 erhöht.

        if(num2 < 10){
            System.out.println( num2 + " Hello World");
        } else {
            System.out.println( num2 + "Hello Universal");
        }



    }
}
