package org.yakov;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(countNumbers(new int[]{1, 3, 4, 5, 1, 5, 4}));
    }

    public static Map<Integer, Long> countNumbers(int[] numbers) {
        return IntStream.of(numbers)
                .boxed()
                .collect(Collectors.groupingBy(num -> num,Collectors.counting()));
    }
}