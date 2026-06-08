package ARRAY_ARRAYLIST;

import java.util.Scanner;

public class productOFarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int x=sc.nextInt();
        int[] arr=new int[x];
        int product=1;
        for(int i=0;i<x;i++){
            System.out.print("Enter the element of the array at index "+(i+1)+" is : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<x;i++){
            product = product * arr[i];
        }
        System.out.print("Product of the array element is : "+product);
    }
}
