package LOOP;

import java.util.Scanner;

public class tableof19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number upto which you want to print : ");
        int n= sc.nextInt();
        for(int i=n;i<=n*10;i=i+n){
            if(i%n==0){
                System.out.print( i + " ");
            }
        }
    }
}
