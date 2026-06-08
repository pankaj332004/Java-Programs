package PPS;

import java.util.Scanner;

public class removeWithPatience {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String r = sc.next();
        String ans = "";
        int n = s.length();
        int m = r.length();
        int i=0;
//        while(i<n){
//            if((i+m)<n && s.substring(i,m)==r){
//                if(i>0){
//                    char prev = ans.charAt(i-1);
//                    for(int j=0;j<m;j++){

//                }
//                i=i+m;
//            }
//            else{
//                ans = ans+s.charAt(i);
//                i++;
//            }
//        }
//        System.out.println(ans);
        while (i <= n - m) {
            if (s.substring(i, i + m).equals(r)) {
                // Optional logic: do something with previous character
                if (ans.length() > 0) {
                    char prev = ans.charAt(ans.length() - 1);
                    // Example: append the previous character again
                    for (int j = 0; j < m; j++) {
                        ans += prev;
                    }

                }
                i += m; // skip the matched substring
            } else {
                ans += s.charAt(i);
                i++;
            }
        }

        // Append remaining characters after last possible match
        while (i < n) {
            ans += s.charAt(i);
            i++;
        }

        System.out.println(ans);
    }
}
