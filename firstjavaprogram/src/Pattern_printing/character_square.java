package Pattern_printing;

import java.util.Scanner;

public class character_square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(j+64)  +"  ");
            }
            System.out.println();
        }
    }
}
