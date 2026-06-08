package DAALAB;

import java.util.ArrayList;
import java.util.Scanner;

class countingSort {
    public static ArrayList<Integer> countsort(int arr[]) {
        int n = arr.length;

        int maxval = 0;
        for (int i = 0; i < n; i++)
            if (arr[i] > maxval) maxval = arr[i];
        int[] count = new int[maxval + 1];
        for (int i = 0; i < n; i++)
            count[arr[i]]++;
        for (int i = 1; i <= maxval; i++)
            count[i] += count[i - 1];
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            ans[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int x : ans)
            result.add(x);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> sorted = countsort(arr);
        for (int x : sorted)
            System.out.print(x + " ");
        System.out.println();
        System.out.println("Pankaj Kumar Rajbhar");
        System.out.println("2300320130170");
    }
}