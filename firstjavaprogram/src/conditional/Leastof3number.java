package conditional;

import java.util.Scanner;

public class Leastof3number {
    public static void main(String[] args){
        Scanner xyz = new Scanner(System.in);
        System.out.print("Enter the number A : ");
        int a = xyz.nextInt();
        System.out.print("Enter the number B : ");
        int b = xyz.nextInt();
        System.out.print("Enter the number C : ");
        int c = xyz.nextInt();
        if(a<b && a<c){
            System.out.print("A is least : "+a);
        }
        else if (b<a && b<c) {
            System.out.print("B is least : "+b);
        }
        else if (c<a && c<b){
            System.out.print("C is least : "+c);
        }
        else{
            System.out.print("All A,B and C are equal ");
        }
    }
}
