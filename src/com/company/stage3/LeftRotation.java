package com.company.stage3;

import java.util.List;



public class LeftRotation {

    public List<Integer> rotate(List<Integer> a, int d) {
        List<Integer> firstPart = a.subList(0, d);
        List<Integer> secondPart = a.subList(d, a.size());
        secondPart.addAll(firstPart);
        return secondPart;
    }
}