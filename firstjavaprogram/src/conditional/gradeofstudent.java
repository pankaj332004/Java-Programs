package conditional;

import java.util.Scanner;

public class gradeofstudent {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the marks of the student : ");
        int m = sc.nextInt();
        if(m>80 && m<=100){
            System.out.print("very Good");
        }
        else if(m>60 && m<=80){
            System.out.print("Good");
        }
        else if(m>40 && m<=60){
            System.out.print("Average");
        }
        else if(m<=40){
            System.out.print("Fail");
        }
        else{
            System.out.print("Wrong Entry");
        }
    }
}
