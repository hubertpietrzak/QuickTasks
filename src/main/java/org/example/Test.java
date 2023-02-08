package org.example;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Integer[] numbers2 = {5, 10, 15};
        List<Integer> list3 = Arrays.asList(numbers2);
        numbers2[0] = 50;
        System.out.println(list3.get(0));
    }
}
