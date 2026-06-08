package LOOP;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the term upto which you want to print the AP : ");
        int n=sc.nextInt();
        // 3 5 7 9 11 13 15 17 19 . . .
//        for(int i=1;i<=(2*n-1);i=i+2){
//            System.out.print(i+" ");
//        }

//        for(int i=4;i<=(3*n-2);i=i+3) {
//            System.out.print(i+" ");
//        }
        //without using nth  formula
        // 4 7 10 13 16 19 22 25 28 31 .....
        System.out.print("Enter the first term of the AP : ");
        int a=sc.nextInt();
        System.out.print("Enter the common difference of the AP : ");
        int d =sc.nextInt();
        for(int i=1; i<=n;i++){
            System.out.print(a+" ");
            a=a+d;
        }
    }
}
