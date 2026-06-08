package DynamicProgramming;

public class printShortestCommonSubsequence {
    public static String lcs(String a , String b){
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        StringBuilder str = new StringBuilder("");
        int i=m; int j=n;
        while (i > 0 && j > 0) {
            if(a.charAt(i-1)==b.charAt(j-1)){
                str.append(a.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                i--;
            }else{
                j--;
            }
        }
        return str.reverse().toString();
    }
    public static String prtsrtcmnseq(String s1 , String s2 , String ans){
        int i=0; int j=0; int k=0;
        int m = s1.length(); int n = s2.length();
        StringBuilder str = new StringBuilder("");
        while(i<m && j<n && k<ans.length()){
            while(s1.charAt(i)!=ans.charAt(k)){
                str.append(s1.charAt(i));
                i++;
            }
            while(s2.charAt(j)!=ans.charAt(k)){
                str.append(s2.charAt(j));
                j++;
            }
            str.append(ans.charAt(k));
            i++;
            j++;
            k++;
        }
        while(i<m){
            str.append(s1.charAt(i));
            i++;
        }
        while(j<n){
            str.append(s2.charAt(j));
            j++;
        }
        return str.toString();
    }
    public static void main(String[] args) {
        String s1  = "adbecf";
        String s2 = "gahbic";
        String ans = lcs(s1,s2);
        String scs = prtsrtcmnseq(s1,s2,ans);
        System.out.println(scs);
    }
}
