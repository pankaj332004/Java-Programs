package conditional;

import java.util.Scanner;

public class multipleCONDITIONusingANDandOR {
    public static void main(String[] args) {
        //logical opration && and ||
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
//        if(n>99 && n<1000){
//            System.out.print("It is a 3 digit number");
//        }
//        else{
//            System.out.print("Not a 3 digit number ");
//        }

//        if(n>9999 && n<100000){
//            System.out.print("5 digit number ");
//        }
//        else{
//            System.out.print("Not a 5 digit number ");
//        }

        if(n%3==0 || n%5==0){
            System.out.print("Number is divisible by 3 or 5");
        }
        else{
            System.out.print("Number is not divisible by 3 or 5");
        }
    }
}
