package Pattern_printing;

import java.util.Scanner;

public class triangle_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        // method 1
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(2*j-1 +"  ");
//            }
//            System.out.println();
//        }

        // method 2
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=(2*i-1);j+=2){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        // Method 3
        for(int i=1;i<=n;i++){
            int a=1;
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a+=2;
            }
            System.out.println();
        }
    }
}
