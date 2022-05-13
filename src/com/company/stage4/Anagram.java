package com.company.stage4;

public class Anagram {

    public static void main(String[] args) {

        System.out.println(calculateAnagramDifference("xcyazt", "abcta"));
        System.out.println(calculateAnagramDifference("abcxaaa", "cbxq"));

    }


    public static int calculateAnagramDifference(String word1, String word2) {

        int count1[] = getSymbolCounts(word1);
        int count2[] = getSymbolCounts(word2);

        int anagrams = 0;

        for(int i='a'; i<='z'; i++){
            anagrams += Math.abs(count1[i] - count2[i]);
        }

        return anagrams;
    }


    public static int[] getSymbolCounts(String s){
        int count[] = new int['z'+1];

        for(int i=0; i<s.length(); i++)
            count[s.charAt(i)]++;

        return count;
    }



}
