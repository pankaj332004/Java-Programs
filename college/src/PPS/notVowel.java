//package PPS;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class notVowel {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String[] arr = new String[n];
//        ArrayList<String> brr = new ArrayList<>();
//
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextLine();
//        }
//        for(int i=0;i<n;i++){
//            String s = arr[i];
//            int j=0;
//            while(j<s.length()){
//                char ch = s.charAt(j);
//                if(ch=='A'|| ch=='a'|| ch=='E' || ch=='e' || ch=='I' || ch=='i' ||ch=='O' || ch=='o' || ch=='U' || ch=='u'){
//                    brr.add(s);
//                    break;
//                }
//            }
//        }
//        if(brr.size()==0){
//            System.out.println(-1);
//        }
//        else{
//            for(int i=0;i<brr.size();i++){
//                System.out.println(brr.get(i));
//            }
//        }
//    }
//}

package PPS;

import java.util.ArrayList;
import java.util.Scanner;

public class notVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // ✅ consume newline

        String[] arr = new String[n];
        ArrayList<String> brr = new ArrayList<>();

        // Read strings
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        // Check each string for vowels
        for (int i = 0; i < n; i++) {
            String s = arr[i];
            int j = 0;
            while (j < s.length()) {
                char ch = s.charAt(j);
                if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' ||
                        ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' ||
                        ch == 'U' || ch == 'u') {

                }else{
                    brr.add(s);
                }
                j++; // ✅ increment j
            }
        }

        // Output
        if (brr.size() == 0) {
            System.out.println(-1);
        } else {
            for (String word : brr) {
                System.out.println(word);
            }
        }

        sc.close();
    }
}

