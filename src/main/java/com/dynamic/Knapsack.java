package com.dynamic;
/**
 * 动态规划 Dynamic Programming 是一种解决复杂问题的算法设计技术，通常用于优化递归算法。
 * 动态规划的核心思想是将问题分解为相对简单的子问题，并且记住已经求解过的子问题的解，避免重复计算，从而提高算法的效率
 *
 * 动态规划常常适用于具有最优子结构和重叠子问题性质的问题
 *
 * 动态规划的关键要素：
 * 1、最优子结构 Optimal Substructure：问题的最优解包含了其子问题的最优解。因此，可以通过求解子问题来得到原问题的最优解。
 * 2、重叠子问题 Overlapping Subproblems：问题可以被分解为若干个子问题，并且这些子问题可能会被多次求解。在动态规划中，将这些子问题的解存储起来，避免重复计算。
 *
 * 动态规划的基本步骤：
 * 1、定义状态：明确定义问题的状态，找出状态之间的关系
 * 2、找出状态转移方程：利用已知的状态推导出其他未知状态的关系，建立状态之间的转移方程
 * 3、初始化：将问题的初始状态设置好，作为动态规划算法的起点
 * 4、状态转移：根据状态转移方程，从初始状态开始逐步推导出问题的解
 * 5、计算结果：根据状态转移得到的结果，得出最终的问题解
 *
 * 动态规划的应用场景：
 * 最短路径问题：Dijkstra算法、Floyd-Warshall算法
 * 最长公共子序列问题：编辑距离、LCS
 * 背包问题：0-1背包问题、完全背包问题
 * 最大子数组和问题：Kadane's Algorithm
 * 费波纳茨数列问题
 *
 * 学习动态规划的建议：
 * 从简单问题入手，逐步掌握动态规划的基本思想和解题方法
 * 多做练习，熟悉不同类型的动态规划问题
 * 理解问题的状态转移方程，这是动态规划问题解决的关键
 * 参考经典的动态规划问题和算法实现
 */

/**
 * 背包问题 0-1 Knapsack Problem
 * 给定一组物品，每种物品有重量和价值两个属性，同时给定一个背包容量，求在不超过背包容量的情况下，能装入背包的物品的最大总价值
 */

public class Knapsack {
    public static int knapsack(int[] weights,int[] values,int capacity){
        int n = weights.length;
        int[][] dp = new int[n+1][capacity+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= capacity; j++) {
                if(weights[i-1] > j){
                    dp[i][j] = dp[i-1][j];
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-weights[i-1]]+values[i-1]);
                }
            }
        }
        return dp[n][capacity];
    }

    public static void main(String[] args) {
        int[] weights = {2,3,4,5};
        int[] values = {3,4,5,6};
        int capacity = 8;
        System.out.println(knapsack(weights,values,capacity));
    }
}
