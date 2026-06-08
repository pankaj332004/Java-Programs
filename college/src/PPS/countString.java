package PPS;

import java.util.Scanner;

public class countString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int A = 0, B =0,C =0, D=0;
        for(char ch : s.toCharArray()){
            if(Character.isLowerCase(ch)){
                A++;
            }
            else if(Character.isUpperCase(ch)){
                B++;
            }
            else if(Character.isDigit(ch)){
                C++;
            }else {
                D++;
            }
        }
        System.out.println(A*B + C*D);
    }
}
