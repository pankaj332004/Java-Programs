package PPS;

import java.util.Arrays;
import java.util.Scanner;

public class classPosition {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int count = 1;
            for(int j=0;j<n;j++){
                if(i!=j && arr[j]>arr[i]) {
                    count = count+1;
                }
            }
            System.out.print(count+" ");
        }
    }
}
