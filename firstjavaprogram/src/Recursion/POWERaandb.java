package Recursion;

import java.util.Scanner;

public class POWERaandb {
    public static int pow(int a , int b){
        if(b==0) return 1;
        return a *pow(a,b-1);
    }
    public static int pow2(int a , int b){
        if(b==0) return 1;
        int result =  pow2(a,b/2);
        if(b%2==0) return result*result;
        else return  result*result*a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base : ");
        int a = sc.nextInt();
        System.out.print("Enter the exponent : ");
        int b = sc.nextInt();
        int ans = pow2(a,b);
        System.out.println(a+" raises to the power " +b +" is :"+ans);
    }
}
