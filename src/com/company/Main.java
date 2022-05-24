package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        boolean b=isPrime(a);
        System.out.println(b);

    }

    public static boolean isPrime(int n){
//
//        if (n == 0 || n==1) {
//            return false;
//        }
//        else if (n==2 || n==3){
//            return true;
//        }
//        else if ((n*n-1)%24==0){
//            return true;
//        }
//        return false;

        int sqrt=(int) Math.sqrt(n) +1;
        for (int i = 2; i < sqrt; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

}

