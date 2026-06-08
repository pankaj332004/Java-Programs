package setANDhashmap;

import java.util.*;

public class countCommon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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

        Set<Character> inter = new HashSet<>(P);
        inter.retainAll(Q);
        System.out.println("Common Character : "+inter.size());
    }
}
