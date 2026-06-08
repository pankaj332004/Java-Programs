package conditional;

import java.util.Scanner;

public class EVENORODD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n= sc.nextInt();
        if(n%2 == 0){
            System.out.print("Entered number is even");
        }
        else{
            System.out.print("Entered number is odd");
        }
    }
}
