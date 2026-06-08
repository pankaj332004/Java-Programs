package conditional;

import java.util.Scanner;

public class sideoftriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st side of triangle : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd side of triangle : ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd side of triangle : ");
        int c = sc.nextInt();
        if((a+b)>c && (a+c)>b && (b+c)>a){
            System.out.print("Given sides will form a triangle");
        }
        else{
            System.out.print("Given sides will not form a triangle");
        }
    }
}
