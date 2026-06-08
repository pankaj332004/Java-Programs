package Problem;

import java.util.Scanner;

public class monotonicArray {
    public static boolean isMonotonic(int[] arr,int n){
        boolean inc = true , dec=true;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                inc=false;
            }
            if(arr[i]<arr[i+1]){
                dec=false;
            }
        }
        return inc || dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(isMonotonic(arr , n));
    }
}
