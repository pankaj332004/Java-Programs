package PPS;

import java.util.Scanner;

public class firstLastword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();
            int len = s[i].length();
            if (len > 0) {
                if (len == 1) {
                    // if string has only one character, print it once
                    System.out.println(s[i].charAt(0));
                } else {
                    System.out.println(s[i].charAt(0) + "" + s[i].charAt(len - 1));
                }
            }
        }
    }
}
