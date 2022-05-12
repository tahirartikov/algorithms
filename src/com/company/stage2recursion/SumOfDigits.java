package com.company.stage2recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumOfDigits(n));
    }
    public static int sumOfDigits(int n){
        int sum=0;
        while (n>0){
           int q=n%10;
            sum+=q;
            n=n/10;
        }
        n=sum;
        if (n<=9){
            return n;
        }else {
            return sumOfDigits(n);
        }
        
    }
}
