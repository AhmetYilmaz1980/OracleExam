package com.oracleExam.oca33_ArrayundList;

import java.util.ArrayList;
import java.util.List;

public class ORC33_ArrayundList {
    public static void main(String[] args) {
        int [] array = {6,9,8};
        List<Integer>list = new ArrayList<>();
        list.add(array[0]); // list 6
        list.add(array[2]); // list 6,8
        list.set(1,array[1]); //list 8 i 9 yapar
        list.remove(0); // 6 yi siler
        System.out.println(list);
    }
}
