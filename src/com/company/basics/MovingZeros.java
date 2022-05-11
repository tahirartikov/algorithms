package com.company.basics;

public class MovingZeros {
    public static void main(String[] args) {
        int[] arr={1, 2, 0, 1, 0, 1, 0, 3, 0, 1};
        int n=arr.length;
        pushZeros(arr,n);
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }

    private static  void pushZeros(int arr[], int n) {
        int count=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];

            }
        }
            while (count<n){
                arr[count++]=0;
            }
        }

    }
