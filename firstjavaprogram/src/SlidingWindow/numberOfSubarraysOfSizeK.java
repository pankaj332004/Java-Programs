package SlidingWindow;
import java.util.*;
import java.io.*;

public class numberOfSubarraysOfSizeK {
    public static int numberOfSubarray(int n, int[] arr , int k,int threshold){
        int i=0,j=0,sum=0;
        while(j<k){
            sum+=arr[j];
            j++;
        }
        i++;j++;
        int maxsum=sum;
        int count=0;
        while(j<n){
            if((float)sum/k >= threshold){
                count++;
            }
            sum=sum-arr[i-1]+arr[j];
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] arr=new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int ans = numberOfSubarray(n,arr,k,x);
        System.out.println(ans);
    }
}
