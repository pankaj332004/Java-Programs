package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class friendsPairingProblem {
     static int[] dp;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[1]=1;
        dp[2]=2;
        dp[0]=0;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+(i-1)*dp[i-2];
        }
        System.out.println(dp[n]);
//        System.out.println(pairing(n));
    }
    public static int pairing(int n){
        if(n==2 || n==1) return n;
        if(dp[n]!=-1) return dp[n];
        return  dp[n]=pairing(n-1)+(n-1)*pairing(n-2);
    }
}
