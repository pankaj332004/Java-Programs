package Multidimensional_Arrays;

import java.util.Scanner;

public class multiplicationoftwomatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and columns of the first matrix : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr=new int[n][m];
        System.out.println("Enter the element of the first matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the rows and columns of the second matrix : ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int[][] brr = new int[p][q];
        System.out.println("Enter the element of the second matrix : ");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                brr[i][j]= sc.nextInt();
            }
        }
        int[][] crr=new int[m][q];
        if(m!=p) System.out.println("Multiplication not possible");
        else{
            System.out.println("Multiplication of two matrix : ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < p; j++) {
                    crr[i][j]=0;
                    for (int k = 0; k < m; k++) {
                        crr[i][j]=crr[i][j]+(arr[i][k]*brr[k][j]);
                    }
                    System.out.print(crr[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
