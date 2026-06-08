package Recursion;

import java.util.Scanner;

public class PRINTnto1 {
    public static void number(int n){
        if(n==0) return;
        System.out.print(n+" ");
        number(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n  ");
        int n = sc.nextInt();
        number(n);
    }
}
