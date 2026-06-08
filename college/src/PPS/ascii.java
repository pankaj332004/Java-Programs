package PPS;

import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m =0;
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s= sc.nextLine();
            for(char j : s.toCharArray()){
                if((int)j > m){
                    m = j;
                }
            }
        }
        System.out.print((char)m+" ");
        System.out.println(m);
    }
}
