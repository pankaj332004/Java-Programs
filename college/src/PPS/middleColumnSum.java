package PPS;

import java.util.Scanner;

public class middleColumnSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = m/2;
        int sum = 0;
        int[][] arr = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
                if(j==x){
                    sum += arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
