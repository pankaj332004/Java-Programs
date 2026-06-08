package Recursion;

import java.util.Scanner;

public class SUM1ton {
//    public static void add(int n, int sum){
//        if(n==0){
//            System.out.println(sum);
//            return;
//        }
//        add(n-1,sum+n);
//    }
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        int n = sc.nextInt();
//        add(n,0);
//    }

    public static int add(int n){
        if(n==1 || n==0) return n;
        if(n<0) return 0;
        return n+add(n-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the positive number : ");
        int n = sc.nextInt();
        int ans = add(n);
        System.out.println(ans);
    }
}
