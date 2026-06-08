package Recursion;

import java.util.Scanner;

public class PRINT1ton {
    // Method 1 global declaration
//    static int m;
//    public static void print(int x){
//        if(x>m) return;
//        System.out.print(x+" ");
//        print(x+1);
//    }
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        m = sc.nextInt();
//        print(1);
//    }

    // Method 2 extra parameter
    public static void print(int x, int m){
        if(x>m) return;
        print(x+1,m);
        System.out.print(x+" ");

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int m = sc.nextInt();
        print(1,m);
    }
}
