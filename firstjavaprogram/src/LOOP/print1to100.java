package LOOP;

import java.util.Scanner;

public class print1to100 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(i+1 +" ");
        }
    }
}
