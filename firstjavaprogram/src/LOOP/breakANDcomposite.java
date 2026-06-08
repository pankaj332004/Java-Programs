package LOOP;

import java.util.Scanner;

public class breakANDcomposite {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // break keyword is used to finish / terminate a loop
        // program for composite number
        // composite number  n factor->(1,n,2 to n-1 ek factor minimum hona chahiye)
        System.out.print("Enter the number  : ");
        int n=sc.nextInt();

        int x=0;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){ // i is factor of 'n'
                System.out.println("composite Number");
                x = 1;// 1 means composite
                break;
            }
        }
        if(n==1) System.out.println("Neither Prime nor Composite");
        else if(x==0) System.out.println("Prime number");
    }
}
