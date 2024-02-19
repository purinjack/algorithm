package com.dynamic;
// 斐波那契数列
public class Fibonacci {

    public static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(fibonacci(i));
        }
    }
}
