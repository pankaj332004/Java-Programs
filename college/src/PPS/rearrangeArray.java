package PPS;

import java.util.Arrays;
import java.util.Scanner;

public class rearrangeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int i=0,j=n-1;
        int[] brr = new int[n];
        int k = 0;

        while(i<=j){
            brr[k++]=arr[i++];
            if(i<=j){
                brr[k++]=arr[j--];
            }
        }

        for(int l=0;l<n;l++){
            System.out.print(brr[l]+" ");
        }
    }
}
