package com.oracleExam.Themen;

public class CarRunner1 {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.marka = "Toyota";
        car1.model = "Corolla";
        car1.yil = 2020;
        System.out.println("Marka : " + car1.marka+
                            ", Model : " +car1.model+
                            ", Yil : "+ car1.yil);

        Car1 car2 = new Car1("opel","Corsa");
        System.out.println("Marka : " + car2.marka+
                           ", Model : " +car2.model);

        Car1 car3 =new Car1("VW","Jetta",2023);
        System.out.println("Marka : " + car3.marka+
                ", Model : " +car3.model+
                ", Yil : "+ car3.yil);

        Car1 car5 = new Car1("Nissan","Micra",2222);
        System.out.println("Marka : " + car5.marka+
                ", Model : " +car5.model+
                ", Yil : "+ car5.yil);
    }
}
