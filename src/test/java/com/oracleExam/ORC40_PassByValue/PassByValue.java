package com.oracleExam.ORC40_PassByValue;

import java.util.Arrays;

public class PassByValue {
    public static void main(String[] args) {
        String str = "Java";
        int[] arr ={1,2,3};
        method1(str);
        method2(arr);
        System.out.println(Arrays.toString(arr));  //[1, 4, 3]
        method3(arr);
        System.out.println(Arrays.toString(arr));//[1, 4, 3]
        System.out.println(str); // Java

    }
    private static void method3(int[] arr){  //Burada yeni obje olusturuldugu icin, lokalde kalir
        int yeniArr[]= {10,11,12,13};
        arr=yeniArr;
    }
    private static void method2(int[] arr){ //burad yapilan islemde yeni obje olusturulmayip
                                            // Var olan objede degisiklik yapildigi icin kalici olur
        arr[1]=4;
        arr[2]=3;
    }
    private static void method1(String str){
        str=str.toUpperCase();   // burada yapilan islem localde kalir
    }
    /**
     * Tüm dogru sıklar
     * A. [1,2,3]
     * B. [1,4,3]
     * C. [10,11,12,13]
     * D. Java
     * E. JAVA
     * F. 1. satirdan dolayi kod calismaz
     */
}
