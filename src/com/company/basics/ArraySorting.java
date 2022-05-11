package com.company.basics;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arr={10, 1, 3, 7, 2, 8, 5, 9, 6, 4};
        sort(arr);
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void sort(int[] arr) {
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j+1]<arr[j]){
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }
    }
}
