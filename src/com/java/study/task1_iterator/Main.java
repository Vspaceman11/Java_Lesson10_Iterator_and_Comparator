package com.java.study.task1_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
        // Without iterator

        System.out.println(list);


        Iterator<Integer> iterator = list.listIterator();
        // With iterator

        while (iterator.hasNext()){
            Integer temp = iterator.next();
            System.out.println(temp);
        }

    }
}
