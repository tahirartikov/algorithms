package com.company.stage2recursion;

import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Scanner;

public class DeepCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Object[] objects = new Object[]{"x", "y",new Object[] {"z"}};
        for (Object o : objects) {
            count(o);
        }
        System.out.println(cnt);
    }


    static int cnt = 0;

    static <T> void count(T obs){
        if(Objects.isNull(obs))
            return;
        cnt++;
        if(obs.getClass().isArray()){
            for(int i=0; i< Array.getLength(obs); i++) {
                count(Array.get(obs, i));
            }
        }
    }
}
