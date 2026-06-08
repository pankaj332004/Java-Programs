package PPS;

import java.util.Scanner;

public class minAndMaxLocation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new  int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int minIdx=0 , maxIdx=0;
        int max = arr[0];
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min = arr[i];
                minIdx=i;
            }
            if(max<arr[i]){
                max=arr[i];
                maxIdx=i;
            }
        }
        if(minIdx>maxIdx){
            int temp = minIdx;
            minIdx = maxIdx;
            maxIdx = temp;
        }
        for(int i=minIdx;i<maxIdx;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<minIdx;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=maxIdx;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
