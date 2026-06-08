package stringbuilder;

import java.util.Scanner;

public class IsomorphicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        String t = sc.nextLine();
        int[] a = new int[128]; // '\0'
        // s = !@efH
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int) ch;
            if (a[idx] == '\0') a[idx] = dh;
            else {
                if (a[idx] != dh) {
                    System.out.print("Invalid");
                    //break;
                }
            }
            int[] b = new int[128]; // '\0'
            // s = !@efH
            for (i = 0; i < t.length(); i++) {
                ch = t.charAt(i);
                dh = s.charAt(i);
                idx = (int) ch;
                if (b[idx] == '\0') b[idx] = dh;
                else {
                    if (b[idx] != dh) {
                        System.out.println("Invalid");
                        //break;
                    }
                }
                System.out.println("Valid");
                //break;
            }
        }
    }
}
