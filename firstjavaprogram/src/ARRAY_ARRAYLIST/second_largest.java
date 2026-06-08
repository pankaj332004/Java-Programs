package ARRAY_ARRAYLIST;

import java.util.Scanner;

public class second_largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        n= arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max =Math.max(max,arr[i]);
        }
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]!=max){
                smax =Math.max(smax,arr[i]);
            }
        }
        System.out.println("Maximum is "+max);
        System.out.println("Second maximum is "+smax);
    }
}
