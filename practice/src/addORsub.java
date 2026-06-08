import java.util.Scanner;

public class addORsub {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter the operator + or - : ");
        char op = sc.next().charAt(0);
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();

        // using if else statement
//        if(op=='+'){
//            System.out.print((a)+(b));
//        }
//        else if (op=='-'){
//            System.out.print((a)-(b));
//        }
//        else{
//            System.out.print("Entered operator is wrong");
//        }
        System.out.print((op=='+')?(a+b):(a-b));
    }
}
