package greedy;

public class minimumProductSubsetArray {
    public static int minimumPossibleProduct(int[] arr){
        int count0 = 0;
        int negcount = 0;
        int negmax = Integer.MIN_VALUE;
        int minPos = Integer.MAX_VALUE;
        int pro = 1;
        if(arr.length==1){
            return arr[0];
        }
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count0++;
                continue;
            }
            if(arr[i]<0){
                negcount++;
                negmax = Math.max(negmax,arr[i]);
            }
            if(arr[i]>0 && arr[i]<minPos){
                minPos = arr[i];
            }
            pro *= arr[i];
        }
        if(negcount==0){
            return minPos;
        }

        if(count0==n  || (negcount==0 && count0 > 0)){
            return pro;
        }

        if(negcount%2==0 && negcount!=0){
            return pro/=negmax;
        }
        return pro;
    }
    public static void main(String[] args) {
        int[] arr = {0, 0, 3, 4, 1,2};
        int ans =minimumPossibleProduct(arr);
        System.out.println(ans);
    }
}
