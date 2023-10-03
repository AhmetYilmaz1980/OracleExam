package com.oracleExam.Themen;

public class Car {
    public Car(){
        System.out.println("Parametresiz Constructor");
    }
    public Car(String renk){
        System.out.println(renk + " araba üretildi");
    }
    public Car(int yil){
        System.out.println(yil + " model bir araba üretildi");
    }
    public Car(int yil, String renk){
        System.out.println(yil +" model "+renk+" bir araba üretildi");
    }
}
