package Multidimensional_Arrays;

import java.util.Scanner;

public class spiral {
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
        System.out.print("Enter the rows and columns : ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        print(arr,n,m);
        int minr=0,maxr=n-1,minc=0,maxc=m-1;
        while(minr <= maxr && minc <= maxc){
            // blue
            for (int j = minc; j <= maxc; j++) {
                System.out.print(arr[minr][j]+" ");
            }
            minr++;
            if(minr>maxr || minc>maxc) break;
            // orange
            for (int i = minr; i <= maxr; i++) {
                System.out.print(arr[i][maxc]+" ");
            }
            maxc--;
            if(minr>maxr || minc>maxc) break;
            // red
            for (int k = maxc; k >= minc; k--) {
                System.out.print(arr[maxr][k]+" ");
            }
            maxr--;
            if(minr>maxr || minc>maxc) break;
            // green
            for (int l = maxr; l >= minr; l--) {
                System.out.print(arr[l][minc]+" ");
            }
            minc++;
        }
    }
}
