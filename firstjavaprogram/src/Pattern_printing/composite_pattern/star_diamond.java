package Pattern_printing.composite_pattern;

import java.util.Scanner;

public class star_diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n=sc.nextInt();
        int nsp=n-1;
        int nst=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("* ");
            }
            System.out.println();
            nsp--;
            nst+=2;
        }

        nsp=1;
        nst=nst-4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("* ");
            }
            System.out.println();
            nsp++;
            nst-=2;
        }
    }
}
