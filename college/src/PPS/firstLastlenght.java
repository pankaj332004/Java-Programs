package PPS;

import java.util.Scanner;

public class firstLastlenght {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            String w;
            for(int j=0;j<m;j++){
                w=sc.nextLine();
                if(j==0 || j==m-1){
                    System.out.println(w.length()+" ");
                }
            }
            System.out.println();
        }
    }
}
