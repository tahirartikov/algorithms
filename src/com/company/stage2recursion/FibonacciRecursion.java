package com.company.stage2recursion;

import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        System.out.println(fib(n));
    }
    static int fib(int n)
    {

        if (n <= 1)
            return n;

        return fib(n - 1)
                + fib(n - 2);
    }
}
