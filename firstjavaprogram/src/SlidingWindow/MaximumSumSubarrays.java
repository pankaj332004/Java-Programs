package SlidingWindow;

import java.util.Scanner;

public class MaximumSumSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();

//        for(int i=0;i<n-k+1;i++){
//            int sum=0;
//            for(int j=i;j<i+k;j++){
//                sum+=arr[j];
//            }
//            maxsum = Math.max(maxsum,sum);
//        }
        int i=0,j=0,sum=0;
        while(j<k){
            sum+=arr[j];
            j++;
        }
        int maxsum=0;
        i++;
        j++;
        while(j<n){
            sum= sum-arr[i-1]+arr[j];
            maxsum = Math.max(maxsum,sum);
            i++;
            j++;
        }
        System.out.println(maxsum);
    }
}
