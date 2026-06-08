package Multidimensional_Arrays;

import java.util.Scanner;

public class rowWiseANDcolumnWiseprinting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and columns : ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        int[][] brr=new int[m][n];
        System.out.println("Enter the element : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                brr[i][j]= sc.nextInt();
//            }
//        }
        System.out.println("Row wise printing : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
        System.out.println("column wise printing : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                brr[i][j]=arr[j][i];
                System.out.print(brr[i][j]+" ");
            }
        }
    }
}
