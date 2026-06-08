package PPS;

import java.util.Scanner;

public class capitalLowerDigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String s = sc.nextLine();
        for(char c : s.toCharArray()){
            if(Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            }else if(Character.isUpperCase(c)){
                sb.append('A');
            }else {
                sb.append('B');
            }
        }
        System.out.println(sb);
    }
}
