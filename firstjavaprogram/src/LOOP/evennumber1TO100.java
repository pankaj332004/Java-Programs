package LOOP;

import java.util.Scanner;

public class evennumber1TO100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number upto you want to even number : ");
        int n= sc.nextInt();
        for(int i=2;i<=n;i=i+2){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
