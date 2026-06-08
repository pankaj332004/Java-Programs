package PPS;

import java.util.Scanner;

public class jumpingNumber {
    public static int  fun(int n){
        if(n<10){
            return 1;
        }
        while(n>10){
            n /= 10;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=0;i<=x;i++){
            int diff = 0;
            if(i<=10){
                System.out.print(i+" ");
            }else{
                int temp = i;
                while(temp!=0){
                    int digit = temp%10;
                    diff = Math.abs(digit - diff);
                    temp=temp/10;
                }
                if(diff == 1){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
