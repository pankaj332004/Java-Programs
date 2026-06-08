package PPS;

import java.util.Scanner;

public class stringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the string : ");
//        String s = sc.nextLine();
//        int n = s.length();
//        int k = sc.nextInt();
//        if(k>n){
//            k = k%n;
//        }
//        k = k%n;
//        String left = s.substring(k) + s.substring(0,k);
//        String right = s.substring(n-k)+s.substring(0,n-k);
//        System.out.println(left);
//        System.out.println(right);

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String[][] arr = new String[n][m];
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=sc.nextLine();
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==0 || j==m-1){
                    System.out.print(arr[i][j].length()+" ");
                }
            }
            System.out.println();
        }
//        String[] arr = new String[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextLine();
//            if(i==0 || i==n-1){
//                System.out.println(arr[i]);
//            }
//        }
    }
}
