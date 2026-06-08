package Pattern_printing.composite_pattern;

import java.util.Scanner;

public class star_pyramid2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();

        int nsp=n-1;
        int nst=1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=nsp;k++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
            nsp--;
            nst+=2;
        }
    }
}
