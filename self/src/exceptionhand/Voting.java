package exceptionhand;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age : ");

        int age= sc.nextInt();
        try{
            if(age<18){
                throw new YoungerAgeException("You are not eligible for voting");
            }
            else{
                System.out.println("You are eligible for voting");
            }
        }
        catch(YoungerAgeException e){
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}
