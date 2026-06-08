package ARRAY_ARRAYLIST.Arraylist;

import java.util.Arrays;

public class basic {
    // in java array they have fixed size
    // so , we use dynamic array using OOP
    // array list is unlimited size
    public static void main(String[] args) {
        int[] arr = {30, 10, 40, 23, 89, 34};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        // for each loop
        System.out.println("\nFor each loop used");
        for(int x: arr){
            System.out.print(x+" ");
        }
        // sorting of the array
        Arrays.sort(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
