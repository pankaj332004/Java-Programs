package PPS;

import java.util.Scanner;

public class sumMerge {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            brr[i] = sc.nextInt();
        }
        int i=0 , j=0,k=0;
        int[] crr = new int[n+n];
        while(i<n && j<n){
            if(arr[i]<=brr[j]){
                crr[k++]=arr[i++];
            }else{
                crr[k++]=brr[j++];
            }
        }
        if(i==n){
            while (j<n){
                crr[k++]=brr[j++];
            }
        }
        if(j==n){
            while (i<n){
                crr[k++]=arr[i++];
            }
        }
        int sum = 0;
        for(int l=0;l<n+n;l++){
            System.out.print(crr[l]+" ");
            if((n+n)%2==0){
                sum = crr[n-1]+crr[n];
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}
