package PrefixSum;

public class basic {
    public static void main(String[] args) {
        // prefix sum of any index is equal is sum upto that index
        // example arr={5,1,8,2,4,3,2}
        // prefixSum ={5,6,14,16,20,23,25}
        // prefixSum[i] = arr[i] + prefixSum[i-1]
        int[] arr = {5,1,8,2,4,3,2};
        int n = arr.length;
        int[] brr = new int[n];
        for(int i=0;i<n;i++){
            if(i>0){
                brr[i]=arr[i]+brr[i-1];
            }else{
                brr[i]=arr[i];
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(brr[i]+" ");
        }
    }
}
