package com.company.stage3;

public class ReverseString {
    public static void main(String[] args) {
        String s="Tahir";
        System.out.println(reverse(s));
    }

    public static String reverse(String str){
        String reversed="";
        for (int i=0; i<str.length(); i++)
        {
            char ch= str.charAt(i); //extracts each character
            reversed= ch+reversed; //adds each character in front of the existing string
        }
        return reversed;

    }

}
