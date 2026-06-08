package SlidingWindow;

import java.util.Scanner;

public class leet209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int minLen=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int sum=0,j=i;
            while(j<n && sum<target){
                sum += nums[j++];
            }
            j--;
            int len =j-i+1;
            if(sum>=target) minLen=Math.min(minLen,len);
        }
        if(minLen==Integer.MAX_VALUE) return 0;
        return minLen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int ans = minSubArrayLen(target , arr);
    }
}
