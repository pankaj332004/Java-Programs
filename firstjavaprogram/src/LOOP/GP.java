package LOOP;

import java.util.Scanner;

public class GP {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the term uo to which you want GP : ");
        int n=sc.nextInt();
        System.out.print("Enter the first term of the GP : ");
        double a=sc.nextDouble();
        System.out.print("Enter the common ratio of the GP : ");
        double r=sc.nextDouble();
        for(int i=1;i<=n;i++){
            System.out.print((int)a+" ");
            a=a*r;
        }
    }
}
