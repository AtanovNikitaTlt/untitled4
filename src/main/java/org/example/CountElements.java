package org.example;

import java.util.HashMap;
import java.util.Map;

public class CountElements {

    public static Map<Integer, Integer> countElements(int[] arr) {

        Map<Integer, Integer> countMap = new HashMap<>();


        for (int num : arr) {

            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            }

            else {
                countMap.put(num, 1);
            }
        }


        return countMap;


    }
}