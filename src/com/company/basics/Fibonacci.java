package com.company.basics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        System.out.println(fibonacciIterative(n));

    }
    public static int fibonacciIterative(int n) {
        if(n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for(int i=2; i<n; i++) {
            int temp = fib;
            fib+= prevFib;
            prevFib = temp;
        }
        return fib;
    }
}
