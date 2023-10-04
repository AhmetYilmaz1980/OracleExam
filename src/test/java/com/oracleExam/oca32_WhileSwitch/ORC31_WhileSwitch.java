package com.oracleExam.oca32_WhileSwitch;

public class ORC31_WhileSwitch {
    public static void main(String[] args) {
        boolean keepGoing = true;
        int count = 0;
        int x = 3;
        int sayac = 1;
        while (count++ < 3) {//1// 0<3 while loop calisir
                            //2// 1<3 while loop calisir
                            //3// 2<3 while loop calisir
                            //4// 3<3 False oldugu icin döngüye girmez,26. satiri calistirir
            int y = (1 + 2 * count) % 3;//1//count burada bir artar (1+2*1)%3 = 0
                                        //2// (1+2*2)%3=2
                                        //3/7 (1+2*3)%3=1
            switch (y) {     //1//y= 0
                             //2// y=2
                             //3// y= 1
                default:      //2// 2 olmadigi icin default calisir,
                             // karsisinda bir islem olmadiginda ve break de olmadigindan alt satira gece
                case 0: x -=1; break; //1// burasi calisir x = 2 olur
                                      //2//  x en son 2 idi 2-1 = 1 olur
                case 1: x +=5; //3// x en son 1 idi 1+5 = 6 olur
            }
            }
        System.out.println(x);
         /*
        A. 4
        B. 5
        C. 6
        D. 7
        E. 13
        F. 11.satirdan dolayi kod calismaz
         */
    }

    }

