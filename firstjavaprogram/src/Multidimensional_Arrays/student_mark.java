package Multidimensional_Arrays;

import java.util.Scanner;

public class student_mark {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns : ");
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[][] arr=new int[n][m];
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
