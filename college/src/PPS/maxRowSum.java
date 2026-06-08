package PPS;

import java.util.Scanner;

public class maxRowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr = new int[n][m];
        int maxR=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
                sum += arr[i][j];
            }
            if(maxR < sum){
                maxR=sum;
            }
            //System.out.println();
        }
        System.out.println(maxR);
    }
}
