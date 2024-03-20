package com.dynamic;

/**
 * 最大子序列和
 */
public class MaximumSubArray {

    public static int maxSubArray(int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        int currentMax = nums[0];
        int globalMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            globalMax = Math.max(currentMax, globalMax);
        }
        return globalMax;
    }
}
