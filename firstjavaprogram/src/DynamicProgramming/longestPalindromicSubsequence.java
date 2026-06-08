package DynamicProgramming;

public class longestPalindromicSubsequence {
    public static void main(String[] args) {
        String s = "abcdcab";
        int n = s.length();
        int[][] dp= new int[n][n];
        int start = 0;
        int maxLen = 1;

        for(int k=0;k<n;k++){
            int i=0;
            int j=k;
            while(j<n){
                if(i==j){
                    dp[i][j]=1;
                }
                else if(j==i+1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=1;

                        if(2>maxLen){
                            start=i;
                            maxLen=2;
                        }
                    }
                }
                else{
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==1){
                        dp[i][j]=1;
                        int len = j-i+1;
                        if(len>maxLen){
                            start=i;
                            maxLen=len;
                        }
                    }
                }
                i++;
                j++;
            }
        }
        System.out.println(s.substring(start,start+maxLen));
    }
}
