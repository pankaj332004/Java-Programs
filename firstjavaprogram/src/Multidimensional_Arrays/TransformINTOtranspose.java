package Multidimensional_Arrays;

import java.util.Scanner;

public class TransformINTOtranspose {
    public static void print(int[][] arr,int n,int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
//    public static void transpose(int[][] arr,int n, int m){
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i; j++) {
//                int temp = arr[i][j];
//                arr[i][j]=arr[j][i];
//                arr[j][i]=temp;
//            }
//        }
//    }
    public static void main(String[] args) {
        // NOTE :- matrix should always be Square matrix
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and columns : ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        print(arr,n,m);
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < m; j++) {
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //transpose(arr,n,m);
        print(arr,n,m);
    }
}
