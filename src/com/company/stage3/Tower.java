package com.company.stage3;

import java.util.Scanner;

public class Tower {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Enter number of rows for the pyramid:");

        int nrows = s.nextInt();
        String[] ss = build(nrows);
        for (String s1 : ss) {
            System.out.println("\"" + s1 + "\",");
        }
    }

    public static String[] build(int n){
        int rowCount = 1;

        System.out.println("Pyramid Pattern: ");

        String[] strings = new String[n];
        for (int i = n-1; i >= 0; i--)
        {
            String s="";
            for (int j = 0; j < i; j++)
            {
                s += " ";
            }


            for (int j = 0; j < rowCount; j++)
            {
                s += "*";
            }


            for (int j = rowCount-1; j >= 1; j--)
            {
                s += "*";
            }

            for (int j=s.length(); j<2*n-1; j++)
            {
                s += " ";
            }
            strings[n-i-1] = s;
            rowCount++;
        }
        return strings;
    }


}
