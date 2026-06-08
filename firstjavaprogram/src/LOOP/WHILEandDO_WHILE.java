package LOOP;

import java.util.Scanner;

public class WHILEandDO_WHILE {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // while is the replacement of for loop
        // syntax for while loop
        // initialized
        // while(condition){
        // code(statement)
        // updation(increment or decrement)
        // }
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
//        int i=1;
//        while(i<=n){
//            System.out.print(i+" ");
//            i++;
//        }
        // syntax for do while loop
        // initialized
        // do{
        // code(statement)
        // updation(increment or decrement)
        // }while(condition);
        // in do while loop it print the least once before checking the condition
        int i=1;
        do{
            System.out.print(i+" ");
            i++;
        }while(i<=n);
    }
}
