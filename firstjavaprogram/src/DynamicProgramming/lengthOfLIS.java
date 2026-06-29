package DynamicProgramming;

public class lengthOfLIS {
    public static int length(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i] = Math.max(dp[j],dp[i]);
                }
            }
            dp[i] = 1+dp[i];
            max = Math.max(max,dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};
        int ans = length(arr);
        System.out.println(ans);
    }
}
