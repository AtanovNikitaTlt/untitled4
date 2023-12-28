package org.example;

import java.util.Map;

import static org.example.CountElements.countElements;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 2, 1, 4, 5, 4};

        Map<Integer, Integer> countMap = countElements(arr);


        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());


        }
    }
}