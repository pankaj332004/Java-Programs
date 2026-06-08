package Multidimensional_Arrays;

import java.util.Scanner;

public class searchA2dMatrix {
    public boolean search(int[][] arr, int x){
        int m=arr.length , n=arr[0].length;
        int i=n-1,j=0;
        while(i<m && j>=0) {
            if (arr[i][j] == x) {
                return true;
            } else if (arr[i][j] < x) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int m=arr.length , n=arr[0].length;
        System.out.println("Enter the element to be searched");
        int x=sc.nextInt();
        //search(arr,x);
//        int i=n-1,j=0;
//        while(i>m && j<=0){
//            if(arr[i][j]==x){
//                System.out.println("Found");
//            }
//            else if(arr[i][j]<x){
//                j++;
//            }
//            else{
//                i--;
//            }
        //}
    }
}
