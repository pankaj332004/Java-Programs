package setANDhashmap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class commonCharcter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();

        Set<Character> P = new HashSet<>();
        Set<Character> Q = new HashSet<>();

        for(int i=0;i<n;i++){
            P.add(s1.charAt(i));
        }
        for(int i=0;i<m;i++){
            Q.add(s2.charAt(i));
        }
        Set<Character> R = new HashSet<>(P);
        R.retainAll(Q);

        if(P.equals(R)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}


//package setANDhashmap;
//
//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.Set;
//
//public class commonCharcter {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//        String s1 = sc.next();
//        String s2 = sc.next();
//
//        Set<Character> P = new HashSet<>();
//        Set<Character> Q = new HashSet<>();
//
//        for (char c : s1.toCharArray()) {
//            P.add(c);
//        }
//        for (char c : s2.toCharArray()) {
//            Q.add(c);
//        }
//
//        Set<Character> R = new HashSet<>(P);
//        R.retainAll(Q);
//
//        System.out.println(P.equals(R) ? "True" : "False");
//    }
//}
