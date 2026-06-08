package ARRAY_ARRAYLIST;

import java.util.Scanner;

public class sumOFarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            System.out.print("Enter the element of the array at index "+(i+1)+" is : ");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        System.out.print("Sum of the array element is : "+sum);
    }
}
