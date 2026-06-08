package String;

import java.util.Scanner;

public class TotalNumberOfDigitsWithoutLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        String s = ""+n;

        System.out.println("The total number of digit is : "+s.length());
    }
}
