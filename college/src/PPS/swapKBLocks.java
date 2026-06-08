package PPS;

import java.util.Scanner;

public class swapKBLocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i=i+2*k){
            for(int j=i;j<i+k;j++){
                int temp = arr[j];
                arr[j]= arr[j+k];
                arr[j+k] = temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
