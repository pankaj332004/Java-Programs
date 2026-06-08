package Recursion;

import java.util.Scanner;

public class decreasingIncreasing {
    public static void decInc(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        decInc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array : ");
        int n = sc.nextInt();
        decInc(n);
    }
}
