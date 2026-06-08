package PPS;

import java.util.Scanner;

public class armstrongNumberRange {
    public static boolean isArmstrong(int num){
        int l = (String.valueOf(num)).length();
        int count =0, temp = num;
        while(num!=0){
            count++;
            num=num/10;
        }
        int sum = 0;
        num = temp;
        while(num!=0){
            int digit=num%10;
            sum += Math.pow(digit,count);
            num=num/10;
        }
        return sum==temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lower = sc.nextInt();
        int upper = sc.nextInt();
        int k=-1;
        for(int i=lower ;i<=upper;i++){
            if(isArmstrong(i)){
                k=1;
                System.out.print(i+" ");
            }
        }
        if(k<0) System.out.println(-1);
    }
}
