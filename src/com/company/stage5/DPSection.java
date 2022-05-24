package com.company.stage5;

public class DPSection {
    public static void main(String[] args) {
        DPSection arraysum = new DPSection();
        int arr[] = {1, 4, 20, 3, 10, 5};
        int n = arr.length;
        int sum = 33;
        arraysum.subArraySum(arr, n, sum);
    }

    int subArraySum(int arr[], int n, int sum) {
        int temp_sum = arr[0], start = 0, i;


        for (i = 1; i <= n; i++) {

            while (temp_sum > sum && start < i - 1) {
                temp_sum = temp_sum - arr[start];
                start++;
            }


            if (temp_sum == sum) {
                int p = i - 1;
                System.out.println(
                        "Sum found between indexes " + start
                                + " and " + p);
                return 1;
            }

            if (i < n)
                temp_sum = temp_sum + arr[i];
        }

        System.out.println("No subarray found");
        return 0;
    }
}
