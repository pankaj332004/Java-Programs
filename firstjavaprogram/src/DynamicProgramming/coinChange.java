package DynamicProgramming;

import java.util.Arrays;

public class coinChange {
    static long[][] dp;
    public static int coinChange(int[] coins, int amount) {
        dp = new long[coins.length][amount+1];
        for(long[] row : dp){
            Arrays.fill(row,-1);
        }
        int ans = (int)coinCount(0,coins,amount);
        if(ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
    public static long coinCount(int i, int[] coins , int amount){
        if(i==coins.length){
            if(amount==0) return 0;
            else return Integer.MAX_VALUE;
        }
        if(dp[i][amount]!=-1) return dp[i][amount];
        long skip = coinCount(i+1,coins , amount);
        if(amount-coins[i] < 0) return skip;
        long pick = 1+ coinCount(i,coins,amount-coins[i]);
        return dp[i][amount]=Math.min(skip,pick);
    }
    public static void main(String[] args) {
        int amount = 11;
        int[] coin = {1 ,2,5};
        int ans = coinChange(coin , amount);
        System.out.println(ans);
    }
}
