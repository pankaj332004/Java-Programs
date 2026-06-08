package Recursion;

import java.util.Scanner;

public class GreatestCommanDivisor {
    public static int GCD(int a , int b){
//        for (int i = Math.min(a,b); i >=1 ; i--) {
//            if(a%i==0 && b%i==0) return i;
//        }
//        return 1;

        if(b%a==0)
            return a;
        return GCD(b%a,a);

//        while(a != b){
//            if(a>b) a = a-b;
//            else b = b-a;
//        }
//        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a : ");
        int a = sc.nextInt();
        System.out.print("enter the number b : ");
        int b = sc.nextInt();
        int ans = GCD(a,b);
        System.out.print(ans);
    }
}
