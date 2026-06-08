package Recursion;

import java.util.Scanner;

public class towerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Tower :- ");
        int n = sc.nextInt();
        hanoi(n,'A','B','C');
    }
    private static void hanoi(int n ,char A,char B, char C){
        if(n==0) return;
        // take the n-1 disc from a to b via c
        hanoi(n-1,A,C,B);
        // largest disc from a to c
        System.out.println(A+"->"+C);
        // take the n-1 disc from b to c via a
        hanoi(n-1,B,A,C);
    }
}
