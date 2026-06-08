package LOOP;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        int rev=0, r, num;
        num=n;
        while(n!=0){
            r=n%10;
            rev=rev*10 + r;
            n=n/10;
        }
        if(num==rev){
            System.out.print("The number is palindrome");
        }
        else{
            System.out.print("The number is not palindrome");
        }
    }
}
