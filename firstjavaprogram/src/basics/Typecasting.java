package basics;

import java.util.Scanner;

public class Typecasting {
    // if the int datatype is given and you want in float datatype then i have to used typecasting
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x : ");
        int x = sc.nextInt();
        double y = (double) x;
        System.out.println("half of the given number is : "+(y/2));
    }
}
