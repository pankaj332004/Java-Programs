package DynamicProgramming;

import java.util.Arrays;

public class unboundedKnapsack {
    static int[][]dp;
    public static int profit(int  i,int[] wt , int[] val, int cap){
        if(i==wt.length) return 0;
        if(dp[i][cap]!=-1) return dp[i][cap];
        int skip = profit(i+1,wt,val,cap);
        if(wt[i]>cap) return dp[i][cap]=skip;
        int pick = val[i]+profit(i,wt,val,cap-wt[i]);
        return dp[i][cap]=Math.max(pick,skip);
    }
    public static void main(String[] args) {
        int[] val = {6,3,9,25};
        int[] wt = {2,2,8,9};
        int cap = 9;
        int n = wt.length;
        dp = new int[n][cap+1];
        for(int[] row  : dp)
            Arrays.fill(row,-1);
        System.out.println(profit(0,wt,val,cap));
    }
}
