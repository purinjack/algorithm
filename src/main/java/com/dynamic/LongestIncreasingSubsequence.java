package com.dynamic;

import java.util.Arrays;

/**
 * 最长递增子序列 The Longest Increasing Subsequence
 * 给定一个整数数组nums，找到其中最长严格递增子序列的长度
 */
public class LongestIncreasingSubsequence {

    public static int lengthOfLIS(int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }

        int[] dp = new int[nums.length];
        //dp填充1
        Arrays.fill(dp,1);
        int maxLength = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            maxLength = Math.max(maxLength,dp[i]);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }
}
