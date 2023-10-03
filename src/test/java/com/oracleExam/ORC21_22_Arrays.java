package com.oracleExam;

import java.util.Arrays;

public class ORC21_22_Arrays {
    public static void main(String[] args){

        char[] c = new char[2];
        int length = c.length;
        System.out.println(length);
         /*Hangileri 7. satirda calisir
        A. int length = c.capacity; Bir array in capasitysini ölcen bir method yok
        B. int length = c.capacity();
        C. int length = c.length; Arrayde parantezsiz oluyor
        D. int length = c.length(); Stringlerde parantezli oluyor
        E. int length = c.size; Arrayler de yok
        F. int length = c.size();
        G. None of the above.
         */

        // 2. Soru MultiArrays  Cok katli Arrayler
        // Cok katli Arraylerde ilk array [] outer Arrayi ikinci [] array inner Arrayi simgeler

        int arr[][] = {{1,2,3},{10,7}};
        System.out.println(arr[0][2]); // sifirinci element {1,2,3}, sifirinci elementin 2. üyesi 3 oldugu icin 3 yazdirir
        System.out.println(Arrays.toString(arr[1])); //Arrayin icindeki tüm elementleri yazdirmak istersek
                                                    // Arrays.toString metodu ile yazdiriyoruz  burada [10,7] yazdirir
        System.out.println(Arrays.deepToString(arr)); //Arrayin tüm elementlerini yazdirmak icin deepToString methodunu kullaniyoruz
                                                        // [[1,2,3],[10,7]]

        int arr1[] = {1,2,053,4};

        int arr2[][] = {{1,2,4},{2,2,1},{0,43,2}};

        System.out.print(arr1[3] == arr2[0][2]); // True

        System.out.println(" "+ (arr1[2]==arr2[2][1])); // Süpriz !! Java da 0 ile baslayan bir rakam yazdigimizda
                                                        // java bunu ('li sistemde (octa) kabul eder.
                                                        // Yani 3*1=3, 5*8 =40 , 0*64 = 0, 3+40+0 = 43 oldugu ici TRUE

          /*
        A. Kod calismaz
        B. true true
        C. false false
        D. true false
        E. false true
         */
    }
}
