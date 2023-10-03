package com.oracleExam;

public class ORC37_ConstructorCallThis {
    int x = 10, y ;
    ORC37_ConstructorCallThis(){
        System.out.print(x * y);
    }
    ORC37_ConstructorCallThis(int x, int y){
        this();
        this.x=x;
        this.y=10;
        System.out.print(x*y);
    }
    ORC37_ConstructorCallThis(int x,int y, int z){
        this(y,z);
        this.x =x;
        this.y=y;
        System.out.print(x*z);
    }

    public static void main(String[] args) {
        ORC37_ConstructorCallThis dnm = new ORC37_ConstructorCallThis(3,4,5);
        System.out.print(dnm.x * dnm.y);
    }
    /**
     * A. 0401212
     * B. 0201212
     * C. 0121212
     * D. 0201512
     * E. Kod Calismaz
     */
}

