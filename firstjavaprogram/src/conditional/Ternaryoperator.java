package conditional;

import java.util.Scanner;

public class Ternaryoperator {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        // Ternary operator (condition) ? if true : if false
        System.out.print((n%2==0)?"Even":"Odd");
    }
}
