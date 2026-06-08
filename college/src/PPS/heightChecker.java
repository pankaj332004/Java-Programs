package PPS;

import java.util.Arrays;
import java.util.Scanner;

public class heightChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        int[] brr = new int[n];
        for(int i=0;i<n;i++){
            brr[i]=arr[i];
        }
        Arrays.sort(arr);
        for (int i=0;i<n;i++){
            if(arr[i]!=brr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
