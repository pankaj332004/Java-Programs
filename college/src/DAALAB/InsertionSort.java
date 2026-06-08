package DAALAB;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    static void insertionSortRecursive(int arr[], int n)
    {
        if (n <= 1)
            return;
        insertionSortRecursive( arr, n-1 );
        int last = arr[n-1];
        int j = n-2;
        while (j >= 0 && arr[j] > last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        insertionSortRecursive(arr, arr.length);

        System.out.print(Arrays.toString(arr));
        System.out.println();
        System.out.println("Pankaj Kumar Rajbhar");
        System.out.println("2300320130170");
    }
}
