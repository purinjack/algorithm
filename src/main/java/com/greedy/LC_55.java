package com.greedy;

/**
 * 55. 跳跃游戏
 */
public class LC_55 {
    public boolean canJump(int[] nums) {
        int index = 0;
        while((index + nums[index]) < nums.length-1){
            int next = process(nums,index,index+nums[index]);
            if(next == index)return false;
            index = next;
        }
        return true;
    }

    public int process(int[] nums,int lo,int ed){
        int sign = lo;
        for(int i = lo;i < nums.length && i <= ed; i++){
            if(nums[i]+i>nums[sign]+sign){
                sign = i;
            }
        }
        return sign;
    }
}
