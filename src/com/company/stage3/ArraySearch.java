package com.company.stage3;

public class ArraySearch {

    public static void main(String[] args) {
        int [] arr={-1,0,3,5,9,12};
        int n =9;
        System.out.println(search(arr,n));
    }

    public static int search(int[] arr, int n){
        int m=0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i]==n)
                return i;

        return -1;
    }

}
