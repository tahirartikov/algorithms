package com.company.stage4;

import java.util.*;
import java.util.stream.Collectors;

public class RemovingDuplicates {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 5, 2, 0, 2, -3, 1, 10));
        System.out.println(uniqueElements(list));
    }

    public static List<Integer> uniqueElements(List<Integer> list) {

        Set<Integer> set = new LinkedHashSet<>(list);
        return set.stream().collect(Collectors.toList());

    }
}
