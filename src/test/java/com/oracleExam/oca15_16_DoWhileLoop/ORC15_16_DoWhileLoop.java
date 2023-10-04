package com.oracleExam.oca15_16_DoWhileLoop;

public class ORC15_16_DoWhileLoop {
    public static void main(String[] args) {
        boolean keepGoing = true;
        int result  = 15 , i = 10;
        do {
            i--; //ilk calistiginda i == 9
            if (i==8) keepGoing = false; // ilk calismada i 9 oldugu icin burasi calismayacak,
                                        // ikinci calistiginda i 8 oldugu icin keepGoing false olur
            result -=2; //ilk calismada result == 13 ikinci calismada result 11 olu
        }while (keepGoing); // ilk calismada burasi true oldugu ici Do döngüsü tekrar baslar
                            // ikinci calismada keepGoing fals oldugu icin döngü biter


        System.out.println(result);

        // A. 7
        // B. 9
        // C. 10
        // D. 11
        // E. 15
        // F. 11. satirdan dolayi kod calismaz

        //Ikinci Soru

        int m = 9 , n = 1, x = 0;
        do {
            m--; //     8  7  6
            n +=2;//    3  5  7
            x +=m +n;// 11 23 36
        }while (m>n);
        System.out.println(x);

        /**
         * A. 11
         * B. 13
         * C. 23
         * D. 36
         * E. 50
         * F. 10. Satirdan dolayi kod calismaz
         */
    }

}
