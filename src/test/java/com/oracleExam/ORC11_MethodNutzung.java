package com.oracleExam;

public class ORC11_MethodNutzung {
    public static long square(int x) { // 4. calisan satir
        long y = x * (long) x; // 5. calisan satir
        x = -1; // 6. calisan satir
        return y; // 7. calisan satir bu sonucu 3. calisan satira götürür
    }

    public static void main(String[] args) {//ilk calisan satir
        // Classta ilk önce main method calismaya baslar.
        int value = 9; // ikinci calisan satir
        long result = square(value);// ücüncü calisan satir --> buradan 4. satira gider
        System.out.println(value); // 8. calisan satir Value  == 9 dur
    }

}
