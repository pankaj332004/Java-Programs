package DAALAB;

import java.util.Scanner;

public class binarysearch {
    public static int binary(int[] arr,int left,int right,int target){
        if (left > right) return -1;

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) return mid;
        else if (arr[mid] > target) return binary(arr, left, mid - 1, target);
        else return binary(arr, mid + 1, right, target);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched : ");
        int target = sc.nextInt();

        int res = binary(arr,0, arr.length, target);
        System.out.println(res==-1?"not found":"Found at index : 0"+res);
        System.out.println("Pankaj Kumar Rajbhar");
        System.out.println("2300320130170");
    }
}
