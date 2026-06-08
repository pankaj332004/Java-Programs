package conditional;

import java.util.Scanner;

public class RECTANGLEareaANDperimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle : ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle : ");
        int b = sc.nextInt();
        int A = l*b;
        System.out.println("Area of the rectangle is : "+A);
        int P =2*(l+b);
        System.out.println("Perimeter of the rectangle is : "+P);
        if(A>P){
            System.out.print("Area is greater : "+A);
        }
        else if(A<P){
            System.out.print("Perimeter is greater : "+P);
        }
        else{
            System.out.print("Both area and perimeter are equal : ");
        }
    }
}
