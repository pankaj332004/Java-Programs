package conditional;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter the operator : ");
        char op = sc.next().charAt(0);
        System.out.println("Enter the 2nd number ");
        int b = sc.nextInt();
        // by if else
//        if(op == '+'){
//            System.out.println(a+b);
//        }
//        else if(op=='-'){
//            System.out.println(a-b);
//        }
//        else if(op=='*'){
//            System.out.println(a*b);
//        }
//        else if(op == '/'){
//            System.out.println(a/b);
//        }
//        else{
//            System.out.println(a%b);
//        }

        // syntax
        // switch(integer expression){
        // case constant 1:
        //     do this;
        // case constant 2:
        //     do this;
        // case constant 3:
        //     do this;
        // default:
        //     do this;
        switch (op){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid entry");
        }
    }
}
