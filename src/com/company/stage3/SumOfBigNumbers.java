package com.company.stage3;

import java.util.Scanner;

public class SumOfBigNumbers {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String a=scanner.next();
        String b=scanner.next();

        System.out.println(add(a,b));

    }


    public static String add(String a, String b){
        int sum;
        int n=Integer.parseInt(a);
        int m=Integer.parseInt(b);
        sum=n+m;
        String s=Integer.toString(sum);
        return s;
    }
}
