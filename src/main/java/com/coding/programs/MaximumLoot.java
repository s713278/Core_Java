package com.coding.programs;
public class MaximumLoot {
    public static void main(String[] args) {
        int[] houses = {5,8,0}; // Replace with the money amounts in each house
        int maxLoot = getMaxLoot(houses);
        System.out.println("Maximum loot: " + maxLoot);
    }

    public static int getMaxLoot(int[] houses) {
        int n = houses.length;
        if (n == 0) return 0;
        if (n == 1) return houses[0];
        
        int dp[]=new int[n];
        dp[0]=houses[0];
        dp[1]=Math.max(houses[0], houses[1]);
        
        //Thief has 2 options at each house:: Loot the current house or skip it and take the max loot form previous house.
        for(int i=2;i<n;i++) {
        	dp[i] = Math.max(dp[i-1], dp[i-2]+houses[i]);
        }
        
        
        //Return the last amunt
        return dp[n - 1];
    }
}
