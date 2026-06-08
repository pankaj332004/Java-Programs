package Pattern_printing;

import java.util.Scanner;

public class Star_square {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of the rows and columns: ");
        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            System.out.println("*****");
//        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
