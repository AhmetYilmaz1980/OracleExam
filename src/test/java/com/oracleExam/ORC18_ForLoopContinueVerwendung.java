package com.oracleExam;

public class ORC18_ForLoopContinueVerwendung {
    public static void main(String[] args) {
        int count = 0;                                      // Count    row     col   if
        ROW_LOOP:                                           //   0       1      1   1*1&2= false
        for (int row = 1; row <= 3; row++)                  //   1       1      2   1*2%2= True
            for (int col = 1; col <= 2; col++) {            //   1       2      1   2*1%2= True
                if (row * col % 2 == 0) continue ROW_LOOP;  //   1       3      1   3*1%2= False
                count++;                                    //   2       3     2    3*2%2= True
            }                                               //   2       4------------------
        System.out.println(count);

        /*
            A. 1
            B. 2
            C. 3
            D. 4
            E. 6
            F. 8. Satirdan dolayi kod calismaz.
             */

    }
}
