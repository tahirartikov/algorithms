package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 8, 9};
        int sum = 11;

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] indexes = new int[2];
        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(sum - arr[i])) {
                indexes[0] = map.get(sum - arr[i]);
                indexes[1] = i;
            }
            map.put(arr[i], i);

        }
        System.out.println(indexes[0] + "," + indexes[1]);

    }


}

