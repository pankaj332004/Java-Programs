package PPS;

import java.util.Arrays;
import java.util.Scanner;

public class naniHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int max = sc.nextInt();
        Arrays.sort(arr);
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(sum+arr[i]<max){
                count++;
                sum += arr[i];
            }
        }
        System.out.println(count);
    }
}
