package conditional;

import java.util.Scanner;

public class Greatestof3number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a : ");
        int a = sc.nextInt();
        System.out.print("Enter the number b : ");
        int b = sc.nextInt();
        System.out.print("Enter the number c : ");
        int c = sc.nextInt();
        // using else if ladder
//        if(a>b && a>c){
//            System.out.print("a is greatest : "+a);
//        }
//        else if (b>a && b>c) {
//            System.out.print("b is greatest : "+b);
//        }
//        else if (c>a && c>b){
//            System.out.print("c is greatest : "+c);
//        }
//        else{
//            System.out.print("All a,b and c are equal ");
//        }

        // nested if else
        if(a>b){
            if(a>c){
                System.out.print("a is greatest : "+a);
            }
            else{
                System.out.print("b is greatest : "+b);
            }
        }
        else{
            if(b>c){
                System.out.print("b is greatest : "+b);
            }
            else{
                System.out.print("c is greatest : "+c);
            }
        }
    }
}
