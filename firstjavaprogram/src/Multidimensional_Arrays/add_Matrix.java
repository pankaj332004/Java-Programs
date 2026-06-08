package Multidimensional_Arrays;

import java.util.Scanner;

public class add_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and columns of first matrix : ");
        int n=sc.nextInt();
        int m= sc.nextInt();
        /*System.out.println("Enter th rows and columns of second matrix : ");
        int p= sc.nextInt();
        int q=sc.nextInt();*/
        int[][] arr=new int[n][m];
        //int[][] brr=new int[p][q];
        //int[][] crr=new int[n][m];
        System.out.println("Enter the element of the first matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the rows and columns of second matrix : ");
        int p= sc.nextInt();
        int q=sc.nextInt();
        int[][] brr=new int[p][q];
        System.out.println("Enter the element of the second matrix: ");
        for (int k = 0; k < p ; k++) {
            for (int l = 0; l < q ; l++) {
                brr[k][l]= sc.nextInt();
            }
        }
        int[][] crr=new int[n][m];
        if(n==p && m==q){
            for(int i=0;i<n;i++){
                for (int j = 0; j < m; j++) {
                    crr[i][j]=arr[i][j]+brr[i][j];
                }
            }
            System.out.println("Addition of the two matrix: \n");
            for(int[] ele: crr){
                for(int x: ele){
                    System.out.print(x+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        else{
            System.out.println("Addition not possible");
        }
    }
}
