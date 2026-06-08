package LOOP;

import java.util.Scanner;

public class sum_of_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        int rev=0 , r;
        while(n!=0){
            r=n%10;
            rev=rev+r;
            n=n/10;
        }
        if(rev>0){
            System.out.print("Sum of the digit of the given number : "+rev);
        }
        else{
            System.out.print("Sum of the digit of the given number : "+ -1*rev);
        }
    }
}
