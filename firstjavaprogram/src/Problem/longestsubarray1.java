package Problem;

public class longestsubarray1 {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,0,1,1,0,1};
        int x = longestSubarray(arr);
        System.out.println(x);
    }
    public static int longestSubarray(int[] nums) {
        int i=0,j=0,maxlen=0,zcnt=0;
        int n=nums.length;
        while(j<n){
            if(nums[j]==0){
                zcnt++;
            }
            while(zcnt>1){
                if(nums[i]==0){
                    zcnt--;
                }
                i++;
            }
            maxlen=Math.max(maxlen,j-i);
            j++;
        }
        return maxlen;
    }
}
