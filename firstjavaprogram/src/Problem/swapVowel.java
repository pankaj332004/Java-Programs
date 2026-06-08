package Problem;

import java.util.Scanner;

public class swapVowel {
    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        char[] ch = st.toCharArray();

        int i = 0, j = ch.length - 1;

        while (i < j) {
            if (!isVowel(ch[i])) {
                i++;
            } else if (!isVowel(ch[j])) {
                j--;
            } else {
                // Both are vowels → swap
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }

        System.out.println(new String(ch));
    }
}