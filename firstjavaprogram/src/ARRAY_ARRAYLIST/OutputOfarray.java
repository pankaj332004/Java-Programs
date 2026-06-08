package ARRAY_ARRAYLIST;

import java.util.Scanner;

public class OutputOfarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        //int x=sc.nextInt();
        for (int i = 0; i <= x - 1; i++) {
            System.out.print("Enter the element at index " + (i + 1) + " is : ");
            arr[i] = sc.nextInt();
        }
//        arr[0]=10;
//        arr[1]=20;
//        arr[2]=30;
//        arr[3]=40;
//        arr[4]=50;
//        arr[5]=60;
//        arr[6]=70;
        // initialise array
        // int[] arr={10, 20, 30, 40, 50};

        // length operator
        // int n=arr.length;
        // for(int i=0;i<n;i++){
        // sout(n)
        // }
        // output
        for(int i=0;i<=x-1;i++){
            System.out.print("Element at index "+(i+1)+" is ");
            System.out.println(arr[i]+" ");
        }
    }
}
