package Multidimensional_Arrays;

import java.util.Scanner;

public class waveform {
    public static void print(int[][] arr,int n,int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and columns : ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the elements in the matrix : ");
        for(int i=0;i<n;i++){
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        print(arr,n,m);
        for (int i = 0; i < n; i++) {
            if(i%2==0) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else{
                for (int j = m-1; j >= 0; j--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if(i%2!=0) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else{
                for (int j = m-1; j >= 0; j--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i%2==0){
                    System.out.print(arr[j][i]+" ");
                }
                else {
                    System.out.print(arr[n-1-j][i]+" ");
                }
            }
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i%2!=0){
                    System.out.print(arr[j][i]+" ");
                }
                else {
                    System.out.print(arr[n-1-j][i]+" ");
                }
            }
        }
    }
}
