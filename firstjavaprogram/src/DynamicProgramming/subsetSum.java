package DynamicProgramming;

import java.util.Arrays;

public class subsetSum {
    static int[][] dp;
    public static boolean solve(int i, int[] arr , int target){
        if(i==arr.length){
            if(target == 0) return true;
            else return false;
        }
        if(dp[i][target]!=-1) return dp[i][target]==1;
        boolean ans = false;
        boolean skip = solve(i+1,arr , target);
        if(target-arr[i] < 0) ans = skip;
        else{
            boolean pick = solve(i+1,arr,target-arr[i]);
            ans = pick || skip;
        }
        if(ans) dp[i][target] = 1;
        else dp[i][target] = 0;
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {0,8,5,2,4};
        int target = 9;
        dp = new int[arr.length][target+1];
//        for(int[] row : dp){
//            Arrays.fill(row , -1);
//        }
//        System.out.println(solve(0,arr,target));

        // tabulation


    }
}
