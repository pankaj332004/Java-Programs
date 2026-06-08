package ARRAY_ARRAYLIST;

import java.util.Scanner;

public class rotate_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the K: ");
        int k=sc.nextInt();
        k=k%n;
        reverse(arr , 0, n-k-1);
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        reverse(arr, n-k,n-1);
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        reverse(arr, 0, n-1);
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void reverse(int[] arr, int i, int j){
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
