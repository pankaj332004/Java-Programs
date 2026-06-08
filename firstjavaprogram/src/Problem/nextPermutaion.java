package Problem;

import java.util.Scanner;

public class nextPermutaion {
    public static void main(String[] args) {
        int[] arr = {1,3,2};
        displayArray(arr);
        NEXTpermutaion(arr);
        System.out.println();
        displayArray(arr);
    }
    public static void NEXTpermutaion(int[] arr){
        int i=arr.length-2;

        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }

        if(i>=0){
            int j=arr.length-1;
            while(arr[j]<= arr[i]) {
                j--;
            }
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        reverseArray(arr , i+1,arr.length-1);
    }
    static void reverseArray(int[] arr, int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void displayArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
