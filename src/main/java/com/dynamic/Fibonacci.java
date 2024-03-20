package com.dynamic;
/** 斐波那契数列
    斐波那契数的特点是每一个数都是前二个数的和。头二项是0和1，
    此数列的前几项如下： 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987 ...
 */
public class Fibonacci {

    public static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        //定义一个容器，存放数据
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
