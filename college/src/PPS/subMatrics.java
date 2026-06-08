package PPS;

import java.util.Scanner;

public class subMatrics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=1;i<n-2;i++){
            for(int j=1;j<m-2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
