package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class longestCommanSUBSEQ {
    static int[][] dp;

    public static int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        dp = new int[nums.size()][target+1];
        for(int[] row : dp){
            Arrays.fill(row , -1);
        }
        int ans = longest(0,nums,target);
        return ans < 0 ? -1 : ans;
    }
    public static int longest(int i , List<Integer> nums , int target){
        if(i==nums.size()){
            if(target == 0) return 0;
            else return Integer.MIN_VALUE;
        }
        if(dp[i][target]!=-1) return dp[i][target];
        int skip = longest(i+1 , nums, target);
        if(target-nums.get(i) < 0) return skip;
        int pick = 1 + longest(i+1, nums , target-nums.get(i));
        return dp[i][target] =  Math.max(skip , pick);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1); arr.add(2); arr.add(3); arr.add(4); arr.add(5);
        int target = 9;
        int ans = lengthOfLongestSubsequence(arr,target);
        System.out.println(ans);
    }
}
