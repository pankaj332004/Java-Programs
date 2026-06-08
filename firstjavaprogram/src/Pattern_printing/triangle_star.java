package Pattern_printing;

import java.util.Scanner;

public class triangle_star {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // in the '* triangle' , in each line , the number of stars that are printed is equal to the row number
        System.out.print("Enter the number of rows: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
