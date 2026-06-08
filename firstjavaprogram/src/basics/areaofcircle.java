package basics;

import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args){
//        double r=3.7;
//        double a = 3.141592 * 3.7 * 3.7;
//        System.out.print("Area of circle with radius  : "+r+" is " +a);
//       // System.out.println(a);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double r = sc.nextDouble();
        double a = 3.141592 * r *r;
        System.out.print("Area of circle : "+a);
    }
}
