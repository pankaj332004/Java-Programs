package Problem;

public class maximumConsecutiveOnes3 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        int x = longestOnes(arr,k);
        System.out.println(x);
    }
    public static int longestOnes(int[] nums, int k) {
        int i=0,j=0,maxlen=0,zc=0;
        int n=nums.length;
        while (j<n){
            if(nums[j]==0){
                zc++;
            }
            while(zc>k){
                if(nums[i]==0){
                    zc--;
                }
                i++;
            }
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }
        return maxlen;
    }
}
