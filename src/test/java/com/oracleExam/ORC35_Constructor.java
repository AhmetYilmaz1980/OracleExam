package com.oracleExam;

public class ORC35_Constructor {

    int count; //instance veiable, count = 0: java default olarak 0 atar
    public void ORC35_Constructor(){ // Klass ismi ile ayni olsada bu bir methoddur
                                    // Constructor lar return Type almaz
                                    // burada void returm Type dir
        count = 4;   // Method ve Contructorin farki Constructor Kalass ismi ile aynidir
                     // ve  return Type almaz
                    // voi olmasa idi konsolda 4 görünürdü
    }

    public static void main(String[] args) {
        ORC35_Constructor cns = new ORC35_Constructor();
        System.out.println(cns.count); // 0

         /*
            A. 0
            B. 4
            C. 7.satirdan dolayi kod calismaz
            D. 8.satirdan dolayi kod calismaz
            E. 12.satirdan dolayi kod calismaz
            F. 13.satirdan dolayi kod calismaz
             */
    }
}
