package Pattern_printing.composite_pattern;

import java.util.Scanner;

public class number_bridge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        n--;
        int nsp = 1;
        for(int i=1;i<=n;i++){
            int a = 1;
            for(int j=1;j<=n+1-i;j++){
                System.out.print(a++ +" ");
            }
            for(int k=1;k<=nsp;k++){
                System.out.print(" "+" ");
                a++; //very important
            }
            nsp += 2;
            for(int j=5;j<=n+5-i;j++){
                System.out.print(a++ +" ");
            }
            System.out.println();
        }
    }
}
