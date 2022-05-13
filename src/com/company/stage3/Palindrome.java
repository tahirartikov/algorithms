package com.company.stage3;

public class Palindrome {

    public static void main(String[] args) {
        String s= "salas";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String rev=sb.toString();
        if(str.equals(rev)){
            return true;
        }else{
            return false;
        }
    }
}
