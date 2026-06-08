package Multidimensional_Arrays;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and columns : ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        int[][] brr=new int[m][n];
        System.out.println("Enter the element of the matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nTransposed matrix is : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                brr[i][j]=arr[j][i];
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
