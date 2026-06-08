package ARRAY_ARRAYLIST;

import java.util.Scanner;

public class MINvalue2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter the element of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        n= arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,arr[i]);
        }
        System.out.println(min);
    }
}
