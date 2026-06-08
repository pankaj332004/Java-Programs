package basics;

import java.util.Scanner;

public class sumof2numberuserinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number x : ");
        int x = sc.nextInt();
        System.out.print("Enter the number y : ");
        int y = sc.nextInt();
        System.out.print("sum of two number is x+y : "+(x+y));
    }
}
