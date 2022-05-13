package com.company.stage3;

public class RemoveDuplicates {

    public static int removeDuplicateElements( int[] nums){
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }

            nums[count] = nums[i];
            count++;
        }
        return count;
    }

}
