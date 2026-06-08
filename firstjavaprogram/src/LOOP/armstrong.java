package LOOP;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        int rev=0,count=0,num,temp,r;
        num=n;
        while(n!=0){
            n=n/10;
            count++;
        }
        temp=num;
        while(num>0){
            r=num%10;
            rev=rev+ (int)Math.pow(r,count);
            num=num/10;
        }
        if(temp==rev){
            System.out.print("The number is Armstrong");
        }
        else{
            System.out.print("The number is not Armstrong");
        }
    }
}
