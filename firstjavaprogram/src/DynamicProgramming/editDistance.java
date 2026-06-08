package DynamicProgramming;

import java.util.*;

public class editDistance {
//    public static int minSteps(int i, int j, StringBuilder a, StringBuilder b){
//        if(i<=-1) return j+1;
//        if(j<=-1) return i+1;
//        if(a.charAt(i)==b.charAt(j)){
//            return minSteps(i-1,j-1,a,b);
//        }
//        else{
//            int del = minSteps(i-1,j,a,b);
//            int ins = minSteps(i,j-1,a,b);
//            int rep = minSteps(i-1,j-1,a,b);
//            return 1+Math.min(del,Math.min(ins,rep));
//        }
//    }

    public static int minSteps(int i , int j , StringBuilder a , StringBuilder b,int[][] dp){
        if(i>= a.length()) return b.length()-j;
        if(j>= b.length()) return a.length()-i;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)){
            return dp[i][j] = minSteps(i+1,j+1,a,b,dp);
        }
        else{
            int del = minSteps(i,j+1,a,b,dp);
            int ins = minSteps(i+1,j,a,b,dp);
            int rep = minSteps(i+1,j+1,a,b,dp);
            return dp[i][j] = 1+Math.min(del,Math.min(ins,rep));
        }
    }
    public static int minimumDistance(String s, String sb){
        StringBuilder a = new StringBuilder(s);
        StringBuilder b = new StringBuilder(sb);
        int m = a.length(); int n =b.length();
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return minSteps(0,0,a,b,dp);
    }
    public static void main(String[] args) {
        String s ="horse";
        String sb ="ros";
        int ans = minimumDistance(s,sb);
        System.out.println(ans);
    }
}
