package DynamicProgramming;

import java.util.Arrays;

public class Knapsack0_1 {
    static int[][]dp;
    public static int profit(int  i,int[] wt , int[] val, int cap){
        if(i==wt.length) return 0;
        if(dp[i][cap]!=-1) return dp[i][cap];
        int skip = profit(i+1,wt,val,cap);
        if(wt[i]>cap) return dp[i][cap]=skip;
        int pick = val[i]+profit(i+1,wt,val,cap-wt[i]);
        return dp[i][cap]=Math.max(pick,skip);
    }
    public static void main(String[] args) {
        int[] val = {5,3,9,16};
        int[] wt = {1,2,8,10};
        int cap = 8;
        int n = wt.length;
        dp = new int[n][cap+1];
        // bottom up approach
//        for(int[] row  : dp)
//            Arrays.fill(row,-1);
//        System.out.println(profit(0,wt,val,cap));

        // top down approach
        for(int i=0;i<n;i++){
            for(int c=0;c<cap+1;c++){
                int skip = (i>0) ? dp[i-1][c] : 0;
                if(wt[i]>c) dp[i][c] = skip;
                else{
                    int pick = val[i];
                    pick += ((i>0) ? dp[i-1][c-wt[i]] : 0);
                    dp[i][c] = Math.max(pick,skip);
                }
            }
        }
        System.out.println(dp[n-1][cap]);
    }
}
