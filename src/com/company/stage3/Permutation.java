package com.company.stage3;

public class Permutation {

    public static void main(String[] args) {
        int arr[] = new int[] {1, 2, 3};
        int n = arr.length;
        permute(arr, 0, n - 1);
    }

    public static void permute(int[] arr, int l, int r) {
        if (l == r) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = l; i <= r; i++) {
            swap(arr, l, i);
            permute(arr, l + 1, r);
            swap(arr, l, i);
        }
    }
    public static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }


}
