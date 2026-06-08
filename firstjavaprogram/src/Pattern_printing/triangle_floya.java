package Pattern_printing;

import java.util.Scanner;

public class triangle_floya {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) {
                //System.out.print(a+" ");
                System.out.print(a*a +" ");
                a+=1;
            }
            System.out.println();
        }
    }
}
